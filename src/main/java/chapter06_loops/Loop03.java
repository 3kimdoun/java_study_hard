package chapter06_loops;
/*
    중첩 for문
    형식 :
    for ( int i = 0 ; i <10 ; i++){
        반복실행문 1
        for ( int i = 0 ; i <10 ; i++){
            반복실행문 2
        }
        반복실행문 3
    }
 */

public class Loop03 {
    public static void main(String[] args) {
//        int a;
//        int b;
//
//        for (int i = 0 ; i < 5 ; i++){
//            a = i;                                         //a값 초기화
//            System.out.println("a의 값:" + a);         //반복실행문 1
//            for (int j = 0 ; j < 5; j++){
//                b = j;                                  //b값 초기화
//                System.out.println("b의 값: "+ b);    //반복실행문 1
//            }
//            System.out.println("----b가 끝나서 새로 a를 대입합니다");
//        }

        /*
            실행 예
            2 X 1 = 2
            2 x 2
            ...
            9 x 9
         */
        for (int i = 2; i < 10 ; i++){
            for (int j = 1 ; j <10 ; j++ ){
                System.out.println(i + " X " + j + " = " + (i*j));
            }
        }

    }
}
