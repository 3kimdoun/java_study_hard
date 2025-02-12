package chapter04_scanner;

import java.util.Scanner;

/*
실행 예
키를 입력하세요 >>>
몸무게를 입력하세요>>>
당신의 bmi 지수는 --입니다

 */ //내가한거
public class Scanner04BmiCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("키를 입력하세요 >>>");
        double height = scanner.nextDouble() / 100;  // 바로 연산가능
//        double height2 = height/100;

        System.out.print("몸무게를 입력하세요 >>>");
        double weight = scanner.nextDouble();

        double bmi = (int)(weight/(height*height));
//        int bmi2 = (int) (weight / (height*height));
//        System.out.print("당신의 bmi 지수는 "+ bmi + " 입니다 ");

        if (bmi < 0){
            System.out.println("잘못입력하셨습니다");
        } else if ( bmi >18) {
            System.out.print("당신의 bmi 지수는 "+ bmi + " 이고, 정상체중입니다. ");
        }else if ( bmi > 23) {
            System.out.print("당신의 bmi 지수는 "+ bmi + " 이고, 과체중입니다. ");
        }else if ( bmi > 25) {
            System.out.print("당신의 bmi 지수는 "+ bmi + " 이고, 비만입니다. ");
        }






    }
}
