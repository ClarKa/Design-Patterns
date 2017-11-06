public class SqlServerFactory extends DAOFactory {
	@Override
	public UserDAO createUserDAO() {
		return new SqlServerUserDAO();
	}

	@Override
	public DepartmentDAO createDepartmentDAO() {
		return new SqlServerDepartmentDAO();
	}

	// @Override
	// public DAO createAttendanceDAO() {
	// 	return new SqlServerAttendaceDAO;
	// }
}