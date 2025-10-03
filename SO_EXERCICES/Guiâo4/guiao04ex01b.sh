#!/bin/bash

function imprime_msg() {
  echo "Uma função que imprime uma mensagem!"
  return 0
}

function info_sistema() {
  echo "Data atual: $(date)"
  echo "Nome do computador: $(hostname)"
  echo "Nome do usuário: $(whoami)"
  return 0
}

# Chamando a função imprime_msg
imprime_msg

# Chamando a função info_sistema
info_sistema
