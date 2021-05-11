package Java_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Sorting_List {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Jan","Feb","March","April","May","June","July");
		List<String> collect = list.stream().sorted().collect(Collectors.toList());
		for (String string : collect) {
			System.out.println(string);
		}
		}

	}


