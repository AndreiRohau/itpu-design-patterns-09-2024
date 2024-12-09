package com.arohau.chainOfResponsibility.ex3;

public class Main {
    public static void main(String[] args) {
        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
        Boolean isAuthorized = null;

        isAuthorized = authProcessorChain.isAuthorized(new OAuthTokenProvider());
        System.out.println(isAuthorized); // true
        isAuthorized = authProcessorChain.isAuthorized(new SamlAuthenticationProvider());
        System.out.println(isAuthorized); // false
    }

    private static AuthenticationProcessor getChainOfAuthProcessor() {
        AuthenticationProcessor oAuthProcessor = new OAuthAuthenticationProcessor(null);
        return new UsernamePasswordAuthenticationProcessor(oAuthProcessor);
    }
}
