package be_study.arr;

public class Arr04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//배열 참조타입 vs 기본타입 int
		int a = 10;
		int b = a;
		System.out.println(a + " " + b);
		
		b = 20;
		System.out.println(a + " " + b);
		
		//배열 복사
		
		//참조변수를 복사 = 얕은 복사(주소를 복사하는 것이기 때문에 변화가 같이 일어남)
//		int[] arr1= {10, 20, 30,};
//		int[] arr2 = arr1;
//		
//		arr2[0] = 99;
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.print(arr1[i] + " ");
//		}
//		System.out.println();
//		for(int i = 0; i < 3; i++) {
//			System.out.print(arr2[i] + " ");
//		}
//		System.out.println();
		
		//깊은 복사 = 값까지 포함해서 
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[3];
		
//		for문으로 각 변수값(int)을 복사
//		for(int i = 0; i < 3; i++) {
//			arr2[i] = arr1[i];
//		}
//		arr2[0] = 99;
		
		
//		System.arraycopy(복사할대상, 복사할 대상의 위치. 저장할대상, 저장할대상의 위치, 길이)
		System.arraycopy(arr1, 0, arr2, 0, 3);
		
		for(int i = 0; i < 3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < 3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
	
	

}
