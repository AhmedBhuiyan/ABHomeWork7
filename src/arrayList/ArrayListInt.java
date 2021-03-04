package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInt {
	public static void main(String[] args) {
    
		
		List<Integer> List=new ArrayList<Integer>();
		
		List.add(5);
		List.add(10);
		List.add(15);
		List.add(20);
		List.add(25);
		List.add(30);
		List.add(35);
		List.add(110);
		List.add(152);
		List.add(2);
		
		for (int i=0;i<10;i++) {	
		System.out.println(List.get(i));

		}
		
}
}
