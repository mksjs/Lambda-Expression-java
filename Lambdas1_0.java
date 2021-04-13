import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
class Lambdas1_0 {
	public static void main(String args[]) {
		//using the test method of Predicate 
		Predicate<String> stringLen = (s)-> s.length() < 10;
		System.out.println(stringLen.test("Apples") + "- Apples is less than 10" ) ;
		
		//Consumer example uses accept method
		Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
		consumerStr.accept("SJDHIUHIHJHIUHY");

		// Function Interface example
		Function<Integer, String> converter = (num) -> Integer.toString(num);
		System.out.println("length of 26 " + converter.apply(26).length());
		
		//Supplier Interface Example 
		Supplier<String> s = () -> "Java is fun";
		System.out.println(s.get());
		
		// BinaryOperator Interface Example
		BinaryOperator<Integer> add = (a, b) -> a + b;
		System.out.println("add 10 + 25 " + add.apply(10,25));

		//UnaryOperator Interface Example 
		UnaryOperator<String> str = (msg) -> msg.toUpperCase();
		System.out.println(str.apply("This is my msg in uppercase"));
		
	}
}
