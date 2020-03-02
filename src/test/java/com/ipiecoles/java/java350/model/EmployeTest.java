package com.ipiecoles.java.java350.model;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDate;

public class EmployeTest {

    @Test
    public void testgetNombreAnneeAnciennete() {
        //Given
        Employe employe = new Employe();
        employe.setDateEmbauche(null);

        //When = Exécution de la méthode à tester
        Integer nombre = employe.getNombreAnneeAnciennete();

        //Then = Vérifications de ce qu'a fait la méthode
        Assertions.assertThat(nombre).isEqualTo(0);
    }

    @Test
    public void testgetNombreAnneeAncienneteTodayPlus2Y() {
        //Given
        Employe employe = new Employe();
        employe.setDateEmbauche(LocalDate.now().plusYears(2));

        //When = Exécution de la méthode à tester
        Integer nombre = employe.getNombreAnneeAnciennete();

        //Then = Vérifications de ce qu'a fait la méthode
        Assertions.assertThat(nombre).isEqualTo(0);
    }

    @Test
    public void testgetNombreAnneeAncienneteTodayMinus3Y() {
        //Given
        Employe employe = new Employe();
        employe.setDateEmbauche(LocalDate.now().minusYears(3));

        //When = Exécution de la méthode à tester
        Integer nombre = employe.getNombreAnneeAnciennete();

        //Then = Vérifications de ce qu'a fait la méthode
        Assertions.assertThat(nombre).isEqualTo(3);
    }
}
