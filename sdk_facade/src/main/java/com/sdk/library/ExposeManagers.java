package com.sdk.library;

/**
 * This will expose underlying Manager implementation through contracts.
 */

public class ExposeManagers {

    private static volatile ExposeManagers INSTANCE;

    private ExposeManagers() {
    }

    public static ExposeManagers getInstance() {
        if (INSTANCE == null) {
            synchronized (ExposeManagers.class) {
                if (INSTANCE == null)
                    INSTANCE = new ExposeManagers();
            }
        }
        return INSTANCE;
    }

    public AuthenticationManager getAuthenticationManager() {
        return new DefaultAuthenticationManager();
    }
}
