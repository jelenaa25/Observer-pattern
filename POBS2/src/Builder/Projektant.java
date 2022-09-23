/* Projektant.java
 * @autor  prof. dr Sinisa Vlajic,
 * Univerzitet u Beogradu
 * Fakultet organizacionih nauka 
 * Katedra za softversko inzenjerstvo
 * Laboratorija za softversko inzenjerstvo
 * 06.11.2017
 */

package Builder;

import AbstractProductA.EkranskaForma;
import AbstractProductC.Kontroler;
import ConcreteSubject.BrokerBazePodataka;
import Subject.Subject;


public abstract class Projektant {
      class SoftverskiSistem // Complex Product
           {  EkranskaForma ef; // AbstractProductA 
              BrokerBazePodataka bbp; // AbstractProductB 
              Kontroler kon; // AbstractProductC 
           }
      
       SoftverskiSistem ss;
               
       abstract public void kreirajEkranskuFormu();   
       abstract public void kreirajBrokerBazePodataka (Subject sub);
       abstract public void kreirajKontroler ();
       abstract public void kreirajSoftverskiSistem();
       abstract public void prikaziEkranskuFormu();
       public Kontroler vratiKontroler() {return ss.kon;} 
}
