public class SqlServerAttendanceDAO implements AttendanceDAO {
	@Override
	public void takeAttendance(String date) {
		System.out.println("Attendance taken on " + date + " in Sql Server");
	}

	@Override
	public void updateAttendance(String oldDate, String newDate) {
		System.out.println("Attendance update from " + oldDate + " to " + newDate + " in Sql Server");
	}
}