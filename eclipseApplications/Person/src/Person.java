import java.util.Scanner;
import java.util.*;
//Hackerrank Class Vs Instance Day 4
//constraints - 1 =< T <= 4
//constraints - 5 =< age <= 30
public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		this.age = initialAge;
        if(this.age <= 0 ){
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
	}

	public void amIOld() {
  		
        
        if(this.age < 13){
            System.out.println("You are young.");
	    }
        else if(this.age >= 13 && this.age< 18){
            System.out.println("You are a teenager.");
        }
        else if(this.age >= 18 ){
            System.out.println("You are old.");
        }
    }
	public void yearPasses() {
  		this.age = this.age + 1; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}