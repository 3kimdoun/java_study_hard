package chapter04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
             문자열 입력
             scanner.next()     -> 띄어쓰기 포함 x
             scanner.nextLine()   -> 띄어쓰기 포함 o

         */
        //Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);
//        System.out.print("당신의 이름을 입력하세용>>>");
//        String name = scanner.nextLine();
//        System.out.println("당신의 이름은"+ name + " 입니당.");

        /*
            실행 예

            이름을 입력하세요 >>>
            주소를 입력하세요 >>>
            나이를 입력하세요 >>>
         */
//        System.out.print("이름을 입력하세요>>>");
//        String name = scanner.nextLine();
//
//        System.out.print("나이를 입력하세요>>>");
//        int age = scanner.nextInt();
//
//        System.out.print("주소를 입력하세요>>>");
//        String address = scanner.nextLine();
//
//        System.out.println("이름 :" + name+
//                " 주소 : " + address +
//                " 나이 : " + age);

        System.out.print("이름을 입력하세요>>>");
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요>>>");
        int age = scanner.nextInt();  //엔터키를 막아주는 베리어 역할
        scanner.nextLine();   //-> 변수에 대입하지 않앗으므로 저장안되
        System.out.print("주소를 입력하세요>>>");
        String address = scanner.nextLine();



        System.out.println("이름 :" + name + "\n주소 : " + address + " \n나이 : " + age +  "\n내년나이 : " + (age + 1));
            // /n : 다음줄로 강제 개행 해주는 명령어
        /*
            next vs. nextLine()
                1. 입력단위 : next() 는 공백이전까지의 단어를 읽고 (띄어씍 불가)
                    nextLine()은 줄바꿈 이전까지의 전체 문자열으 읽음(enter 키 기준)
                2. 1.로 인한 문제점 : next() 다음에 nextLine()을 혼합하여 쓰게 될 때
                    nextLine() 을 호출하기 전에 next()를 먼저 사용하게되면 next()  입력하고 나 ㄴ 후에
                    엔터키로 인해 nextLine()이 입력을 무시하고 다음 코드 라인을 읽어 들이면서 빈문자열만 저장
                    변수에 아무것도 대입되지 않을 수도 있음
                3. 해결방안 : 2.는 자바 상에서의 대표적인 스캐너 관련문제로 이를 막기위해 엔터키로 흡수해주는
                            베리어를 코드라인으로 삽입할 필요가 있음

         */

    }
}
