package app;

import com.acme.ClientController;
import com.acme.ClientRepository;

public class AppDiStarter {
    public static void main(String[] args) {
        new ClientController(new ClientRepository());
    }
}
