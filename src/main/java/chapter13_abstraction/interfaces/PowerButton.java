package chapter13_abstraction.interfaces;

public class PowerButton extends Button{

    private boolean status;
    public String name;


    @Override
    public void onPressed() {
        if(status){
            status = false;
            System.out.println("전원을 끕니다.");
        }else {
            status =true;
            System.out.println("전원을 켭니다.");
        }
    }


    /*
    PowerButton.java 에서 확인할 수 잇듯이
    걔는 전원을 켜고 끄는 것만 하는 상황이므로
    onUp()메서드 혹은 onDown() 메서드를 굳이 Override할 필요가 없습니다
    하지만 abstract로 선언한 메서드는 반드시 자식클래스에서 구현되어야 하므로
    onUP,onDown()메서드들을 앱스트렉트로 선언하면
    파워버튼 클래스에 불피료한 메서드들을 구현해야하므로
    onPRessed만 앱스트ㄹㄱ트로 선언함

    VolumeUpBotton / VolumeDownButtom클래스 생성 ㄱㄱ
     */
}
