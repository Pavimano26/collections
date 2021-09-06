package listTest;

import java.util.LinkedList;

public class LinkedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList link=new LinkedList();
		link.add("vcentry");
		link.add('a');
		link.add("Selenium");
		link.add(10);
		link.add(true);
		
		for(int i=0;i<link.size();i++)
		
	System.out.println(link.get(i));    

	}

}
