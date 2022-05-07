package Sorting;

import java.util.NoSuchElementException;
import java.util.Optional;

public class JetOptional {
public static void main(String[] args) {
  new JetOptional().run();
  
}

private void run() {
  Jet jet = jetMethod(Optional.of(new Jet("Crashed")));
  System.out.println(jet);
  
  try {
  jetMethod(Optional.empty());
  }
  catch(NoSuchElementException e) {
    System.out.println(e.getMessage());
  }
}

  private Jet jetMethod(Optional<Jet> optionalJet) {
    return optionalJet.orElseThrow(() -> 
       new NoSuchElementException("No Jet!"));
  }
}
