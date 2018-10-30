package adapter;

public class ClientNoAdapter {
    public static void main(String[] args) {

        // adapter 패턴을 사용하기 전
        /*BeforServiceA sa1 = new BeforServiceA();
        BeforServiceB sa2 = new BeforServiceB();

        sa1.runServiceA();
        sa2.runServiceB();*/

        // adapter 패턴을 사용
        AdapterServiceA asa1 = new AdapterServiceA();
        AdapterServiceB asb1 = new AdapterServiceB();

        asa1.runService();
        asb1.runService();

    }
}
