package com.infinitestudio.apkef.service;


import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.infinitestudio.apkef.receiver.APKEFTutoAlarmReceiver;

public class APKEFTutoDownloaderService extends DownloaderService {
	// Votre clé publique fournie par Google Play
    public static final String BASE64_PUBLIC_KEY = "votre_cle_publique";
                                                    
    // Vous devez également modifier ces chiffres, ils doivent être compris entre -128 et +127
    public static final byte[] SALT = new byte[] { 1, 42, -12, -1, 54, 98, -100, -12, 43, 2, -8, -4, 9, 5, -106, -107, -33, 45, -1, 84
    };

    @Override
    public String getPublicKey() {
        return BASE64_PUBLIC_KEY;
    }

    @Override
    public byte[] getSALT() {
        return SALT;
    }

    @Override
    public String getAlarmReceiverClassName() {
        return APKEFTutoAlarmReceiver.class.getName();
    }
}