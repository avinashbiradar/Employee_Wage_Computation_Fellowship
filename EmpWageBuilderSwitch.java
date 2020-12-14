import jdk.internal.dynalink.beans.StaticClass;

class Employee {
    //constants
    static final int IS_PART_TIME=1;
    static final int IS_FULL_TIME = 2;
    static final int EMP_RATE_PER_HOUR=20;

    public static void main(String[] args) {

        //variables
        int empHrs = 0;
        int empWage = 0;
        //computation
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch ( empCheck) {
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            case IS_PART_TIME:
                empHrs = 4;
                break;
            default:
                empHrs = 0;

        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("empWage " + empWage);
    }
}