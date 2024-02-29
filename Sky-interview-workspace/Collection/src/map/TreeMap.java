package map;


public class TreeMap {

	public static void main(String[] args) {

		java.util.TreeMap map = new java.util.TreeMap();
		map.put("1", "one");
		map.put("3", "Three");
		map.put("5", "Five");
		map.put("2", "Two");
		map.put("4", "Four");

		System.out.println(map);

	}

}