package Sorting;

import java.util.List;

public class JetSorter {

  public static void main(String[] args) {
    new JetSorter().run();

  }

  private void run() {
    List<Jet> lambdaJets = sortByLambda();
  System.out.println(lambdaJets);
  
  List<Jet> methJets = sortByMeth();
  System.out.println(methJets);
    
  }

  private List<Jet> sortByMeth() {
    List<Jet> Jets = Jet.getJets();
    Jets.sort((j1, j2) -> Jet.compare(j1, j2));
    return Jets;
  }

  private List<Jet> sortByLambda() {
    List<Jet> Jets = Jet.getJets();
    Jets.sort((j1, j2) -> Jet.compare(j1, j2));
    return Jets;
  }

}
