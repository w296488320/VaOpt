package io.virtualapp.Utils;

import android.util.Log;

import io.virtualapp.config.MainConfig;


public class CLogUtils {


	private static String TAG = "Q296488320";

	public static void e(String msg){
			if(MainConfig.isTest) {
				Log.e(TAG, msg);
			}
	}

	public static void e(String TAG, String msg){
		if(MainConfig.isTest) {
			Log.e(TAG, msg);
		}
	}
}
