 
		package mapTest;

		import java.util.Iterator;
		import java.util.Set;
		import java.util.TreeMap;

		public class TreeMapTest {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				TreeMap tree=new TreeMap<>();
				
				tree.put("username", "123@gmail.com");
				tree.put("password", "123456");
				tree.put("address", "guindy");
				tree.put("name", "vcentry");
				tree.put("address", "KK nagar");
				tree.put("mob", "123456");
				tree.put("address", "CMBT");
			//	tree.put(null, "nullvalue");
				tree.put("mob", null);
			//	tree.put(null, "nullvalue1");
				tree.put("mob1", null);
				
				
//				System.out.println(tree.get("mob"));
				
				Set s= tree.keySet();
				Iterator it=s.iterator();
				
				while(it.hasNext()){
					Object key=it.next();
					
					System.out.println(key+": " + tree.get(key) );
				}
				
				
				
				
				

			}

		


	

}
