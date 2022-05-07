package Sorting;

import java.util.stream.Collectors;

public class JetStream {
  public static void main(String[] args) {
    new JetStream().run();
  }

  private void run() {
   String jets = Jet.getJets().stream()
     .map((jet) -> jet.toString())
     .sorted()
     .collect(Collectors.joining(", " ));
   
   System.out.println(jets);
  }
}
