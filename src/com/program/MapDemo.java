package com.program;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

//Map is a data structure which is not in the Collection 
//map is a  combination of two data types
//key and value, it basically key:value pair combo
//where keys are unique(like set which cannot have duplicate)
//values can be anything even null values are allowed 
//hashMap is implementation class which doesn't follow insertion order 
//LinkedHashmap follows insertion order
//Sorted Map is a subclass of map and it has a implementation class
//called as TreeMpa and its sorted in ascending order
//hashtable: is similar to hashmap where it any class(customized class) if your 
//using hashtable the key class must implement hashcode and equals method of object class
//for hashtable non-null object can be used as a key or as a value.
//identityHashMap:is going to work with referential equality not with the object
//concurrent hashmap: its synchronized and thread safe hashmap 

public class MapDemo {

	public static void main(String[] args) {
		//Map<K,V> k = new HashMap<>();
		//key is going to act like a Set 
		//even though you have multiple nulls for key 
		//you will get only one element inserted into map
		Map<Integer, String> k = new HashMap<>();
		k.put(11, "sdhgwyud");
		k.put(102, null);
//		k.put(null, "hdwg");
//		k.put(null, "dnsbhadyw");
//		k.put(null, "dnsbhadyw");
//		k.put(null, "dnsbhadyw");
//		k.put(null, "jdshg");
		System.out.println(k);
		//clears the map data stucture
		//k.clear();
		//System.out.println(k);
		
		//Insertion order is being followed
		Map<String, Integer> k1 = new LinkedHashMap<>();
		k1.put("sdhgwyud",10 );
		k1.put(null,12);
		k1.put("hdwg",null );
		k1.put(null, 323);
		k1.put(null, 323);
		k1.put(null, 233);
		k1.put("sdsd",null );
		
		System.out.println(k1);
		Set<String> s1 = k1.keySet();
		System.out.println("keys were extracted"+s1);
		//get all the values from the map data structure
		Collection<Integer> v = k1.values();
		System.out.println("values were extracted"+v);
		
		
		//SortedMap cannot have key with null value
		//keys are sorted in ascending order
		SortedMap<Integer, String> k2 = new TreeMap<>();
		k2.put(123, "vidya");
		k2.put(23, null);
		k2.put(12, null);
		k2.put(1, null);
		k2.put(788, null);
		System.out.println(k2);
		
		//extracting the keys from a Map
		Set<Integer> s = k2.keySet();
		System.out.println("keys were extracted" +s);
		//get all the values from the map data structure
		Collection<String> v1 = k2.values();
		System.out.println("values were extracted"+v1);
		
		//finding a key is present or not
		System.out.println(k2.containsKey(123));
		//finding a value is present or not 
		System.out.println(k2.containsValue(null));
		
		//Entry<K,V> is a sub-interface of Map interface
		//using this to extract elements in the form of key:value pairs and looping through it
		//set which contains a maps
		Set<Map.Entry<Integer,String>>	e = k2.entrySet();
		//enhanced for loop to loop through the map as a map(combination of key and value)
		for(Map.Entry<Integer, String> a: e) {
			System.out.println(a);
		}
		//using iterator to loop through the set 
		Iterator<Map.Entry<Integer,String>> i = e.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(e);
		
		//comparing one map with another
		System.out.println(k2.equals(k1)); //false 
		
		//Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
		System.out.println(k2.get(123));
		//Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
		System.out.println(k2.getOrDefault(10, "hello"));
		//Returns the hash code value for this map.
		System.out.println(k2.hashCode());
		//finds out weather it has elements or not
		System.out.println(k2.isEmpty());
		
		//adding all elements of k in k2
		//Copies all of the mappings from the specified map to this map (optional operation).
		k2.putAll(k);
		System.out.println(k2);
		
		//if this key is associated with a value it returns a value 
		//if not it inserts
		k2.putIfAbsent(10, "glass");
		System.out.println(k2);
		
		//based on key it removes the elements first occurrence
		k2.remove(123);
		System.out.println(k2);
		System.out.println(k2.remove(102, null)); //returns false as 123 is associated with vidya
		System.out.println(k2);

		//replace whatever value associated with it to phone and return existing value
		System.out.println(k2.replace(10, "phone"));
		System.out.println(k2);
		//key which is associate with null gets replaced with laptop and returns true or false
		k2.replace(1, null, "laptop");
		System.out.println(k2);
		//Returns the number of key-value mappings in this map.
		System.out.println(k2.size());	
		
		//refer equality and object equality
				Student stud = new Student(10,"vidya");
				Student stud2 = new Student(10,"vidya");
				
				//object
				System.out.println(stud.equals(stud2));
				//this is reference check
				if(stud == stud2) {
					System.out.println("true");
				}else System.out.println("false");
	}

}