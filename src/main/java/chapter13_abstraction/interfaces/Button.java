package chapter13_abstraction.interfaces;
/*
    인터ㅠㅔ이스는 일반클래스와 달리 다중 상속이 가능
    그렇기 대문에 일반클래스와 상속관련 명령어도 다름
    extends(일반 클래스 상속시)
    implements(인터페이스 상속 시)
 */
public abstract class  Button implements Press, Up, Down {
    @Override
    public void onDown() {

    }

    @Override
    public abstract void onPressed();


    @Override
    public void onUp() {

    }
}
