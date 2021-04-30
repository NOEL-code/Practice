import java.util.Scanner;
public class WhileExample {

	public static void main(String[] args) {
		
		Scanner objIn;
		objIn = new Scanner(System.in);
		
		int iNum, iCount, iSum, iAvg;
		
		iCount = 0;
		iSum = 0;
		iAvg = 0;
		
		System.out.print("정수 여러 개를 입력하고 마지막에 -1을 입력하시오" );
		
		iNum = objIn.nextInt();
		
		while(iNum != -1) {
		
			iSum = iSum + iNum;
			iCount = iCount + 1;
			iNum = objIn.nextInt();
		
		}
		iAvg = iSum/iCount;
		
		System.out.print(iCount +" 개의 정수의 합은 " + iSum + " 이며 평균은 " + iAvg +"입니다");
		
		
		objIn.close();

	}

}
