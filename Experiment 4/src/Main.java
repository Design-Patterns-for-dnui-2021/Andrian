
public class Main {

	public static void main(String[] args) {
		// level 1 = Admin
		// level 2 = staff
		
		User AdminUser = new User("Suman",210100,1);
		User StaffUser = new User("Russell",127321,2);
		
		Permission perm;
		PermissionFactory factory = new OAPermissionFactory();
		
		perm = AdminUser.login(factory);
		perm.operatePermission();
		perm.authority();
		
		System.out.println("----------------------------------------");
		
		perm = StaffUser.login(factory);
		perm.operatePermission();
		perm.authority();

	}

}
