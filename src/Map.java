import java.util.HashMap;

public class Map {

	private final static  String  ASHUTOSH = "ashutosh";
	
	public static void getKeyValue(int key, String keyValue ) {
		switch(keyValue.toLowerCase()) {
		
		case ASHUTOSH:
			System.out.println("key is "+key);
			break;
		
		}

	}
	
	public static void main(String[] args) {
		
		HashMap <Integer, String> map =new HashMap<Integer, String>();
		map.put(15, "ashutosh");
		map.put(16, "ashutosh");
		map.put(23, "ashutosh");
		map.put(45, "ashutosh");
		
//	for(int key : map.keySet()) {
//		String keyValue = map.get(key);
//		System.out.println(key+"="+keyValue);
//		getKeyValue( key,keyValue);
//		
//	}
		
		
		for (int key:map.keySet()) {
			String keyValue = map.get(key);
			System.out.println("key is ="+key +" and value is= "+keyValue);
			getKeyValue(key, keyValue);
		}

	}

}
