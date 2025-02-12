package chapter07_methods;

import java.util.Scanner;

public class Method03Switch {
    /*
        Method02.java 파일 확인시 별찍기 관련 메서드 구현됨
        getStar() 메서드를 보면 내부에 if-if else- else 형태의 구문으로 출력하게됨
        매개변수를 1-4까지를 받아서 왼쪽으로 증가하는 별 등을
        출력하게끔 돼있음

        하지만 이프문을 사용하면 가독성이 떨어지기 때문에
        스위치문으로 교체하여 동일한 기능을 하게끔
        리팩토링 과정을 거치고자함
     */
    public static String getStar(int totalLine, int menuSelect) {
        String result = "";

        switch (menuSelect) {
            case 1:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        result += "&";
                    }
                    result += "\n";
                }
                break;
            case 2:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < totalLine - i - 1; j++) {
                        result += " ";
                    }
                    for (int k = 0; k < i + 1; k++) {
                        result += "&";
                    }
                    result += "\n";
                }
                break;

            case 3:
                    for (int i = 0; i < totalLine; i++) {
                        for (int j = 0; j < totalLine - 1; j++) {
                            result += "&";
                        }
                        result += "\n";
                    }
                    break;
            case 4:
                    for (int i = 0; i < totalLine ; i++) {
                        for (int j = 0; j < i; j++) {
                            result += "  ";
                        }
                        for (int k = 0; k < totalLine - i; k++) {
                            result += "&";
                        }
                        result += "\n";
                    }
                    break;
            default:
                result =" 잘못입력하셨습니다 다시입력하세요 ~ ~ ~";
                }

                return result;

        }

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            int rowOfStars;
            int choice;

            System.out.print("몇 줄 짜리 별을 생성할까???>>>>");
            rowOfStars = scanner.nextInt();

            System.out.println("1. 왼쪽으로 치우친 증가하는 별");
            System.out.println("2. 오른쪽으로 치우친 증가하는 별");
            System.out.println("3. 왼쪽으로 치우친 감소하는 별");
            System.out.println("4. 오른쪽으로 치우친 감소하는 별");
            choice = scanner.nextInt();

            String starResult = getStar(choice, rowOfStars);
            System.out.println(starResult);


        }
    }


