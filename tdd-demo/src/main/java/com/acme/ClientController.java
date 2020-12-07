package com.acme;

import java.util.Collection;
import java.util.Optional;

public class ClientController {

    private ClientRepository clients;

    public ClientController(ClientRepository clients) {
        this.clients = clients;
    }

    public Optional<Collection<Client>> getClients() {
        final Collection<Client> clients = this.clients.getClients();
        if (clients.isEmpty()) {
            return Optional.empty();
        } else {return Optional.of(clients);}

    }
}
