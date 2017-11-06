public class OracleUserDAO implements UserDAO {
	@Override
	public void createUser(int userid) {
		System.out.println("User of id: " + userid + " created from Oracle.");
	}

	@Override
	public void deleteUser(int id) {
		System.out.println("User of id: " + id + " deleted from Oracle.");
	}
}