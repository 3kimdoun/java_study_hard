package chapter04_scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" x 입력 : ");
        int x = scanner.nextInt();

        System.out.println(" y 입력 : ");
        int y = scanner.nextInt();

        System.out.println(" x + y =" + x+y);
        //맨 처음이 스틀링이라 x , y 에 해당하는 값도 스트링으로 처리됨
        System.out.println(" x + y =" +(x+y));
        // 그 문제를 해결하기 위해 연산우선 순위를 만들어 주고자 x + y 를 소괄호로 묶음

    }
}
