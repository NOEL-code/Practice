import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		
		Random rand = new Random(); 
		int iPitch []; // 투수의 숫자 저장하는 변
		iPitch = new int [3];
		
		for(int i = 0; i<iPitch.length; i++) {
			iPitch[i] = rand.nextInt(9) + 1; // 100의 자리수
		}
		Scanner scan  = new Scanner(System.in);
		
		int iGoStop; // 계임 계속할건지 물어보는 변수
		int iStrike = 0; // 맞추면 스트라이크
		int iBall = 0; // 틀리먼 볼
		int iBat []; // 타자가 입력하는 변수를 자리수로 분할하는 변수
		iBat = new int[3];
		int userNum; //타자가 입력하는 수를 저장하는 변수
		boolean result = false; // 게임을 계속할건지 정하는 변수
		
		while(!result) {
			
			System.out.print("숫자 세개를 입력하시오 ");	
			
			userNum = scan.nextInt();
			iBat[0] = userNum / 100; //100의 자리수
			iBat[1] = (userNum - (iBat[0] * 100)) / 10 ; // 10의 자리수
			iBat[2] = (userNum - (iBat[0] * 100) - (iBat[1] * 10)); // 1의 자리수
			
			Baseball compare;
			compare = new Baseball();
			
			int iResult[] = compare.hit(iBat, iPitch, iStrike, iBall);
			
			iStrike = iResult[0];
			iBall = iResult[1];
			
			if(iStrike >= 1 && iBall < 1) {
				System.out.println(iStrike +" 스트라이크 ");
			}
			else if(iStrike < 1 && iBall >=1) {
				System.out.println(iBall + "볼");
			}
			else if(iStrike >=1 && iBall >=1) {
				System.out.println(iStrike +" 스트라이크 " + iBall + "볼");
			}
			if(iStrike == 3) {
				System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종");
				System.out.println("게임을 새로 시작하려면 1, 종료하시려면 2를 입력하세요.");
				iGoStop = scan.nextInt();
				if(iGoStop == 2) {
					result = true;
				}
			}
			iBall = 0;
			iStrike = 0; //주석 수정해봤
			
			}
		
		}
	public int[] hit (int[] iBat, int[] iPitch, int iStrike, int iBall) {
		for(int i=0; i<iPitch.length; i++) {
			for(int j=0; j<iBat.length; j++) {
				if(iPitch[i] == iBat[j]) {
					if(i == j) {
						iStrike = iStrike +1;
					}
					else {
						iBall = iBall + 1;	
					}
				}
			}
				
		}
		int iCount[] = {iStrike, iBall};
		return iCount;
			
	}
	}