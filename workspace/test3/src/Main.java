import java.lang.invoke.SwitchPoint;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		int x = 2;
//		int y = 45;
//		int z = 55;
//		
//
//		if (x % 2 == 0) {
//			System.out.println("true");
//		} 
//		Product p1 = new Product();
		p1.setName("Oil");
		p1.setPrice(20);

//		int Day = 4;
//		Scanner cs = new Scanner(System.in);
//		System.out.println("Enter the day of weak : ");
//		int input = cs.nextInt();
//		switch (input) {
//		case 3: {
//			System.out.println("thuersday ");
//			break;
//		}
//		case 4: {
//			System.out.println("thuersday ");
//			break;
//		}
//		case 5:{
//			System.out.println("Friday ");
//			break;
//		}
//		}
		
		Product p1 = new Product();
		p1.setName("Oil1");
		p1.setPrice(20);
		Product p2 = new Product();
		p2.setName("Oil2");
		p2.setPrice(120);
		
		if (p1.getPrice() > p2.getPrice()){
			System.out.println(p1.getName());
		}

	}
   
}

class Product{	
	public String Name ; 
	public int price ; 
	public int quantity;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + price;
		result = prime * result + quantity;
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (price != other.price)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	
}



