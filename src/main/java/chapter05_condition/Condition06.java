package chapter05_condition;

import java.util.Scanner;

public class Condition06 {
    public static void main(String[] args) {
        /*
            사용자에게 스코어를 입력받아 다음과 같은 조건을 만족시키도록 작성하시오

            스코어가 0보다 작거나 100 보다 크면 grade는 x
            changedScore -> 9~10 grade = A
            changedScore -> 8 grade = B
            changedScore -> 7 grade = C
            changedScore -> 6 grade = E
            changedScore -> 5이하 grade = F

            실행 예
            점수를 입력하세ㅛㅇ >>. 100
            학점은 A

            if문을 통해서 0미만 100초과를 걸러내는 적읍 grade x
            나머지 부분을 스위치.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요>>>");

        int score = scanner.nextInt();
        int changedScore = score/10;
        String grade= "";

//        System.out.println(changedScore);
        //int 로 선언해서 알아서 버림이 일어남 ㄱㅊㄱㅊ

        //점수변환 끝 조건문 ㄱ (if swtch 혼합)
        if ( score< 0 ||score >100){
            grade = "x";
        } else {
            switch (changedScore) {

                case 9, 10:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                   grade = "D";
                    break;
//                case 5,4,3,2,1 :   //이거보단 낫당....  프린트 굳이 안해도됐음... 좀 편하게 쓰는거 생각 ㄱㄱ
                default:
                    grade = "E";
            }

            System.out.println("당신의 학점은 " + grade + " 입니다.");
        }


    }
}
