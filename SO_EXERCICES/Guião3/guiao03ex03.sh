#!/bin/bash
if [ "$#" -ne 1 ]; then
    echo "Número de argumentos inválido. Utilização: $0 nome_do_arquivo"
    exit 1
fi

# Este script verifica a existência de um arquivo.
echo "Verificando..."
if [[ -f $1 ]]; then
    echo "$1 existe."
else
    echo "$1 não existe"
fi

if test -d "$1"; then
    echo "$1 é um diretório."
    echo "Permissões do diretório $1:"
    ls -ld "$1"
else
    echo "$1 é um arquivo."
    echo "Permissões do arquivo $1:"
    stat -c "%A %a" "$1"
fi

echo "Concluído."


