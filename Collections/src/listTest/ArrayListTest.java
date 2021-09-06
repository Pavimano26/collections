package listTest;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList();
a.add('a');
a.add("Selenium");
a.add(10);
a.add(true);


//Object obj=a.get(0);
//for(int i=0;i<a.size();i++)
//	
//System.out.println(a.get(i));    

Iterator it=a.iterator();
//Object obj1=it.next();
//while(it.hasNext()){
//	
//System.out.println(it.next());
//}
for(;it.hasNext();)
{
	System.out.println(it.next());
}


	}

}
