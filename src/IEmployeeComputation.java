public interface IEmployeeComputation {
    /* UC14:- Ability to get the Total Wage when queried by Company...*/
    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs);

    public void calculateTotalWage();

    public int getTotalEmpWage(String companyName);
}


