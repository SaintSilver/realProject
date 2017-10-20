package Main;

public class PickNameVO {

	String name;
	String time;
	int price;
	
	public String getName() {
		return name;
	}

	public String getTime() {
		return time;
	}

	public int getPrice() {
		return price;
	}

	public PickNameVO(String name, String time, int price) {
		this.name = name;
		this.time = time;
		this.price = price;
	}
	
}
