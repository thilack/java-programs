package java;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<4;i++) {
	for(int j=0;j<3-i;j++) {
		System.out.print("  ");
	}
	for(int k=1;k<=i;k++) {
		System.out.print(k);
		System.out.print("   ");
	}
		
	System.out.println();
}


	}

}
