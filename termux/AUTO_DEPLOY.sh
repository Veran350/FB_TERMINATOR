#!/bin/bash  
cd ~/FB_TERMINATOR  

# Generate debug.keystore  
mkdir -p keys  
if [ ! -f keys/debug.keystore ]; then  
    keytool -genkey -v -keystore keys/debug.keystore -storepass android -alias androiddebugkey -keypass android -dname "CN=Android Debug"  
fi  

# Install tools  
pkg install apktool openjdk-17 php ngrok -y  

# Start server  
./termux/SERVER_KILLER.sh  

# Build APK  
apktool b app -o apk_out/FB_Killer.apk  

# Sign APK  
cd apk_out  
zipalign -v 4 FB_Killer.apk FB_Signed.apk  
apksigner sign --ks ../keys/debug.keystore --ks-pass pass:android FB_Signed.apk  

echo "[+] APK READY: apk_out/FB_Signed.apk"  
