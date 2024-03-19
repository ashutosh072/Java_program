import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.testng.annotations.Test;

public class MapOperation {

//	@Test()
//	public void addingAndRemoval() {
//
//		Map<Integer, String>  map = new HashMap<Integer, String>();
//		map.put(1, "ashu");
//		map.put(2, "ashutosh");
//		map.put(3, "ashutosh kumar");
//		map.put(4, "ashutosh kumar sharma ");
//
//		System.out.println(map);
//
//		for(Map.Entry m :map.entrySet()) {
//			System.out.println(m.getKey() +" value "+ m.getValue());
//
//
//			Object mapKeyVlaue = m.getKey();
//		}
//	}
//	@Test(priority =0)
//	public void operationOfList () {
//		List <String >l= new LinkedList<String>();
//		l.add("ashutosh");
//		l.add("ashutosh kumar ");
//		l.add("ashutosh kumar sharma ");
//		System.out.println(l);
//		for (String k:l) {
//			System.out.println(k);
//		}
//		Iterator<String> itr = l.iterator();
//		while(itr.hasNext()) {
//			System.out.println("by iterator ="+itr.next());
//		}
//	
//	 
//	ArrayList <String> al = new ArrayList<String>();
//	
//	al.addAll(l);
//	
//	System.out.println("arrayList ="+al);
//	
//	Vector vt = new Vector<>();
//	vt.add(al);
//	
//	System.out.println("vector value = "+al);
//			
//	
//
//}	
//	
//	@Test
//	public void mapPractice() {
//		HashMap<Integer, String>map = new HashMap<Integer ,String>();
//		
//		map.put(1, "Hello");
//		map.put(2, "Hello 1");
//		map.put(3, "Hello 2");
//		map.put(4, "Hello 3");
//		
//		for (Map.Entry m:map.entrySet()) {
//			
//			System.out.println("Get key ="+m.getKey()+"Get value ="+m.getValue());
//			System.out.println();
//			
//		}
//		
//		System.out.println(map);
//		ArrayList<HashMap<Integer ,String>> al = new ArrayList<HashMap<Integer ,String>>();
//		System.out.println(al.add(map));
//		for (HashMap<Integer, String> a: al) {
//		System.out.println("Using hashmap with list ="+a);
//		
//		
//				
//		}
//		
//		
//		
//	}
	@Test
	public void array() {
	String  str[] = {"ashu","aman","ankit"};
	System.out.println(str.length);
	for (int i = 0; i < str.length; i++) {
		
	System.out.println(str[i]);
		
	}
		
	}
	@Test
	public void arrayList() {
	ArrayList <String> al = new ArrayList<String>();
//	LinkedList<String> al = new LinkedList<String>();
	al.add("ashu");
	
	al.add("ashu1");
	al.add("ashu2");
	al.add("ashu3");
	al.add("ashu4");

	
	for (int i = 0; i < al.size(); i++) {
		System.out.println(al.get(i));
		
		 System.out.println(al);
		 System.out.println(al.size());
		 
		
	}
	
	}

}


