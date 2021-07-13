class maths{
	
	public maths() {
	}
	
	public int sum(int num1,int num2) {
		return num1+num2;
	}
	
	public int sum(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	
	public int diff(int num1,int num2) {
		return num1-num2;
	}
	
	public int product(int num1,int num2) {
		return num1*num2;
	}
	
	public int product(int num1,int num2,int num3) {
		return num1*num2*num3;
	}
	
	public int div(int num1,int num2) {
		return num1/num2;
	}
}

public class objectclass {

	public static void main(String[] args) {
		maths ob=new maths();
		System.out.println(ob.sum(98, 24));
		System.out.println(ob.sum(12, 24, 76));
		System.out.println(ob.diff(12, 24));
		System.out.println(ob.product(6, 94));
		System.out.println(ob.product(26, 7, 9));
		System.out.println(ob.div(98, 7));
	}

}
