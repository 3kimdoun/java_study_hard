package chapter05_condition;
/*
    switch 문

    형식 :
    switch(변수)
        case 조건1:
            실행문1:
            break;
        case 조건2:
            실행문2:
            break;
        case 조건3:
            실행문3:
            break;
        case 조건4:
            실행문4:
            break;
        default:
            실행문5

default의 의미 : case 에 해당되지 않은 변수가 적둉될 경우 실행되는 부분
braek의 의미 :해당 조건문/ 반복문을 그 자리에서 종료시키는 단어

 */

import java.util.Scanner;

public class Condition05Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selected = null;

//        System.out.println("[선택 프로그램 ]");
//        System.out.println("a. 메뉴 1");
//        System.out.println("b. 메뉴 2");
//        System.out.println("c. 메뉴 3");
//        System.out.println("d. 메뉴 4");
//        System.out.println("e. 메뉴 5");

        System.out.println("메뉴를 선택하세요>>>");
        selected =scanner.nextLine();
        if (selected=="a"){
            System.out.println("메뉴1을 선택하셧습니다");
        } else if (selected =="b") {
            System.out.println("메뉴2를 선택하셧습니다");
        }
        //가독성 박살

        switch (selected){
            case "a":
                System.out.println("메뉴1을 선택하셨습니다");
                break;
            case "b":
                System.out.println("메뉴2을 선택하셨습니다");
                break;
            case "c":
                System.out.println("메뉴3을 선택하셨습니다");
                break;
            case "d":
                System.out.println("메뉴4을 선택하셨습니다");
                break;
            case "e":
                System.out.println("메뉴5을 선택하셨습니다");
                break;
            default:
                System.out.println("잘못 선택하셨습니다");
        }
//selected2

        System.out.println("[선택 프로그램 ]");
        System.out.println("1. 메뉴 1");
        System.out.println("2. 메뉴 2");
        System.out.println("3. 메뉴 3");
        System.out.println("4. 메뉴 4");
        System.out.println("5. 메뉴 5");

//        String  selected2 = null;
        int selected2  = 0;
        System.out.println("메뉴를 선택하세요>>>");
        selected2 =scanner.nextInt();

        switch (selected2) {
            case 1:
                System.out.println("메뉴1을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("메뉴2을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("메뉴3을 선택하셨습니다.");
                break;
            case 4:
                System.out.println("메뉴4을 선택하셨습니다.");
                break;
            case 5:
                System.out.println("메뉴5을 선택하셨습니다.");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }

    }
}
