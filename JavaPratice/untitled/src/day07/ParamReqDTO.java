package day07;

public class ParamReqDTO {
    private int num1;
    private int num2;

    ParamReqDTO(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}
