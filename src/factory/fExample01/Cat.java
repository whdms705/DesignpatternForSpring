package factory.fExample01;

//@Content : 추상 팩토리 메서드 오버라이딩
public class Cat extends Animal {
    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}
