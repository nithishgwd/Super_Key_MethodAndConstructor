package nithish_221047018;

class Race1{
	int car1;
	Race1(int car1){
		this.car1 = car1;
	}
    void car1(){
    	System.out.println("car1 method in parent, speed of car1 85kmph");
    	}  
}  
class Race2 extends Race1{
	int car2;
	Race2(int car1,int car2){
		//reusing parent constructor
		super(car1);
		this.car2 = car2;
		System.out.println("race2 constructor\n");
	}
	void car1(){
		System.out.println("car1 method in child, speed of car1 99kmph");
		}
	void car2(){
		System.out.println("speed of car2 105kmph");
		}
	
	// invoke parent class method
	void speed(){  
	super.car1();  
	car2();
	}
}
	
public class Super {

	public static void main(String[] args){
		Race2 obj = new Race2(85,99);
		System.out.println("resuing construtor using super keyword");
		System.out.println(obj.car1);
		System.out.println(obj.car2);
		System.out.println("\nbefore invoking method of parent class, car1 method in child class");
		obj.car1();
		obj.car2();
		
		System.out.println("\nafter invoking method of parent class, car1 method in child class");
		obj.speed();
	}

}
