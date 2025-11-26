package be_study.quiz.quiz33;

public class Level5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 41
		Person[] pArr41 = new Person[5];
		for (Person p : pArr41) {
			System.out.print(p + " ");
		}
		System.out.println();
		fillPersonArray(pArr41);
		for (Person p : pArr41) {
			System.out.print(p + " ");
		}
		System.out.println("---------------------------------------");

		// 42
		Person[] pArr42 = new Person[4];
		fillPersonArray(pArr42);
		pArr42[0].name = "일번";
		pArr42[1].name = "이번";
		pArr42[2].name = "삼번";
		pArr42[3].name = "사번";
		sayHelloInPersonArray(pArr42);
		System.out.println("---------------------------------------");

		// 43
		Person[] pArr43 = new Person[4];
		Person p43 = new Person();
		p43.name = "김응석";
		p43.age = 27;
		putPersonInPersonArray(pArr43, p43, 2);
		for (Person p : pArr43) {
			if (p == null)
				System.out.println("null");
			else
				System.out.println(p.name + " " + p.age);
		}
		System.out.println("---------------------------------------");

		// 44
		Person[] pArr44 = new Person[4];
		fillPersonArray(pArr44);
		pArr44[0].name = "일번";
		pArr44[1].name = "이번";
		pArr44[2].name = "삼번";
		pArr44[3].name = "사번";
		for (int i = 0; i < 4; i++) {
			pArr44[i].age = (int) (Math.random() * 60) + 1;
		}
		for (Person p : pArr44) {
			System.out.print(p.name + " " + p.age + " ");
		}
		System.out.println();
		Person[] sortpArr44 = sortByAge(pArr44);
		for (Person p : sortpArr44) {
			System.out.print(p.name + " " + p.age + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------");
		
		//45
		Person p45 = new Person();
		p45.name = "김응석";
		p45.age = 27;
		System.out.println(p45.name + " " + p45.age);
		fixPersonField(p45);
		System.out.println(p45.name + " " + p45.age);
		System.out.println("바뀌었음");

	}

	// 41
	public static void fillPersonArray(Person[] pArr) {
		for (int i = 0; i < pArr.length; i++)
			pArr[i] = new Person();
	}

	// 42
	public static void sayHelloInPersonArray(Person[] pArr) {
		for (Person p : pArr) {
			p.hello();
		}
	}

	// 43
	public static void putPersonInPersonArray(Person[] pArr, Person p, int n) {
		// 상식적으로 index가 0일 때를 첫번째라고 하기 때문에 n번째에 넣는 것을 index로 변환하여 수식을 작성하려다가
		// 헷갈릴 수 있기 때문에 그냥 n은 인덱스로 하기로 했음

		pArr[n] = new Person();
		pArr[n].name = p.name;
		pArr[n].age = p.age;
	}

	// 44
	public static Person[] sortByAge(Person[] pArr) {
		Person[] sortpArr = new Person[pArr.length];
		fillPersonArray(sortpArr);
		int[] age = new int[pArr.length];

		for (int i = 0; i < pArr.length; i++) {
			age[i] = pArr[i].age;
		}

		for (int i = 0; i < pArr.length; i++) {
			for (int j = i; j < pArr.length; j++) {
				if (age[j] < age[i]) {
					int temp = age[i];
					age[i] = age[j];
					age[j] = temp;

				}
			}
		}
		for (int i = 0; i < pArr.length; i++) {
			for (int j = 0; j < pArr.length; j++) {
				if (age[i] == pArr[j].age) {
					sortpArr[i].name = pArr[j].name;
					sortpArr[i].age = pArr[j].age;
					pArr[j].age = 0;
					break;
				}
			}
		}

		return sortpArr;
	}
	
	//45
	public static void fixPersonField(Person p) {
		p.name = "김응주";
		p.age = 34;
	}

}
