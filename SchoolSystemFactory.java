public class SchoolSystemFactory {
    public static void main(String [] args) {
        //Adaptees
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        //Adapters
        SchoolManagementApp attendancesystemadapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradingsystemadapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp librarysystemadapter = new LibrarySystemAdapter(librarySystem);

        attendancesystemadapter.integrateSystem();
        gradingsystemadapter.integrateSystem();
        librarysystemadapter.integrateSystem();

    }
}
