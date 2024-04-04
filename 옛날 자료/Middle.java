import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		Scanner objInt09;
		objInt09 = new Scanner(System.in);
		
		int iNum1_09, iNum2_09, iNum3_09, iMid;
		iMid = 0;
		
		System.out.println("정수 3개를 입력>>");
		
		iNum1_09 = objInt09.nextInt();
		iNum2_09 = objInt09.nextInt();
		iNum3_09 = objInt09.nextInt();
		
		if(iNum1_09 >= iNum2_09) { // 1이 2보다 큰 경우
			
			if(iNum2_09 >=iNum3_09) {	
				iMid = iNum2_09; // 1이 2보다 크고 2가 3보다 크 2가 중간값
			}
			else if(iNum1_09<=iNum3_09) {
				iMid = iNum1_09; // 1이 2보다 크고 1이 3보다 작으면 1이 중간값
			}
			else {
				iMid = iNum3_09; // 2가 3보다 작고 1이 3보다 크면 3이 중간값
			}
		}	
		else if(iNum1_09 >iNum3_09) { // 1이 2보다 작고 1이 3보다 큰경우
			iMid = iNum1_09;	// 1이 중간 값
		}
		else if(iNum2_09 > iNum3_09) { // 1이 2보다 작고 2가 3보다 큰 경우
			iMid = iNum3_09; // 3이 중간 값
		}
		else {
			iMid = iNum2_09; //1이 2보다 작고 3이 2보다 큰 경우2가 중간값
		}

		System.out.print("중간 값은 " + iMid);
		
		objInt09.close();
	}

}
