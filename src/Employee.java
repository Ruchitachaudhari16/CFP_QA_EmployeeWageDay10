public class Employee {
    /*UC9:-Ability to save the Total Wage for Each Company */
    public static  final int IS_PART_TIME=1;
    public static  final int IS_FULL_TIME=2;
    private final String company;
    private final int EMP_RATE_PER_HOUR;
    private final int MAX_HRS_IN_MONTH;
    private final int  NUM_OF_WORKING_DAYS;
    private  int totalempWage;

    public Employee(String company, int EMP_RATE_PER_HOUR, int MAX_HRS_IN_MONTH, int NUM_OF_WORKING_DAYS) {
        this.company = company;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
        this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
    }
    public void computeEmpWage()
    {
        int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;

        while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
        {
            totalWorkingDays++;
            int empCheck=(((int)Math.floor(Math.random()*10)% 3));
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
        int totalEmpWage=totalEmpHrs * EMP_RATE_PER_HOUR;
    }

@Override
public String toString()
{
    return  "Total Emp Wage for Company:"+company+ "is: "+totalempWage;
}

    public  static  void main(String[] args)
    {
        Employee dmart=new Employee("Dmart",20,2,10);
        Employee reliance=new Employee("Reliance",10,4,20);
      dmart.computeEmpWage();
      System.out.println(dmart);
       reliance.computeEmpWage();
       System.out.println(reliance);
    }
}
