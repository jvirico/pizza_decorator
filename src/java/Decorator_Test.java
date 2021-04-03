package Decorator;

public class Decorator_Test {

	public static void main(String[] args) {		
		
		//Pizza 1
		ToppingDecorator PizzaDecorator1 = new ToppingDecorator("Tomato", 0.75,
				new ToppingDecorator("Olives",1.0,
						new PizzaBase("Naepolitan", "Small", 3.99)));
		
		//Pizza 2
		ToppingDecorator PizzaDecorator2 = new ToppingDecorator("Garlic", 0.25,
				new ToppingDecorator("Hot Paprica",1.0,
						new ToppingDecorator("Chicken",2.25,
								new ToppingDecorator("Mozzarella",1.0,
										new PizzaBase("Deep Dish", "Medium", 4.99)))));
		//Pizza 3
		ToppingDecorator PizzaDecorator3 = new ToppingDecorator("Basil", 0.50,
				new ToppingDecorator("Olives",1.0,
						new ToppingDecorator("Pepperoni",2.50,
								new ToppingDecorator("Mozzarella",1.0,
										new PizzaBase("New York", "Large", 5.99)))));
		
		System.out.println("Pizza: " + PizzaDecorator1.Print());
		System.out.println("Total Price: " + PizzaDecorator1.GetPrice() + "€");
		System.out.println("");
		System.out.println("Pizza: " + PizzaDecorator2.Print());
		System.out.println("Total Price: " + PizzaDecorator2.GetPrice() + "€");
		System.out.println("");
		System.out.println("Pizza: " + PizzaDecorator3.Print());
		System.out.println("Total Price: " + PizzaDecorator3.GetPrice() + "€");
	}

}
