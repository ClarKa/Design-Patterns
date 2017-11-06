public class SqlServerUserDAO implements UserDAO {
	@Override
	public void createUser(int id) {
		System.out.println("User of id: " + id + " created from SQL server.");
	}

	@Override
	public void deleteUser(int id) {
		System.out.println("User of id: " + id + " deleted from SQL server.");
	}
}