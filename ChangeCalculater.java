import java.util.Scanner;
public class ChangeCalculater {

	public static void main(String[] args) {

		
		Scanner objMoney;
		objMoney = new Scanner(System.in);
		
		
		int iUnit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		int iInputMoney;
		int iMok;
		System.out.println("금액을 입력하시오.");
		
		iInputMoney = objMoney.nextInt();
		
		for(int i=0;i<iUnit.length;i++) {
			iMok = iInputMoney / iUnit[i];
			if(iMok > 0) {
			System.out.println(iUnit[i] +"원 짜리 : " +iMok +"개");
			}
			iInputMoney = iInputMoney % iUnit[i];
		}
		
		objMoney.close();
	}

}
