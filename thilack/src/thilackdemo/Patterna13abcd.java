package thilackdemo;

public class Patterna13abcd {

	public static void main(String[] args) {
		char a='A';
		do
		{
			char b='A';
			while(b<a)
			{
				System.out.print(" ");
				b++;
			}
			System.out.println(b);
			a++;
		}while(a<'F');

	}

}
