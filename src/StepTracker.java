public class StepTracker {
    private int aD=0;
    private int totalSteps=0;
    private int totalDays = 0;
    private int min;

    public StepTracker(int m)
    {
        min = m;
    }
    public void addDailySteps(int steps)
    {
        if(steps>min)
        {
            aD++;
        }
        totalDays++;
        totalSteps+=steps;
    }
    public int activeDays()
    {
        return aD;
    }

    public double averageSteps()
    {
        if(totalDays==0)
        {
            return 0.0;
        }
        return (double)(totalSteps/totalDays);
    }

}
