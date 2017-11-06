public class OracleAttendanceDAO implements AttendanceDAO {
	@Override
	public void takeAttendance(String date) {
		System.out.println("Attendance taken on " + date + " in Orcle");
	}

	@Override
	public void updateAttendance(String oldDate, String newDate) {
		System.out.println("Attendance update from " + oldDate + " to " + newDate + " in Orcle");
	}
}