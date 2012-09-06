


public class HelloWorld {

	public static void main(String[] args)  {
		
		int a,b;
		Pointless p = new Pointless();

		System.out.println("Hello World!");
		System.out.println("This is a silly test for git");
		System.out.println("This is the Master");
		System.out.println("This is a new branch");
		System.out.println("This is a branch of branch1");
		System.out.println("This is getting silly");

		for (a=0;a<10;a++) {
			b=p.getz();
			System.out.println("Crazy man " + a + " " + b);
			p.setz(10-a);
		}
	}
}
