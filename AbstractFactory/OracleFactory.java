public class OracleFactory extends DAOFactory {
	@Override
	public UserDAO createUserDAO() {
		return new OracleUserDAO();
	}

	@Override
	public DepartmentDAO createDepartmentDAO() {
		return new OracleDepartmentDAO();
	}
}