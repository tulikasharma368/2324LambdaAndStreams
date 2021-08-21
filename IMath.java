package lambdaAndStream;

@FunctionalInterface
public interface IMath {
	int calculate(int a,int b);// only one abstract method
	
	public static void print(int a, int b, String function,IMath fobj ) {
		System.out.println("Result of "+function+" is "+fobj.calculate(a,b));
	}
}
