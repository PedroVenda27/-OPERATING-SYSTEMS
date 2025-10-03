
ANOTAÇÕES!!!!!!!!!


Get-Content -Path temp.txt:

#Este comando lê o conteúdo do arquivo "temp.txt" e exibe todo o conteúdo na saída.
#A saída será o conteúdo completo do arquivo "temp.txt", mostrando todas as linhas de texto.

Get-Content -Path temp.txt -TotalCount 5:

#Este comando lê o conteúdo do arquivo "temp.txt", mas limita a saída às primeiras 5 linhas do arquivo.
#A saída será apenas as primeiras 5 linhas do arquivo "temp.txt".

(Get-Content -Path temp.txt -TotalCount 25)[-1]:

#Este comando lê o conteúdo do arquivo "temp.txt", mas limita a saída às últimas 25 linhas do arquivo.
#Em seguida, seleciona apenas a última linha dessas 25 linhas.
#A saída será a última linha do arquivo "temp.txt".

Get-Item -Path temp.txt | Get-Content -Tail 1:

#Este comando primeiro obtém informações sobre o arquivo "temp.txt" usando Get-Item.
#Em seguida, o comando Get-Content -Tail 1 lê apenas a última linha do arquivo.
#A saída será a última linha do arquivo "temp.txt".
