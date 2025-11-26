package be_study.quiz.quiz24;

public class People {
	
	//객체
	String name;
	String sex;
	int age;
	int height;
	int weight;
	String job;
	String blood;
	String health;
	boolean isSleep;
	
	//기본생성자
	
	People() {}
	People(String name, String sex, int age, int height, int weight, String job, String blood, String health, boolean isSleep ) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job = job;
		this.blood = blood;
		this.health = health;
		this.isSleep = isSleep;
		
		System.out.println(this.name);
		System.out.println(this.sex);
		System.out.println(this.age);
		System.out.println(this.height);
		System.out.println(this.weight);
		System.out.println(this.job);
		System.out.println(this.blood);
		System.out.println(this.health);
		System.out.println(this.isSleep);
	}
}
