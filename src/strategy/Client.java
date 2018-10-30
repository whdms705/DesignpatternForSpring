package strategy;


//무기를(전략)를 조달하여(생성) 군인(컨텍스트)에게
//지급(주입)해 줄 보급 장교(클라이언트 ,제3자)
public class Client {
    public static void main(String[] args) {
        Strategy strategy = null;
        Solider rambo = new Solider();

        //총을 람보에세 전달해서 전투를 수행하게 한다.
        strategy = new StrategyGun();
        rambo.runContext(strategy);

        System.out.println();

        //검을 람보에세 전달해서 전투를 수행하게 한다.
        strategy = new StrategySword();
        rambo.runContext(strategy);

        System.out.println();


        //활을 람보에세 전달해서 전투를 수행하게 한다.
        strategy = new StrategyBow();
        rambo.runContext(strategy);

        System.out.println();
    }
}
