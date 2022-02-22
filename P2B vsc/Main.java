
public class Main {
    public static void main(String[] args) {
      Voetbalclub ajx = new Voetbalclub("Ajax");
      Voetbalclub feij = new Voetbalclub("Feijenoord");
  
      feij.verwerkResultaat('w');
      feij.verwerkResultaat('w');
      feij.verwerkResultaat('w');
      feij.verwerkResultaat('g');
  
      System.out.println("Feijenoord punten: " + feij.aantalPunten());
      System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
      System.out.println();
  
      /*
      system.out.println(ajx) geeft -> Voetbalclub@36baf30c
      system.out.println(feij) geeft -> Voetbalclub@7a81197d
      */

      System.out.println(ajx);
      System.out.println(feij);
    }
  }