public class AcademicAdvisor {
    private String advisorId;
    private String name;
    private String department;
    private int assignedStudents;
    private boolean isActive;

    public AcademicAdvisor(String advisorId,String name, String department, int assignedStudents) {
        this.advisorId = advisorId;
        this.name = name;
        this.department = department;
        this.assignedStudents = assignedStudents;
        this.isActive = true;
    }

    public String getAdvisorId() {
        return advisorId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAssignedStudents() {
        return assignedStudents;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setAssignedStudents(int count) {
        if (count < 1 || count > 50){
            System.out.println("Attempting invalid student load assignment ("+ count +")...");
            System.out.println("Assigned students count (" + count + ") must be between 1 and 50.");
            System.out.println("Confirmed Active Load: " + getAssignedStudents() +" Students");
        }else {
            this.assignedStudents = count;
            System.out.println("Confirmed Active Load: " + getAssignedStudents() +" Students");
        }
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
