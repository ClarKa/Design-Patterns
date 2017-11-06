public class MyClass {
	public static void main(String[] args) {

		/* ----------------------------- Conclusion ----------------------------
		Can easily switch betweeen different db here.

		If need to support new db (ex. Informix).
		Only need to add:
			one concrete factory: InformixFactory which implements DAOFactory.
			two classes: InformixUserDAO and InformixDepartmentDAO.

		Problems:
		1. We need to create instance of concrete factory in every classes need
		DAOFactory. It would be very tedious and time-wasting to change the
		concrete factory if the number of such classes is big.
		2. If one new table is added to the database (ex. Attendance table)
			Add:
				one interface: AttendanceDAO
				two classes: SqlServerAttendanceDAO and OracleAttendanceDAO
			This is fine casue we just write new classes and do extension.

			Modifications:
				DAOFactory - add createAttendanceDAO();
				SqlServerFactory - add createAttendanceDAO();
				OracleFactory - add createAttendanceDAO();
			This is not good cause it does not obey the closed for modification
			principle.
			See AbstractFactoryOptimized for optimization.
		--------------------------------------------------------------------- */

		// DAOFactory factory = new SqlServerFactory();
		DAOFactory factory = new OracleFactory();


		UserDAO userDAO = factory.createUserDAO();
		DepartmentDAO departmentDAO = factory.createDepartmentDAO();

		userDAO.createUser(1);
		userDAO.deleteUser(1);

		departmentDAO.createDepartment("IT");
		departmentDAO.deleteDepartment("IT");
	}
}