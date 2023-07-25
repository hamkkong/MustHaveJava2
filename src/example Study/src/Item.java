
public class Item {
    private String name;
    private int price;
    
    
    public static void main(String[] args) {
	
	Item item = new Item();
	item.name = "apple";
	item.price = 1000;
	//System.out.println(item.name);
	//System.out.println(item.price);
	
	item = null;
	System.out.println(item.name);
	System.out.println(item.price);
    }

}
