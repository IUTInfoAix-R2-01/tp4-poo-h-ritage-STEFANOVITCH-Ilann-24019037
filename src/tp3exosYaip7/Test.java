package tp3exosYaip7;

public class Test {

	public static void main(String[] args) {
		Customer c = new Customer("null");
		System.out.println(c.getName());
		c.setMember(true);
		c.setMemberType("TropBeau");
		System.out.println(c.toString());
	}

}
