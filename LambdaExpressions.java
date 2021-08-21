package lambdaAndStream;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		IMath add = (int a,int b) -> a+b ;// add is a lambda function here
		IMath mul = (int a,int b) -> a*b ;
		IMath div = (int a,int b) -> a/b ;
		
		System.out.println("Sum of 2 numbers: "+add.calculate(10, 20));
		System.out.println("Product of 2 numbers: "+mul.calculate(10, 20));
		System.out.println("Division of 2 numbers: "+div.calculate(100, 20));
	}
}
