public class User {
 
	private String name;
	 
	private int no_account;
	 
	private int level;
	 
	public User(String name, int no_account, int level) {
		this.name = name;
		this.no_account = no_account;
		this.level = level;		
	 
	}
	
	Permission login(PermissionFactory factory) {
		System.out.println("Logged in as: " + name);
		System.out.println("No Account: " + no_account);
		System.out.println("Permission Level: " + level);
		return factory.getPermission(level);
	}
	 
	int getLevel() {
		return this.level;
	}
	 
}
 
