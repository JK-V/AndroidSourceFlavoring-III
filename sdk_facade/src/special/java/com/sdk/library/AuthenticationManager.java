package com.sdk.library;

/**
 * Contract which lists all the accessible methods.
 */

public interface AuthenticationManager {

    void pinAuthentication();

    void fingerprintAuthentication();

    void patternAuthentication();
}
