package chapter13_abstraction.interfaces;

public class AirConditionerController {
    private PowerButton powerButton;
    private static TemperatureDownButton temperatureDownButton;
    private static TemperatureUpButton temperatureUpButton;

    public AirConditionerController(PowerButton powerButton,
                                    TemperatureDownButton temperatureDownButton,
                                    TemperatureUpButton temperatureUpButton) {
        this.powerButton = powerButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
    }

    public static void onPressedtemperatureDownButton(){
        temperatureDownButton.onPressed();}
    public static void onDowntemperatureDownButton(){
        temperatureDownButton.onDown();
    }
    public static void onPressedtemperatureUpButton(){
        temperatureUpButton.onPressed();}
    public static void onUptemperatureUpButton(){
        temperatureUpButton.onUp();
    }

    public static void onPressedPowerButton() {

    }
}

