package com.ategen.kulff;

import android.hardware.fingerprint.FingerprintManager;
import android.support.annotation.Nullable;

/**
 * Created by arade on 1/8/17.
 */

public interface FingerprintActivityInterface {
      String DEFAULT_KEY_NAME = "default_key";
    void onPurchased(boolean withFingerprint,
                     @Nullable FingerprintManager.CryptoObject cryptoObject);
     void createKey(String keyName, boolean invalidatedByBiometricEnrollment);
}
