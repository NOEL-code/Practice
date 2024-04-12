package day07;

//DB, 로직: 데이터 처리
public class CalcModel{

    public ParamResDTO plus(ParamReqDTO paramReqDTO){
        return new ParamResDTO(paramReqDTO.getNum1()+ paramReqDTO.getNum2());
    }
}
