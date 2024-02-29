package JavaBasic;

public class AllPatern {
	
	
		public static void main(String[] args) {
			int i, j;

			for (i = 1; i <= 5; i++) {
				for (j = 5; j > i; j--) {
					System.out.print(i);

				}
				System.out.println(j);
			}

			System.out.println("-------------------------2-------------");

			int a, b;

			for (a = 1; a <= 5; a++) {
				for (b = 1; b < a; b++) {
					System.out.print(b);
				}
				System.out.println(a);
			}

			System.out.println("------------------3--------------------");

			// int a,b;

			for (i = 1; i <= 5; i++) {
				for (j = 1; j < i; j++) {
					System.out.print(i);
				}
				System.out.println(j);
			}

			System.out.println("----------------4----------------------");

			// int a,b;

			for (int k = 5; k > 0; k--) {
				for (int k2 = 0; k2 < k; k2++) {
					System.out.print(k);
				}
				System.out.println();
			}

			System.out.println("-----------------5---------------------");

			// int a,b;

			for (i = 1; i <= 5; i++) {
				for (j = 5; j > i; j--) {
					System.out.print(i);
				}
				System.out.println(j);
			}
		}
	}



