import java.util.ArrayList;
import java.util.List;

public class Basket {
	public static List<Fruit> fruitList = new ArrayList<>();
	
	public  static void addFruit(Fruit fruit) throws InterruptedException{
//		System.out.printf("\n Inside addFruit for int %s",i);
		
		
        if (fruitList.size()<5) {
            fruitList.add(fruit);
        } else {
            System.out.println("Cannot add more than 5 fruits to list");
        }
		
	}
	
	public static Fruit removeFruit() throws InterruptedException{
//		System.out.printf("\n Inside removeFruit for int ");
		
		
		Fruit i = fruitList.remove(0);
		
		
		return i;
	}
	
	public boolean isEmpty() {
		return fruitList.isEmpty();
	}
	
	
}