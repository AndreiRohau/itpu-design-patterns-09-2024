package com.arohau.facade.ex2;

public class App {
    public static void main(String[] args) {
        SendMessageFacade sendMessageFacade = new SendMessageFacade();
        sendMessageFacade.sendMessage();
    }
}
