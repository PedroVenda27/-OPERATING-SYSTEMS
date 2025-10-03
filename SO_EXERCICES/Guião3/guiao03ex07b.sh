#!/bin/bash
# compute the sum of a series of numbers.
SCORE="0"
SUM="0"
COUNT="0"
while true; do
 echo -n "Enter your score [0-10] ('q' to quit): ('r' to reiniciate sum and count)"
 read SCORE;
 if (("$SCORE" < "0")) || (("$SCORE" > "10")); then
 echo "Try again: "
 elif [[ "$SCORE" == "r" ]]; then
 SUM="0"
 COUNT="0"
 echo " sum and count = 0"
 elif [[ "$SCORE" == "q" ]]; then
 MEDIA=$(bc <<< "scale=2; $SUM / $COUNT")
 echo "Sum: $SUM"
 echo "Media: $MEDIA"
break
 else
 SUM=$((SUM + SCORE))
 COUNT=$((COUNT + 1))
 fi
done
echo "Exiting." 
