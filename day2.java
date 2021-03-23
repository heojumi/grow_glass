package Main;
import java.util.Scanner;
public class day2 {
//해가 두개이상있는 경우도 체크//왜 ?반례가 있을까
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,n,w,x=0,y=0,z=0;
		a=sc.nextInt();
		b=sc.nextInt();
		n=sc.nextInt();
		w=sc.nextInt();
		
		
		for(int i=1;a*i<=w;i++) {
				int j=w-a*i;
				if(j%b==0){
					x=i;
					y=j/b;
					if(a==b)
						{	if(x==1 && y==1 && x+y==n)
									{System.out.println(x+ " "+y);
									z=1;
									break;}
						else
							break;

					}
					if(x+y==n) {
					System.out.println(x+ " "+y);
					z=1;
					break;}
				}
			}
		
		
			if(z==0)
				System.out.println(-1);

	}

}
