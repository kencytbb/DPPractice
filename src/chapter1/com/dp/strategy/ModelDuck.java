package chapter1.com.dp.strategy;

import chapter1.com.dp.dobehavior.FlyNoWay;
import chapter1.com.dp.dobehavior.Quack;

public class ModelDuck extends Duck{

	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a real Model duck");
	}

}
