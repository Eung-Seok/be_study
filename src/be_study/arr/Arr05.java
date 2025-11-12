package be_study.arr;

public class Arr05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 20, 30, 40, 50};
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("arr[%d] = %d\n",i, arr[i]);
		}
		
		for(int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();
		
		//총합 구하기
		//원래 하던거
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		//향상된 for문으로 하는 것
		sum = 0;
		for(int v: arr) {
			sum += v;
		}
		System.out.println(sum);
		
		//모든 숫자에 -5점 처리
		
		for (int s: arr) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		int index = 0;
		//아래처럼 하면 아무런 영향을 주지 못함
		for(int s : arr) {
			s -= 5;
		}
		
		for(int s: arr) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//이렇게 해야 값을 바꿀 수 있음 
		for(int s : arr) {
			arr[index] = s-5;
			index++;
		}
		
		for(int s : arr) {
			System.out.print(s + " ");
		}
		
		
		
		
	}

}
