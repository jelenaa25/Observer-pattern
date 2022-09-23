/* Kontroler.java
 * @autor  prof. dr Sinisa Vlajic,
 * Univerzitet u Beogradu
 * Fakultet organizacionih nauka 
 * Katedra za softversko inzenjerstvo
 * Laboratorija za softversko inzenjerstvo
 * 06.11.2017
 */

package AbstractProductC;

import AbstractProductA.EkranskaForma;
import ConcreteSubject.BrokerBazePodataka;
import DomainClasses.DKPorudzbina;
import DomainClasses.GeneralDObject;

public abstract class Kontroler {
    EkranskaForma ef;
    BrokerBazePodataka bbp;
    DKPorudzbina ip;   // Promenljivo!!!
    String poruka;
    public GeneralDObject getDKObject(){return ip;}
    public abstract void napuniDomenskiObjekatIzGrafickogObjekta(); 
    public abstract boolean nadjiDomenskiObjekat();
}
