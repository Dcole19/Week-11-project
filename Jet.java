package Sorting;

import java.util.ArrayList;
import java.util.List;

public class Jet {
  private String name;

  private static List<Jet> jets = List.of(
      new Jet("F-15"),
      new Jet("F-22"),
      new Jet("F-16"),
      new Jet("A-10"),
      new Jet("F-14"));
  
  public Jet(String name) {
        this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name + " Jet";
  }
  
  public static int compare(Jet j1, Jet j2) {
    return j1.name.compareTo(j2.name);
  }

    /*This returns a list that is modifiable.  
     * List.of returns an unmodifiable list.
     */
  
  public static List<Jet> getJets() {
    return new ArrayList<>(jets);
  }
  
}
