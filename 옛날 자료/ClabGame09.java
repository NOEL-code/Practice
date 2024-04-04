import java.util.Scanner;
public class ClabGame09 {

	public static void main(String[] args) {

	int iClabCount_09, iMog_09, iNmg_09, iInPutNum_09;	
		
	Scanner objInt;
	
	objInt = new Scanner(System.in);
	
	System.out.println("1~99 사이의 정수를 입력하시오>>");
	
	iInPutNum_09 = objInt.nextInt();
	
	
	iClabCount_09 = 0;
	iMog_09 = iInPutNum_09 / 10;
	// 몫 구하기
	iNmg_09 = iInPutNum_09 % 10;
	// 나머지 구하기
	if(iMog_09 == 3 || iMog_09 == 6 || iMog_09 == 9) {
		iClabCount_09 = iClabCount_09 + 1;
	}
	// 몫이 3,6,9면 짝 카운트 =1
	if(iNmg_09 == 3 || iNmg_09 == 6 || iNmg_09 == 9) {
		iClabCount_09 = iClabCount_09 + 1;
	}
	// 나머지 3,6,9면 짝 카운트 =1
	
	if(iInPutNum_09 > 1 && iInPutNum_09 < 100) { // 1~99 범위 안에서만 출력하기
		if(iClabCount_09 > 0) { // 짝 카운트가 1이상이면 출력 시작
			System.out.print("박수"); 
			for(int i = 0; i < iClabCount_09; i++) { // 짝 카운트 갯수큼 출력
				System.out.print("짝");
			}
		iClabCount_09 = 0; // 짝 카운트 초기화
		}
	}
	else{
			System.out.println("1~99 사이의 정수가 아닙니다"); // 범위 벗어 낫을 시 출력
	}
	objInt.close();
		
	}

}