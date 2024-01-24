public interface IEmployeeComputation {
/* UC12:-Refactor to have list of multiple companies to manage Employee Wage.*/
        public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs);

        public void calculateTotalWage();
    }

