package Items;

public class Items {
	public int Itemid;
	public String Name;
	public double Price;
	
	
	public Items(int itemid, String name, double price) {
		super();
		Itemid = itemid;
		Name = name;
		Price = price;
	}


	@Override
	public String toString() {
		return "Item [Itemid=" + Itemid + ", Name=" + Name + ", Price=" + Price + "]";
	}
	
	
}