package action;

import action.DiscreteActionDependent;
import action.DiscreteActionInterface;
import timer.OneShotTimer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscreteActionDependentTest {
    private OneShotTimer ost;
    private OneShotTimer ost2;
    private DiscreteActionDependent dadOneShot;
    private DiscreteActionInterface dadOneShot2;
    private DiscreteActionInterface dadOneShot3;

    @BeforeEach
    void setUp() {
        ost = new OneShotTimer(10);
        ost2 = new OneShotTimer(15);
        dadOneShot = new DiscreteActionDependent(ost, "hasNext", ost);
        dadOneShot2 = new DiscreteActionDependent(ost, "hasNext", ost2);
        dadOneShot3 = new DiscreteActionDependent(ost, "hasNext", null);
    }

    /*
        Entree : DiscreteActionDependent(obj, mtd, timer)
        Description : Test de la creation de l'objet DiscreteActionDependent
        Resultat Attendu : Objet creer avec l'objet DiscreteAction(obj, mtd, timer) stock dans la variable baseAction,, un TreeSet de DiscreteAction cree dans dependentActions, l�it�rateur du TreeSet dans it et l�action courante (baseAction) dans currentAction
     */
    @Test
    void DAD1_constructorMethod(){
        assertEquals(dadOneShot.getObject(), ost);
        assertEquals(dadOneShot.getMethod().getName(), "hasNext");
        //Aucune possibilite de recuperer daOneShot.timmer
        //Aucune possibilite de recuperer daOneShot.dependentAction
        //Aucune possibilite de recuperer daOneShot.it
        //Aucune possibilite de recuperer daOneShot.currentAction
    }

    /*
        Entr�e : addDependence(obj, mtd, timer)
        Description : Test ajout d�une action
        R�sultat Attendu : ajout de la discreteAction( obj, mtd, timer) dans le TreeSet
     */
    @Test
    void DAD2_dependence(){
        dadOneShot.addDependence(ost2, "hasNext", ost2);
        // Aucun moyen d'avoir la liste de d�pendence pour tester l'ajout
    }

    /*
        Entr�e : nextMethod()
        Description : Test de la m�thode nextMethod avec currentAction = baseAction
        R�sultat Attendu : La variable it prend la valeur de l�it�rateur du TreeSet et la currentAction prend la valeur de la prochaine iteration
     */
    @Test
    void DAD3_nextMethodWithCurrentEqualsBase(){
        dadOneShot.addDependence(ost2, "hasNext", ost2);
        dadOneShot.nextMethod();
        //Aucun moyen de tester le bon fonctionnement
        // it et currentAction impossible � atteindre
    }

    /*
        Entr�e : nextMethod()
        Description : Test de la m�thode nextMethod avec currentAction derni�re action de la liste
        R�sultat Attendu : La variable la currentAction prend la valeur de baseAction
     */
    @Test
    void DAD4_nextMethodWithCurrentIsLastAction(){
        dadOneShot.addDependence(ost2, "hasNext", ost2);
        dadOneShot.nextMethod();
        dadOneShot.nextMethod();
        //Aucun moyen de tester le bon fonctionnement
        // it et currentAction impossible � atteindre
    }

    /*
            Entr�e : nextMethod()
            Description : Test de la m�thode nextMethod avec currentAction derni�re action de la list
            R�sultat Attendu : La variable la currentAction prend la valeur de baseAction
         */
    @Test
    void DAD6_spendTimeWithSeveralAction(){
        dadOneShot.addDependence(ost2, "hasNext", ost2);
        dadOneShot.addDependence(ost2, "hasNext", ost2);
        dadOneShot.spendTime(4);
        //Aucun moyen de tester le bon fonctionnement
        //Aucun acces aux actions
    }

    /*
        Entr�e : DiscreteAction(o, m, timer) getMethod()
        Description : Test du getter de method d�un objet initialis�
        R�sultat Attendu : Retourne la m�thode m
     */
    @Test
    void DAD7_getMethod() {
        assertEquals(dadOneShot.getMethod().getName(),"hasNext");
    }

    /*
        Entr�e :DiscreteAction(o, m, timer) getCurrentLapsTime()
        Description : Test du getter de lapsTime d�un objet initialis�
        R�sultat Attendu : Retourne null
     */
    @Test
    void DAD8_getCurrentLapsTime() {
        assertEquals(dadOneShot.getCurrentLapsTime(),null);
        dadOneShot.next();
        assertEquals(dadOneShot.getCurrentLapsTime(),null);
    }

    /*
        Entr�e : DiscreteAction(o, m, timer) getObject()
        Description : Test du getter de objet
        R�sultat Attendu : Retourne l�objet o
     */
    @Test
    void DAD9_getObject() {
        assertEquals(dadOneShot.getObject(),ost);
    }

    /*
        Entr�e : compareTo(c)
        Description : Test de comparaison de currentAction avec l'objet pass� en param�tre
        R�sultat Attendu : Retourne le resultat de la comparaison entre les 2 objets
     */
    @Test
    void DAD10_compareTo() {
        dadOneShot2.next();
        assertEquals(dadOneShot.compareTo(dadOneShot2),1);
    }

    /*
        Entr�e : isEmpty()
        Description : Test isEmpty avec le TreeSet est vide
        R�sultat Attendu : Retourne True
     */
    @Test
    void DAD11_isEmpty() {
        assertFalse(dadOneShot.isEmpty());

    }

    /*
        Entr�e : hasNext()
        Description : Test de hasNext avec baseAction a une action suivante et depedentsActions non vide
        R�sultat Attendu : Retourne True
     */
    @Test
    void DAD12_hasNextWithBaseActionHasNextAndDependentActionsNotEmpty() {
        dadOneShot.addDependence(ost2, "hasNext", ost2);
        assertTrue(dadOneShot.hasNext());
    }

    /*
        Entr�e : hasNext()
        Description : Test de hasNext avec baseAction a une action suivante et depedentsActions vide
        R�sultat Attendu : Retourne True
     */
    @Test
    void DAD13_hasNextWithBaseActionHasNextAndDependentActionsEmpty() {
        assertEquals(dadOneShot.hasNext(),true);
    }

    /*
        Entr�e : hasNext()
        Description : Test de hasNext avec baseAction n'a pas d'action suivante et depedentsActions non vide
        R�sultat Attendu : Retourne True
     */
    @Test
    void DAD14_hasNextWithBaseActionNotHasNextAndDependentActionsNotEmpty() {
        dadOneShot.addDependence(ost2, "hasNext", ost2);
        dadOneShot.next();
        assertTrue(dadOneShot.hasNext());
    }

    /*
        Entr�e : hasNext()
        Description : Test de hasNext avec baseAction n'a pas d'action suivante et depedentsActions vide
        R�sultat Attendu : Retourne False
     */
    @Test
    void DAD15_hasNextWithBaseActionNotHasNextAndDependentActionsEmpty() {
        assertFalse(dadOneShot3.hasNext());
    }

    /*
            Entr�e : updateTimeLaps()
            Description : Test de updateTimeLaps
            R�sultat Attendu : passe � la m�thode suivante
         */
    @Test
    void DAD16_updateTimeLaps() {
        // dadOneShot2.updateTimeLaps();
        // it et currentAction impossible � atteindre
    }
}