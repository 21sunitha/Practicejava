package Function;

public class ParameterizedFuction {
	void chocolate(int money)
	{
		System.out.println("the price of chocolate is : "+ money);
	}
	void powder(int quantity)
	{
		System.out.println("the quantity of powder packets is : "+ quantity);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedFuction obj1=new ParameterizedFuction();
		obj1.chocolate(30);
		ParameterizedFuction obj2=new ParameterizedFuction();
		obj2.powder(5);

	}

}
