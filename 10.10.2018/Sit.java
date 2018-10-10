package class_10_10;

public class Sit {
	private int price;
	private boolean open = true;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public Sit(int price, boolean open) {
		super();
		this.price = price;
		this.open = open;
	}

}
