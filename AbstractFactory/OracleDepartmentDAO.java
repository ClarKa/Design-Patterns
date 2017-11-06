public class OracleDepartmentDAO implements DepartmentDAO {
	@Override
	public void createDepartment(String name) {
		System.out.println("Department " + name + " created in Oracle.");
	}

	@Override
	public void deleteDepartment(String name) {
		System.out.println("Department " + name + " deleted from Oracle");
	}
}