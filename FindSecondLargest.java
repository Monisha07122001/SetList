package week7.program1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
public static void main(String[] args) {
	int[] data= {3,2,11,4,6,7,2,3,3,6,7};
	Set<Integer> num=new TreeSet<Integer>();
	for(Integer b:data) {
		num.add(b);
	}
	System.out.print(num+" ");
	List<Integer> num1=new ArrayList<Integer>();
	for(Integer c:num) {
		num1.add(c);
	}
	System.out.println();
	System.out.print(num1+ " ");
	Integer integer=num1.get(num1.size()-2);
	System.out.println("Second Largest Number: "+integer);
	
}
}
