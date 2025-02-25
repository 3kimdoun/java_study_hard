package chapter18_generic.wildcard;
/*
    와일드 카드 (wildcard)
        : 와일드카드는 제네릭 타입을 좀 더 유연학[ 사용할 수 있도록 보조하는 역할
            표기방식 -> '?'

        1. 상한 경계 와일드 카드
            <? extends T> : T 의 하위 타입만 허용
        2. 하한 경계 와일드 카드
            <? super T> : T의 상위 타입만 허용
 */
public class Main {
    public AnimalData<? extends Animal> getAnimail(int flag){
        if(flag ==1){
            AnimalData<Human> animalData =new AnimalData<>(new Human());
            return animalData;
        } else if (flag ==2) {
            AnimalData<Tiger> animalData =new AnimalData<>(new Tiger());
            return animalData;
        }
        return null;
    }



//    public static void main(String[] args) {
//        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
//        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
//        AnimalData<Car> animalData3 = new AnimalData<>(new Car());
////여기선 오류가 안남
//        animalData1.printData();
//        animalData2.printData();
//        animalData3.printData();   //카를 애니멀로 형 변환 ㅎ려 하닊 오류 발생
//        //여기서 문제점은 꼬 ㄱ호출을 해봐야 오류가 발생한다는것을 인지할 수 있다는 점
//
    //메인 클래스의 객체 생성
    Main main = new Main();
    AnimalData<? extends Animal> animalData3 = main.getAnimail(1);
    AnimalData<? extends Animal> animalData4 = main.getAnimail(2);
    //이상의 코드는 메인에 잇는 겟애니멀() 메서드를 통해서 간접적으로 휴먼 객체 및
    //애니멀 객체를 생성하는 고정이라고 볼수 있음

   if (animalData3 != null){
        animalData3.printData();
    }


}
