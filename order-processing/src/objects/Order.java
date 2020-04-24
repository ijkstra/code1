package objects;

import enums.OrderState;

public class Order {
	
	private int id;
	private OrderState state = OrderState.NEW;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public OrderState getState() {
		return state;
	}
	public void setState(OrderState state) {
		this.state = state;
	}
	
	
	
	
}
