package action;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import action.DiscreteAction;
import action.DiscreteActionInterface;
import timer.OneShotTimer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiscreteActionTest {
    private OneShotTimer ost;
    private OneShotTimer ost2;
    private DiscreteAction daOneShot;
    private DiscreteActionInterface daOneShot2;
    private DiscreteActionInterface daOneShot3;

    @BeforeEach
    void setUp() {
        ost = new OneShotTimer(10);
        ost2 = new OneShotTimer(15);
        daOneShot = new DiscreteAction(ost, "hasNext", ost);
        daOneShot2 = new DiscreteAction(ost, "hasNext", ost2);
        daOneShot3 = new DiscreteAction(ost, "getMethod", ost);
    }

    @Test
    void DA1_constructorMethodInObject() {
        assertEquals(daOneShot.getObject(), ost);
        assertEquals(daOneShot.getMethod().getName(), "hasNext");
        // Aucune possibilit� de r�cup�rer daOneShot.timmer
    }

    @Test
    void DA2_constructorMethodNotInObject() {
        // DiscreteAction daFail = new DiscreteAction(ost1, "notDeclaredMethod", ost2);
        // assertNull(daFail.getMethod());
    }

    /*
        Entr�e : spendTime(4)
        Description : Test de la m�thode spendTime avec lapsTime = 10 donc lapsTime > 4 > 0
        R�sultat Attendu : La valeur de lapsTime devient 4 et la log : �[DA] operate spendTime on objectName : objectHashCode: old time 10 new time 6� a �t� ajout�e
    */
    @Test
    void DA3_spendTimeWithLapsSupZero() {
        daOneShot.next();
        assertEquals(daOneShot.getCurrentLapsTime(), 10);
        daOneShot.spendTime(4);
        assertEquals(daOneShot.getCurrentLapsTime(),6);

    }

    /*
        Entr�e : spendTime(4)
        Description : Test de la m�thode spendTime avec lapsTime = null
        R�sultat Attendu : La log : �[DA] operate spendTime on objectName : objectHashCode: old time null new time null� a �t� ajout�e
     */
    @Test
    void DA4_spendTimeWithLapsEqualsNull() {
        daOneShot.next();
        assertEquals(daOneShot.getCurrentLapsTime(), 10);
        daOneShot.next();
        assertEquals(daOneShot.getCurrentLapsTime(), null);
        daOneShot.spendTime(4);
        assertEquals(daOneShot.getCurrentLapsTime(),null);
    }

    /*
        Entr�e : DiscreteAction(o, m, timer) getMethod()
        Description : Test du getter de method d�un objet initialis�
        R�sultat Attendu : Retourne la m�thode m
     */
    @Test
    void DA5_getMethod() {
        assertEquals(daOneShot.getMethod().getName(),"hasNext");
    }

    /*
        Entr�e :DiscreteAction(o, m, timer) getCurrentLapsTime()
        Description : Test du getter de lapsTime d�un objet initialis�
        R�sultat Attendu : Retourne null
     */
    @Test
    void DA6_getCurrentLapsTime() {
        assertEquals(daOneShot.getCurrentLapsTime(),null);
        daOneShot.next();
        assertEquals(daOneShot.getCurrentLapsTime(),10);
    }

    /*
        Entr�e : DiscreteAction(o, m, timer) getObject()
        Description : Test du getter de objet
        R�sultat Attendu : Retourne l�objet o
     */
    @Test
    void DA7_getObject() {
        assertEquals(daOneShot.getObject(),ost);
    }

    /*
        Entr�e : compareTo(c)
        Description : Test de comparaison avec lapsTime courant null
        R�sultat Attendu : Retourne 1
     */
    @Test
    void DA8_compareToWithCurrentLapsTimeNull() {
        daOneShot2.next();
        assertEquals(daOneShot.compareTo(daOneShot2),1);
    }

    /*
        Entr�e : compareTo(c)
        Description : Test de comparaison avec lapsTime de c null
        R�sultat Attendu : Retourne -1
     */
    @Test
    void DA9_compareToWithParamLapsTimeNull() {
        daOneShot.next();
        assertEquals(daOneShot.compareTo(daOneShot2),-1);
    }

    /*
        Entr�e : compareTo(c)
        Description : Test de comparaison avec lapsTime courant > lapsTime de c
        R�sultat Attendu : Retourne 1
     */
    @Test
    void DA10_compareToWithCurrentLapsTimeSupParamsLapsTime() {
        daOneShot.next();
        daOneShot2.next();
        daOneShot2.spendTime(10);
        assertEquals(daOneShot.compareTo(daOneShot2),1);
    }

    /*
        Entr�e : compareTo(c)
        Description : Test de comparaison avec lapsTime courant < lapsTime de c
        R�sultat Attendu : Retourne -1
     */
    @Test
    void DA11_compareToWithCurrentLapsTimeInfParamsLapsTime() {
        daOneShot.next();
        daOneShot2.next();
        assertEquals(daOneShot.compareTo(daOneShot2),-1);
    }

    /*
        Entr�e : compareTo(c)
        Description : Test de comparaison avec lapsTime courant = lapsTime de c
        R�sultat Attendu : Retourne 0
     */
    @Test
    void DA12_compareToWithCurrentLapsTimeEqualsParamsLapsTime() {
        daOneShot.next();
        daOneShot2.next();
        daOneShot2.spendTime(5);
        assertEquals(daOneShot.compareTo(daOneShot2),0);
    }

    /*
        Entr�e : DiscreteAction(o, m, timer) toString()
        Description : Test du toString d�un objet initialis�
        R�sultat Attendu : Retourne le string:
            �Object : oName
             Method : mName
            Stat. : timer
            delay : lapsTime�
     */
    @Test
    void DA13_toString() {
        //Aucun moyen de r�cup�rer le timmer
        assertEquals(daOneShot.toString(), "Object : " + daOneShot.getObject()+"\n Method : " + daOneShot.getMethod() + "\n Stat. : " + "daOneShot.getTimer()" + "\n delay : " + daOneShot.getCurrentLapsTime());
    }

    /*
        Entr�e : DiscreteAction(o, m, timer) hasNext()
        Description : Test m�thode hasNext() avec timer != null et timer a une prochaine valeur
        R�sultat Attendu : Retourne True
     */
    @Test
    void DA14_hasNext() {
        assertEquals(daOneShot.getCurrentLapsTime(),null);
        daOneShot.next();
        assertEquals(daOneShot.getCurrentLapsTime(),10);
    }

    /*
        Entr�e : DiscreteAction(o, m, timer) hasNext()
        Description : Test m�thode hasNext() avec timer != null et timer a une prochaine valeur
        R�sultat Attendu : Retourne True
     */
    @Test
    void DA15_hasNextWithTimerNotNullAndWithNextValue() {
        assertTrue(daOneShot.hasNext());
    }

    /*
        Entr�e : DiscreteAction(o, m, timer) hasNext()
        Description : Test m�thode hasNext() avec timer != null et timer n�a pas de prochaine valeur
        R�sultat Attendu : Retourne False
     */
    @Test
    void DA16_hasNextWithTimerNotNullAndWithoutNextValue() {
        daOneShot.next();
        assertFalse(daOneShot.hasNext());
    }

    /*
        Entr�e : DiscreteAction(o, m, timer) hasNext()
        Description : Test m�thode hasNext() avec timer == null
        R�sultat Attendu : Retourne False
     */
    @Test
    void DA17_hasNextWithTimerNull() {
        //Aucun moyen d'avoir un timmer null pour tester
    }

    /*
        Entr�e : spendTime(50)
        Description : Test de la m�thode spendTime avec lapsTime = 10 donc 50 > lapsTime> 0
        R�sultat Attendu : Exception : �t > lapsTime"
     */
    @Test
    void DA18_spendTimeWithParamSupLapsTime() {
        // Normal que ca marche pas : il y a pas d'exception (alors qu'il devrait en avoir une car sinon pas logique)
        assertThrows(Exception.class, () -> {
            daOneShot.next();
            daOneShot.spendTime(50);
        });
    }

    /*
        Entr�e : spendTime(-50)
        Description : Test de la m�thode spendTime avec temps < 0
        R�sultat Attendu : Exception �t < 0�
     */
    @Test
    void DA19_spendTimeWithParamInf0() {
        // Normal que ca marche pas : il y a pas d'exception (alors qu'il devrait en avoir une car sinon pas logique)
        assertThrows(Exception.class, () -> {
            daOneShot.next();
            daOneShot.spendTime(-50);
        });
    }

}
