package chapter05_condition;
/*
     조건문

     1. if문 : if 다음에 있는 () 내의 조건문이 true 일 때, {} 내의 실행문이 실행됨. false면 안됨

     형식 :
     if (조건식) {     조건식 : true / false 로 결론이 날 수 있는 식 또는 문장
            실행문
    }
    2. if - else 문 : if 다음에 있는 () 내의 조건식이 true일 때는 if에 종속된ㅇ{} 내의 실행문이 실행됨
    false 면 else에 종속된 {} 내의 실행문이 실행됨

    형식 :
    if (조건식) {
        실행문1
    } else {     else 의 경우 if가 false일 때만 실행된기 떄문에 별도의 조건식이 없음
        실행문 2
    }

 */

public class Condition01 {
    public static void main(String[] args) {
       int num = 10;
//1번
        if (num> 0 ){
            System.out.println("num 은 양수입니다");
        }
      // 2번
       if (num> 0 ){
           System.out.println("num 은 양수입니다");
       }else {
           System.out.println("num 은 0이거나 음수");
       }
    }
}
