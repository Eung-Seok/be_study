package be_study.quiz.quiz33;

public class Level2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//11
		Person p11 = new Person();
		p11.age = 27;
		p11.name = "김응석";
		System.out.println(p11.age + " " + p11.name);
		
		//12
		Person p12 = new Person();
		p12.hello();
		
		//13
		Person p13 = new Person();
		p13.name = "김응석";
		printName(p13);
		
		//14
		Person p14 = makePerson();
		System.out.println(p14.age + " " + p14.name);
		
		//15
		Person p15_1 = makePerson();
		Person p15_2 = makePerson();
		p15_1.age = (int)(Math.random()*40)+ 1;
		p15_2.age = (int)(Math.random()*40)+ 1;
		System.out.printf("1번나이: %d, 2번나이: %d\n",p15_1.age, p15_2.age);
		if(p15_1.age > p15_2.age)
			System.out.println(p15_1.age);
		else
			System.out.println(p15_2.age);
		
		//16
		Person p16 = makePerson();
		System.out.println(p16.age);
		upAge(p16);
		System.out.println(p16.age);
		
		//17
		Person p17 = makePerson();
		String name17 = p17.name;
		int age17 = p17.age;
		System.out.println(p17.age + " " + p17.name);
		name17 = "김응주";
		age17 = 34;
		System.out.println(p17.age + " " + p17.name);
		System.out.println("나눠 담은 후 변경해도 원본에는 변함이 없음");
		
		//18
		Person[] pArr18 = {new Person(),new Person(),new Person()};
		pArr18[0].name = "일번";
		pArr18[1].name = "이번";
		pArr18[2].name = "삼번";
		for(Person p: pArr18) {
			System.out.printf(p.name + " ");
		}
		System.out.println();
		
		//19
		Person[] pArr19 = {new Person(),new Person(),new Person()};
		pArr19[0].name = "일번";
		pArr19[1].name = "이번";
		pArr19[2].name = "삼번";
		sayHello(pArr19);
		
		//20
		Person[] pArr20 = {new Person(),new Person(),new Person(),new Person()};
		pArr20[0].name = "일번";
		pArr20[1].name = "이번";
		pArr20[2].name = "삼번";
		pArr20[3].name = "사번";
		pArr20[0].age = (int)(Math.random()*40)+ 1;
		pArr20[1].age = (int)(Math.random()*40)+ 1;
		pArr20[2].age = (int)(Math.random()*40)+ 1;
		pArr20[3].age = (int)(Math.random()*40)+ 1;
		System.out.printf("1번나이: %d, 2번나이: %d, 3번나이: %d, 4번나이: %d\n",pArr20[0].age,pArr20[1].age,pArr20[2].age,pArr20[3].age);
		System.out.println(maxAge(pArr20).name);
		
	}

	//13
	public static void printName(Person p1) {
		System.out.println(p1.name);
	}
	
	//14
	public static Person makePerson() {
		Person p = new Person();
		p.name = "김응석";
		p.age = 27;
		
		return p;
	}

	//16
	public static void upAge(Person p) {
		p.age += 1;
	}
	
	//19
	public static void sayHello(Person[] pArr) {
		for(Person p:pArr) {
			p.hello();
		}
	}
	
	//20
	public static Person maxAge(Person[] pArr) {
		int index = 0;
		int maxAge = 0;
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i].age > maxAge) {
				index = i;
				maxAge = pArr[i].age;
			}
		}
		return pArr[index];
	}
}
