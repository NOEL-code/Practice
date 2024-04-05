package day03;

public class EX05 {
    public static void main(String[] args) {
        Netflix netflix = new Netflix();
        Tiving tiving = new Tiving();

        netflix.play();
        netflix.finish();

        tiving.play();
        tiving.finish();
    }
}

class OTT{
    void printOpeningLogo(){

    };
    void play(){
        printOpeningLogo();
        System.out.println("영상 시작");
    };

    void finish(){
        System.out.println("다 봤다.");
    }
}

class Netflix extends OTT{

    @Override
    void printOpeningLogo() {
        System.out.println("넷플릭스");
    }

}

class Tiving extends OTT{

    @Override
    void printOpeningLogo() {
        System.out.println("티빙");
    }

}
