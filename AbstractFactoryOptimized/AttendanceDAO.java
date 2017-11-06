public interface AttendanceDAO {
	public void takeAttendance(String date);
	public void updateAttendance(String oldDate, String newDate);
}