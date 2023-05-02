
public class Test {

	public static void main(String[] args) {

		Patient p = new Patient();
		p.setId(1);
		p.setName("manju");
		p.setSsn("arm");

		System.out.println("Id :" + p.getId());
		System.out.println("Name : " + p.getName());
		System.out.println("Ssn : " + p.getSsn());
	}

}
