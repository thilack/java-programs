package java;

public class Pattern6 {

	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			int c;
			for(int j=0;j<5-i;j++) {
				c=i+j;
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
