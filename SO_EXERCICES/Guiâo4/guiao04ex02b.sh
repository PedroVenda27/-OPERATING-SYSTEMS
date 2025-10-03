#!/bin/bash

function numeric_to_string() {
    local number=$1
    case "$number" in
        1)
            echo "Um"
            ;;
        2)
            echo "Dois"
            ;;
        3)
            echo "Três"
            ;;
        *)
            return $number
            ;;
    esac
    return 0
}

numeric_to_string $1
return_value=$?
echo "O valor de retorno da função é: $return_value"

