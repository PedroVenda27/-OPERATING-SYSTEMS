#!/bin/bash

# Função para comparar os números
function comparar_numeros() {
    local num1=$1
    local num2=$2

    # Verifica se os números são iguais
    if [ $num1 -eq $num2 ]; then
        return 0
    fi

    # Verifica qual número é maior
    if [ $num1 -gt $num2 ]; then
        return $num1
    else
        return $num2
    fi
}

# Solicita ao usuário para inserir os dois números
echo "Por favor, insira o primeiro número:"
read num1
echo "Por favor, insira o segundo número:"
read num2

# Chama a função para comparar os números
comparar_numeros $num1 $num2

# Captura o valor de retorno da função
resultado=$?

# Verifica o valor de retorno e imprime a mensagem apropriada
if [ $resultado -eq 0 ]; then
    echo "Os números são iguais."
else
    echo "O maior número é: $resultado"
fi

