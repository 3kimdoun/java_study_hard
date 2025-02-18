package chapter13_abstraction.interfaces;

public class VolumeDownButton extends Button {
    @Override
    public void onPressed() {
        System.out.println("음량을 한 칸 내립니다.");
    }

    @Override
    public void onDown() {
        super.onDown();  //슈퍼클래스의 메서드를 호출하는 키워드엿음
        //근데 구현한게 없어서 잇어도그만 없어도 그만 여기선 남겨두갯음
        //그리고 볼륨업버튼에서는 없애서 비교하도록 하겟음
        System.out.println("음량을 계속내립니다");
    }
}
