package com.mornning.plugdemo;

import android.content.Context;

import org.acdd.android.compat.ACDDApp;
import org.acdd.framework.ACDDConfig;

public class ACDDCoreApp extends ACDDApp {
    static {
//        ACDDConfig.DELAY = new String[]{"com.acdd.qrcode", "libcom.acdd.testapp1", "libcom.acdd.testapp2"};
        ACDDConfig.AUTO = new String[]{"com.mornning.pluginone"};
//        ACDDConfig.STORE = new String[]{"com.acdd.android.appcenter", "com.acdd.universalimageloader.sample"};
    }

    @Override
    protected void attachedBaseContext(Context context) {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ACDDConfig.stubModeEnable = true;
        //InternalConstant.BundleNotFoundActivity=BundleNotFoundActivity.class;
    }
}
