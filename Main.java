public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Hazel", "Brgy. PBW Calaca Batangas PH", "BSIT", 2);
        System.out.println(student.toString());

        System.out.println("\n----------------------------------\n");

        // Create a Staff object
        Staff staff = new Staff("Elloi", " PBE Calaca Batangas", "IT");
        System.out.println(staff.toString());
    }
}
