package Decorator;

public class Decorator extends AbstractPizza{

	protected AbstractPizza _p;
	
	@Override
	public double GetPrice() {
		return _p.GetPrice();
	}

	@Override
	public String Print() {
		return _p.Print();
	}
}
