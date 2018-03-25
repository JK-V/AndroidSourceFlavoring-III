package com.sdk.library;

import com.sdk.core.Device;

/**
 * Generic flavor Implementation of {@link AuthenticationManager}.
 */

class DefaultAuthenticationManager implements AuthenticationManager {

    private Device mDevice;

    public DefaultAuthenticationManager() {
        mDevice = new Device("12345678", "Samsung", "S8", true);
        mDevice.setEncryptedHashedPin("199020");
        GlobalConstants.TYPE_OF_USER = "Generic User";
    }

    public void pinAuthentication() {

        System.out.println("You've Authenticated, using this pin: " + mDevice.getEncryptedHashedPin() + " User Type: " + GlobalConstants.TYPE_OF_USER);
    }

    public void fingerprintAuthentication() {
        System.out.println("Inside Fingerprint Authentication");
    }

    public void patternAuthentication() {
        System.out.println("Inside Pattern Authentication");
    }

    public void retinaAuthentication() {
        System.out.println("Inside Retina Authentication");
    }

    public void faceAuthentication() {
        System.out.println("Inside Face Authentication");
    }
}
