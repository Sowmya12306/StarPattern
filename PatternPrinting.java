package myfirstprogram;

public class PatternPrinting {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 && i < (n - i) / 2 || i == 0 | i == (n - 1) / 2 || j == n - 1 && i > (n - 1) / 2
						|| i == n - 1)
					System.out.print("s ");
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == 0 || i == n - 1)
					System.out.print("o ");
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i + j == n - 1 && i >= n / 2 || i == j && j >= n / 2)
					System.out.print("w ");
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == j && i <= n / 2 || i + j == n - 1 && j >= n / 2)
					System.out.print("m ");
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i == j && i <= n / 2 || i + j == n - 1 && j >= n / 2 || i + j > n - 1 && i > n / 2 && j == n / 2)

					System.out.print("y ");
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i == n / 2 || i < n / 2 && j == n / 2 && i != 1 || i < n / 2 && j == 1 && i != 0
						|| i == 1 && j > n / 2 && j != n - 1 || i > n / 2 && j == 0
						|| j > n / 2 && j == n - 1 && i > n / 2)

					System.out.print("a ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}

		System.out.println("\n");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n / 2 && i != 1)
					System.out.print("i ");
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == j)
					System.out.print("n ");
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 | i == n - 1 || i == n / 2)
					System.out.print("e ");
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 | i == n - 1)
					System.out.print("u ");
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 | i == n / 2 || j == n - 1 && i <= n / 2 || i == j && i > n / 2)
					System.out.print("r ");
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
					System.out.print("o ");
				else
					System.out.print("  ");
			}
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == j)
					System.out.print("n ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}

		
		}

	}




