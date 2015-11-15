// containersindepth/Prediction.java
// �2016 MindView LLC: see Copyright.txt
// Predicting the weather with groundhogs.
import java.util.*;

public class Prediction {
  private static Random rand = new Random(47);
  private boolean shadow = rand.nextDouble() > 0.5;
  @Override
  public String toString() {
    if(shadow)
      return "Six more weeks of Winter!";
    else
      return "Early Spring!";
  }
}