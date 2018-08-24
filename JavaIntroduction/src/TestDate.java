
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date();
		Date date2 = new Date(18, 1, 1997);
		date1.Display();
		date2.Display();
		date1.setDate(15);
		date1.setMonth(2);
		date1.Display();
		date2.Display();

	}

}
