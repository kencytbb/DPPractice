package chapter1.com.dp.instance;

import chapter1.com.dp.dobehavior.FlyRocketPowered;
import chapter1.com.dp.strategy.Duck;
import chapter1.com.dp.strategy.MallardDuck;
import chapter1.com.dp.strategy.ModelDuck;

public class MiniDuckSimulator {
	
	public static void main(String[] args)  {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();		
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
} 
