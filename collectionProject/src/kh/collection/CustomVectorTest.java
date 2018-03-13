package kh.collection;

public class CustomVectorTest {

	public static void main(String[] args) {
		
		CustomVector myVector = new CustomVector(10);
		System.out.println(myVector.capacity());
		System.out.println(myVector.isEmpty());
		System.out.println(myVector.size());
		
		myVector.add("1");
		myVector.add("2");
		myVector.add("3");
		myVector.add("4");
		myVector.add("5");
		myVector.add("6");
		myVector.add("7");
		myVector.add("8");
		myVector.add("9");
		myVector.add("10");
		myVector.add("1");
		myVector.add("2");
		myVector.add("3");
		myVector.add("4");
		myVector.add("5");
		myVector.add("6");
		myVector.add("7");
		myVector.add("8");
		myVector.add("9");
		myVector.add("10");

		
		System.out.println(myVector.capacity());
		System.out.println(myVector.isEmpty());
		System.out.println(myVector.size());
		System.out.println(myVector.get(3));
		
		System.out.println(myVector.remove("5"));
		System.out.println(myVector.toString());
		
	}

}
