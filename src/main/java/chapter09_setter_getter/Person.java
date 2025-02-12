package chapter09_setter_getter;

public class Person {
    private String name;
    private int age ;

    // 기본 생성자 , 매개변수가 하나인 매개변수 생성자 두 개 매개변수가 두개인 매개변수 생성자 하나
    //생성 ㄱㄱㄱㄱㄱㄱㄱㄱㄱ


    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        //setName의 경우 메서드 이기 때문에 내부에 로직을 설계 가능함
        //스트링 네임의 길이가  4글자 초과라면 메서드를 강제 정지시킴으로써 입력을 불가능 하게 막기 가능
        if (name.length() > 4 ) {
            System.out.println("이름의 글자 수를 초과했습니다");
            return;     //메서드에 리턴으로 작성하면 메서드 자체 종료
        }
        System.out.println("이름을 대입했습니다.");
        System.out.println("이름을 수정합니다");
        System.out.println("변경 전 이름 : "+ this.name);

        this.name = name;
        System.out.println("변경 후 이름 : "+ this.name);

        this.name =name;
    }
    public void setAge(int age) {
        //0 미만이고 200초과  값이 입력됐을 경우에는 "불가능한 나이 입력입니다"
        //라고 출력시키고
        //0이상 200 이하의 값이 입력됐을 경우에는 값대임
        //나이가 입력되었습니다.

        if (age < 0 || age > 200 ){
            System.out.println("불가능한 나이 입력입니다.");
            return;
        }
//        else {
//            System.out.println("나이가 입력되었습니다.");
//        }
        System.out.println("나이가 입력되었습니다.");
        this.age = age;
    }

    public void setInfo(String name, int age){
        this.name = name;
        this.age = age;
    }

    //게터구조

    public String getName(){
        return name;
    }

    //getAge()를 정의하시고 PersonMain.java 에서 person01 객체를 나이를 조회하여
    //저는 올해 --살입니다 내년에는 --+1 살이됩니다  가 출력되도록
    //작성 ㄱㄱㄱ

    public int getAge(){
        return age;
    }






}
