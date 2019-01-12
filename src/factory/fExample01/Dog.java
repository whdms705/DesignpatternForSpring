package factory.fExample01;

// 추상 팩터리 메서드 오버라이딩
public class Dog extends Animal {
    @Override
    AnimalToy getToy() {
        return new DogToy();
    }
}
