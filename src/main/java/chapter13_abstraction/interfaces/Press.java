package chapter13_abstraction.interfaces;

public interface Press {

    String NAME = "button";
    // interface 이기 때문에 변수 앞에 접근 제어자를 명시하지 않았지만
    //public final 이 생략됨
    //그리고 상수이기 때문에 대문자로 표기햇고
    //일반적인 클래스의 경웇처럼 String name; 세미콜론 마무리가아닌
    //초기화 까지 이루어져야함

    //안되는 것들 예시
//    String name;        //접근 제어자 지정 불가능 -> 선언만 하는 것도 불가능
//    public Press();  //생성자 선언 불가능

//    void pop(){
//        System.out.println("일반메서드입니다.");
//    }
    //구현부가 있는 일반 메서드 선언 불가능
    //default 했더니 구현부 잇는 일반메서드가 되는 것 처럼 나온부분 -> 자바 8
    //업데이트 된 내용이고 default 의 경우 동일 패키지 내에서는  사용가능햇엇음
    //챕터 10 에서 수업한내용

    //되는 것 정의 -> 추상메서드 정의
    void onPressed();

    //interface 인 Up.java 와 Down.java를 생성하시고
    //void 형태인 onUp()메서드, onDown()메서드 선언 ㄱㄱ





}
