#!/bin/bash

# Verifica se foram fornecidos exatamente dois argumentos
if [ $# -ne 2 ]; then
    echo "Usage: $0 <number> <prefix>"
    exit 1
fi

# Validação do primeiro argumento
if ! [[ $1 =~ ^[0-9]+$ ]]; then
    echo "O primeiro argumento deve ser um número."
    exit 1
fi

if [ $1 -lt 0 ] || [ $1 -gt 99 ]; then
    echo "O primeiro argumento deve ser um número entre 0 e 99."
    exit 1
fi

# Validação do segundo argumento
case $2 in
    arg*) # Se o segundo argumento começa com "arg"
        ;;
    *) # Se o segundo argumento não começa com "arg"
        echo "O segundo argumento deve começar com 'arg'."
        exit 1
        ;;
esac

echo "Argumentos válidos."

