select arg in "$@" "Terminar"; do
    if [ -n "$arg" ]; then
        echo "Você escolheu $arg ($REPLY)."
    else
        echo "Opção inválida. Terminando o programa."
        exit 1
    fi
    break
done
