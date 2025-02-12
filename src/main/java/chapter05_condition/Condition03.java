package chapter05_condition;

import java.util.Scanner;

/*
     사용자에게 score를 입력받아 다음과 같은 조건을 만족시키돌고 작성하시오
     score
     grade

     실행예
     점수를 입력하세요 >>
     입력한 점수는 100점이며 학점은 A 입니다
 */
public class Condition03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        String grade = "X";
        System.out.print("몇점" +
                "인가요?>>>");
        score = scanner.nextInt();

// 내가한거
//        if (score > 89){
//            System.out.println("당신의 점수는 "+ score + "점이며 학점은 A 입니다");
//        } else if (score > 79 ) {
//            System.out.println("당신의 점수는 "+ score + "점이며 학점은 B 입니다");
//        }else if (score > 69) {
//            System.out.println("당신의 점수는 " + score + "점이며 학점은 C 입니다");
//        }else if (score > 59) {
//            System.out.println("당신의 점수는 " + score + "점이며 학점은 D 입니다");
//        } else if (score > 100 || score <0) {
//            System.out.println("당신의 점수는 " + score + "점이며 학점은 X 입니다");
//        }  else {
//            System.out.println("당신의 점수는 " + score + "점이며 학점은 F 입니다");
//        }

        //이플 엘스로 엑스랑 등급제 나누고
        // 엘스문 안에 다시 등급들 ㄱㄱㄱㄱㄱㄱ <- 이게 더 좋아보임

        if (score > 89) {
            grade = " X ";
        } else {
            if (score > 79) {
                grade = "A ";
            } else if (score > 69) {
                grade = " B ";
            } else if (score > 59) {
                grade = " C ";
            } else {
                grade = " F ";
            }
            System.out.println("당신의 점수는 " + score + "점이며 학점은" + grade + " 입니다");
            }
        }
}
