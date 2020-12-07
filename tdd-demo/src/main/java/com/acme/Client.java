package com.acme;

import java.util.Objects;

public class Client {
    private int id;

    public Client(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return getId() == client.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
