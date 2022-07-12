import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Retailer
 */
public class Retailer extends Basket {
	private String retailerName;
	private int age;
	Basket fruitBasket;

	public Retailer(String name, int i) {
		this.retailerName = name;
		this.age = i;
	}

	public void buyFruitsFromFarmer() throws InterruptedException, IOException {
				

			Fruit fruit = Basket.removeFruit();
			System.out.printf("%s bought fruit!!! \n", this.retailerName);

            ObjectOutputStream oos = null;
            
            try {
                oos = new ObjectOutputStream(new FileOutputStream("fruits-bought.txt"));
                oos.writeObject(fruit);
                System.out.println("Fruit Added");
            } catch (FileNotFoundException e) {
            } catch (IOException e) {
            } finally {
                oos.close();
            
			
		}
	}


}