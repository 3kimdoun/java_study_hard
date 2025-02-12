package chapter05_condition;

import java.util.Scanner;

public class Condition04BmiUpg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("키를 입력하세요 >>>");
        double height = scanner.nextDouble() / 100;

        System.out.print("몸무게를 입력하세요 >>>");
        double weight = scanner.nextDouble();

        double bmi = weight/(height*height);

        if (bmi < 0){
            System.out.println("잘못입력하셨습니다");
        } else if ( bmi >18) {
            System.out.print("당신의 bmi 지수는 "+ (int)(bmi) + " 이고, 정상체중입니다. ");
        }else if ( bmi >23) {
            System.out.print("당신의 bmi 지수는 "+ (int)(bmi) + " 이고, 과체중입니다. ");
        }else if ( bmi >25) {
            System.out.print("당신의 bmi 지수는 "+ (int)(bmi) + " 이고, 비만입니다. ");
        }
    }
}
