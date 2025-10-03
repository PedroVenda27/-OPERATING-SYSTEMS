#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

int main(int argc, char *argv[])
{
    int ret;

    printf("Antes do fork: PID = %d, PPID = %d\n", getpid(), getppid());

    ret = fork();

    if (ret < 0) {
        perror("Erro no fork.");
        return EXIT_FAILURE;
    }

    if (ret == 0)
    {
        printf("Após o fork: PID = %d, PPID = %d, retorno do fork = %d\n", getpid(), getppid(), ret);
    }
    else
    {
        printf("Após o fork: PID = %d, PPID = %d, retorno do fork = %d\n", getpid(), getppid(), ret);
    }

    return EXIT_SUCCESS;
}
