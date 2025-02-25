package chapter17_static.builders;

/*
    1.빌더 패턴 이란


    주요특징 :
    1) 객체를 생성하는 여러 개의 필드를 '명시적'으로 관리할 수 있음.
    2) 불필요한 생성자 오버로딩을 줄여 가독성을 높임 (기본생성자 /필드1만 포함하는 생성자/
        필드2만 포함하는 매개변수 생성자 / 필드1,2를 다 포함하는 매개변수 생성자)
    3) 체이닝 메서드를 사용하여 객체를 직관적으로 생성

    2. 빌더 패턴이 생기게 된 원인
        1) 복잡한 생성자 문제
            객체의 필드가 많아질 수록 생성자의 파라미터 수도 늘어남
        2) 생성자 오버로딩 문제- 생성자에 필요한 조합이 다를 경우 수많은 생성자를 만들어야함
            -> 유지보수에 악영향 / 필드 하나 추가하며 ㄴ생성자를 싸그리 다 고쳐야한다는 문제
        3) 가독성과 유지보수
            코드를 작성하고 읽는 입장에서 객체를 생성할 때 어 떤값이 어떤 ㅊ필드에 해당하는지가
            명확하지 않아 실수를 유발가능

 */

import lombok.ToString;
@ToString
public class Person {
//    private final String address;
    //필드선언
    private String name;
    private int age;
    private String address;
//
//    public Person() {
//    }
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    public Person(int age) {
//        this.age = age;
//    }
//
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Person(int age, String address) {
//        this.age = age;
//        this.address = address;
//    }
//
//    public Person(String name, String address) {
//        this.name = name;
//        this.address = address;
//    }
//
//    public Person(String name, int age, String address) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }
    //-> 너무 길고 번거로워서 필더패턴이 생겨남
    //여기서부터 빌더패턴의 구성을 위한 코드작성

    private Person(Builder builder){            //접근 지정자가 프라이빗이기 때문에 객처생성 불가능
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }
    //이상의 코드를 봣을떄 빌더 클래스의 객체인 빌더의 인스턴스 변수인
    //네임 에이지 ㅋ어드레스를 펄슨 객체의 인스턴스 변수 네임 에이지 어드레스에 대입하는 구조

    //객체를 생성하는 메인 단계에서 빌더를 통해  펄슨 객체를 생성할 것이기 때문에 퍼블릭
    public static class Builder{
        //빌더 클래스의 필드 선언
        //상위 클래스의 필드와 동일해야 함
        private String name;
        private int age;
        private String address;

        //빌더 클래스의 메서드 정의
        // 여기서 중요한 점이 메서드명인데 제가 수업할 때 메서드명은 동사라고 이야기햇지만
        //여기서는 펄슨의 필드명과 동일하게 작성할 예정.

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder age (int age){
            this.age = age;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }

        //최종 펄슨 객체 생성 메서드
        public Person build(){
            return new Person(this);

        }


    }
}
