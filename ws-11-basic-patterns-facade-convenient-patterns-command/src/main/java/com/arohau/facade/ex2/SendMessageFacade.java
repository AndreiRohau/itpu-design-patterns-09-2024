package com.arohau.facade.ex2;

public class SendMessageFacade {
    public void sendMessage() {
        Client client = new Client();
        client.connectToServer();

        ClientServer clientServer = new ClientServer();
        clientServer.authenticateClient();
        clientServer.routeToRecipient();

        RecipientServer recipientServer = new RecipientServer();
        recipientServer.authenticateRecipient();
        recipientServer.sendMessage();

        Recipient recipient = new Recipient();
        recipient.receiveMessage();
    }
}
