public class EmpWageBuilderIf {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static void main(String[] args)
    {
            int empHrs = 0;
            int empWage = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            if (empCheck == IS_FULL_TIME)
            {
                empHrs = 8;
                empWage = empHrs * EMP_RATE_PER_HOUR;
                System.out.println("Full Time");
                System.out.println("empWage " + empWage);
            }
            else
            {
                empHrs=0;
                empWage= empHrs*EMP_RATE_PER_HOUR;
                System.out.println("absent");
                System.out.println("empWage "+empWage);
            }
    }
}