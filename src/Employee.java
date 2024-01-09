public class Employee {
    /*UC 10:-Ability to manage Employee Wage of multiple companies */
    public static  final int IS_PART_TIME=1;
    public static  final int IS_FULL_TIME=2;
    int maxHoursPerMonth;
    private int numOfCompany=0;
    private CompanyEmpWage[] companyEmpWageArray;
    Employee()
    {
        companyEmpWageArray=new CompanyEmpWage[5];
    }
    private void addCompanyEmpWage(String company,int empRatePerHour,int NUM_OF_WORKING_DAYS,int maxHoursPermonth)
    {
     companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,NUM_OF_WORKING_DAYS,maxHoursPermonth);
    numOfCompany++;
    }

    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalempWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }
    private int computeEmpWage(CompanyEmpWage companyEmpWage)
    {
        int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;

        while(totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.NUM_OF_WORKING_DAYS)
        {
            totalWorkingDays++;
            int empCheck=(((int) Math.floor(Math.random()*10)% 3));
switch (empCheck)
{
    case IS_PART_TIME:
         empHrs=4;
         break;
    case IS_FULL_TIME:
        empHrs=8;
        break;
    default:
        empHrs=0;
}
totalEmpHrs+=empHrs;
System.out.println("Day#: " +totalWorkingDays + "Emp hr :" +empHrs);
        }
        return  totalEmpHrs * companyEmpWage.EMP_RATE_PER_HOUR;
    }


    public  static  void main(String[] args)
    {
        Employee emp=new Employee();
        emp.addCompanyEmpWage("DMart",20,2,10);
        emp.addCompanyEmpWage("Reliaance",10,4,20);
      emp.computeEmpWage();
    }
}
