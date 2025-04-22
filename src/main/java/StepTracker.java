import java.util.ArrayList;
public class StepTracker
{
 private int numSteps;
 private int numRecordings;
 private int numActive;
 public StepTracker(int steps)
  {
   numSteps = steps;
   numRecordings = 0;
   numActive = 0;
  }
 public void addDailySteps(int x)
  {
   numSteps += x;
   numRecordings += 1;
   if(x>=10000)
    numActive+=1;
  }
 public int activeDays()
  {
   return numActive;
  }
 public double averageSteps()
  {
   return ((double)numSteps/numRecordings);
  }
}
         
