package chapter13_abstraction.abstract_class;

public class TabletFactory extends Factory {

    public TabletFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("["+ model+ "] 모델 테블릿을 생산합니다.");

    }

    @Override
    public void manage() {
        System.out.println("테블릿 공장을 관리합니다.");

    }
}
