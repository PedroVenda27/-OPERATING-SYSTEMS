#!/bin/bash
# Espera até que um host, fornecido como argumento, volte a ficar online.
host=$1
for (( ; ; )); do
    if ping -c 1 "$host" >& /dev/null; then
        break
    else
        echo "$host ainda está indisponível."
        sleep 5
    fi
done
echo -e "$host está disponível novamente.\a"

