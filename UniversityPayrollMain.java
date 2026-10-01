public class UniversityPayrollMain {
    public static void main(String args[]){
        System.out.println("============================================================");
        System.out.println("           CAMPUS PERSONNEL & PAYROLL MANAGEMENT");
        System.out.println("============================================================\n");

        AcademicAdvisor advisor = new AcademicAdvisor("ADV-105", "Dr. Elena Rostova", "Computer Science", 35);
        System.out.println("Assigned Advisor: " + advisor.getName() + " [Department: "+ advisor.getDepartment() + "]");
        advisor.setAssignedStudents(75);
        System.out.println("\n------------------------------------------------------------");

        Professor prof1 = new Professor("PROF-101","Dr. Arthur Pendelton",3600,5);
        Professor prof2 = new Professor("PROF-102","Dr.  Sarah Jenkins",3600,8);
        Administrator adm1 = new Administrator("ADM-101","Ahmed Mohamed",2100,10);
        Administrator adm2 = new Administrator("ADM-102","Hassan Sayed",2100,15);

        UniversityEmployee[] employeesArray = {prof1, prof2, adm1, adm2};

        double totalPayroll = 0.0;
        for (UniversityEmployee employee : employeesArray){
            employee.displayProfile();
            System.out.println("Net Monthly Compensation: $" + employee.calculateMonthlySalary());
            totalPayroll += employee.calculateMonthlySalary();
            employee.conductDuties();

            if (employee instanceof Evaluatable) {
                Evaluatable evaluatable = (Evaluatable) employee;
                try {
                    evaluatable.evaluatePerformance(94.5);
                } catch (IllegalArgumentException e) {
                    System.out.println("Evaluation failed: " + e.getMessage());
                }
            }
            System.out.println("------------------------------------------------------------");
        }
        System.out.println("TOTAL MONTHLY INSTITUTIONAL DISBURSEMENT: $" + totalPayroll);
        System.out.println("============================================================");



    }
}
