public class CompanyEmpWage {
    /*UC 10:-Ability to manage Employee Wage of multiple companies */
    public final String company;
    public final int EMP_RATE_PER_HOUR;
    public final int MAX_HRS_IN_MONTH;
    public final int  NUM_OF_WORKING_DAYS;
    public   int totalempWage;
    public int maxHoursPerMonth;

    public CompanyEmpWage(String company, int EMP_RATE_PER_HOUR, int MAX_HRS_IN_MONTH, int NUM_OF_WORKING_DAYS) {
        this.company = company;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
        this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
    }
    public void setTotalempWage(int totalempWage)
    {
        this.totalempWage=totalempWage;
    }
public String toString()
{
    return "Total emp wage for Company:" +company+ " is:"+totalempWage;
}
}
