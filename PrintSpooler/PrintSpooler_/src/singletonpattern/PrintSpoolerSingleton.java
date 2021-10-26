package sdp.sy_4.singletonpattern;

public class PrintSpoolerSingleton {
	private static PrintSpoolerSingleton instance;
	private String name;
	private PrintSpoolerSingleton(String name) {
		this.name = name;
	}
	
	public static PrintSpoolerSingleton getInstance(String name) {
		if( instance == null && !name.equals(null) ) {
			instance = new PrintSpoolerSingleton(name);
		}
		return instance;
	}
	
	public void manageJobs() {
		System.out.println(name+"...");
	}
}