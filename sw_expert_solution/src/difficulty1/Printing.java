package difficulty1;

public class Printing {

	public static void main(String[] args) {
		char[][] printing = new char[5][5];

		for (int i = 0; i < printing.length; i++) {
			for (int j = 0; j < printing[i].length; j++) {
				if (i == j) {
					printing[i][j] = '#';
				} else {
					printing[i][j] = '+';
				}
				System.out.print(printing[i][j]);
			}
			System.out.println();
		}

	}

}
