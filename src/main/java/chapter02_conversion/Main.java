package chapter02_conversion;

public class Main {
    public static void main(String[] args) {
        /*
             형변환(Conversion) : 용량 상의 문제로 일어나는 이슈를 해결하기 위해서 사용

                1) 업캐스팅(upcasting) : 더 큰 용량의 자료형으로 변환 시키는것

         */
        char cast1 = 'A';
        System.out.println("원형 : " + cast1);
        // 업캐스팅의 방법 #1
        //형 변환을 하기 위해서는 '(바꿀 자료형) 변수명' 으로 작성하면됨
        System.out.println("변형 :"+(int) cast1);
        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 :"+(int) cast2);

        //업캐스팅 방법 #2
        char cast3 = 'b';
        //업캐스팅을 진행할 새로운 변수를 선언해서 대입하는 방식
        int cast4 = (int)cast3;
        System.out.println("원형 : " + cast3);
        System.out.println("변형 : " + cast4);

        //  2) 다운캐스팅(downcasting) : 더 적은 용량의 자료형으로 변환시키는 것
        int cast5 = 99; //1번방법
        int cast6 = 100; //2번방법

        //지시사항 : 다운 캐스팅 하는 방법을 업캐스팅방식 1,2를 동원해서 char 형태로 바꾼후
        //콘솔창에 원형과 변형 ㄱ

        System.out.println("원형 : " + cast5);
        System.out.println("변형 : " +(char) cast5);
        char cast7 = (char) cast6;
        System.out.println("원형 : " + cast6);
        System.out.println("원형 : " + cast7);

        /*
         추후 수업 예정이긴한데 (Java2) , 간단히 말하자면
         업캐스팅의 경우 메모리 용량이 커지기만 하는것이기 때문에 기본적으로 '암시적(implicit)'으로 변형가능
         다운캐스팅의 경우 용량이 적어지기 때문에 메모리 용량을 벗어나게 되는 경우도 있음
            ex) long으로만 표현가능한데 int로 다운캐스팅 시도할경우 오류발생 가능성있음
        그렇기 때문에 다운캐스팅을 할 때에는 '명시적 (explicit)'으로 함
         */

    }
}
