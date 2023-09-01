package 스택기본;

import java.util.Stack;

/*
Stack은 제일 나중에 들어온 값이 가장 먼저 빠져 나가는 구조 (LIFO(Last in First Out))
Stack은 내부적으로 Vector  클래스를 상속 받아 만들어 졌습니다.
push / peek() / pop() / empty() / size() / contains(1)
 */
public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());  // 맨위의 값 확인 = 3
        System.out.println(stack.pop());   // 맨 나중에 들어온 값 꺼내기 = 3 꺼내기
        System.out.println(stack.empty()); // 현재 스택이 비어 있는지 확인  false
        System.out.println(stack.size());  // 스택내에 몇개의 데이터가 있는지 확인 = 2
        System.out.println(stack.contains(1)); // 매개 변수의 스택내에 존재하는지 확인 true

    }
}
