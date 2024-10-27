package com.arohau.behavioral.chainOfResponsibilities.processor;

import com.arohau.behavioral.chainOfResponsibilities.AuthenticationProcessor;
import com.arohau.behavioral.chainOfResponsibilities.AuthenticationProvider;
import com.arohau.behavioral.chainOfResponsibilities.provider.OAuthTokenProvider;

public class OAuthProcessor extends AuthenticationProcessor {

    public OAuthProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if (authProvider instanceof OAuthTokenProvider) {
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        }

        return false;
    }
}
