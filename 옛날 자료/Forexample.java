import java.util.Scanner;
public class Forexample {

	public static void main(String[] args) {

		Scanner objIn;
		objIn = new Scanner(System.in);
		
		int iNum, iCount;
		
		
		System.out.println("정수를 입력하시오");
		
		iCount = 0;
		iNum = objIn.nextInt();
		
		
		for(int i=0 ; i<iNum; i++) {
			
			iCount = iCount + 1;
			System.out.println("");
			
			for(int j=0; j<iCount; j++) {
				System.out.print("* ");
			}
		}
		objIn.close();
	}

}
