package setTest;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet has=new TreeSet();
		
		has.add('d');
		has.add('a');
//		has.add("author");
//		has.add("vcentry");
//		has.add(10);
//		has.add(null);
//		has.add(5);
//		has.add(true);
		has.add('d');
		has.add('r');
		has.add('h');
//		has.add("author");
		
		Iterator it  = has.iterator();
		while(it.hasNext()) {
			Object value=it.next();
			if(value.equals('h'))
			System.out.println(value);
		}

	}

}
