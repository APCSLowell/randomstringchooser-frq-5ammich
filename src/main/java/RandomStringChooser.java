import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  private ArrayList<String> holder = new ArrayList<String>();
  public RandomStringChooser(String [] array1){
      for (int i = 0; i < array1.length; i++){
          holder.add(array1[i]);
      }

  }
  public String getNext(){
    if (holder.size() == 0){
        return "NONE";
    }
    else{
      int picker = (int)(Math.random()*holder.size());
      String tempHolder = holder.get(picker);
      holder.remove(picker);
      return tempHolder;
    }
  }
}
