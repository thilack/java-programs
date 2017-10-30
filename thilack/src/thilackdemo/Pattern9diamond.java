package thilackdemo;

public class Pattern9diamond {

	public static void main(String[] args) {
		{
			int round=1,space;
		
	do
	{
		space=0;
		do
			{
			space++;
			System.out.print(" ");
			
			}while(space<10-round);
	int number=0;
	
		do
	{
		number++;
		
		System.out.print("*");
		System.out.print(" ");
		//System.out.println();
	}while(number<round);
		
		round++;
		System.out.println();
		
	}while(round<10);
	
	}
		
		int round=1,space;
		
do
{
	space=0;
	do
		{
		space++;
		System.out.print(" ");
		
		}while(space<round);
int number=0;

	do
{
	number++;
	
	System.out.print("*");
	System.out.print(" ");
	//System.out.println();
}while(number<10-round);
	
	round++;
	System.out.println();
	
}while(round<10);	
	}
}
