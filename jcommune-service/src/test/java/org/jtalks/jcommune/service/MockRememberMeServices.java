package org.jtalks.jcommune.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.RememberMeServices;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** @author stanislav bashkirtsev */
public class MockRememberMeServices implements RememberMeServices {
    @Override
    public Authentication autoLogin(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("to be implemented in component tests");
    }

    @Override
    public void loginFail(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("to be implemented in component tests");
    }

    @Override
    public void loginSuccess(HttpServletRequest request, HttpServletResponse response,
                             Authentication successfulAuthentication) {
        throw new UnsupportedOperationException("to be implemented in component tests");
    }
}
