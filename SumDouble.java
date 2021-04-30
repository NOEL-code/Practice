import java.util.Scanner;

public class SumDouble {

	public static void main(String[] args) {

		Scanner objInNum;
		objInNum = new Scanner(System.in);

		int iNum;
		int iSum;
		int iLoop;
		int iMulty;
		
		System.out.println("1부터 10까의 정수를 입력하시오 : ");
		iNum = objInNum.nextInt();
	
		while(iNum != 0) {
			iSum = 0;
			iMulty = 1;
			iLoop = iNum+1;
			for(int i =0; i<iLoop; i++){
				iSum = iSum + i;
				if(i>0) {
					iMulty = iMulty * i;
				}
			}
			if(iNum<1 || iNum >10) {
				System.out.println("오류 : 1부터 10까의 정수를 입력해야 합니다");
			}
			else{ 
				if(iNum % 2 == 1) {
					System.out.println("홀수 : 1 ~ " +iNum +" 까지 합은 [" +iSum + "] 입니다");
				}
				if(iNum % 2 == 0) {
					System.out.println("짝수 : 1 ~ " +iNum +" 까지 곱은 [" +iMulty + "] 입니다");
				}
			}	
			System.out.println("1부터 10까의 정수를 입력하시오 : ");
		
			iNum = objInNum.nextInt();
		}
	System.out.println("프로그램을 종료합니다");
	
	objInNum.close();	
	}
}
