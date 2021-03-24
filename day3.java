package Main;
import java.util.Scanner;
public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 long A,B,C,point=0,z=0;
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
	
		
		if(B>=C)
			System.out.println(-1);
		else {
		while(z==0)
		{
			if(C*point>A+B*point) {
				System.out.println(point);
				break;
			}
			else
				point++;
			}
	
		}}
	}


