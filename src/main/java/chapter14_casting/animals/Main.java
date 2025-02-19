package chapter14_casting.animals;
/*
     참조 자료형 캐스팅
        객체 지향 캐스팅(OOP)에서 중요한 요소 중 하나로

        1 . 정의 :
            Java에서 자료형은 크게 두 가지로 구분되는데,
            1) 기본 자료형 : int, double, char 등
            2) 참조 자료형 : 객체를 참조하는 변수로 클래스나 인터페이스로
                            생성된 객체

            참조 자료형 캐스팅은? -> 객체의 자료형을 변환하는 작업
            A a = new A();
            A a = new B();

                캐스팅의 종류
                    1) 업캐스팅 : 하위 클래스의 타입의 객체를 상위 클래스 타입으로 변환
                    2) 다운캐스팅 : 상위 클래스 타입의 객체를 하위 클래스 타입으로 변환

                알아야 할 사항 : 연산자(Operator) instanceof -> 연산자 개념 첫주차 때 함
                        ex) 1 + 1 = 2 에서 +가 연산자
                        ex) 객체명 instanceof 클래스명

        2. 업캐스팅 - 암시적으로 이루어짐 -> 알아서 바뀌긴 함
            -> 다만 ㅓㅇㄴ제 알아서 바뀌었는지는 개발자가 파악할 필요가 있음

        3. 다운캐스팅 - 명시적으로 이루어짐 -> 반드시 개발자가
            적절한 장소와 시간대에 사용해줘야 함

        4. 업캐스팅과 다운캐스팅의 활용
            캐스팅은 주로 다형성을 구현할 때 사용함 상위 클래스타입으로
            객체를 처리하면서도 특정 상황에서는 하위클래스의 고유 기능을 사용가능

        5. 캐스팅의 장단점
            장점 :
                코드 유연성 : 업캐스팅을 통해 '다양한 객체를 하나의 상위 클래스 타입으로 관리'가능
                다형성 구현 : 메서드 오버라이딩과 함께 사용하면 코드의 재사용성을 높일 수 있음

            단점 :
                다운캐스팅의 위험성 : 잘못 다운 캐스팅을 하게 될 수 있음.
                예를 들어 상위클래스 a와 하위클래스 B C 가 있다고 가정할 때
                삐의 객체인 삐를 ㅇ



        instanceof 연산자 : Java 에서 객체의 실제타입을 검사하는데 사용
            ( 어떤 클래스의 객체인지를 확인하는 용도)
            -> 주로 다운 캐스팅의 안전성을 확보하기 위해서 사용함.

            형식 :
                object(객체명) instanceof ClassName (클래스명 ) -> 1 + 2의 + 라고 생각ㄱㄱ

                object :검사하려는 객체명
                ClassName : 객체가 검사될 클래스/ 인터페이스

                return값은 object가 ClassName의 인스턴스이거나 하위클래스의 인스턴스인 경우
                true, 아니면 false
 */

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
//오버라이딩한 메서드
        dog1.makeSound();
//고유 메서드
        dog1.fetch();

        Animal animal1 = dog1;   //업캐스팅 #1 방법
        animal1.makeSound();     //클래스 Dog의 makesound()가 호출됨

        System.out.println("------animal2-----");
        Animal animal2 = new Dog();
        animal2.makeSound();

        Animal animal3  =new Animal();
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);    //true

        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);
        // : object가 인스턴스이거나 '하위 클래스의 인스턴스인 경우' true.

        System.out.println("animal2 검증 부분입니다.");
        boolean result3 = animal2 instanceof Animal;
        boolean result4 = animal2 instanceof Dog;
        System.out.println(result3);
        System.out.println(result4);

        boolean result5 = animal3 instanceof Animal;
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result5);
        System.out.println(result6);

        //Animal animal3 = new Animal(); 로만 만들었기 때문에 아예 업캐스팅이
        //이루어지지 않음

        System.out.println("");











    }
}
