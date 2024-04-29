package Day1;

public class CodeRunner {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		int[] number=new int[4];
		number[0]=1;
		number[1]=2;
		number[2]=3;
		number[3]=4;
		System.out.println("Numbers are");
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		
		int[] values= {5,6,7,8};
			System.out.println("Values are");
			for (int i = 0; i < values.length; i++) {
				System.out.println(values[i]);
			}
			values[2]=15;
			System.out.println("Values After modified are");
			for (int i = 0; i < values.length; i++) {
				System.out.println(values[i]);
			}
	}

}
