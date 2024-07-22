package DemoOnCollection.MapsOnProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


import java.util.Set;
import java.util.TreeMap;

public class DemoOnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "varma");
		map.put(2, "Hello");
		map.put(3, "World");
		
		System.out.println(map);
		
		System.out.println(map.get(1));
		
		map.put(null, "num");
		
		System.out.println(map);
		
		System.out.println(map.get(null));
		
		Set<Entry<Integer, String>> val =  map.entrySet();
		
		Iterator<Entry<Integer, String>> itr = val.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> ss= itr.next();
			System.out.println(ss.getValue()+ "		"+ss.getKey());
		}
		
		System.out.println(map.containsValue("Hello"));
		
		System.out.println(map.containsKey(1));
		
		System.out.println(map);
		
		TreeMap<Integer, Employees> emp = new TreeMap<>();
		
		Employees e1 = new Employees(23,"varma",500,"Hyderabad");
		Employees e2 = new Employees(22,"k1",8000,"Guntur");
		Employees e3 = new Employees(11,"v2",4000,"Delhi");
		
		
		
		
		TreeMap<Employees, Address> myMap = new TreeMap<>();
		
		Address add = new Address("Guntur", "AP");
		
		myMap.put(e1,add);
		myMap.put(e2,add);
		myMap.put(e3,add);
		
		System.out.println(myMap);
		

	}

}
