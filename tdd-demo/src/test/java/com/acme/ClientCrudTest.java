package com.acme;

/**
 * Test Case
 */




import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import static java.util.Arrays.asList;
import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ClientCrudTest {
     /**
      *  BDD tests = doc
      */
     @Test
     public void shouldGetClientsAbsenceMessageWhenNoRegisteredClients() {
          //region Given
          ClientRepository clientsStub = mock(ClientRepository.class);
          when(clientsStub.getClients()).thenReturn(Collections.emptyList());
          ClientController sut = new ClientController(clientsStub);
          //endregion

          //region When
          final Optional<Collection<Client>> maybeClients = sut.getClients();
          //endregion

          //region Then

          assertEquals(Optional.empty(), maybeClients);
          //endregion

     }

     @Test
     public void shouldGetAllClientsWhenThereAerRegisteredClients() {

          final Collection<Client> expectedClients = asList(new Client(1), new Client(2));
          ClientRepository clientsStub = mock(ClientRepository.class);
          when(clientsStub.getClients()).thenReturn(expectedClients);

          ClientController sut = new ClientController(clientsStub);

          assertEquals(expectedClients, sut.getClients().get());
     }

}
