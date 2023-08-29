package 날짜와시간;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
Date() : 운영체제로부터 날짜와 시간 정보를 가져와 원하는 포맷 형태로 출력, 객체를 생성 해야함.
자바의 java.util 패키지에 포함되어 있어 import를 해야함
 */
public class DateAndCal {         // SimpleDateFormat
    //public DateAndCal() {
    public static void main(String[] args) {
        Date now = new Date();
//        System.out.println(now);
//        // 원하는 포멧으로 변경 하기
//        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
//        System.out.println(sdf.format(now));

        // yyyy : 연도를 4자리로 표시
        // yy : 연도를 2자리로 표시
        // MM : 월을 표시 (*대문자임에 유의*, 월이 2자리로 표시)
        // HH : 24시간제
        // hh : 12시간제
        // mm : 분을 출력

        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;   // 참조 변수 7개 선언
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년MM월dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날 입니다.");  // W 월의 몇번째 주
        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");  // w 년도의 몇번째 주
        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));

        Calendar cal = Calendar.getInstance(); // 운영체제로부터 시간을 가져옴, 하나의 값만 가져올때 유용
        System.out.println(cal.get(Calendar.YEAR));  // 2023
        System.out.println(cal.get(Calendar.MONTH) + 1); // 8 (*인덱스로 제공* 되어 0부터 시작해서 +1 넣어 줘야 8월이 나온다.)
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 3 (주에서 몇번째 날인지 )
        System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 29
        System.out.println(cal.get(Calendar.AM_PM)); // 1 (오후는 1, 오전은 0)
        System.out.println(cal.get(Calendar.HOUR)); // 현재 시
        System.out.println(cal.get(Calendar.MINUTE)); // 현재 분
        System.out.println(cal.get(Calendar.SECOND)); // 현재 초

        // Calender 클래스로 yyyy년MM월dd일 HH시mm분ss초 포맷과 동일하게 출력하기

        Calendar date = Calendar.getInstance();
        int year = date.get(Calendar.YEAR);
        int mon = date.get(Calendar.MONTH);
        int day = date.get(Calendar.DAY_OF_MONTH);
        int isPM = date.get(Calendar.AM_PM);
        int hour = date.get(Calendar.HOUR);
        int min = date.get(Calendar.MINUTE);
        int sec = date.get(Calendar.SECOND);
        if(isPM == 1) hour += 12;
        System.out.printf("%d년%02d월%02d일 %02d시%02d분%02d초\n" ,
                year,mon,day,hour,min,sec);  // 0넣으면 2자리인 경우 모두 채워줌 ㄷ






    }
}
