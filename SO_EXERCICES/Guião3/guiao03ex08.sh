#!/bin/bash

# Use a estrutura select para criar menus.
select arg in "$@"; do
    echo "Você escolheu $arg ($REPLY)."
    break
done
