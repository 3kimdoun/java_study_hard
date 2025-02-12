package chapter09_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
//        // p 객체 생성
        Person person1 = new Person();        //정의하지 않아도 ㄱㅊ

//        person1.name ="안근수";   /프라이빗 적용후에는 오류가 발생하기 때문에 주석처리함!!!
//        person1.age= 1000;  //
//
//        System.out.println(person1.age);

//        person1.setName("ㄱㄷㅇ");
//        person1.setName("김ㄱㄴㄷㄹㅁ");  //얘 실행해봐도 바뀌지 않았음 을 확인 ㄱㄴ
//        person1.setName("김ㄷㄷ");  //얘가 호출됐을 때 변경 전 이름이 안근수라는 점에서 알수잇음
//
//        person1.setAge(1000);

//        person1.setAge(201);
        person1.setAge(30);
        person1.setAge(30);



        System.out.println("제 이름은" + person1.getName() + "입니다");
        System.out.println("제 나이는" + person1.getAge() + "살 입니다. 내년에는"+ (person1.getAge()+1)+"살이 됩니다.");

//        System.out.println(person1.);

    }
}
