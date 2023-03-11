import java.util.Scanner;
public class CompleteDet{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How big is the matrix?");
		int size = sc.nextInt();
		
		int[][] matrix = new int[size][size];
		
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				System.out.println("Row " + (i+1) + " Column " + (j+1) + ":");
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("The matrix:\n");
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				System.out.print(matrix[i][j] + "   ");
			}
			System.out.print("\n");
		}
		
		if(size == 2){
			System.out.println("The Determinant is " + DetWork.two(matrix));
		}
		else{
			System.out.println("The Determinant is " + DetWork.more(matrix));
		}
	}
}