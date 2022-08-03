package myfirstprogram;

public class NumPrint {
	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 ||i==0|j==n-1||i==n-1||j-i>=(n)/2||i+j<=(n-1)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
}
		System.out.println("");
	
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (j == 0 &&i>=(n-1)/2||i==n-1||j==n-1&&i>=(n-1)/2||i==n-2||i-j>=(n-1)/2||i+j>=n-1+(n-1)/2)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
}
System.out.println();
	
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (j == 0 ||i==n-1||i==0||i+j<=(n)/2||i-j>=(n-1)/2)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
}
	System.out.println();
	for (int i = 0; i < n/2; i++) {
		for (int j = 0; j < n/2; j++) {
			
				System.out.print(i);
			
		}
		System.out.println();
}
}
}
	

