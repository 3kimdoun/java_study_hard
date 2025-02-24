package chapter17_static.singleton;

import lombok.Getter;

public class Samsung {
    @Getter
    //필드 위에 게터 사용하면 getCompany 만들겟단 뜻
    private  String company;
    private int serialNumber;

    //singleton 패턴 작성
    //1. 스태틱 변수 정의 -> 보통 싱글톤 만들 때 객체명을 instance로 쓰는 편
    private static Samsung instance = null; //자료형이 삼성 인 정적변수

    //2.기본 생성자 정의
    private Samsung(){
        company = getClass().getSimpleName(); //패키지를 떼고 클래스명만 가지고 오는 애
        serialNumber = 20250000;

    }
    //3.static 메서드 정의 -> 대부분의 경우 getInstance()로 정의함
    public static Samsung getInstance(){
        if (instance ==null){       //현재 인스턴스가 없다면 이하의 코드가 실행됨
            instance = new Samsung();   //Samsung 클래스의 객체 생성
        }                                   //static변수인 instance에 대입
        return instance;                        //instance가 이미 있다면 return만 시랳ㅇ됨


        //만약 이상의 조건문이 실행되지 않는다면 이미 기존의 인스턴스가 잇단 으미ㅣ임
        //즉
    }

    public String creatserialNumber (String model){
        return model + "-" + ++serialNumber ;
    }



}
