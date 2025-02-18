package chapter13_abstraction.abstract_class;

public abstract class Factory {
    private  String name;

    public  Factory (String name){
        this.name =name;
    }
/*
    추상 메서드의 정의
    : {} 가 없는 애다 // 구현부가 없다 // method body 가 없다
    access modifier 와 return type 사이에 abstract 를 삽입해주면 추상 메서드로 선언됨
     -> 선언햇으며 ㄴ퍼블릭과 클래스 사이에도 앱스트르렉으를 넣어줘야 오류가 나지 않음

     왜 ? 추상메서드가 "하나라도" 있으면 추상 클래스
 */
    // 여기 부터는 추상 메서드가 아닌 애들
    public abstract void produce(String model) ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void printInfo(){
        System.out.println( "공장의 정보를 출력합니다 \n"+ name);
    }


    public abstract void manage();
}
