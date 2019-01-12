package training.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// Maps work as key value pair
		
		Map<String,String> fruit_map = new HashMap<String, String>();
		fruit_map.put("A", "Apple");
		fruit_map.put("B", "Banana");
		fruit_map.put("C", "Cherry");
		fruit_map.put("M", "Mango");	
		System.out.println(fruit_map.get("M"));
		
		Map<String, List<String>> shoppingCart = new HashMap<String, List<String>>();
		
		List<String> fruit_list = new ArrayList<String>();
		fruit_list.add("apple");
		fruit_list.add("banana");
		fruit_list.add("mango");
		// unique id is ABC
		
		
		shoppingCart.put("ABC", fruit_list);
		
		System.out.println(shoppingCart.get("ABC"));
	}

}
