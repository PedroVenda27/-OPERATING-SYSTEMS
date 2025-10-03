#!/bin/bash
if [ -z "$1" ]; then
    echo "Uso: $0 <nome-base>"
    exit 1
fi

nome_base="$1"

for i in {0..7}; do
    filename="${nome_base}$(printf "%02d" $i).txt"
    touch "$filename"
done
