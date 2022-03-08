
public class Main {

	public static void main(String[] args) {

		long[][] m = new long[3][3];

		char[][] jogo = new char[3][3];
		jogo[0][0] = 'X';
		jogo[2][1] = 'O';
		System.out.println("posição 0 " + jogo[0][0]);
		System.out.println("posição 8 " + jogo[2][1]);

		int[][][] n = new int[3][3][3];
		n[0][0][0] = 10;
		n[1][1][0] = 15;

		int[][] b = new int[][] { { 1, 2 }, { 3, 4 } };
		int[][] l = { { 5, 6 }, { 7, 8 } };
		int[][][] t = new int[][][] { { { 1, 2 }, { 3, 4 }, }, { { 5, 6 }, { 7, 8 } } };
		int[][][] x = { { { 9, 18 }, { 11, 12 } }, { { 13, 14 }, { 15, 16 } } };

		int[][] idades = new int[][] { { 12, 35 }, { 45, 22 } };

		for (int[] id1 : idades) {
			for (int id2 : id1) {
				System.out.println(id2);
		}
		
		for (int i = 0; i < idades.length; i++) {
			int[] id = idades[i];
			for (int j = 0; j < idades.length; j++) {
				System.out.println(idades[i][j]);
				
			}
		}
		byte[] bytes = new byte[2];
		bytes[1] = 100;
		
		float[] floats = new float[2];
		floats[1] = 10.98f;
		
		for (byte byte_ : bytes) {
			System.out.println("byte: " + byte_);
		}
		for (float float_ : floats ) {
			System.out.println("float " + float_);
			
			
		}
		
		
		
			
		}
		

	}
}
