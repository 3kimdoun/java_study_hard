package chapter13_abstraction.interfaces;
/*
 이 부분에서 고려해야할 점은
 자바는 단일 상속만 가능하기 때문에
 VD/ VU / PB 셋 중 하나만 상속할 수 잇을 거 같은데
 어떻게 위의 메서드들을 다 사용하게 작성할 수 있을까?
 */
public class RemoteController {
    //필드 선언 -> 이전 까지는 자바의 기본자료형만을 사용햇지만
    //이번에 처음으로 우리가 직접정의한 클래스가 자료형이되ㅡㄴ 필드를 정용함
    private PowerButton powerButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;


    public RemoteController(PowerButton powerButton,
                            VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton,
                            ChannelDownButton channelDownButton, ChannelUpButton channelUpButton
                            )
    {
        this.powerButton = powerButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;

    }

    //메서드 구현
    //PowerButton 의 메서드를 구현
    public void onPressedPowerButton(){
        powerButton.onPressed();
    }
    public void onPressedVolumeDownButton(){
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton(){
        volumeDownButton.onDown();
    }
    public void onPressedVolumeUpButton(){
        volumeUpButton.onPressed();
    }
    public void onUpVolumeUpButton(){
        volumeUpButton.onUp();
    }

    public void onPressedChannelDownButton(){
        channelDownButton.onPressed();
    }
    public void onDownChannelDownButton(){
        channelDownButton.onDown();
    }
    public void onPressedChannelUpButton(){
        channelUpButton.onPressed();
    }
    public void onUpChannelUpButton(){
        channelUpButton.onUp();
    }






}
