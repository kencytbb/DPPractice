package chapter1.com.dp.dobehavior;

import chapter1.com.dp.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	public void quack() {		
		System.out.println("<<Silence>>");
	}

}
