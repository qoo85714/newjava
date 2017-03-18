package tw.org.iii;

public class Bike {
	double speed; 
	int a ; // a=0
	static int counter; //b=0
	Bike(){
		this(0);
	}
	Bike(int s){
		this(s*1f);
	}
	Bike(float s){
		this(s*1.0);
	}
	Bike(double s){
		speed = s;
		a++;counter++;
		System.out.println("Bike:Bike()");
	}
	void upSpeed(){    //void 不傳回值
		//speed*=1.2;
		  speed = (speed<1)?1:(speed*1.2);
	}
	void upSpeed(int gear){    
		
		  speed = (speed<1)?1:(speed*(1.2+gear));
	}
	void downSpeed(){
		speed*=0.7;
	}
	double getSpeed(){
	return speed;
	}
	}

