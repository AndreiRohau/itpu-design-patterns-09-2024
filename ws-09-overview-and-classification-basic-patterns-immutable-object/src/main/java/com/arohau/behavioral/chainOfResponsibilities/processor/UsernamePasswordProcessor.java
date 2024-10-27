package com.arohau.behavioral.chainOfResponsibilities.processor;

import com.arohau.behavioral.chainOfResponsibilities.AuthenticationProcessor;
import com.arohau.behavioral.chainOfResponsibilities.AuthenticationProvider;
import com.arohau.behavioral.chainOfResponsibilities.provider.UsernamePasswordProvider;

public class UsernamePasswordProcessor extends AuthenticationProcessor {

    public UsernamePasswordProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if (authProvider instanceof UsernamePasswordProvider) {
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        }
        return false;
    }
}
