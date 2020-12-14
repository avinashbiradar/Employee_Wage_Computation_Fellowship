public class EmpWageBuilderIf {
    public static final int IS_FULL_TIME = 1;
    public static void main(String[] args)
    {
        int empHrs = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
            System.out.println("Present");
        }
        else {
            empHrs=0;
            System.out.println("Absent");
        }
    }
}

