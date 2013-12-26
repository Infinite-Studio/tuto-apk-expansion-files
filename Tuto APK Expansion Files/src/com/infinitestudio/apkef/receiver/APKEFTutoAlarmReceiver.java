package com.infinitestudio.apkef.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;

import com.google.android.vending.expansion.downloader.DownloaderClientMarshaller;
import com.infinitestudio.apkef.service.APKEFTutoDownloaderService;

public class APKEFTutoAlarmReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		try {
            DownloaderClientMarshaller.startDownloadServiceIfRequired(context, intent,
                    APKEFTutoDownloaderService.class);
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
	}
}
