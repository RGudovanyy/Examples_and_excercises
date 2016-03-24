package JUnitTest.JUnit.TestDoubles;


import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class RaceResultsServiceTest {

    RaceResultsService raceResults = new RaceResultsService();
    Client clientA = mock(Client.class, "ClientA");
    Client clientB = mock(Client.class, "ClientB");
    Message message = mock(Message.class);



    /*
    The first test is meant to verify whether, if a single client has subscribed to the
    RaceResultsService , it receives messages.
    */
    @Test
    public void subscribed_client_should_receive_messages(){
        raceResults.addSubscriber(clientA);
        raceResults.send(message);
        verify(clientA).receive(message);
    }

/*
since I know that a message has been sent to one single client, I now wish to test whether
this functionality will also work for more than one subscriber.
 */
    @Test
    public void message_should_be_sent_to_all_subscribed_clients(){
         raceResults.addSubscriber(clientA);
        raceResults.addSubscriber(clientB);
        raceResults.send(message);
        //"verify that clientA has never received a message"
        verify(clientA).receive(message);
        verify(clientB).receive(message);
    }

    /*
    The next step is to make sure that clients who are not subscribed do not receive any messages.
     */

    @Test
    public void not_subscribed_clients_should_not_receive_messages(){
        raceResults.send(message);

        verify(clientA, never()).receive(message);
        verify(clientB, never()).receive(message);
    }

    @Test
    public void should_send_only_one_message_to_multi_subscriber(){
        raceResults.addSubscriber(clientA);
        raceResults.addSubscriber(clientA);
        raceResults.send(message);

        verify(clientA).receive(message);
    }

    /*
    What remains is to make sure that once a client has unsubscribed,
    it will not receive any messages.
     */

    @Test
    public void unsubscribed_client_should_not_receive_messages(){
        raceResults.addSubscriber(clientA);
        raceResults.removeSubscriber(clientA);
        raceResults.send(message);

        verify(clientA, never()).receive(message);
    }

}
