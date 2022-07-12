public class UrbanFarmer  {
	private String farmerName;
	private short age;
    

	public UrbanFarmer(String name, short age) {
		this.farmerName = name;
		this.age = age;
	}

	public String getFarmerName() {
		return farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public void harvest(Fruit fruit) throws InterruptedException {
		
			System.out.printf("%s harvesting \n", this.farmerName);
            Basket.addFruit(fruit);
		
	}

	
}
