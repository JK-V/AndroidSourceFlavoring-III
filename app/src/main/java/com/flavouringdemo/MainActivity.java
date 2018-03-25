package com.flavouringdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sdk.library.AuthenticationManager;
import com.sdk.library.ExposeManagers;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkVisibilityOfAPIs();
    }

    //To check visibility of SDKLibrary APIs
    private void checkVisibilityOfAPIs() {
        AuthenticationManager authenticationManager = ExposeManagers.getInstance().getAuthenticationManager();
        authenticationManager.pinAuthentication();
    }
}
