package thilackdemo;

public class Pattern5reverse {

	public static void main(String[] args) {
		int r=1;
		do
		{
			int s=0;
			do {
				s++;
				System.out.print(s);
			}while(s<5-r);
		r++;
		System.out.println();
		}while(r<4);

	}

}
