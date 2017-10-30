package thilackdemo;

public class Pattern10mstar {

	public static void main(String[] args) {
		int row=1,star,space;
		do{
			space=0;
			do
			{
			space++;
			System.out.print(" ");
			}while(space<row);
			star=0;
			do
			{
				
			star++;
			System.out.print(star);
			System.out.print(" ");
		}while(star<5-row);
		row++;
		System.out.println();
		                       
			
		}while(row<5);
		
	}

}
