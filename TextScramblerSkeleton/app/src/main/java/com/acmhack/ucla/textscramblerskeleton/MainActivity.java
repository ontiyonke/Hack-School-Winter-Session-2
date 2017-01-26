package com.acmhack.ucla.textscramblerskeleton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set up user interface and behavior
    }

    // Use this function to change from encyrpt to decrypt
    // Look at the image in the drawable folder named: "swap_example_not_for_project_usage"
    // for more clarity on how the ui should change if unsure what to do here.
    public void swap_direction(){

    }

    //Use these functions to implement a substitution cipher (https://en.wikipedia.org/wiki/Substitution_cipher)
    //Optional Substitutional Cipher, but you can use your own.
    //  plain text: ABCDEFGHIJKLMNOPQRSTUVWXYZ
    // cipher text: ZEBRASCDFGHIJKLMNOPQTUVWXY
    // example: "flee at once. we are discovered!" transforms into "SIAA ZQ LKBA. VA ZOA RFPBLUAOAR!"
    public void encrypt1(){

    }
    public void decrypt1(){

    }

    //Use these functions to implement a polyalphabetic cipher (https://en.wikipedia.org/wiki/Polyalphabetic_cipher)
    //This is similar to substitution but using multiple substitution alphabets
    //              plain text: ABCDEFGHIJKLMNOPQRSTUVWXYZ
    // even letter cipher text: ZEBRASCDFGHIJKLMNOPQTUVWXY
    //  odd letter cipher text: CDFGHIJKLMNOPQTUVWXYZEBRAS
    // example: "test" transforms into "yaxo"
    public void encrypt2(){

    }
    public void decrypt2(){

    }

    //Implement your own encryption
    //This doesn't have to be complicated, but for those who are interested in security
    //and want try something more advanced you could try creating AES encryption (https://en.wikipedia.org/wiki/Advanced_Encryption_Standard)
    // which is the standard worldwide. You can also take a look at some of java and android's built-in encryption libraries for more ideas
    //Here is a link to the android developer docs: https://developer.android.com/reference/javax/crypto/package-summary.html
    public void encrypt3(){

    }
    public void decrypt3(){

    }
}
