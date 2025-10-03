#!/bin/bash
# Parameter Expansion

file="$HOME/.bashrc"

echo "Caminho do Arquivo: $file"

echo "Nome do Arquivo: ${file##*/}"

echo "Diretorio Do Arquivo: ${file%/*}"
