package chapter06_loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        /*
            n에 숫자를 입력하여 몇 번 반복할지 결정하고
            1부터 n 까지 표시하는 반복문 ㄱㄱ
         */
        //1.Scanner import
        Scanner scanner = new Scanner(System.in);

        int n =0 ;

        System.out.print("1부터 얼마까지 숫자를 표시할까??>>>>");
        n= scanner.nextInt();

        /*
            실행 예
            1 2 3 4 5 6 7 ...n

            1 부터 n 까지의 합 =

         */
/*//i  1부터 시작 -> 시작값 아니라 종료값도 수정해여도ㅣ//
        for(int i =1 ; i < n+1 ; i++){
            System.out.println(i);*/
//        }

// i 0부터 시작
        int sum = 0;
        for(int i =0 ; i < n ; i++){
            System.out.print( i+1  +  " ");
            //강사님
            sum += i+1;
            //수강생님
            //sum += i
        }
        System.out.println("합 : " + sum );
//        System.out.println("합 : " + (sum+n) );




    }
}
