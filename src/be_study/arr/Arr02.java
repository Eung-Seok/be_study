package be_study.arr;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int
		//int[]
		//int[][]
		//int[][][]
		
		int n = 10;
		int[] nArr1 = new int[5];
		
		int[][] nArr2 = new int[3][5];
		
		/*  0  1 2 3  4
		 0  ㅁ ㅁ ㅁ ㅁ ㅁ 
		 1  ㅁ ㅁ ㅁ ㅁ ㅁ
		 2  ㅁ ㅁ ㅁ ㅁ ㅁ
		 */

		int[][] nArr3 = new int[4][3];
		
		/*  0  1 2
		 0  ㅁ ㅁ ㅁ 
		 1  ㅁ ㅁ ㅁ 
		 2  ㅁ ㅁ ㅁ     
		 3  ㅁ ㅁ ㅁ      
		 */
		
		
		int[] nArray1 = {1,2,3,4,5,6};
		int[][] nArray2 = {{1,2,3}, {4,5,6}} ;
		//1 2 3 
		//4 5 6
		
		int[][] nArray3 = {{1,2}, {3,4,}, {5,6,}};
		// 1 2
		// 3 4
		// 5 6 
		System.out.println(nArray2[0][2]);
		
		int[][] nArray4 = new int[2][3];
		
		for( int i = 0; i < 2 ; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(nArray2[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
