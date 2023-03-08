package action;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.TreeSet;
import java.util.Vector;

//import jshell.spi.ExecutionControl.NotImplementedException;
import action.DiscreteAction;
import action.DiscreteActionInterface;
import action.DiscreteActionOnOffDependent;
import timer.OneShotTimer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiscreteActionOnOffDependentTest {

    private OneShotTimer ost;
    private OneShotTimer ost2;
    private DiscreteActionOnOffDependent daofdOneShot;
    private DiscreteActionOnOffDependent daofdOneShot2;
    private DiscreteActionOnOffDependent daofdOneShot3;
    private DiscreteActionOnOffDependent daofdOneShot4;
    private DiscreteActionInterface daOneShot;

    @BeforeEach
    void setUp() {
        ost = new OneShotTimer(10);
        ost2 = new OneShotTimer(15);
        daOneShot = new DiscreteAction(ost, "hasNext", ost2);
        daofdOneShot = new DiscreteActionOnOffDependent(ost, "hasNext", ost, "next", ost2);

        // Second Constructor : DatesOn < DateOff
        TreeSet<Integer> datesOn = new TreeSet<Integer>();
        datesOn.add(24);  
        TreeSet<Integer> datesOff = new TreeSet<Integer>();
        datesOff.add(42);
        daofdOneShot2 = new DiscreteActionOnOffDependent(ost, "hasNext", datesOn, "next", datesOff);

        // Third Constructor : DatesOn > DateOff
        datesOn = new TreeSet<Integer>();
        datesOn.add(42);
        datesOff = new TreeSet<Integer>();
        datesOff.add(24);
        daofdOneShot3 = new DiscreteActionOnOffDependent(ost, "hasNext", datesOn, "next", datesOff);

        // 4th Constructor : DatesOn = DateOff
        datesOn = new TreeSet<Integer>();
        datesOn.add(24);  
        datesOff = new TreeSet<Integer>();
        datesOff.add(24);
        daofdOneShot4 = new DiscreteActionOnOffDependent(ost, "hasNext", datesOn, "next", datesOff);
    }

    /*
        Entr�e : DiscreteActionOnOffDependent(Obj,on,timerOn,off,timerOff)
        Description : Test de d�claration de l�objet DiscreteActionOnOffDependent
        R�sultat Attendu :Objet cr�� avec un objet DiscreteAction(obj,on,timerOn) stock� dans la variable onAction, un second objet similaire DiscreteAction(obj,off,timerOff) stock� dans la variable offAction.
        L�instanciation de offAction est �galement stock� dans current action et le currentLapsTime est instanci� � 0.
    */
    @Test
    void DA00D1_firstConstructor(){
        // Aucune possibilit� de r�cup�rer daofdOneShot.onAction
        // Aucune possibilit� de r�cup�rer daofdOneShot.offAction
        // assertEquals(daofdOneShot.onAction.getObject(), ost);
        // assertEquals(daofdOneShot.offAction.getObject(), ost);
        assertEquals(daofdOneShot.getObject(), ost);
    }

    /*
        Entr�e : DiscreteActionOnOffDependent(obj, on, datesOn, off, datesOff)
        Description : Test du deuxi�me constructeur avec la premi�re date de datesOn ant�rieur � la premi�re date de datesOff
        R�sultat Attendu : Objet cr�� avec un objet DiscreteAction(obj,on, new DateTimer(datesOn)) stock� dans la variable onAction, un second objet similaire DiscreteAction(obj,on, new DateTimer(datesOn)) stock� dans la variable offAction
    */
    @Test
    void DA00D2_secondConstructorWithFirstDateOnInfFirstDateOff(){
        // Aucune possibilit� de r�cup�rer daofdOneShot.onAction
        // Aucune possibilit� de r�cup�rer daofdOneShot.offAction
        // assertEquals(daofdOneShot.onAction.getObject(), ost);
        // assertEquals(daofdOneShot.offAction.getObject(), ost);
        assertEquals(daofdOneShot2.getObject(), ost);
    }

    /*
        Entr�e : DiscreteActionOnOffDependent(obj, on, datesOn, off, datesOff)
        Description : Test du deuxi�me constructeur avec la premi�re date de datesOn post�rieur � la premi�re date de datesOff
        R�sultat Attendu : Objet cr�� avec un objet DiscreteAction(obj,on, new DateTimer(datesOn)) stock� dans la variable onAction, un second objet similaire DiscreteAction(obj,on, new DateTimer(datesOn)) stock� dans la variable offAction currentAction prend la valeur de offAction
    */

    @Test
    void DA00D3_secondConstructorWithFirstDateOnSupFirstDateOff(){
        // Aucune possibilit� de r�cup�rer daofdOneShot.onAction
        // Aucune possibilit� de r�cup�rer daofdOneShot.offAction
        // assertEquals(daofdOneShot.onAction.getObject(), ost);
        // assertEquals(daofdOneShot.offAction.getObject(), ost2);
        assertEquals(daofdOneShot3.getObject(), daofdOneShot.getObject());
    }

    /*
        Entr�e : DiscreteActionOnOffDependent(obj, on, datesOn, off, datesOff)
        Description : Test du deuxi�me constructeur avec la premi�re date de datesOn identique � la premi�re date de datesOff
        R�sultat Attendu : Objet cr�� avec un objet DiscreteAction(obj,on, new DateTimer(datesOn)) stock� dans la variable onAction, un second objet similaire DiscreteAction(obj,on, new DateTimer(datesOn)) stock� dans la variable offAction currentAction prend la valeur de onAction
    */
    @Test
    void DA00D4_secondConstructorWithFirstDateOnEqualsFirstDateOff(){
        // Aucune possibilit� de r�cup�rer daofdOneShot.onAction
        // Aucune possibilit� de r�cup�rer daofdOneShot.offAction
        // assertEquals(daofdOneShot.onAction.getObject(), ost);
        // assertEquals(daofdOneShot.offAction.getObject(), ost);
        assertEquals(daofdOneShot4.getObject(), daofdOneShot4.getObject());
    }

    /*
        Entr�e : nextAction()
        Description : Test de la m�thode avec un currentAction diff�rent de onAction
        R�sultat Attendu : Remplacement de la currentAction par l�action suivante de l�action on
    */
    @Test
    void DA00D5_nextActionWithCurrentActionDiffOnAction(){
        assertEquals(daofdOneShot.getCurrentLapsTime(),null);
        assertEquals(daofdOneShot.getObject(),ost);
        daofdOneShot.nextAction();
        daofdOneShot.nextAction();
        assertEquals(daofdOneShot.getCurrentLapsTime(),15);
        assertEquals(daofdOneShot.getObject(),ost);
    }

    /*
        Entr�e : nextAction()
        Description : Test de la m�thode avec un currentAction �gale � onAction
        R�sultat Attendu : Remplacement de la currentAction par l�action suivante de l�off Action, et on attribu lastOffDelay par le LapsTime de la nouvelle currentAction
    */
    @Test
    void DA00D6_nextActionWithCurrentActionEqualsOnAction(){
        assertEquals(daofdOneShot.getCurrentLapsTime(),null);
        assertEquals(daofdOneShot.getObject(),ost);
        daofdOneShot.nextAction();
        assertEquals(daofdOneShot.getCurrentLapsTime(),10);
        assertEquals(daofdOneShot.getObject(),ost);
        // Aucune possibilit� de r�cup�rer daofdOneShot.lastOffDelay
        // assertEquals(daofdOneShot2.getLastOffDelay(),24);
    }

    /*
        Entr�e :spendTime(4)
        Description : Test de la m�thode spendTime : l�action courante se voit tester sur l�action spendTime()
        R�sultat Attendu : Retourne void
    */
    

    /*
        Entr�e : getMethod()
        Description : Test du Getter pour la r�cup�ration de la m�thode de l�objet courant
        R�sultat Attendu : R�cup�ration de la m�thode de l�objet courant
    */
    @Test
    void DAO0D8_getMethod() throws NoSuchMethodException {
        assertEquals(daofdOneShot.getMethod(), ost.getClass().getDeclaredMethod("next", new Class<?>[0]));
    }

    /*
        Entr�e : getCurrentLapsTime()
        Description : Test du Getter pour la r�cup�ration du laps time de l�objet courant
        R�sultat Attendu : R�cup�ration du laps time de l�objet courant
    */
    @Test
    void DA00D9_getCurrentLapsTime(){
        assertEquals(daofdOneShot.getCurrentLapsTime(), null);
        daofdOneShot.nextAction();
        daofdOneShot.nextAction();
        assertEquals(daofdOneShot.getCurrentLapsTime(), 15);
    }

    /*
        Entr�e : getObject()
        Description : Test du Getter pour r�cup�rer l�objet depuis l�action courtante
        R�sultat Attendu : Retour l�objet de l�action courante
    */
    @Test
    void DA00D10_getObject(){
        assertEquals(daofdOneShot.getObject(), ost);
    }

    /*
        Entr�e : compareTo(c)
        Description : Test de compareTo
        R�sultat Attendu : Retourne la valeur du compareTo de currentAction avec c
    */
    @Test
    void DA00D11_compareTo(){
        daofdOneShot.nextAction();
        daofdOneShot.nextAction();
        assertEquals(daofdOneShot.compareTo(daOneShot),-1);
    }

    /*
        Entr�e : next()
        Description : Test de next lorsqu�il n�y a pas d�action future
        R�sultat Attendu : Retourne l'action courante
    */
    @Test
    void DA00D12_nextWithNoFuturAction(){
        daofdOneShot.next();
        daofdOneShot.next();
        assertEquals(daofdOneShot.next(),daofdOneShot);

    }

    /*
        Entr�e : next()
        Description : Test de next lorsqu�il y a une action future
        R�sultat Attendu : Retourne l'action courante
    */
    @Test
    void DA00D13_nextWithFuturAction(){
        assertEquals(daofdOneShot.next(),daofdOneShot);
    }

    /*
        Entr�e : hasNext()
        Description : Test de hasNext avec onAction et offAction ont une action suivante
        R�sultat Attendu : Retourne True
    */
    @Test
    void DA00D14_hasNextWithOnActionHaveNextAndOffActionHaveNext(){
        assertEquals(daofdOneShot.hasNext(),true);
    }

    /*
         Entr�e : hasNext()
         Description : Test de hasNext avec onAction n�a pas d�action suivante et offAction a une action suivante
         R�sultat Attendu :Retourne True
     */
    @Test
    void DA00D15_hasNextWithOnActionHaveNotNextAndOffActionHaveNext(){
        daofdOneShot2.nextAction();
        assertEquals(daofdOneShot2.hasNext(),true);
    }

    /*
         Entr�e : hasNext()
         Description : Test de hasNext avec onAction a une action suivante et offAction n�a pas d�action suivante
         R�sultat Attendu : Retourne True
     */
    @Test
    void DA00D16_hasNextWithOnActionHaveNextAndOffActionHaveNotNext(){
        daofdOneShot.nextAction();
        assertEquals(daofdOneShot.hasNext(),true);
    }

    /*
         Entr�e : hasNext()
         Description : Test de hasNext avec onAction et offAction n�ont pas d�action suivante
         R�sultat Attendu : Retourne False
     */
    @Test
    void DA00D17_hasNextWithOnActionHaveNotNextAndOffActionHaveNotNext(){
        daofdOneShot.nextAction();
        daofdOneShot.nextAction();
        assertEquals(daofdOneShot.hasNext(),false);
    }

    /*
         Entr�e : spendTime()
         Description : Test de spendTime avec t < lapstime
         R�sultat Attendu : Lapstime est diminu� de t
     */
    @Test
    void DAOOD18_spendTime() {
        daofdOneShot.nextAction();
        daofdOneShot.spendTime(5);
        assertEquals(daofdOneShot.getCurrentLapsTime(), 5);
    }


}