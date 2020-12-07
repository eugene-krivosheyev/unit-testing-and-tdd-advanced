package com.acme;

/**
 * Test Case
 */




import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClientCrudTest {
     /**
      *  BDD tests = doc
      */
     @Test
     public void shouldGetClientsAbsenceMessageWhenNoRegisteredClients() {
          //region Given
          ClientController sut = new ClientController();
          //endregion

          //region When
          String message = sut.getClients();
          //endregion

          //region Then

          assertEquals("No registered clients", message);
          //endregion

     }

}
