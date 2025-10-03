#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(int argc, char *argv[])
{
    int ret;

    printf("Antes do fork: PID = %d, PPID = %d\n", getpid(), getppid());

    ret = fork();

    if (ret < 0) { 
        perror ("Erro no fork.");
        return EXIT_FAILURE;
    }

    if (ret > 0) sleep (2);

    printf("Após o fork: PID = %d, PPID = %d\n", getpid(), getppid());

    return EXIT_SUCCESS;
}
