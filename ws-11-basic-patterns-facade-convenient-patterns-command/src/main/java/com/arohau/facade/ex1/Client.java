package com.arohau.facade.ex1;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Client {

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException,
            InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

        String input = "Some text to encrypt";

        EncryptionFacade encryptionFacade = new EncryptionFacade();
        String encryptedInput = encryptionFacade.encrypt(input);

        System.out.println("Encrypted String: " + encryptedInput);
    }
}