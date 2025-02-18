package chapter13_abstraction.abstract_class;

public class PhoneFactory extends Factory {
    // 생성자 및 메서드를 일일이 복사 및 타이핑 할 필요 없으 ㅁ-> 빨간줄 딸깍딸깍 ㄱ
    public PhoneFactory(String name) {
        super(name);
    }
    // Factory 클래스에 잇던 추상 메서드인 produce를 override 하니까 구현부가 자동생성됨
    // 우리는 PhoneFactory 클래스에서 추상메서드를 구현부가 잇는 메서드로 "재정의" 해서 사용함
    @Override
    public void produce(String model) {
        System.out.println("["+ model+ "] 모델 스마트폰을 생산합니다.");
    }
    @Override
    public void manage(){
        System.out.println("스마트폰 공장을 관리합니다.");
    }
}
