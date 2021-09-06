package listTest;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add('a');
		a.add("Selenium");
		a.add(10);
		a.add(true);
		a.add(2, "Automation");
		
		
		ArrayList b=new ArrayList();
		b.add('b');
		b.add("Vcentry");
		b.add(20);
		b.add(false);
		
a.addAll(1, b);
Iterator it=a.iterator();
//Object obj1=it.next();
while(it.hasNext()){
	
System.out.println(it.next());
}
	}

}
