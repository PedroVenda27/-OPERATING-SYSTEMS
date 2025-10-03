#!/bin/bash
# Very simple disk space test.
partition=$(df -h | awk 'NR>1{print $5,$1}' | sort -nk1 | tail -1 | awk '{print $2}')
echo "Partition with most free space: $partition"

space=$(df -h | awk '{print $5}' | grep % | grep -v Use | sort -n | tail -1 | cut -d "%" -f1 -)
echo "largest occupied space = $space%"
case $space in
[0-6]* ) # space < 70%
    Message="OK."
    ;;
[7-8]* ) # 70% <= space < 90%
    Message="$space % full."
    ;;
[9]* ) # 90% <= space < 99%
    Message="$space % full."
    ;;
99 ) # space = 99%
    Message="$space % full!"
    ;;
* )
    Message="non-existing disk..."
    ;;
esac
echo "$Message"
