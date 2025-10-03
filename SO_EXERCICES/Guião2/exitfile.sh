#!/bin/bash

# Verifica se foi passado um argumento para o nome do arquivo
if [ -z "$1" ]; then
    echo "Uso: $0 <nome-do-arquivo>"
    exit 1
fi

# Verifica se o arquivo existe
if [ ! -e "$1" ]; then
    echo "O arquivo '$1' não existe."
    exit 1
fi

# Executa o comando 'file' para o arquivo especificado e armazena o código de saída
file "$1"
exit_code=$?

# Exibe o código de saída do comando 'file'
echo "Código de saída do comando 'file': $exit_code"

