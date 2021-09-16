public class Person extends Subject implements Observer, Member {
 
	private String name;
	 
	public Person(String name) {
		this.name = name;
	 
	}
	 
	public void action() {
		System.out.println(this.name + " take action because other member got attacked!");
	 
	}
	 
	public void update() {
	 
	}
	 
	public void beat() {
		System.out.println(this.name + " got attacked");
		this.notifyObserver();
		System.out.println("");
	 
	}
	 
}
 
