import java.util.Scanner;

public class array {

	private int arr1d[],arr2d[][],size;
	private Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		array arr=new array(3);
		arr.setArr2d();
		arr.getArr2d();
		
	}
	
	public array(int size) {
		this.size=size;
		arr1d =new int[size];
		arr2d=new int[size][size];
	}
	public void setArr1d() {
		for(int i=0;i<size;i++)
			arr1d[i]=sc.nextInt();
	}
	public void setArr2d() {
		for(int i=0;i<size;i++)
			for(int j=0;j<size;j++)
				arr2d[i][j]=sc.nextInt();
	}
	public void getArr1d() {
		for(int i=0;i<size;i++)
			System.out.println(arr1d[i]);
	}
	public void getArr2d() {
		for(int i=0;i<size;i++)
			for(int j=0;j<size;j++)
				System.out.println(arr2d[i][j]);
	}
}
