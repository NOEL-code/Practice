import java.util.Scanner;
public class Pitagoras {

	public static void main(String[] args) {

		Scanner objInTri;
		objInTri = new Scanner(System.in);
		
		int iATri_09[]; //A원의 정보
		int iBTri_09[]; //B원의 정보
		int iACount_09; //A원의 배열의 길이(루프 돌리기 용도)
		int iBCount_09; //B원의 배열의 길이(루프 돌리기 용도)
		int iLenth1_09; //A,B 원의 중심으로 만든 삼각형 첫번째 변의 길
		int iLenth2_09; //A,B 원의 중심으로 만든 삼각형 두번째 변의 길	
		int iRadius_09; //A,B 원의 중심으로 만든 삼각형 세번째 변의 길(반지름을 이용함)
		
		int i;
		
		iATri_09 = new int [3];
		iBTri_09 = new int [3];
		
		iACount_09 = iATri_09.length;
		iBCount_09 = iBTri_09.length;
		System.out.print("첫번째 원의 중심과 반지름 입력");
		for(i = 0; i <iACount_09; i++) {
			iATri_09[i] = objInTri.nextInt();	
		} //A원의 정보 입력
		System.out.print("두번째 원의 중심과 반지름 입력");
		for(i = 0; i <iBCount_09; i++) {
			iBTri_09[i] = objInTri.nextInt();
		} //B원의 정보 입력
		
		iLenth1_09 = iATri_09[0] - iBTri_09[0]; // 첫번 째 변의 길이 구하기
		iLenth2_09 = iATri_09[1] - iBTri_09[1]; // 두번 째 변의 길이 구하기
		iRadius_09= iATri_09[2] + iBTri_09[2];  // 세번 째 변의 길이 구하기
		
		iLenth1_09 = iLenth1_09 * iLenth1_09; // 첫번째 변의 길이를 제곱
		iLenth2_09 = iLenth2_09 * iLenth2_09; // 두번째 변의 길이를 제곱
		iRadius_09 = iRadius_09 * iRadius_09; // 세번째 변의 길이를 제곱
		
		if(iLenth1_09 + iLenth2_09<= iRadius_09) { // 첫번째 변의 제곱 더하기 두번째 변의 제곱과 세변째 변의 길이를 비
			System.out.print("두 원은 서로 겹친다"); // 세변째 변의 길이가 작으면 곂친다.
		}
		else {
			System.out.print("두원은 서로 겹치지 않는다");	 //세변째 변의 길이가 크면 곂치지 않는다
		}
		
		objInTri.close();
	}

}
