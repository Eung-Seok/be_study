package be_study.cond;

public class Cond03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		/*
		 if
		 
		  if
		  
		  if
		  
		  -------
		  else 혼자 x
		  
		  if
		  else
		 */
		int dice = 4;
		if (dice == 1) {
			
		} else if (dice == 2) {
			
		} else if (dice == 3) {
			
		} else if (dice == 4) {
			
		} else if (dice == 5) {
			
		} else if (dice == 6) {	
		}
		
		if (dice == 1) {
			
		} else if (dice == 2) {
			
		} else if (dice == 3) { 
			
		} else if (dice == 4) {
			
		} else if (dice == 5) {
			
		} else {
			
		}
		
		if (dice  < 10) {}
		
		if (dice > 0 && dice <= 6) {}
		
		
		switch (dice) {
		case 1:
			System.out.println("case 1");
			System.out.println("case 1");
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break;
		case 4:
			System.out.println("case 4");
			break;
		case 5:
			System.out.println("case 5");
			break;
		case 6:
			System.out.println("case 6");
			break;
		default: //else
			System.out.println("default");
			break;
		}
		
		
		// ------------------------------------------------
		
		/*
		 	출근시간  일
		 	  8시    청소
		 	  9시	회의
		 	  10시	업무
		 	  11시	외근
		 */
		
		int showTime = 8;
		
		if (showTime <= 8) {
			//청소
			//회의
			//업무
			//외근
		} else if (showTime <= 9) {
			//회의
			//업무
			//외근
		} else if (showTime <= 10) {
			//업무
			//외근
		} else if (showTime <= 11) {
			//외근
		}
		
		
	}
}
