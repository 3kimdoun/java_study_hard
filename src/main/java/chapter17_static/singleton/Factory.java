package chapter17_static.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    private  String facrotyName;

    public SmartPhone produceSmartPhone(){
        System.out.println(facrotyName + "에서 스마트폰을 생산합니다.");

        String model = "갤럭시 26";
        String serial = null;

        Samsung samsung = Samsung.getInstance();


        serial = samsung.creatserialNumber(model);
        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(),model,serial );
        return smartPhone;


    }
}
