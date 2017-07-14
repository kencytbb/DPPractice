package chapter1.com.dp.dobehavior;

import chapter1.com.dp.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	public void fly() {
		System.out.println("I can't fly");
	}

}
