
public class TestPerson {

	public static void main(String[] args) {
		Person p;
		p = new Person();
		p.display();
		
		p = new Person(21, "Prateek");
		p.display();
		
		p.setAge(11);
		p.display();
	}

}