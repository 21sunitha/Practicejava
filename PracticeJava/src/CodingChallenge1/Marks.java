package CodingChallenge1;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		float score=sc.nextInt();
		sc.nextLine();
		String department=sc.nextLine();
		System.out.println("my name is : "+name);
		System.out.println("my score is : "+score/10);
		System.out.println("my department is : "+department);
		
	}

}
