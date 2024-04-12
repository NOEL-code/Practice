    package day07;

    public class CalcDemo {
        public static void main(String[] args) {

            CalcModel calcModel = new CalcModel(); // CalcModel 생성
            CalcController calcController = new CalcController(calcModel); // CalcController 생성
            CalcView calcView = new CalcView(calcController);
        }
    }