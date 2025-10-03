#!/bin/bash

# Verifica se o número de argumentos passados é igual a 1
if [ "$#" -ne 1 ]; then
    echo "Uso: $0 <diretório>"
    exit 1
fi

# Verifica se o argumento passado é um diretório
if [ ! -d "$1" ]; then
    echo "Erro: \"$1\" não é um diretório válido."
    exit 1
fi

# Para todos os arquivos no diretório fornecido, mostra suas propriedades
for f in "$1"/*; do
    file "$f"
done
