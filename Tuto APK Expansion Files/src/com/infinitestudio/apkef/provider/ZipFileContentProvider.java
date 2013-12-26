package com.infinitestudio.apkef.provider;

import com.android.vending.expansion.zipfile.APEZProvider;

public class ZipFileContentProvider extends APEZProvider {

    @Override
    public String getAuthority() {
        return "com.infinitestudio.apkef.provider.ZipFileContentProvider";
    }
}