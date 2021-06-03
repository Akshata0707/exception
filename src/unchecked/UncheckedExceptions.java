package unchecked;

public class UncheckedExceptions {

	public static void main(String[] args)  {
		int a=10;
		int b=0;
		System.out.println("this is unchecked Exception example");
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("do not devide by zero");
			
		}
		
	}
}
