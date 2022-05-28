package week4;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacters {
	public static void main(String[] args) {
		String str="babub";
		char[] Chararray=str.toCharArray();
		for (int i = 0; i < Chararray.length; i++) {
			System.out.println(Chararray[i]);
		}
		Set<Character> obj=new HashSet<Character>();
		obj.add('b');
		obj.add('a');
		obj.add('b');
		obj.add('u');
		obj.add('b');
		System.out.println(obj);
		String[] split=str.split("b");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}
} 
