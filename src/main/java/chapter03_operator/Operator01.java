package chapter03_operator;
/*
    논리 연산자

    true(1), false(0) : 컴퓨터가 읽을 수 있는 두 숫자
    boolean : true / false 를 구분하는 자료형

    AND(&&) : 곱 T X T = T / T X F = F / F X F = F --> 한나라도 false 라면 false
    OR(||) :  합 T + T = T  / T + F = T / F + F = F --> 하나라도 true라면 true
    NOT(!) : 값을 반대로 바꿔줌. 혹은 틀릴경우를 나타ㄴㅐㅁ
    boolean flag = false;
    sout(!flag)

 */
public class Operator01 {
    public static void main(String[] args) {
        boolean flag = false;
        System.out.println(!flag);

        boolean flag1 = true;
        boolean flag2 = false;

    //앤드연산ㄴ자
        boolean result1 = flag1 && flag1;
        System.out.println("T X T = "+result1);

        boolean result2 = flag1 && flag2;
        System.out.println("T X F = "+result2);

        boolean result3 = flag2 && flag2;
        System.out.println("F X F = "+result3);

    //  오알 연산자 예시들
        boolean result4 = flag1 || flag1;
        System.out.println("T + T =" + result4);

        boolean result5 = flag1 || flag2;
        System.out.println("T + F =" +result5);

        boolean result6 = flag2 || flag2;
        System.out.println("F + F =" +result6);
    //
        boolean result7 = flag1 || flag2 && flag1;
        System.out.println(" T + F X F =" +result7);

        boolean result8 = 10 % 3 == 0;          // "=" 대입연산자임 a와 b가 같다라고 쓸때는 a==b 로 작성함
        System.out.println("10 % 3 == 0? :"+ result8);

        boolean result9 = 10 % 3 != 0;
        System.out.println("10% 3 !=0?:"+ result9);


    }
}
