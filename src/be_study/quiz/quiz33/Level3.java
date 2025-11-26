package be_study.quiz.quiz33;

public class Level3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 21
		Person[] pArr21 = makePersonArr(4);
		for (Person p : pArr21) {
			System.out.println(p.name);
		}

		// 22
		Person[] pArr22 = makePersonArr(4);
		pArr22[0].age = (int)(Math.random()*40)+ 1;
		pArr22[1].age = (int)(Math.random()*40)+ 1;
		pArr22[2].age = (int)(Math.random()*40)+ 1;
		pArr22[3].age = (int)(Math.random()*40)+ 1;
		System.out.printf("1번나이: %d, 2번나이: %d, 3번나이: %d, 4번나이: %d\n",pArr22[0].age,pArr22[1].age,pArr22[2].age,pArr22[3].age);
		System.out.println(sumAge(pArr22));

		//23
		Person[] pArr23 = makePersonArr(4);
		pArr23[0].age = (int)(Math.random()*40)+ 1;
		pArr23[1].age = (int)(Math.random()*40)+ 1;
		pArr23[2].age = (int)(Math.random()*40)+ 1;
		pArr23[3].age = (int)(Math.random()*40)+ 1;
		System.out.printf("1번나이: %d, 2번나이: %d, 3번나이: %d, 4번나이: %d\n",pArr23[0].age,pArr23[1].age,pArr23[2].age,pArr23[3].age);
		ageTen(pArr23);
		System.out.printf("1번나이: %d, 2번나이: %d, 3번나이: %d, 4번나이: %d\n",pArr23[0].age,pArr23[1].age,pArr23[2].age,pArr23[3].age);
		
		//24
		Person[] pArr24 = makePersonArr(4);
		pArr24[0].name = "일번";
		pArr24[1].name = "이번";
		pArr24[2].name = "삼번";
		pArr24[3].name = "사번";
		String[] name24 = nameArray(pArr24);
		for(String s: name24) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//25
		Person[] pArr25 = new Person[4];
		Person p25 = new Person();
		pArr25[0] = p25;
		
		//26
		Person[] pArr26 = new Person[6];
		pArr26[2] = new Person();
		pArr26[4] = new Person();
		
		for(int i = 0; i < 6; i++) {
			if(pArr26[i] == null)
				System.out.println(i + "번은 null");
		}
		
		//27
		Person p27 = namePerson("김응석");
		System.out.println(p27.name);
		
		//28
		Person[] pArr28 = new Person[9];
		for(int i = 0; i < 9; i++) {
			if(i % 2 == 0)
				pArr28[i] = new Person();
		}
		for(int i = 0; i < 9; i++) {
			if(pArr28[i] == null)
				System.out.println(i + "번은 null");
		}
		
		//29
		Person p29 = new Person();
		p29.name = "김응석";
		p29.age = 27;
		Person new_p29 = duplicateNameOnly(p29);
		System.out.println(new_p29.age + " " + new_p29.name);
		
		//30
		Person[] pArr30 = makePersonArr(4);
		for(Person p: pArr30) {
			p.age = (int)(Math.random()*60)+ 1;
		}
		
		for(int i = 0; i < pArr30.length; i++) {
			System.out.printf("%d번나이: %d ",i+1, pArr30[i].age);
		}
		System.out.println();
		Person[] new_pArr30 = ageOverThirty(pArr30);
		for(int i = 0; i < new_pArr30.length; i++) {
			System.out.printf("%d번나이: %d ",i+1, new_pArr30[i].age);
		}
		System.out.println();
		
		
	}

	// 21
	public static Person[] makePersonArr(int n) {
		Person[] pArr = new Person[n];
		for (int i = 0; i < n; i++) {
			pArr[i] = new Person();
		}
		return pArr;
	}

	// 22
	public static int sumAge(Person[] pArr) {
		int sum = 0;
		for(Person p : pArr) {
			sum += p.age;
		}
		return sum;
	}

	
	// 23
	public static void ageTen(Person[] pArr) {
		for(int i = 0; i < pArr.length; i++) {
			pArr[i].age = 10;
		}
	}
	
	//24
	public static String[] nameArray(Person[] pArr) {
		String[] name = new String[pArr.length];
		for(int i = 0; i < pArr.length; i++) {
			name[i] = pArr[i].name;
		}
		return name;
	} 
	
	//27
	public static Person namePerson(String name) {
		Person p = new Person();
		p.name = name;
		return p;
	}
	
	//29
	public static Person duplicateNameOnly(Person p) {
		Person per = new Person();
		per.name = p.name;
		return per;
	}
	
	//30
	public static Person[] ageOverThirty(Person[] pArr) {
		int num = 0;
		int j = 0;
		for(Person p: pArr) {
			if(p.age >= 30)
				num++;
		}
		Person[] perArr = new Person[num];
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i].age >= 30) {
				perArr[j] = pArr[i];
				j++;
			}
		}
		return perArr;
	}
}