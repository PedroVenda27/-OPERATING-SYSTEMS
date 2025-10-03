#!/bin/bash
# Para todos os arquivos em uma pasta, mostra suas propriedades.
for f in "$1"/*; do
    file "$f"
done
