package Main;
import java.util.Scanner;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int A,B,C,val;
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,j=0,k=0;
		
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		val=A*B*C;
		String str=String.valueOf(val);
		for (int i = 0; i < str.length(); i++) {
		      if(str.charAt(i)=='0')
		    	  a++;
		      else if(str.charAt(i)=='1')
		    	  b++;
		      else if(str.charAt(i)=='2')
		    	  c++;
		      else if(str.charAt(i)=='3')
		    	  d++;
		      else if(str.charAt(i)=='4')
		    	  e++;
		      else if(str.charAt(i)=='5')
		    	  f++;
		      else if(str.charAt(i)=='6')
		    	  g++;
		      else if(str.charAt(i)=='7')
		    	  h++;
		      else if(str.charAt(i)=='8')
		    	  j++;
		      else if(str.charAt(i)=='9')
		    	  k++;
		    }
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(j);
		System.out.println(k);
	}

}
