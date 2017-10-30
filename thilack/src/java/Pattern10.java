package java;

public class Pattern10 {

	public static void main(String[] args) {
		for(int i=1;i<4;i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
				System.out.print("   ");
			}
				
			System.out.println();
		}
		for(int l=1;l<4;l++) {
			for(int m=0;m<l;m++) {
				System.out.print("  ");
			}
			for(int n=1;n<=3-l;n++) {
				System.out.print("*");
				System.out.print("   ");
			}
				
			System.out.println();
		}


			}

		}