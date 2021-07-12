import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int opt=sc.nextInt();
		switch(opt)
		{
		 case 1:
			 System.out.println("Case1 ");
			 break;
		 case 2:
			 System.out.println("Case2 ");
			 break;
		 case 3:
			 System.out.println("Case3 ");
			 break;
		 case 4:
			 System.out.println("Case4 ");
			 break;
		 default:
			 System.out.println("Default ");
		   }
	}

}
