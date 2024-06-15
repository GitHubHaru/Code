import java.util.Random;
import java.util.Scanner;
public class test02 {
	public static void main(String[] args) {
		long money=1000;
		int wl=0;
		int last=0;
		int money2=0;
		System.out.println("______________________________________________________________");
		System.out.println("게임 방법 : 우선 배팅을 한후 묵찌빠를 한다. 묵찌빠를 질경우 배팅금을 전부 잃는다.");
		System.out.println("          이겼을 경우 자신이 마지막에 냈던 것을 기준으로 룰렛을 돌린다.");
		System.out.println("배율 정보 : 0개 = 0.5배, 1개 = 1배, 2개 = 3배, 3개 = 10배");
		System.out.println("승리 방법 : 10000원을 모으거나 파산하면 게임이 끝난다.");
		System.out.println("______________________________________________________________");
		while(money>1&&money<=10000) {
			boolean start=true;
			while(start) {
				System.out.println("___________________________________");
				System.out.println("         보유 금액 : "+money);
				System.out.println("___________________________________");
				Scanner moneyscan=new Scanner(System.in);
				System.out.print("배팅 금액 : ");
				money2=moneyscan.nextInt();
				boolean moneywh=true;
				if(money>=money2&&money2>=1) {
					moneywh=false;
					money=money-money2;
				}
				while(moneywh) {
					System.out.print("입력값이 잘못되었습니다. 배팅 금액 : ");
					money2=moneyscan.nextInt();
					if(money>=money2&&money2>=1) {
						moneywh=false;
						money=money-money2;
					}
				}
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
					System.out.println("___________________________________");
					System.out.println("               나 : 묵");
					System.out.println("___________________________________");
				}
				else if(first==2) {
					System.out.println("___________________________________");
					System.out.println("               나 : 찌");
					System.out.println("___________________________________");
				}
				else{
					System.out.println("___________________________________");
					System.out.println("               나 : 빠");
					System.out.println("___________________________________");
				}
				Random random=new Random();
				int a = random.nextInt(3)+1;
				if(a==1) {
					System.out.println("___________________________________");
					System.out.println("               ai : 묵");
					System.out.println("___________________________________");
				}
				else if(a==2) {
					System.out.println("___________________________________");
					System.out.println("               ai : 찌");
					System.out.println("___________________________________");
				}
				else{
					System.out.println("___________________________________");
					System.out.println("               ai : 빠");
					System.out.println("___________________________________");
				}
				if(first!=a) {
					boolean start2=true;
					while(start2) {
						wh=true;
						if(first==1) {
							if(a==2) {
								System.out.print("1~3 사이의 정수를 입력하세요.당신이 우위입니다(1=묵,2=찌,3=빠)");
								first=select.nextInt();
								if(first>=1&&first<=3) {
									wh=false;
								}
								while(wh) {
									System.out.print("입력값이 잘못되었습니다. 1~3 사이의 정수를 입력하세요.당신이 우위입니다(1=묵,2=찌,3=빠)");
									first=select.nextInt();
									if(first>=1&&first<=3) {
										wh=false;
									}
								}
								if(first==1) {
									System.out.println("___________________________________");
									System.out.println("               나 : 묵");
									System.out.println("___________________________________");
								}
								else if(first==2) {
									System.out.println("___________________________________");
									System.out.println("               나 : 찌");
									System.out.println("___________________________________");
								}
								else{
									System.out.println("___________________________________");
									System.out.println("               나 : 빠");
									System.out.println("___________________________________");
								}
								a = random.nextInt(3)+1;
								if(a==1) {
									System.out.println("___________________________________");
									System.out.println("               ai : 묵");
									System.out.println("___________________________________");
								}
								else if(a==2) {
									System.out.println("___________________________________");
									System.out.println("               ai : 찌");
									System.out.println("___________________________________");
								}
								else{
									System.out.println("___________________________________");
									System.out.println("               ai : 빠");
									System.out.println("___________________________________");
								}
								if(first==a){
									start2=false;
									System.out.println("___________________________________");
									System.out.println("__________|당신의 승리입니다!|__________");
									System.out.println("___________________________________");
									last=first;
								}
							}
							else if(a==3) {
								System.out.print("1~3 사이의 정수를 입력하세요.상대가 우위입니다(1=묵,2=찌,3=빠)");
								first=select.nextInt();
								if(first>=1&&first<=3) {
									wh=false;
								}
								while(wh) {
									System.out.print("입력값이 잘못되었습니다. 1~3 사이의 정수를 입력하세요.상대가 우위입니다(1=묵,2=찌,3=빠)");
									first=select.nextInt();
									if(first>=1&&first<=3) {
										wh=false;
									}
								}
								if(first==1) {
									System.out.println("___________________________________");
									System.out.println("               나 : 묵");
									System.out.println("___________________________________");
								}
								else if(first==2) {
									System.out.println("___________________________________");
									System.out.println("               나 : 찌");
									System.out.println("___________________________________");
								}
								else{
									System.out.println("___________________________________");
									System.out.println("               나 : 빠");
									System.out.println("___________________________________");
								}
								a = random.nextInt(3)+1;
								if(a==1) {
									System.out.println("___________________________________");
									System.out.println("               ai : 묵");
									System.out.println("___________________________________");
								}
								else if(a==2) {
									System.out.println("___________________________________");
									System.out.println("               ai : 찌");
									System.out.println("___________________________________");
								}
								else{
									System.out.println("___________________________________");
									System.out.println("               ai : 빠");
									System.out.println("___________________________________");
								}
								if(first==a){
									start2=false;
									System.out.println("___________________________________");
									System.out.println("__________|당신의 패배입니다!|__________");
									System.out.println("___________________________________");
									wl=1;
									last=first;
								}
							}
						}
						else if(first==2) {
							if(a==1) {
								System.out.print("1~3 사이의 정수를 입력하세요.상대가 우위입니다(1=묵,2=찌,3=빠)");
								first=select.nextInt();
								if(first>=1&&first<=3) {
									wh=false;
								}
								while(wh) {
									System.out.print("입력값이 잘못되었습니다. 1~3 사이의 정수를 입력하세요.상대가 우위입니다(1=묵,2=찌,3=빠)");
									first=select.nextInt();
									if(first>=1&&first<=3) {
										wh=false;
									}
								}
								if(first==1) {
									System.out.println("___________________________________");
									System.out.println("               나 : 묵");
									System.out.println("___________________________________");
								}
								else if(first==2) {
									System.out.println("___________________________________");
									System.out.println("               나 : 찌");
									System.out.println("___________________________________");
								}
								else{
									System.out.println("___________________________________");
									System.out.println("               나 : 빠");
									System.out.println("___________________________________");
								}
								a = random.nextInt(3)+1;
								if(a==1) {
									System.out.println("___________________________________");
									System.out.println("               ai : 묵");
									System.out.println("___________________________________");
								}
								else if(a==2) {
									System.out.println("___________________________________");
									System.out.println("               ai : 찌");
									System.out.println("___________________________________");
								}
								else{
									System.out.println("___________________________________");
									System.out.println("               ai : 빠");
									System.out.println("___________________________________");
								}
								if(first==a){
									start2=false;
									System.out.println("___________________________________");
									System.out.println("__________|당신의 패배입니다!|__________");
									System.out.println("___________________________________");
									wl=1;
									last=first;
								}
							}
							else if(a==3) {
								System.out.print("1~3 사이의 정수를 입력하세요.당신이 우위입니다(1=묵,2=찌,3=빠)");
								first=select.nextInt();
								if(first>=1&&first<=3) {
									wh=false;
								}
								while(wh) {
									System.out.print("입력값이 잘못되었습니다. 1~3 사이의 정수를 입력하세요.당신이 우위입니다(1=묵,2=찌,3=빠)");
									first=select.nextInt();
									if(first>=1&&first<=3) {
										wh=false;
									}
								}
								if(first==1) {
									System.out.println("___________________________________");
									System.out.println("               나 : 묵");
									System.out.println("___________________________________");
								}
								else if(first==2) {
									System.out.println("___________________________________");
									System.out.println("               나 : 찌");
									System.out.println("___________________________________");
								}
								else{
									System.out.println("___________________________________");
									System.out.println("               나 : 빠");
									System.out.println("___________________________________");
								}
								a = random.nextInt(3)+1;
								if(a==1) {
									System.out.println("___________________________________");
									System.out.println("               ai : 묵");
									System.out.println("___________________________________");
								}
								else if(a==2) {
									System.out.println("___________________________________");
									System.out.println("               ai : 찌");
									System.out.println("___________________________________");
								}
								else{
									System.out.println("___________________________________");
									System.out.println("               ai : 빠");
									System.out.println("___________________________________");
								}
								if(first==a){
									start2=false;
									System.out.println("___________________________________");
									System.out.println("__________|당신의 승리입니다!|__________");
									System.out.println("___________________________________");
									last=first;
								}
							}
						}
						else {
							if(a==1) {
								System.out.print("1~3 사이의 정수를 입력하세요.당신이 우위입니다(1=묵,2=찌,3=빠)");
								first=select.nextInt();
								if(first>=1&&first<=3) {
									wh=false;
								}
								while(wh) {
									System.out.print("입력값이 잘못되었습니다. 1~3 사이의 정수를 입력하세요.당신이 우위입니다(1=묵,2=찌,3=빠)");
									first=select.nextInt();
									if(first>=1&&first<=3) {
										wh=false;
									}
								}
								if(first==1) {
									System.out.println("___________________________________");
									System.out.println("               나 : 묵");
									System.out.println("___________________________________");
								}
								else if(first==2) {
									System.out.println("___________________________________");
									System.out.println("               나 : 찌");
									System.out.println("___________________________________");
								}
								else{
									System.out.println("___________________________________");
									System.out.println("               나 : 빠");
									System.out.println("___________________________________");
								}
								a = random.nextInt(3)+1;
								if(a==1) {
									System.out.println("___________________________________");
									System.out.println("               ai : 묵");
									System.out.println("___________________________________");
								}
								else if(a==2) {
									System.out.println("___________________________________");
									System.out.println("               ai : 찌");
									System.out.println("___________________________________");
								}
								else{
									System.out.println("___________________________________");
									System.out.println("               ai : 빠");
									System.out.println("___________________________________");
								}
								if(first==a){
									start2=false;
									System.out.println("___________________________________");
									System.out.println("__________|당신의 승리입니다!|__________");
									System.out.println("___________________________________");
									last=first;
								}
							}
							else if(a==2) {
								System.out.print("1~3 사이의 정수를 입력하세요.상대가 우위입니다(1=묵,2=찌,3=빠)");
								first=select.nextInt();
								if(first>=1&&first<=3) {
									wh=false;
								}
								while(wh) {
									System.out.print("입력값이 잘못되었습니다. 1~3 사이의 정수를 입력하세요.상대가 우위입니다(1=묵,2=찌,3=빠)");
									first=select.nextInt();
									if(first>=1&&first<=3) {
										wh=false;
									}
								}
								if(first==1) {
									System.out.println("___________________________________");
									System.out.println("               나 : 묵");
									System.out.println("___________________________________");
								}
								else if(first==2) {
									System.out.println("___________________________________");
									System.out.println("               나 : 찌");             
									System.out.println("___________________________________");
								}
								else{
									System.out.println("___________________________________");
									System.out.println("               나 : 빠");
									System.out.println("___________________________________");
								}
								a = random.nextInt(3)+1;
								if(a==1) {
									System.out.println("___________________________________");
									System.out.println("               ai : 묵");
									System.out.println("___________________________________");
								}
								else if(a==2) {
									System.out.println("___________________________________");
									System.out.println("               ai : 찌");
									System.out.println("___________________________________");
								}
								else{
									System.out.println("___________________________________");
									System.out.println("               ai : 빠");
									System.out.println("___________________________________");
								}
								if(first==a){
									start2=false;
									System.out.println("___________________________________");
									System.out.println("__________|당신의 패배입니다!|__________");
									System.out.println("___________________________________");
									wl=1;
									last=first;
								}
							}
						}
						
					}
					if(wl==0) {
						Random rerandom=new Random();
						int b = rerandom.nextInt(3)+1;
						Random rerandom2=new Random();
						int c = rerandom.nextInt(3)+1;
						Random rerandom3=new Random();
						int d = rerandom.nextInt(3)+1;
						if(last==1) {
							if(b==1) {
								if(c==1) {
									if(d==1) {
										System.out.println("__________| 묵 | 묵 |묵 |__________");
										System.out.println("________"+(money2*10-money2)+"만큼 땄습니다.________");
										money+=money2*10;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 묵 | 묵 | 찌 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 묵 | 묵 | 빠 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
								}
								else if(c==2) {
									if(d==1) {
										System.out.println("__________| 묵 | 찌 | 묵 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 묵 | 찌 | 찌 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 묵 | 찌 | 빠 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
								}
								else {
									if(d==1) {
										System.out.println("__________| 묵 | 빠 | 묵 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 묵 | 빠 | 찌 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 묵 | 빠 | 빠 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
								}
							}
							else if(b==2) {
								if(c==1) {
									if(d==1) {
										System.out.println("__________| 찌 | 묵 |묵 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 찌 | 묵 | 찌 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 찌 | 묵 | 빠 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
								}
								else if(c==2) {
									if(d==1) {
										System.out.println("__________| 찌 | 찌 | 묵 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 찌 | 찌 | 찌 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 찌 | 찌 | 빠 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
								}
								else {
									if(d==1) {
										System.out.println("__________| 찌 | 빠 | 묵 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 찌 | 빠 | 찌 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 찌 | 빠 | 빠 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
								}
							}
							else {
								if(c==1) {
									if(d==1) {
										System.out.println("__________| 빠 | 묵 |묵 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 빠 | 묵 | 찌 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 빠 | 묵 | 빠 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
								}
								else if(c==2) {
									if(d==1) {
										System.out.println("__________| 빠 | 찌 | 묵 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 빠 | 찌 | 찌 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 빠 | 찌 | 빠 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
								}
								else {
									if(d==1) {
										System.out.println("__________| 빠 | 빠 | 묵 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 빠 | 빠 | 찌 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 빠 | 빠 | 빠 |__________");
										System.out.println("________"+(money2*-.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
								}
							}
						}
						else if(last==2) {
							if(b==1) {
								if(c==1) {
									if(d==1) {
										System.out.println("__________| 묵 | 묵 |묵 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 묵 | 묵 | 찌 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 묵 | 묵 | 빠 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
								}
								else if(c==2) {
									if(d==1) {
										System.out.println("__________| 묵 | 찌 | 묵 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 묵 | 찌 | 찌 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 묵 | 찌 | 빠 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
								}
								else {
									if(d==1) {
										System.out.println("__________| 묵 | 빠 | 묵 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 묵 | 빠 | 찌 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 묵 | 빠 | 빠 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
								}
							}
							else if(b==2) {
								if(c==1) {
									if(d==1) {
										System.out.println("__________| 찌 | 묵 |묵 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 찌 | 묵 | 찌 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 찌 | 묵 | 빠 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
								}
								else if(c==2) {
									if(d==1) {
										System.out.println("__________| 찌 | 찌 | 묵 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 찌 | 찌 | 찌 |__________");
										System.out.println("________"+(money2*10-money2)+"만큼 땄습니다.________");
										money+=money2*10;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 찌 | 찌 | 빠 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
										
									}
								}
								else {
									if(d==1) {
										System.out.println("__________| 찌 | 빠 | 묵 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 찌 | 빠 | 찌 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 찌 | 빠 | 빠 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
								}
							}
							else {
								if(c==1) {
									if(d==1) {
										System.out.println("__________| 빠 | 묵 |묵 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 빠 | 묵 | 찌 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 빠 | 묵 | 빠 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
								}
								else if(c==2) {
									if(d==1) {
										System.out.println("__________| 빠 | 찌 | 묵 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 빠 | 찌 | 찌 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 빠 | 찌 | 빠 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
								}
								else {
									if(d==1) {
										System.out.println("__________| 빠 | 빠 | 묵 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 빠 | 빠 | 찌 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 빠 | 빠 | 빠 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
								}
							}
						}
						else {
							if(b==1) {
								if(c==1) {
									if(d==1) {
										System.out.println("__________| 묵 | 묵 |묵 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 묵 | 묵 | 찌 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 묵 | 묵 | 빠 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
								}
								else if(c==2) {
									if(d==1) {
										System.out.println("__________| 묵 | 찌 | 묵 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 묵 | 찌 | 찌 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 묵 | 찌 | 빠 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
								}
								else {
									if(d==1) {
										System.out.println("__________| 묵 | 빠 | 묵 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 묵 | 빠 | 찌 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 묵 | 빠 | 빠 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
								}
							}
							else if(b==2) {
								if(c==1) {
									if(d==1) {
										System.out.println("__________| 찌 | 묵 |묵 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 찌 | 묵 | 찌 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 찌 | 묵 | 빠 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
								}
								else if(c==2) {
									if(d==1) {
										System.out.println("__________| 찌 | 찌 | 묵 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 찌 | 찌 | 찌 |__________");
										System.out.println("________"+(money2*0.5-money2)+"만큼 땄습니다.________");
										money+=money2*0.5;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 찌 | 찌 | 빠 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
								}
								else {
									if(d==1) {
										System.out.println("__________| 찌 | 빠 | 묵 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 찌 | 빠 | 찌 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 찌 | 빠 | 빠 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
								}
							}
							else {
								if(c==1) {
									if(d==1) {
										System.out.println("__________| 빠 | 묵 |묵 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 빠 | 묵 | 찌 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 빠 | 묵 | 빠 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
								}
								else if(c==2) {
									if(d==1) {
										System.out.println("__________| 빠 | 찌 | 묵 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 빠 | 찌 | 찌 |__________");
										System.out.println("________"+(money2*1-money2)+"만큼 땄습니다.________");
										money+=money2*1;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 빠 | 찌 | 빠 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
								}
								else {
									if(d==1) {
										System.out.println("__________| 빠 | 빠 | 묵 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
									else if(d==2) {
										System.out.println("__________| 빠 | 빠 | 찌 |__________");
										System.out.println("________"+(money2*3-money2)+"만큼 땄습니다.________");
										money+=money2*3;
										start=false;
										start2=false;
									}
									else {
										System.out.println("__________| 빠 | 빠 | 빠 |__________");
										System.out.println("________"+(money2*10-money2)+"만큼 땄습니다.________");
										money+=money2*10;
										start=false;
										start2=false;
									}
								}
							}
						}
					
				}
					else {
						System.out.println("__________"+money2+"만큼 잃었습니다.__________");
						money+=money2*0;
						start=false;
						start2=false;
					}	
				}
				else{
					money=money+money2;
					System.out.println("___________________________________");
					System.out.println("__________|비겼습니다. 다시!|__________");
					System.out.println("___________________________________");
				}
		}
		}
		if(money>=10000) {
			System.out.println(money+"을 달성하였습니다. 축하합니다!");
		}
		else {
			System.out.println("파산 하였습니다..");
		}
	}
}
