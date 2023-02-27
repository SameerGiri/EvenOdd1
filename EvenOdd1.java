import java.util.Scanner;
class  EvenOdd1
{
	public static void main(String[] args) 
	{
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=inp.nextInt();
		if(a%2==0)
		{
			System.out.println(a+ ":Number is even");
		}
		else
			{
			System.out.println(a +":Number is odd");
}	
}
}
