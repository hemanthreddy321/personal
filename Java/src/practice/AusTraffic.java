package practice;

public class AusTraffic implements CentralTraffic{
    public static void main(String[] args) {
        CentralTraffic ausTraffic = new AusTraffic();
        ausTraffic.greenGo();
        ausTraffic.redStop();
        ausTraffic.yellowFlash();
        AusTraffic ausTraffic1 = new AusTraffic();
        ausTraffic1.walkOn();
    }
    @Override
    public void greenGo() {
        System.out.println("greenimpl");
    }

    @Override
    public void redStop() {
        System.out.println("redimpl");
    }

    @Override
    public void yellowFlash() {
        System.out.println("yellowimpl");
    }
    public void walkOn(){
        System.out.println("walk");
    };
}
