#!/bin/bash
# very simple disk space test.
space=$(df -h | awk '{print $5}' | grep % | grep -v Use | sort -n | tail -1 | cut -d "%" -f1 -)
echo "largest occupied space = $space%"
case $space in
[0-6]* ) # espaço < 70%
Message="OK."
;;
[7-8]* ) # 70% <= espaço < 90%
Message="$space % full."
;;
[9]* ) # 90% <= espaço < 99%
Message="$space % full."
;;
99 ) # espaço = 99%
Message="$space % full!"
;;
* )
Message="non-existing disk..."
;;
esac
echo $Message.
