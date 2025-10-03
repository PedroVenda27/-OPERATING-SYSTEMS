#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main(int argc, char *argv[])
{
    int stat;

    printf("(Antes do fork): PID = %u, PPID = %u\n", getpid(), getppid());

    switch (fork())
    {
        case -1:
            perror("Erro no fork.\n");
            return EXIT_FAILURE;
        case 0:
            if (execl("/bin/ls", "ls", "-la", NULL) < 0)
            {
                perror("Erro a criar processo.\n");
                return EXIT_FAILURE;
            }

            printf("Done.");
            break;
            
        default:
            printf("(Depois do fork): PID = %u, PPID = %u\n", getpid(), getppid());

            if (wait(&stat) < 0)
            {
                perror("Ocorreu um erro enquanto o processo estava à espera que um processo filho terminasse.\n");
                return EXIT_FAILURE;
            }

            printf("Processo filho terminou:\n");

            if (WIFEXITED(stat) != 0)
            {
                printf("Estado de saída = (%d).\n", WEXITSTATUS(stat));
            }
            else
            {
                printf("O processo filho terminou de forma inesperada.\n");
            }
    }

    return EXIT_SUCCESS;
}
