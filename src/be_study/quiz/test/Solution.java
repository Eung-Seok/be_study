package be_study.quiz.test;
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {     
        
    	int answer = 0;
    	Arrays.sort(array);
    	int[] num = new int[array.length];
        int[] realnum = new int[array.length];
    	int now = -1;
    	int nownum = array[0]-1;
    	for(int i = 0; i < array.length; i++) {
    		if(array[i] == nownum) {
    			num[now]++;
    		} else {
    			nownum = array[i];
    			now++;
                realnum[now] = array[i];
    			num[now]++;
    		}
    	}
        
    	int location = 0;
    	int max = num[0];
    	
    	for (int i = 0; i < array.length; i++) {
    		if(num[i] < max) {
    			max = num[i];
    			location = i;
    		}
    	}
    	
    	Arrays.sort(num);
    	
    	if(num.length == 1) {
            answer = realnum[0];
    	} else if(num[num.length-1] == num[num.length-2]) {
    		answer = -1;
    	} else {
            answer = realnum[location-1];
        }
    	return answer;
    }
}