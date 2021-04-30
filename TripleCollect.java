import java.util.Scanner;
public class TripleCollect {

	public static void main(String[] args) {
		
		
		Scanner objInPut;
		objInPut = new Scanner(System.in);
		
		int iArry_09[];
		int iCount_09;
		
		iArry_09 = new int[10]; // 10 크기의 배열 생성
		
		iCount_09 = iArry_09.length; // 루프 돌리기용 길이 배열길이 변수
		
		System.out.println("양의 정수 10개를 입력하시오"); //10 입력 받기
		
		for(int i =0; i<iCount_09; i ++) { // 배열에 입력받은 정수 저장하기
			iArry_09[i] = objInPut.nextInt();
		}

		System.out.print("3의 배수는 ");

		for(int i =0; i<iCount_09; i ++) {
			if(iArry_09[i] % 3 == 0){ // 3으로 나눈 나머지가 0이면 3의 배수
				System.out.print(iArry_09[i]+" ");
			}
		}
		objInPut.close();
		
	}

}
