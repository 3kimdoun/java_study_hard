package chapter16_bean.person;

public class Person {
    //이하의 코드는 그대로 뒀을 경우 빨간줄이 뜨는데 두가지 해결방법
    //1.name에 값을 대입해 상수를 초기화
    //2.final이 ㅂ ㅌ은 변수를 필수적으ㅡ로 포함ㅁ하는 매개변수 생성ㅈ자를 만들것
    private final String name;
    private int age;

    // 필수적인 필드를 포함한 RequriedArgsConstructor를 생성
    public Person(String name) {
        this.name = name;
    }

    // 필수 필드 및 옵션 필드를 전부 포함한 생성자 -> AllArgsConstructor에 해당
    public Person(String name, int age) {
        this.name = name;
        this.age = age;


    }

}
