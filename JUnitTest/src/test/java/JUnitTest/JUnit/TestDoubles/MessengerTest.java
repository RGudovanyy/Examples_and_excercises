package JUnitTest.JUnit.TestDoubles;
/*
import org.junit.Test;

import static org.mockito.Mockito.*;

public class MessengerTest {

    private static final String CLIENT_EMAIL = "some@email.com";
    private static final String MSG_CONTENT = "Dear John! You are fired!";


    @Test
    public void should_send_email() throws Exception {
        Template template = mock(Template.class);
        Client client = mock(Client.class);
        MailServer mailServer = mock(MailServer.class);
        TemplateEngine templateEngine = mock(TemplateEngine.class);

        Messenger sut = new Messenger(mailServer, templateEngine);
        when(client.getEmail()).thenReturn(CLIENT_EMAIL);

        /*
        Whenever someone asks you to prepare a message with given template and client,
        please return the value of MSG_CONTENT
         */
/*
        when(templateEngine.prepareMessage(template,client)).thenReturn(MSG_CONTENT);
        sut.sendMessage(client, template);

        //Taking control over indirect methods - test spy
        sut.sendMessage(client, template);
        /*
        verify that the send() method of mailServer was
        invoked with given email and message content
         */
/*
        verify(mailServer).send(CLIENT_EMAIL, MSG_CONTENT);

    }
}
*/
