package day05;

public class EX03 {

    public static void main(String[] args) {

        int date = 801;
        int charge;
        int quantity = 10;
        int _summerRate = 1000;
        int _winterRate = 1000;
        int _winterServiceCharge = 1000;

        if(isSummer(date)){
            charge = quantity * _summerRate;
        } else {
            charge = quantity * _winterRate + _winterServiceCharge;
        }

    }

    public static boolean isSummer(int date){
        final int SUMMER_START = 701;
        final int SUMMER_END = 901;

        return date >= SUMMER_START && date <= SUMMER_END;
    }
}
