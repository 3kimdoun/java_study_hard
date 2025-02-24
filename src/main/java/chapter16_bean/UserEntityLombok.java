package chapter16_bean;

import lombok.Getter;
import lombok.Setter;
/*
    ctrl + alt + s / 상단에 메뉴바(햄버거) file - settings들어갑니다
    command + ,

    Lombok 설치 과정
    좌측 부분 스크롤링해서 하단으로 내려가면 plugin에서 lombok ->
    설치 -> enabled되게끔합니다 (disabled가 보이면 현재 활성화상태)

    chrome mvn이라고 검색합닏다 Maven Repository가 나오게 되는데
    거기 검색창에서 lombok 검색합니다.
    build system에 맞게 버전 선택하고 의존성을 추가하면 되는데,
    저희는 애초에 만들때 gradle로 만들었기 때문에 build.gradle에 있습니다.

    build.gradle에 의존성 부분에 추가를 하고 나서
    maven 경우에는 pom.xml에 dependencies에 추가하고 나서
    -> 코끼리 새로고침 해야합니다.

    20250224 수업 예정 내용 -> 그래서 롬복은 어디다가 / 왜 쓰는거고 / 어떤 기능이 있는지

    Lombok
        Java에서 반복적으로 작성해야하는 코드를 자동으로 생성해주는 라이브러리

        장점 :
            코드의 가독성을 높일 수 있다. -> 주석을 통한 애너테이션을 붙여 코드 생성을 제어가능
            특히 스크롤링해서 특정필드의 .setter가 있는지 ㅇ벗는지에 대해 고려할 필요 없이
            @파트만 보더라도 대략적인 코드의 흐름을 알 수 있음

        1. @Dara
            - @Getter, @Setter, @RequiredArgsConstructor, @ ToSting, @EqualAndHshCode
            애너테이션을 전부 포함한 종합 패키지에 해당

        2. @NoArgsConstructor
            -기본 생성자를 생성
        3. @RequiredArgsConstructor
            -final 또는 @NotNull로 지정된 필드를 매개변수로 받는 생성자를 생성

        4.@Getter, @Setter
            -각 필드에 대해 게터 세터 메서드들을 생성
            -클래스 레벨에 사용하면 모든 필드에대해 필드레벨에 사용하면 특정 필드에 대해서만
                게터 세터가 생성됨->
        5. @EqualAndHshCode
            -equals() 와 hashcode() 메서드들을 자동으로 생성 -> 둘이 세트로 만들어줘야하기 때문

        6. @ToString
            toStrin() 메서드들을 자동으로생성
            -객체의 필드값을 문자열로 표현해주는 메서드
        6.@AllArgsConstructor
            - 모든 필드를 포함하는 매개변수 생성자를 새엇ㅇ
            -@Data에 포함돼 있지 않다는 점에 주의

 */

@Setter
@Getter
public class UserEntityLombok {
    private int username;
    private int password;
    private String email;
    private String name;

    public void setUsername(int i) {
    }
}
