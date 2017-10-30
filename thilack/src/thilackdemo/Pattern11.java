package thilackdemo;

public class Pattern11 {

	public static void main(String[] args) {
		int r=1,s,b;
		do{
			b=0;
			do
			{
				b++;
				System.out.print(r);
			}while(b<r);
			s=0;
			while(s<5-r){
				System.out.print(" ");
				System.out.print(" ");
				//System.out.print(" ");
				s++;
				}
		b=0;
		do
		{
			b++;
			System.out.print(r);
		}while(b<r);
		r++;
		System.out.println();
		
		}while(r<6);
	}

}
