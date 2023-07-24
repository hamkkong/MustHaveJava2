package arrayCopy;
import java.util.*;
public  class Fruit implements Comparable<Fruit>{
    private String name;
    private int price;
    
    public Fruit(String name, int price) {
	this.name = name;
	this.price = price;
    }
    @Override
    public String toString() {
	return "\n {name: " + name + ", price : " + price + "} \n";
    }
    
    @Override
    public int compareTo(Fruit fruit) {
	return this.price - fruit.price;
    }

    public static void main(String[] args) {   //fruit  
	Fruit[] arr = {
		new Fruit("Apple", 100),
		new Fruit("Kiwi", 500),
		new Fruit("Orange", 200),
		new Fruit("Banana", 50),
		new Fruit("Watermelon", 880),
		new Fruit("Cherry", 10)
	};
	Arrays.sort(arr);
	
	System.out.println(" Sorted arr[] : \n" + Arrays.toString(arr));

    }

}
