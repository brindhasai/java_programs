public class WordMatrix 
{
	public int[][] solution;
	int path = 1;

	public WordMatrix(int N) 
	{
		solution = new int[N][N];
		for (int i = 0; i < N; i++) 
		{
			for (int j = 0; j < N; j++) 
			{
				solution[i][j] = 0;
			}
		}
	}

	public boolean searchWord(char[][] matrix, String word) 
	{
		int N = matrix.length;
		for (int i = 0; i < N; i++) 
		{
			for (int j = 0; j < N; j++) 
			{
				if (search(matrix, word, i, j, 0, N)) 
				{
					return true;
				}
			}
		}
		return false;
	}

	public boolean search(char[][] matrix, String word, int row, int col,int index, int N) 
	{

		
		if (solution[row][col] != 0 || word.charAt(index) != matrix[row][col]) 
		{
			return false;
		}

		if (index == word.length() - 1) 
		{
			solution[row][col] = path++;
			return true;
		}

		solution[row][col] = path++;		
		
		if (row + 1 < N && search(matrix, word, row + 1, col, index + 1, N)) //go down
		{ 					
			return true;
		}
		if (row - 1 >= 0 && search(matrix, word, row - 1, col, index + 1, N)) //go up
		{
			return true;
		}
		if (col + 1 < N && search(matrix, word, row, col + 1, index + 1, N)) //go right
		{ 		
			return true;
		}
		if (col - 1 >= 0 && search(matrix, word, row, col - 1, index + 1, N)) //go left
		{ 
			return true;
		}
		
		solution[row][col] = 0;
		path--;
		return false;
	}

	public void print() {
		for (int i = 0; i < solution.length; i++) {
			for (int j = 0; j < solution.length; j++) {
				System.out.print(" " + solution[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		char[][] matrix = { {'F','A','C','I'},{'O','B','Q','P'},{'A','N','O','B'},{'M','A','S','S'} };
		String s="FOAM";
		String str="MASS";
		WordMatrix w = new WordMatrix(matrix.length);
		if (w.searchWord(matrix, s)) {
			w.print();
			System.out.println("Word found");
		} else {
			System.out.println("No word found");
		}

	}

}
