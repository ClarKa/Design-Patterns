public class SqlServerDepartmentDAO implements DepartmentDAO {
	@Override
	public void createDepartment(String name) {
		System.out.println("Department " + name + " created in Sql Server");
	}

	@Override
	public void deleteDepartment(String name) {
		System.out.println("Department " + name + " deleted from Sql Server");
	}
}