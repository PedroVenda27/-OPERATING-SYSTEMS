#!/bin/bash

# Função para adicionar o prefixo "new_" aos nomes dos arquivos
add_prefix() {
    for file in "$1"/*; do
        if [ -f "$file" ]; then
            new_name="$1/new_$(basename "$file")"
            mv "$file" "$new_name"
            echo "Arquivo renomeado para: $new_name"
        fi
    done
}

# Função para remover o prefixo "new_" dos nomes dos arquivos
remove_prefix() {
    for file in "$1"/new_*; do
        if [ -f "$file" ]; then
            new_name="$1/$(basename "$file" | sed 's/^new_//')"
            mv "$file" "$new_name"
            echo "Arquivo renomeado para: $new_name"
        fi
    done
}

# Verifica se o número de argumentos passados é válido
if [ "$#" -ne 1 ] || [ ! -d "$1" ]; then
    echo "Uso: $0 <diretório>"
    exit 1
fi

# Verifica se a opção -r foi fornecida
if [ "$2" == "-r" ]; then
    remove_prefix "$1"
else
    add_prefix "$1"
fi
