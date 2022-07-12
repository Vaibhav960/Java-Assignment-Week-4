import java.io.IOException;

public class Main{
      public static void main(String[] args) throws InterruptedException, IOException {
            Mango m1 = new Mango("hapus1", "yellow", 420);
            Mango m2 = new Mango("hapus3", "yellow2", 200);
            Mango m3 = new Mango("hapus3", "yellow3", 300);
            Apple a1 = new Apple();
            Apple a2 = new Apple();



            Retailer r1 = new Retailer("john",23);
            UrbanFarmer uf1 = new UrbanFarmer("Kiran",(short)26);

            uf1.harvest(m1);
            uf1.harvest(m2);
            uf1.harvest(m3);
            uf1.harvest(a1);
            uf1.harvest(a2);
            

            r1.buyFruitsFromFarmer();
            r1.buyFruitsFromFarmer();
            r1.buyFruitsFromFarmer();
            r1.buyFruitsFromFarmer();
            r1.buyFruitsFromFarmer();
      }
}