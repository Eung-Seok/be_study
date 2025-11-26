package be_study.quiz.quiz33;

public class Level4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 31
		Person[] pArr31 = personArray(5);
		int[] iArr31 = intArray(5);
		printPersonArray(pArr31);
		printIntArray(iArr31);
		System.out.println("---------------------------------------");

		// 32
		Person[] pArr32 = personArray(9);
		int[] iArr32 = intArray(7);
		for (int i = 0; i < 7; i++) {
			iArr32[i] = (int) (Math.random() * 60) + 1;
		}
		printIntAndPersonArray(pArr32, iArr32);
		System.out.println("---------------------------------------");

		// 33
		Person[] pArr33 = personArray(5);
		for (int i = 0; i < 5; i++) {
			pArr33[i].age = (int) (Math.random() * 60) + 1;
		}
		int[] age = ageToInt(pArr33);
		for (int v : age) {
			System.out.print(v + " ");
		}
		System.out.println();

		System.out.println("---------------------------------------");

		// 34
		int[] iArr34 = intArray(7);
		for (int i = 0; i < 7; i++) {
			iArr34[i] = (int) (Math.random() * 60) + 1;
		}
		Person[] pArr34 = makeAgeOnly(iArr34);
		for (Person p : pArr34) {
			System.out.print(p.age + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------");

		// 35
		Person p35 = new Person();
		p35.name = "김응석";
		p35.age = 27;
		Person new_p35 = clonePerson(p35);
		System.out.println(new_p35.name + " " + new_p35.age);
		System.out.println("---------------------------------------");

		// 36
		Person[] pArr36 = personArray(4);
		pArr36[0].name = "일번";
		pArr36[1].name = "이번";
		pArr36[2].name = "삼번";
		pArr36[3].name = "사번";
		for (int i = 0; i < 4; i++) {
			pArr36[i].age = (int) (Math.random() * 60) + 1;
		}
		Person[] new_pArr36 = deepClonePersonArray(pArr36);
		new_pArr36[2].age = 26;
		for (Person p : pArr36) {
			System.out.print(p.name + " " + p.age + " ");
		}
		System.out.println();
		for (Person p : new_pArr36) {
			System.out.print(p.name + " " + p.age + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------");

		// 37
		Person[] pArr37 = personArray(6);
		pArr37[0].name = "일번";
		pArr37[2].name = "삼번";
		pArr37[5].name = "육번";
		nameNullFilter(pArr37);
		System.out.println("---------------------------------------");
		
		// 38
		Person[] pArr38 = personArray(4);
		pArr38[0].name = "일번";
		pArr38[1].name = "이번";
		pArr38[2].name = "삼번";
		pArr38[3].name = "사번";
		for (int i = 0; i < 4; i++) {
			pArr38[i].age = (int) (Math.random() * 60) + 1;
		}
		Person[] new_pArr38 = deepClonePersonArrayWithInt(pArr38,6);
		Person[] new_pArr38_2 = deepClonePersonArrayWithInt(pArr38,2);
		for (Person p : pArr38) {
			System.out.print(p.name + " " + p.age + " ");
		}
		System.out.println();
		for (Person p : new_pArr38) {
			System.out.print(p.name + " " + p.age + " ");
		}
		System.out.println();
		for (Person p : new_pArr38_2) {
			System.out.print(p.name + " " + p.age + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------");

		// 39
		Person p39 = new Person();
		initializePerson(p39);
		System.out.println(p39.name + " " + p39.age);
		System.out.println("---------------------------------------");

		// 40
		Person p40 = new Person();
		initializePerson(p40);
		int n1 = 10;
		int n2 = 27;
		int n3 = 40;
		compareIntAndPersonAge(n1, p40);
		compareIntAndPersonAge(n2, p40);
		compareIntAndPersonAge(n3, p40);

	}

	// person배열 생성자
	public static Person[] personArray(int n) {
		Person[] pArr = new Person[n];
		for (int i = 0; i < n; i++) {
			pArr[i] = new Person();
		}
		return pArr;
	}

	// int배열 생성자
	public static int[] intArray(int n) {
		int[] iArr = new int[n];
		return iArr;
	}

	// 31
	public static void printPersonArray(Person[] pArr) {
		for (Person p : pArr) {
			System.out.println(p.name + " " + p.age);
		}
	}

	public static void printIntArray(int[] numArr) {
		for (int v : numArr) {
			System.out.print(v + " ");
		}
		System.out.println();
	}

	// 32
	public static void printIntAndPersonArray(Person[] pArr, int[] iArr) {
		int large = 0;
		if (pArr.length > iArr.length)
			large = pArr.length;
		else
			large = iArr.length;
		if (pArr.length > iArr.length) {
			for (int i = 0; i < iArr.length; i++) {
				System.out.println(i + "번째: Person : " + pArr[i].name + " " + pArr[i].age + " Int : " + iArr[i]);
			}
			System.out.println("Int배열 끝");
			for (int i = iArr.length; i < large; i++) {
				System.out.println(i + "번째 Person: " + pArr[i].name + " " + pArr[i].age);
			}
		} else {
			for (int i = 0; i < pArr.length; i++) {
				System.out.println(i + "번째: Person : " + pArr[i].name + " " + pArr[i].age + " Int : " + iArr[i]);
			}
			System.out.println("Person배열 끝");
			for (int i = pArr.length; i < large; i++) {
				System.out.println(i + "번째 Int: " + iArr[i]);
			}
		}
	}

	// 33
	public static int[] ageToInt(Person[] pArr) {
		int[] iArr = new int[pArr.length];
		for (int i = 0; i < pArr.length; i++) {
			iArr[i] = pArr[i].age;
		}
		return iArr;
	}

	// 34
	public static Person[] makeAgeOnly(int[] iArr) {
		Person[] pArr = personArray(iArr.length);
		for (int i = 0; i < iArr.length; i++) {
			pArr[i].age = iArr[i];
		}
		return pArr;
	}

	// 35
	public static Person clonePerson(Person p) {
		Person per = new Person();
		per.name = p.name;
		per.age = p.age;
		return per;
	}

	// 36
	public static Person[] deepClonePersonArray(Person[] pArr) {
		Person[] perArr = personArray(pArr.length);
		for (int i = 0; i < pArr.length; i++) {
			perArr[i].name = pArr[i].name;
			perArr[i].age = pArr[i].age;
		}

		return perArr;
	}

	// 37
	public static void nameNullFilter(Person[] pArr) {
		for (int i = 0; i < pArr.length; i++) {
			if (pArr[i].name == null)
				System.out.println(i + 1 + "번째(index는 " + i + ") 이름은 null");
		}
	}

	// 38
	public static Person[] deepClonePersonArrayWithInt(Person[] pArr, int n) {
		Person[] perArr = personArray(n);

		if (n > pArr.length) {
			for (int i = 0; i < pArr.length; i++) {
				perArr[i].name = pArr[i].name;
				perArr[i].age = pArr[i].age;
			}
		} else {
			for (int i = 0; i < n; i++) {
				perArr[i].name = pArr[i].name;
				perArr[i].age = pArr[i].age;
			}
		}

		return perArr;
	}

	// 39
	public static void initializePerson(Person p) {
		p.name = "김응석";
		p.age = 27;
	}

	// 40
	public static void compareIntAndPersonAge(int n, Person p) {
		if (n > p.age)
			System.out.println("int가 Person의 나이보다 큽니다");
		else if (n < p.age)
			System.out.println("int가 Person의 나이보다 작습니다");
		else
			System.out.println("int와 Person의 나이가 같습니다");
	}
}
