public class DAOFactoryReflection {
	// can further improved by putting the dbname into a xml/ini file.

	// public final static String db = "SqlServer";
	public final static String db = "Oracle";

	public static UserDAO createUserDAO() {
		UserDAO userDAO = null;
		try {
			userDAO = (UserDAO) Class.forName(db + "UserDAO").newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userDAO;
	}

	public static DepartmentDAO createDepartmentDAO() {
		DepartmentDAO dao = null;
		try {
			dao = (DepartmentDAO) Class.forName(db + "DepartmentDAO").newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dao;
	}

	public static AttendanceDAO createAttendanceDAO() {
		AttendanceDAO dao = null;
		try {
			dao = (AttendanceDAO) Class.forName(db + "AttendanceDAO").newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dao;
	}
}