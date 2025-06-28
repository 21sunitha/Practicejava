package CodingChallenge5;
import java.util.Arrays;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		int[]arr=new int[size];
		for(int i=0;i<=size-1;i=i+1) {
			arr[i]=sc.nextInt();
			
		}
		if(size%2!=0) {
			System.out.println("middle element : "+arr[size/2]);
		}
		else {
			System.out.println("Middle element : "+arr[(size/2)-1] );
		}
		//System.out.println(Arrays.toString(arr));  //printing an array
	

	}

}
