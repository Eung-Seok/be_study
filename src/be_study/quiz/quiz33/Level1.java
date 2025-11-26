package be_study.quiz.quiz33;

public class Level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
		int[] arr1 = {1,2,3,4,5,6,7};
		for(int v: arr1) {
			System.out.print(v + " ");
		}
		System.out.println();
		
		//2
		int[] arr2 = new int[5];
		arr2[2] = 50;
		
		//3
		System.out.println(arr2.length);
		
		//4
		int sum4 = 0;
		for(int v: arr1) {
			sum4 += v;
		}
		System.out.println(sum4);
		
		//5
		for(int v: arr1) {
			System.out.print(v + " ");
		}
		System.out.println();
		
		//6
		System.out.println(mean(arr1));
		
		//7
		int[] arr7 = {1,6,2,3,9,2,7};
		System.out.println(max(arr7));
		
		//8
		plusOne(arr1);
		for(int v: arr1) {
			System.out.print(v + " ");
		}
		System.out.println();
		
		//9
		int[] arr9 = makeArray(3);
		for(int v: arr9) {
			System.out.print(v + " ");
		}
		System.out.println();
		
		//10
		int[] arr10 = reverseArray(arr1);
		for(int v: arr10) {
			System.out.print(v + " ");
		}
		System.out.println();
		
	}
	
	//6
	public static double mean(int[] numArr) {
		int sum = 0;
		for(int v: numArr) {
			sum += v;
		}
		double mean = (double)sum/numArr.length;
		
		return mean;
	}
	
	//7
	public static int max(int[] numArr) {
		int max = 0;
		for(int v: numArr) {
			if(v > max)
				max = v;
		}
		return max;
	}
	
	//8
	public static void plusOne(int[] numArr) {
		for(int i = 0; i < numArr.length; i++) {
			numArr[i]  += 1;
		}
	}
	
	//9
	public static int[] makeArray(int n) {
		int[] array = new int[n];
		return array;
	}
	
	//10
	public static int[] reverseArray(int[] numArr) {
		int[] reverse = new int[numArr.length];
		for(int i = 0; i < numArr.length; i++) {
			reverse[i] = numArr[numArr.length-1-i];
		}
		return reverse;
	}

}
