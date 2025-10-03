
// ALINEA A

fork():  // Cria um novo processo filho , que é uma cópia do processo processo pai.
getpid(): // Retorna o ID do processo chamado.
getppid(): // Retorna o ID do processo pai do chamado.


// ALINEA B


#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(int argc, char *argv[])
{
    int ret;

    printf("Antes do fork: PID = %d, PPID = %d\n", getpid(), getppid()); // Dá Print aos IDS( getpid() "Atual" e  getppid() "Pai") ID uma vez Pelo Processo Pai  (+1)

    ret = fork(); // Gera Processo Filho

    if (ret < 0) { 
        perror ("Erro no fork."); // Erro
        return EXIT_FAILURE;
    }

    if (ret > 0) sleep (2); // Caso Seja Processo Pai Adormece 2 seg

    printf("Após o fork: PID = %d, PPID = %d\n", getpid(), getppid()); // Dá Print aos IDS( getpid() "Atual" e  getppid() "Pai") ID uma vez Pelo Processo Pai e Filho (+2)
 
    return EXIT_SUCCESS;
}
