package 프로퍼티;

import 커피메뉴만들기.CoffeeMenuList;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

/*
Map의 하나의 형태 : 키와 값이 모두 String 타입으로 제한된 형태
내부 설정 정보 읽기(database.properties가 생성되어 있지 않으면 에러 발생)
주로 Properties의 정보를 읽어 들일때 사용 됩니다.
 */
public class PropertiesMain {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String path = PropertiesMain.class.getResource("../커피메뉴만들기/database.properties").getPath();
        // = String path = CoffeeMenuList.class.getResource("./database.properties").getPath(); >  위와 동일하게 출력된다
        path = URLDecoder.decode(path,"utf-8");   // 문자열 utf-8 에 대해서 디코딩 하겠다. 한글에 대한 처리를 위해서
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);

    }
}

