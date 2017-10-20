package Order;

public class OrderVO {

	private String id;
	private String name;
	private String item;
	private int ea;
	private int price;
	private String time;
	
	public OrderVO(String id, String name, String item, int ea, int price, String time) {
		this.id = id;
		this.name = name;
		this.item = item;
		this.ea = ea;
		this.price = price;
		this.time = time;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getItem() {
		return item;
	}
	public int getEa() {
		return ea;
	}
	public int getPrice() {
		return price;
	}
	public String getTime() {
		return time;
	}
	
	
	
}
