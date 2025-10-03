#!/bin/bash
# wait for a host, given as argument, to come back online.
host=$1
until ping -c 1 "$host" >& /dev/null; do
 echo "$host is still unavailable."
 sleep 5
done;
echo -e "$host is available again.\a"

