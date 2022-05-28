package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Missingnumber {
	public static void main(String[] args) {
		int[]number= {4,6,7,2,3,1,9,10,8,8,6};
		Arrays.sort(number);
		int length=number.length;
		Set<Integer> obj=new TreeSet<Integer>();
		for (int i = 0; i < length; i++) {
			obj.add(number[i]);
		}
		for (Integer each : obj) {
			obj.add(each);
		}
		List<Integer> num1=new ArrayList<Integer>(obj);
		for (int i = 0; i < num1.size(); i++) {
			if(num1.get(i)+1!=num1.get(i+1)) {
				System.out.println(num1.get(i)+1);
				break;
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
