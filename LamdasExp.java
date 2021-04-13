import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class LamdasExp {

		public static void  main(String [] args ) {
			//Anonymous inner class : runnable  
			Runnable r1 = new Runnable() {
				@Override 
				public void run() {
					System.out.println("run 1");
				}
			};
			
			// Lambda version of runnable (no argument)
			Runnable r2 = () -> System.out.println("run 2");
			
			//start running both threads
			r1.run();
			r2.run();
			
			// using existing functional interface BiFunction
			BiFunction<String , String, String > concate = (a, b) -> a + b ;
			String sentence  = concate.apply("Today is ", "a great day");
			System.out.println(sentence);
			
			//Example of Consumer functional Interface
			Consumer<String> hello =  name -> System.out.println("Hello " + name);
			for (String name : Arrays.asList("Duke ",  "mickey", "minnie" ) ) {
				hello.accept(name);
			}
		}
}
