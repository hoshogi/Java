package hw4;

interface MobilePhone {
    void sendCall();
    void receiveCall();
    void sendSMS();
    void receiveSMS();
}

interface MP3 {
    void play();
    void stop();
}

class PDA {
    int calculate(int a, int b) {
        return a + b;
    }
}

class SmartPhone extends PDA implements MobilePhone, MP3 {
    @Override
    public void sendCall() { System.out.println("전화 걸기"); }

    @Override
    public void receiveCall() { System.out.println("전화 받기"); }

    @Override
    public void sendSMS() { System.out.println("SMS 보내기"); }

    @Override
    public void receiveSMS() { System.out.println("SMS 받기"); }

    @Override
    public void play() { System.out.println("음악 재생"); }

    @Override
    public void stop() { System.out.println("재생 중지"); }

    public void scheduler() {
        System.out.println("일정 관리");
    }

    public void applicationManager() {
        System.out.println("어플리케이션 삽입/삭제");
    }
}

public class SmartPhoneTest {
    public static void main(String[] args) {
        MobilePhone p = new SmartPhone();
        p.sendCall();
        ((MP3)p).play();
        System.out.println(((PDA)p).calculate(3, 5));
        ((SmartPhone)p).scheduler();
    }
}

/*
public class SmartPhoneTest {
    public static void main(String[] args){
        SmartPhone p = new SmartPhone();
        p.sendCall();
        p.play();
        System.out.println(p.calculate(3,5));
        p.scheduler();
    }
}
*/