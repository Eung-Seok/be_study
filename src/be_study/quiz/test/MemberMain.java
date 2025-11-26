package be_study.quiz.test;

import java.util.Arrays;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 0, 0, 1 };
		asdf(arr);

		for (int v : arr) // 배열을 출력하는 for문
			System.out.print(v + " ");
		
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void asdf(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] += 1;
		}

	}
}
