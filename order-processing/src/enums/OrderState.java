package enums;

public enum OrderState {
	NEW(0, "new order"),
	FULFILLED(1, "the order is fulfilled"),
	;
	
	private int code;
	private String message;
	private OrderState(int code, String message) {
		this.code = code;
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
