public class Runner {
    public static void main(String[] args)
    {
        StepTracker s = new StepTracker(10000);
        System.out.println(s.activeDays());
        System.out.println(s.averageSteps());
        s.addDailySteps(9000);
        s.addDailySteps(5000);
        System.out.println(s.activeDays());
        System.out.println(s.averageSteps());
        s.addDailySteps(13000);
        System.out.println(s.activeDays());
        System.out.println(s.averageSteps());
        s.addDailySteps(23000);
        s.addDailySteps(1111);
        System.out.println(s.activeDays());
        System.out.println(s.averageSteps());
    }

}
