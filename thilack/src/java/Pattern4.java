package java;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=4;k>i;k--) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}