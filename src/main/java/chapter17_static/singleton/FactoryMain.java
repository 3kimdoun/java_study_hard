package chapter17_static.singleton;
/*
    싱글톤 패턴(Singleton Pattern)
        :소프트위에 '디자인패턴' 중 하나로 어떤 클래스가 하나의 안스턴스만 갖도록 보작아혹
        그 인스턴스에 접근할 수 잇는 접근법을 제공하는 패턴
        예르르들어 데이터 베이스 연결과 같ㅊ은 리소스는 프로그램 전체에서 하나의 인스턴스만 사용해야할 때가 많기 때문에
        싱글톤패턴은 유용함

    특징
        1.하나의 인스턴스만 존저
        하나의 인스턴스만 생성되고 이 인스턴스는 프로그램이 실행되는 동안 유지
        2.전역 접근법
        싱글톤 인스턴스는 정적 메서드를 통하여 어디서든 접근가능
        -> 객체명.메서드면() x /클래스명.메서드명() o
        3. 인스턴스의 생명주기관리
        클래스 자체가 인스턴스 생성을 관리하므로 다른 객체들이 직접 인스턴스를 생성하거나 폐기할 수 없음

    장점
        1.메모리 절약 : 불필요한 인스턴스 생성 방지 메모리 절약가능
        2.글로벌(전역적)_접근: 전역적으로 접근 가능해 메모리 관리 용이
                       -> 하지만 잦은 접근자체는 단점에 해당
        3.일관성 유지 : 애플리케이션 전반에서 하나의 인스턴스만 사용하기 때문에 상태 일관성을 유지

    단점
        1.테스트 어려움: 싱글톤 패턴은 전역적으로 사용되므로 단위테스트가 어려울 수 있음
                    -> 단위테스트란 표현은 보통 메서드 단위로 이루어지는테스트를 의미
        2.의존성 숨김 : 싱글톤을 남용하면 클래스간의 의존성을 추적하기 어려움
 */
public class FactoryMain {

    public static void main(String[] args) {
        Factory factory1 = new Factory("1공장");
        Factory factory2 = new Factory("2공장");
        Factory factory3 = new Factory("3공장");
        Factory factory4 = new Factory("4공장");
        //잘못된 사례 0
//        SmartPhone smartPhone0 = new SmartPhone("삼성", "갤럭시 27",":2025000");
//        System.out.println();

        //싱글톤패턴 사용 -> 팩토리 객체를 통한 스마트폰 객체 ㅐㅅㅇ성
        SmartPhone smartPhone1 =factory1.produceSmartPhone();
        SmartPhone smartPhone2 =factory2.produceSmartPhone();
        SmartPhone smartPhone3 =factory3.produceSmartPhone();
        SmartPhone smartPhone4 =factory4.produceSmartPhone();
        System.out.println(smartPhone1);
        System.out.println(smartPhone2);
        System.out.println(smartPhone3);
        System.out.println(smartPhone4);



    }

}
