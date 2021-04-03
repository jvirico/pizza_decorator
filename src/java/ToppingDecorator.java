package Decorator;

public class ToppingDecorator extends Decorator{

	private String _toppingName;
	private double _price;

	public ToppingDecorator(String Name, double Price, AbstractPizza p) {
		_toppingName = Name;
		_price = Price;
		super._p = p;
	}
	
	@Override
	public double GetPrice() {
		
		return super._p.GetPrice() + _price;
	}
	
	@Override
	public String Print() {

		return _toppingName + " + " + super._p.Print();
	}
	
}
