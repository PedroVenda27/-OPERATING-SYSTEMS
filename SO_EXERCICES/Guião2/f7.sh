
for i in {0..7}; do
    # Nome do arquivo
    filename="f$(printf "%02d" $i).txt"
    # Criação do arquivo
    touch "$filename"
done
