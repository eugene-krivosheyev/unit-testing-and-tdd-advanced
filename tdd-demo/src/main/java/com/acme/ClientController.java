package com.acme;

import java.util.Collection;
import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

public class ClientController {
    private ClientRepository clients; //Creator

    //DI: constructor I
    public ClientController(ClientRepository clients) {
        this.clients = clients;
    }


    public Optional<Collection<Client>> getClients() {
        final Collection<Client> clients = this.clients.getClients();
        if (clients.isEmpty()) {
            return empty();
        } else {
            return of(clients);
        }
    }
}
