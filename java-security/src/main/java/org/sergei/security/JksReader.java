package org.sergei.security;

import java.io.*;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/**
 * @author Sergei Visotsky
 */
public class JksReader {

    public static void main(String[] args) {
        try(InputStream inStream = JksReader.class.getResourceAsStream("keystore.jks")) {
            KeyStore keyStore = KeyStore.getInstance("jks");
            keyStore.load(inStream, "keyStoreSecret".toCharArray());
            System.out.println("KeyStore type: " + keyStore.getType());
            System.out.println("KeyStore size: " + keyStore.size());
        } catch (KeyStoreException | IOException | NoSuchAlgorithmException | CertificateException e) {
            e.printStackTrace();
        }

    }

}
