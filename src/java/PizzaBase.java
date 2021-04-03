package Decorator;

public class PizzaBase extends AbstractPizza{
	
	private String _baseType;
	private String _size;
	private double _price;
	
	@Override
	public double GetPrice() {		
		return _price;
	}
	
	@Override
	String Print() {
		return _baseType + " Base, (" + _size + " size)";
	}
	
	public PizzaBase(String Type, String Size, double Price) {
		_baseType = Type;
		_price = Price;
		_size = Size;
	}
}
