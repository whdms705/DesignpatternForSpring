package adapter;

public class AdapterServiceA {
    BeforServiceA sa1 = new BeforServiceA();
    void runService(){
        sa1.runServiceA();
    }
}
