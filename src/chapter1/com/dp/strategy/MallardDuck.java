package chapter1.com.dp.strategy;

import chapter1.com.dp.dobehavior.FlyWithWings;
import chapter1.com.dp.dobehavior.Quack;

public class MallardDuck extends Duck{

	public MallardDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}
