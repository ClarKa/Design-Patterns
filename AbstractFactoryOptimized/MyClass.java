public class MyClass {
	public static void main(String[] args) {
		/* ----------------------------- Conclusion ----------------------------
		This optimization simply combines simple factory pattern with abstract
		factory patten.

		Problem:
		1. When adding new DB, need to add a new case in all the switch
		statements in DAOFactory.
		--------------------------------------------------------------------- */
		System.out.println("\n------- Result for DAOFactory using switch ------\n");

		UserDAO userDAO1 = DAOFactory.createUserDAO();
		DepartmentDAO departmentDAO1 = DAOFactory.createDepartmentDAO();
		AttendanceDAO attendanceDAO1 = DAOFactory.createAttendanceDAO();

		userDAO1.createUser(1);
		userDAO1.deleteUser(1);

		departmentDAO1.createDepartment("IT");
		departmentDAO1.deleteDepartment("IT");

		attendanceDAO1.takeAttendance("2017-10-31");
		attendanceDAO1.updateAttendance("2017-10-30", "2017-10-11");


		/* ----------------------------- Conclusion ----------------------------
		DAOFactoryReflection optimized DAOFactory above by reflection.
		No need to add case in switch statements when adding support for a new
		DB.
		Still need to add a new method when adding a new table.
		--------------------------------------------------------------------- */

		System.out.println("\n----- Result for DAOFactory using reflection ----\n");

		UserDAO userDAO2 = DAOFactoryReflection.createUserDAO();
		DepartmentDAO departmentDAO2 = DAOFactoryReflection.createDepartmentDAO();
		AttendanceDAO attendanceDAO2 = DAOFactoryReflection.createAttendanceDAO();

		userDAO2.createUser(1);
		userDAO2.deleteUser(1);

		departmentDAO2.createDepartment("IT");
		departmentDAO2.deleteDepartment("IT");

		attendanceDAO2.takeAttendance("2017-10-31");
		attendanceDAO2.updateAttendance("2017-10-30", "2017-10-11");
	}
}