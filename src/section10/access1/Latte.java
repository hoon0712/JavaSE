package section10.access1;

public class Latte {
		/*
		 * 속성
		 * name
		 * isCold
		 * brand
		 * price
		 * 
		 */
		
		public String name;
		public boolean isCold;
		public String brand;
		public int price;
		
		public void getInfo() {
				System.out.println("name: " + name);
				System.out.println("Ice: " + isCold);
				System.out.println("Brand: " + brand);
				System.out.println("Price: " + price);
		}
		
}
