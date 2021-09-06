package hashTableTest;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable hashTable= new Hashtable();
			
		hashTable.put("username", "123@gmail.com");
		hashTable.put("password", "123456");
		hashTable.put("address", "guindy");
		hashTable.put("name", "vcentry");
		hashTable.put("address", "KK nagar");
		hashTable.put("mob", "123456");
		hashTable.put("address", "CMBT");
		//hashTable.put(null, "nullvalue");
		//hashTable.put("mob", null);
	
	
	
		String username= hashTable.get("username").toString();
		System.out.println(username);
		
		Set s= hashTable.keySet();
		Iterator it=s.iterator();
	
	while(it.hasNext()){
		String key=it.next().toString();		
		System.out.println(key+"--"+hashTable.get(key));
	}
		//username-
		
	Enumeration e=hashTable.keys();	
		while(e.hasMoreElements()){
			String key=e.nextElement().toString();		
		System.out.println(key+"--"+hashTable.get(key));		}
	}

}
