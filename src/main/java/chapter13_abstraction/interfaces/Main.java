package chapter13_abstraction.interfaces;
/*
    인터페이스
        인터페이스는 자바에서 클래스가 구현해야하는 '메서드들'의 집합을 정의하는
        일종의 규약 (protocol)

        인터페이스는 메서드의 시그니처(메서드이름, 리턴타입, 매개변수 목록) 만을
        포함하며, 메서드의 실제 구현은 포함핮지 않음
            ->
        다중 상속을 지원 -> 이를 통해 클래스가 여러 인터페이스를 구현할 수 있음
            : 추상 클래스는 단일 상속을 지원해서 상속과정을 알아보기 쉽다고
            20250217 에 수업함 -> 차이점

        특징
            1. 추상 메서드 : 인터페이스 내의 모든 메서드는 기본적으로 추상 메서드
            2. 상수 : 인터페이스 내에세ㅓ 선언된 변수는 모두 '자동으로'
                public static final 상수로 취급된
            3. 다중 상속 : 클래스는 여러 인터페이스를 구현할 수 있음

        추상 클래스와의 공통점
            - 모두 추상 클래스를 포함할 수 있고, 이를 서브클래스에서 구현해야한다

        추상클래스와의 차이점
            - 추상클래스
                1. 부분 구현 허용 : 추상클래스는 추상메서드 뿐만 아니라
                일반 메서드도 포함할 수 있다
                2. 상태 저장 가능: 추상클래스는 인스턴스변수(상태) 를 가질 숭 ㅣㅆ다
                3. 단일 상속 : 클래스는 하나의  추상클래스만을 상속 받을 수 있다
                4. 생성자 : 추상클래스는 생성장를 가질 숭 ㅣㅆ다
                5. 다양한 접근제어자
                     : 추상클래스의 메서드와변수는 다양한 접근제어자 를 가질수잇다

            -인터페이스
                1. 완전한 추상화 : 인터페이스는 기본적으로 모든 메서드가 추상메서드
                자바 8 이후 디폴트 스태틱 메서드를 사용가능하긴함
                2. 인터페이스는 인스턴스 변수 (필드 중 객체마다 값이 다른 변수)를 가질 수 있는
                상수만 선ㄴ언가능
                3. 다중상속 : 클래스는 여러 인터페이스를 '구현할수있다'
                4. 생성자 없음: 인터페이스는 생성자를 가질 수 없다
                    -> 일단 필드에서 객체마다 다른 값을 가지게되는 인스턴스 변수가 없는
                    생ㅅ성자 생성이 불가능 -> 객체마ㅏ 다른 값을 갖질수없다는 으미
                5. 자동 PUBLIC : 인터페이스이

*/
public class Main {
    public static void main(String[] args) {
        RemoteController remoteController =new RemoteController(
                new PowerButton(),
                new VolumeDownButton(),
                new VolumeUpButton()
        );
        //RemoteController remoteController =new RemoteController();까지 작성햇을 경우에
        /*
            저희가 매개변수 생성자로 정의했기 때문에 오류가 발생함. 그래서 argumnet들을
            채워넣을 필요가 있는데

            RemoteController의 객체를 생성햇고 객체명이 remoteController임.
            클래스명1 객체명1 = new 클래스명 1(argument1, ...);
            클래스명2 객체명2 = new 클래스명 1(new 클래스명 3(), ...);

            이상의 경우 new 클래스명3() ,new 클래스명4()를 통해 객체생성은 이미 '완료'됨
                -> 생성자의 정의 : 객체가 생성될 떄 자동으로 호출되는 특별한 메서드
            다만 차이점은 무냐 -> 객체명이 없을 뿐
         */

        remoteController.onPressedPowerButton();
        remoteController.onPressedPowerButton();
        /*
            다중 상속을 지원하지 않는 자바클래스에서 remoteController 라는 객체가
            파워버튼/VD /VU 에 있는 메서드 5개를 전부 호출할 수 있도록 하기 위해
            필드로 PB / VD / VU  를 가지고 생성자의 argument로 사용한다음
            RemoteController 의 일반 메서드로 PB의 메서드 호출을 할 수 있도록 정의

            Main.java 에서 remoteController.onPressedPowerButton();로 호출하면
            onPressedPowerButton(); 얘가
            powerButton.onPressed(); 얘를 또 따로호출해서
            이중호출을 하는 방식으로 전체기능을 구현할 수 있도록 작성함
         */
        remoteController.onPressedVolumeDownButton();
        remoteController.onDownVolumeDownButton();
        remoteController.onPressedVolumeUpButton();
        remoteController.onUpVolumeUpButton();

    }
}
