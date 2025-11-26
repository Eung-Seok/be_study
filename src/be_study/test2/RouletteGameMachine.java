package be_study.test2;

import java.util.Scanner;

public class RouletteGameMachine {
	Scanner scanner = new Scanner(System.in);

	String machineId;
	String branchName;
	int totalPoint;
	int successNum;
	int failNum;
	int remainTryNum;
	int totalSales;
	boolean isRun;

	public RouletteGameMachine(String machineId, String branchName) {
		this.machineId = machineId;
		this.branchName = branchName;
		this.totalPoint = 0;
		this.successNum = 0;
		this.failNum = 0;
		this.remainTryNum = 0;
		this.totalPoint = 0;
		this.isRun = true;
	}

	public void selectMenu() {
		System.out.println("어떤 작업을 하시겠습니까?");
		System.out.println("1.충전, 2.게임시작, 3.마감");
		int menu = scanner.nextInt();
		switch (menu) {
		case 1:
			this.chargeMoney();
			break;
		case 2:
			this.startGame();
			break;
		case 3:
			this.stopMachine();
			break;
		default:
			System.out.println("1부터 3까지의 숫자를 입력해주세요.");
		}
	}

	public void chargeMoney() {
		if (this.remainTryNum > 0) {
			System.out.printf("이미 %d회 충전되어있습니다. 게임을 플레이해주세요.\n",this.remainTryNum);
		} else {
			System.out.println("이 게임기기는 1000원당 2회의 기회가 주어집니다");
			System.out.print("얼마를 충전하시겠습니까? : ");
			int inputMoney = scanner.nextInt();
			while (inputMoney % 1000 != 0 || inputMoney <= 0) {
				System.out.println("충전금액은 1000원단위만 가능합니다.");
				System.out.print("얼마를 충전하시겠습니까? : ");
				inputMoney = scanner.nextInt();
			}
			this.totalSales += inputMoney;
			this.remainTryNum += (inputMoney / 1000) * 2;
			System.out.printf("%d회 충전되었습니다.\n", (inputMoney / 1000) * 2);
			System.out.printf("남은 기회 : %d회\n", this.remainTryNum);
		}
	}
	
	public int runRoulette() {
		int result = (int) (Math.random() * 6 + 1);
		switch (result) {
		case 1:
			System.out.println("1점");
			break;
		case 2:
			System.out.println("2점");
			break;
		case 3:
			System.out.println("3점");
			break;
		case 4:
			System.out.println("4점");
			break;
		default:
			System.out.println("실패!");
			this.failNum++;
			return 0;
		}
		this.successNum++;
		return result;
	}


	public void startGame() {
		if (remainTryNum == 0) {
			System.out.println("게임을 시도하려면 충전해주세요");
		} else {
			while (this.remainTryNum > 0) {
				this.totalPoint += this.runRoulette();
				this.remainTryNum--;
			}
			System.out.printf("%d회 시도 중 %d회 성공, %d회 실패, 총점: %d점\n", this.failNum + this.successNum, this.successNum,
					this.failNum, this.totalPoint);
			this.failNum = 0;
			this.successNum = 0;
			this.totalPoint = 0;

		}
	}

	public void stopMachine() {
		if (this.remainTryNum > 0) {
			System.out.println("기회가 남아있습니다. 게임을 플레이해주세요.");
		} else {
			System.out.println("오늘의 매출액 : " + this.totalSales);
			isRun = false;
		}
	}

}
