package com.acme;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Test Case
 */
public class ClientCrudTest {
    /**
     * BDD: tests = doc -> DSL
     * BDD: DDD(test)
     */
    @Test
    public void shouldGetClientsAbsenceMessageWhenNoRegisteredClients() {
        //region Given | Arrange | Fixture
        ClientRepository clientsStub = mock(ClientRepository.class);
        when(clientsStub.getClients()).thenReturn(emptyList());
        ClientController sut = new ClientController(clientsStub);
        //endregion

        //region When | Act
        final Optional<Collection<Client>> maybeClients = sut.getClients();
        //endregion

        //region Then | Assert
        assertEquals(Optional.empty(), maybeClients);
        //endregion
    }

    /**
     * Specification By Example
     */
    @Test
    public void shouldGetAllClientsWhenThereAreRegisteredClients() {
        final Collection<Client> expectedClients = asList(new Client(1), new Client(2));
        ClientRepository clientsStub = mock(ClientRepository.class);
        when(clientsStub.getClients()).thenReturn(expectedClients);

        ClientController sut = new ClientController(clientsStub);

        assertEquals(
                asList(new Client(1), new Client(2)),
                sut.getClients().get()
        );
    }
}
