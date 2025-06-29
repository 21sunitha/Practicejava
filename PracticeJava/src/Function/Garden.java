package Function;

public class Garden {
	int apple_price=20;
	int apple_count=5;
	void total_money()
	{
		System.out.println(apple_count*apple_price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garden a=new Garden();
		a.total_money();

	}

}
