package be_study.quiz;

import java.util.Scanner;
import java.util.Random;
public class Quiz23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
	
		
	
		//인원수와 층수를 입력받기
		System.out.print("엘레베이터의 정원을 입력해주세요 : ");
		int limitPeopleNum = scanner.nextInt();
		System.out.print("엘레베이터의 한계 중량을 입력해주세요 : ");
		int totalWeight = scanner.nextInt();
		System.out.printf("엘레베이터가 멈출 수 있는 횟수를 입력해주세요 : ");
		int canStop = scanner.nextInt();
		
		int peopleNum = random.nextInt(1,21);
		System.out.printf("탑승대기인원은 %d명입니다.\n",peopleNum);
		
		int weight = 0;
		int weightSum = 0;
		int nowPeople = 0;
		
		for (int i = 0; i < peopleNum; i++) {
			if(limitPeopleNum == nowPeople) {
				System.out.println("정원이 다 찼습니다.");
				System.out.printf("총 %d명이 탔습니다.\n",nowPeople);
				break;
			}
			weight = random.nextInt(40, 151);
			weightSum += weight;
	
			System.out.printf("%d번째 사람 탑승 무게: %d\n",i+1, weight);
			if(totalWeight < weightSum) {
				System.out.printf("총 무게가 %d로 중량 초과입니다.\n",weightSum);
				System.out.println("마지막으로 탄 사람은 내려주세요");
				System.out.printf("총 %d명이 탔습니다.\n",nowPeople);
				break;
			}
			nowPeople++;
			System.out.printf("현재까지 탑승인원: %d,총 무게: %d\n",nowPeople,weightSum);
		}
		
		int[] layer = new int[nowPeople];
		int[] sortLayer = new int[nowPeople];
		for (int i = 0; i < nowPeople; i++) {
			layer[i] = random.nextInt(2, 101);
			System.out.printf("%d번재 사람의 내릴 층 : %d\n", i+1, layer[i]);
		}
		
		int min = layer[0];
		int max = layer[0];
		int lastLayer = 0;
		
		
		//최댓값, 최솟값을 우선 찾기
		for(int i = 0; i < nowPeople; i++) {
			if(layer[i] < min)
				min = layer[i];
			if(layer[i] > max)
				max = layer[i];
		}
		
		//sortLayer는 크기순으로 숫자를 정렬한 배열이기 때문에 최소와 최대를 처음과 끝에 넣음
		sortLayer[0] = min;
		sortLayer[nowPeople-1] = max;
		
		
		//숫자를 sort하는 for문, 중복값을 처리할 수 있음
		for (int i = 1; i < nowPeople; i++) {
			//min을 최대로 하면 배열의 다른 숫자들은 이거보다 작음
			min = max;
			for (int j = 0; j < nowPeople; j++ ) {
				if(layer[j]-sortLayer[i-1] < min-sortLayer[i-1] && layer[j]-sortLayer[i-1] > 0) {
					min = layer[j];
				}
			}
			//min이 최댓값이면 마지막에 온 것이므로 거기가 몇번째 숫자인지 저장하면서 for문을 끝냄
			if (min == max) {
				sortLayer[i] = max;
				lastLayer = i;
				break;
			}
			sortLayer[i] = min;
		}
		
		int nowLayer = 1;
		int num = 0;
		
		while (true) {
			System.out.printf("%d층\n",nowLayer);
			if(num <= lastLayer) {
				if(nowLayer == sortLayer[num]) {
					System.out.println("내렸습니다");
					num++;
				}	
			}
					
			if(nowLayer == 100) {
				break;
			}
			if(num == canStop) {
				break;
			}
			nowLayer++;
		}
		
		System.out.println("==================================");
		if (num == canStop) {
			System.out.println("점검중입니다.");
		} else {
			while(nowLayer > 1) {
				nowLayer--;
				System.out.printf("%d층\n",nowLayer);
			}
		}
	}

}
