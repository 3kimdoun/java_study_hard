package chapter18_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class AnimalData<T> {
    private T animal;

    public void printData(){
        ((Animal)animal).move();  //AnimalData 내의 멤버 변수인 animal을 Animal 타입으로
        //형변환 .move() 메서드를 호출
        if(animal.getClass()== Human.class){
            ((Human)animal).read();
        } else if (animal.getClass()== Tiger.class) {
            ((Tiger)animal).hunt();
        }
    }


}
