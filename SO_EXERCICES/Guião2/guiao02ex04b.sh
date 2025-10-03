
#!/bin/bash

echo "i --- Listar todos os ficheiros e diretórios em /etc:"
ls /etc

echo "ii --- Listar todos os ficheiros e diretórios em /etc cujo nome começa por a:"
ls /etc | grep '^a'

echo "iii --- Listar todos os ficheiros e diretórios em /etc cujo nome começa por a e tem mais de 3 caracteres:"
ls /etc | grep '^a.{3,}'


echo "iv --- Listar todos os ficheiros e diretórios em /etc cujo nome contém 'conf':"
ls /etc | grep 'conf'
