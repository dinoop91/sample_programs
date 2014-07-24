package sample1;

public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int mat1[][] = {{1,1,6,3},{2,4,3,2}};
		int mat2[][] = {{2,4,3},{5,5,7}};
		System.out.println("matrix 1");
		for(int i=0; i< mat1.length;i++){
			for(int j=0; j< mat1[i].length;j++){
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println("\n");
		}
		System.out.println("matrix 2");
		for(int i=0; i< mat2.length;i++){
			for(int j=0; j< mat2[i].length;j++){
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		
		System.out.println("sum is");
		for(int i=0, j=0;i<mat1.length & j<mat2.length;i++, j++){
			for(int x=0, y=0;x<mat1[i].length & y<mat2[j].length;x++, y++){
				System.out.print(mat1[i][x]+mat2[j][y]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("multiply is ");
		for(int i=0, j=0;i<mat1.length & j<mat2.length;i++, j++){
			for(int x=0, y=0;x<mat1[i].length & y<mat2[j].length;x++, y++){
				System.out.print(mat1[i][x]*mat2[j][y]+"  ");
			}
			System.out.println();
		}
	}

}
