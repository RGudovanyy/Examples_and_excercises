package JUnitTest.JUnit.TestDoubles;

import java.util.Collection;
import java.util.HashSet;

public class RaceResultsService {
    private Collection<Client> clients = new HashSet<Client>();

    public void addSubscriber(Client client) {
        clients.add(client);
    }

    public void send(Message message) {
        for(Client c : clients)
            c.receive(message);
    }

    public void removeSubscriber(Client client) {
        clients.remove(client);
    }
}
