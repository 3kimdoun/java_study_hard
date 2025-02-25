package chapter17_static.builders;

public class PersonMAin {
    public static void main(String[] args) {
//        Person person1 = new Person("어떤 필듣드드듣듣");
        //이상의 코드는 현재 오류 발생합니ㅏ 생성자를 다 없애기도 햇고
        //빌더 내부에 펄슨 객체를 생성하는 빌드라는 메서드만

        Person person1 = new Person.Builder()
                .name("안근수")
                .age(38)
                .address("부산")
                .build();

        System.out.println(person1);

        Person person2 = new Person.Builder()
                .name("김이")
                .build();

        Person person3 = new Person.Builder().build();


    }
}
