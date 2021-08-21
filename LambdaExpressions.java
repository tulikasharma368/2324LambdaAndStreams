package lambdaAndStream;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		IMath add = (int a,int b) -> a+b ;// add is a lambda function here
		IMath mul = (int a,int b) -> a*b ;//these are anonymous functions, they don't belong to any class
		IMath div = (int a,int b) -> a/b ;
		
//		System.out.println("Sum of 2 numbers: "+add.calculate(10, 20));
//		System.out.println("Product of 2 numbers: "+mul.calculate(10, 20));
//		System.out.println("Division of 2 numbers: "+div.calculate(100, 20));
		
		IMath.print(200, 10, "Addition", add);
		IMath.print(200, 10, "Multiplication", mul);
		IMath.print(200, 10, "Division", div);
		
		
	}
}
