package chapter06_loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        /*
             별찍기를 통한 for문 구조 학습
             *
             **
             ***
             ****
             *****

             i 의 값이 바뀔 때 마다 개행(엔터) 이루어져야함

         */
//        for (int i = 0 ; i < 5 ; i++){
//            for (int j =0; j < i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /*
            숫자를 입력 받아 그 줄 수 만큼의 별찍기가 이루어질수잇도록 작성 ㄱㄱ

            실행예 실행숫자를 입력 >>>
         */
//        Scanner scanner= new Scanner(System.in);
//        int row = 0;
//        System.out.print("숫자를 입력하세요 >>>");
//        row = scanner.nextInt();
//
//        for (int i = 0 ; i < row ; i++){   //int i 는 개행 횟수
//            for (int j = 0; j < i+1 ; j++ ){   //별이 어떻게 찍힘?????
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
                *****
                ****
                ***
                **
                *
         */

         for(int i=5 ; i > 0 ; i--){
             for (int j = 0 ; j< i ; j++){
                 System.out.print("🥰");
             }

         System.out.println();
        }
         /*
                *
               **
              ***

              요렇게 하는 법^^.

          */



    }
}
