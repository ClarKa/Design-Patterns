public class DAOFactory {
	public final static String db = "sqlserver";
	// public final static String db = "oracle";

	public static UserDAO createUserDAO() {
		switch (db) {
			case "sqlserver":
				return new SqlServerUserDAO();
			case "oracle":
				return new OracleUserDAO();
			default:
				return null;
		}
	}

	public static DepartmentDAO createDepartmentDAO() {
		switch (db) {
			case "sqlserver":
				return new SqlServerDepartmentDAO();
			case "oracle":
				return new OracleDepartmentDAO();
			default:
				return null;
		}
	}

	public static AttendanceDAO createAttendanceDAO() {
		switch (db) {
			case "sqlserver":
				return new SqlServerAttendanceDAO();
			case "oracle":
				return new OracleAttendanceDAO();
			default:
				return null;
		}
	}
}