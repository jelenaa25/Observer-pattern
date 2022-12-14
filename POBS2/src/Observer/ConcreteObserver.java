/* ConcreteObserver.java
 * @autor  prof. dr Sinisa Vlajic,
 * Univerzitet u Beogradu
 * Fakultet organizacionih nauka 
 * Katedra za softversko inzenjerstvo
 * Laboratorija za softversko inzenjerstvo
 * 02.12.2017
 */
package Observer;

import DomainClasses.DKPorudzbina;
import AbstractProductC.Kontroler;

public class ConcreteObserver implements Observer
{ Kontroler kon;
   
  public ConcreteObserver(Kontroler kon1) {kon=kon1;}  
  
   @Override
   public void Update(int brojPrijave)
    { DKPorudzbina tekucaip = (DKPorudzbina) kon.getDKObject();
      if (tekucaip!=null)
              {
                 if (brojPrijave == tekucaip.getSifraPorudzbine())
                   { kon.nadjiDomenskiObjekat();
                   }     
              }  
    }
   
   
   
}

