package setTest;

import java.util.*;
//import java.util.Set;
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				HashSet hash = new HashSet();
//				hash.add('s');
//				hash.add("Vcentry");
//				hash.add("Selenium");
//				hash.add(true);
				hash.add(30);
				hash.add(10);
				hash.add(20);
				hash.add(40);
//				hash.add('a');
//				hash.add('b');
//				hash.add(null);
//				hash.add(false);
//				hash.add("Chennai");
//				
				
			Iterator it= hash.iterator();
			while(it.hasNext()) {
				if(it.next().equals('h'))
				
			System.out.println(it.next());	
			}
				

			}

		}


	


