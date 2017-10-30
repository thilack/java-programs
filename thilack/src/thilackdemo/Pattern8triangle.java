package thilackdemo;

public class Pattern8triangle {

	public static void main(String[] args) {
		
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
						
			System.out.print(" *");
			//System.out.print(" ");
						}while(number<5-round);
					round++;
					System.out.println();
		}while(round<5);


}
}