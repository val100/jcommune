package org.jtalks.jcommune.service;

import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistry;

import java.util.List;

/** @author stanislav bashkirtsev */
public class MockSessionRegistry implements SessionRegistry {
    @Override
    public List<Object> getAllPrincipals() {
        throw new UnsupportedOperationException("to be implemented in component tests");
    }

    @Override
    public List<SessionInformation> getAllSessions(Object principal, boolean includeExpiredSessions) {
        throw new UnsupportedOperationException("to be implemented in component tests");
    }

    @Override
    public SessionInformation getSessionInformation(String sessionId) {
        throw new UnsupportedOperationException("to be implemented in component tests");
    }

    @Override
    public void refreshLastRequest(String sessionId) {
        throw new UnsupportedOperationException("to be implemented in component tests");
    }

    @Override
    public void registerNewSession(String sessionId, Object principal) {
        throw new UnsupportedOperationException("to be implemented in component tests");
    }

    @Override
    public void removeSessionInformation(String sessionId) {
        throw new UnsupportedOperationException("to be implemented in component tests");
    }
}
