import java.util.ArrayList;
public class StepTracker
{
 private int minSteps;
 private int numRecordings;
 private int numActive;
 private int numSteps
 public StepTracker(int threshold)
  {
   minSteps = threshold;
   numSteps = 0;
   numRecordings = 0;
   numActive = 0;
  }
 public void addDailySteps(int x)
  {
   numSteps += x;
   numRecordings += 1;
   if(x>=threshold)
    numActive+=1;
  }
 public int activeDays()
  {
   return numActive;
  }
 public double averageSteps()
  {
   if(numRecordings == 0)
    return 0.0;
   return ((double)numSteps/numRecordings);
  }
}
         
