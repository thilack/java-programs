package thilackdemo;

public class Pattern1 {

	public static void main(String[] args) {
		int r=1;
		do
		{
			int s=0;
			while(s<r)
			{
				s++;
				System.out.print("*");
			}
			r++;
			System.out.println();
		}while(r<5);

	}

}
