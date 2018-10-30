package strategy;

// 전략을 사용하는 군인
public class Solider {
    void runContext(Strategy strategy){
        System.out.println("전투 시작");
        strategy.runStrategy();
        System.out.println("전투 끝");
    }
}
