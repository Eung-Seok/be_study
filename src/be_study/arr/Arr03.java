package be_study.arr;

public class Arr03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr1 = {1,2,3,};
		
		System.out.println(arr1[0] == arr1[2]);
		
		String[] arr2 = {"A","B","C"};
		
		System.out.println(arr2[0] == arr2[2]); //이거는 String의 주소를 비교하는 것
		System.out.println(arr2[0].equals(arr2[2])); //이게 값의 비교
	
	}
	

}
