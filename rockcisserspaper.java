import java.util.Random;
import java.util.Scanner;
public class test01 {
	public static void main(String[] args) {
boolean start=true;
		while(start) {
			Scanner select=new Scanner(System.in);
			System.out.print("1~3 사이의 정수를 입력하세요.(1=묵,2=찌,3=빠)");
			int first=select.nextInt();
			boolean wh=true;
			if(first>=1&&first<=3) {
				wh=false;
			}
			while(wh) {
				System.out.print("입력값이 잘못되었습니다. 1~3 사이의 정수를 입력하세요.(1=묵,2=찌,3=빠)");
				first=select.nextInt();
				if(first>=1&&first<=3) {
					wh=false;
				}
			}
			if(first==1) {
				System.out.println("나 : 묵");
			}
			else if(first==2) {
				System.out.println("나 : 찌");
			}
			else{
				System.out.println("나 : 빠");
			}
			Random random=new Random();
			int a = random.nextInt(3)+1;
			if(a==1) {
				System.out.println("ai : 묵");
			}
			else if(a==2) {
				System.out.println("ai : 찌");
			}
			else{
				System.out.println("ai : 빠");
			}
			if(first!=a) {
				if(first==1) {
					if (a==2) {
						System.out.print("승리");
						start=false;
					}
					else {
						System.out.print("패배");
						start=false;
					}
				}
				else if(first==2) {
					if(a==1) {
						System.out.print("패배");
						start=false;
					}
					else {
						System.out.print("승리");
						start=false;
					}
				}
				else {
					if(a==1) {
						System.out.print("승리");
						start=false;
					}
					else {
						System.out.print("패배");	
						start=false;
					}
				}
			}
			else{
				System.out.print("비겼습니다!다시 ");
			}
		}
	}
}
