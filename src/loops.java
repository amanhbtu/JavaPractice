
public class loops {

	public static void main(String[] args) {
		loops l=new loops();
		l.forLoop();
	}
	public void forLoop() {
		for(int i=1;i<=10;i++)
			System.out.println(i);
		
		for(int i=1;i<=10;i++) {
			for(int j=i;j>0;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		String [] fruits= {"Apple","Orange","Banana","Pineapple","Kiwi"};
		for(String a :fruits){
			System.out.println(a+" is a fruit");
		}
		
		String word="Apple";
		String [][] keywords= {{"Apple","About apple"},{"Banana","about banana"},{"Kiwi"," no information"}};
		for(String []a :keywords){
			if(a[0].toLowerCase().matches(word.toLowerCase()))
			System.out.println("Name : "+a[0]+", Detail : "+a[1]);
		}
	}
	

}
