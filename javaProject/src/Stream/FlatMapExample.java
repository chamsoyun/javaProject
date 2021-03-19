package Stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lamda","stream mapping");
		
		inputList1.stream()
					.flatMap(data -> Arrays.stream(data.split(" ")))
					.forEach(word -> System.out.println(word));
		
		System.out.println();
		
//		List<String> inputList2 = Arrays.asList("10,20,30", "40,50,60");
//		inputList2.stream()
//					.flatMapToInt(data -> {
//						String[] strArr = data.split(",");
//						int[] intArr = new int[strArr.length];
//						
//					})
//					.forEach(number -> System.out.println(numner)));
	}
}
