package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStr {

	public static void main(String[] args) {
    
		List<String> List=new ArrayList<String>();
		
		List.add("Ahmed");	
		List.add("Ali");
		List.add("Barry");
		List.add("Muneeb");
		List.add("Uddin");
		
		for (int i=0;i<5;i++) {
		System.out.println("Name of the Student SDET2021  #"+(i+1)+" .  "+List.get(i));
		
		}
		System.out.println("List wasn't made onthe basis of merrit,it was made alphabatic order.");

	}

}
