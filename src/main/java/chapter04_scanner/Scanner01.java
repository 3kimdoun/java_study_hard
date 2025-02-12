package chapter04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner 클래스 import
        Scanner scanner = new Scanner(System.in); //콘솔창에 사용자가 값을 입력가능 스캐너치고 컨트롤 스페이스바 치면 자동완성
        System.out.print("올해 년도를 입력하셈>>>");   // 앞으로 print 와 println 구분할 예정
        int year = scanner.nextInt();  //명령어관련우 추후 설명 메서드 개념임ㅁ
        System.out.print(year);
        System.out.println("올해 년도를 입력하셈>>>");

        /*
            int 입력하고 싶으면 scanner.nextInt();
            double 입력하고싶으면 scanner.nextDouble();

            String은?
         */
        String year1 = scanner.nextLine();
        System.out.println("올해년도는"+ year + "입니다");
        System.out.println("올해년도는"+ year + 1 + "입니다");
        // year1 을 String 자료형으로 선언했기 때문에 수학연산이 불가능해져서 2025를 입력했을 때 20251로 출력

        /*
            scanner를 사용했을 때 그 결과값을 변수에 대입하는 경우, 변수의 '자료형이 매우 중요' 함

            scanner.nextInt() / scanner.nextLine() 을 이용하면 콘솔창에 사용자가 원하는 값을 입력가능
            그리고 그 결과값을 각각 int year / String year1 에 대입함

            즉 결과값이 변수에 대입됐음을 의미 -> 대입연산자 개념을 떠올려야함
                애초에 변수를 선언하면서 어떤 자료형이 될지 미리 고려한다면 자동완성을 통해
                nextInt(), nextDouble(), nextLine()를 추천해줌
         */


    }
}
