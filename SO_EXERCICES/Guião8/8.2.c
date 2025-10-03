#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

int main(int argc, char *argv[])
{
    int ret;

    printf("Antes do fork: PID = %d, PPID = %d\n", getpid(), getppid()); // Dá Print aos IDS( getpid() "Atual" e  getppid() "Pai") ID uma vez Pelo Processo Pai  (+1)

    ret = fork(); // Gera Processo Filho

    if (ret < 0) {
        perror("Erro no fork."); // Erro
        return EXIT_FAILURE;
    }

    if (ret == 0)
    {
        printf("Após o fork: PID = %d, PPID = %d, retorno do fork = %d\n", getpid(), getppid(), ret); // Dá Print aos IDS( getpid() "Atual" e  getppid() "Pai") ID uma vez Pelo Filho (+1)
    }
    else
    {
        printf("Após o fork: PID = %d, PPID = %d, retorno do fork = %d\n", getpid(), getppid(), ret); // Dá Print aos IDS( getpid() "Atual" e  getppid() "Pai") ID uma vez Pelo Filho (+1)
    }

    return EXIT_SUCCESS;
}

 // No total, são 3 linhas impressas.