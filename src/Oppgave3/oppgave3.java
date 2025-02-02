package Oppgave3;

public class oppgave3 {

	public static void main(String[] args) {
		System.out.println("Test av opperasjons tid:");
		// for å få koden i gang for å ungå oppstartstiden av koden under
		long n = 10_000_000_000L;
		
		System.out.println("n= "+n);
		for (int i = 0;i<10; i++) {
			tid(n);
		}
		
		
		n = 10_000_000L;
		
		System.out.println("\n n= "+n);
		for (int i = 0;i<10; i++) {
			tid(n);
		}
		
		n = 100_000_000L;
		System.out.println("\n n= "+n);
		for (int i = 0;i<10; i++) {
			tid(n);
		}
		
		n = 1_000_000_000L;
		System.out.println("\n n= "+n);
		for (int i = 0;i<10; i++) {
			tid(n);
		}
	}

	public static void tid(long n) {
		// før
		long before = System.currentTimeMillis();
		long k = 0;
		for (long i = 1; i <= n; i++) {
			k = k + 5;
		}
		// etter
	long etter = System.currentTimeMillis();
	
	System.out.print(etter-before+"ms, ");
	}
	
}
