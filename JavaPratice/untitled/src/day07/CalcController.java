package day07;

public class CalcController {

    CalcModel calcModel;

    public CalcController(CalcModel calcModel) {
        this.calcModel = calcModel;
    }

    public int plus(int num1, int num2){

        ParamReqDTO paramReqDTO = new ParamReqDTO(num1, num2);
        ParamResDTO paramResDTO = calcModel.plus(paramReqDTO);

       return paramResDTO.getNum();
    }

    public int minus(int num1, int num2){
        ParamReqDTO paramReqDTO = new ParamReqDTO(num1, num2);

    }
}
