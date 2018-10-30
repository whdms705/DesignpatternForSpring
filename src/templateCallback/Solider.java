package templateCallback;

import templateCallback.Strategy;

// 전략을 사용하는 군인
public class Solider {
    void runContext(String weaponSound){
        System.out.println("전투 시작");
        executeWeapon(weaponSound).runStrategy();
        System.out.println("전투 끝");
    }

    private Strategy executeWeapon(final String weaponSound){
        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(weaponSound);
            }
        };
    }
}
