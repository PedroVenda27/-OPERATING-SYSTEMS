#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main(int argc, char *argv[])
{
    int stat;

    printf("(Antes do fork): PID = %u, PPID = %u\n", getpid(), getppid()); // Dá Print aos IDS( getpid() "Atual" e  getppid() "Pai") ID uma vez Pelo Processo Pai  (+1)

    switch (fork()) //  entra Numm Switch  e Gera Processo Filho

    {
        case -1:
            perror("Erro no fork.\n");  // Erro
            return EXIT_FAILURE;
        case 0:
            if (execl("/bin/ls", "ls", "-la", NULL) < 0) // Corre outro Programa "/bin/ls"
            { 
                perror("Erro a criar processo.\n");  // Erro
                return EXIT_FAILURE;
            }

            printf("Done.");  // Nunca Vai Chegar Aqui pois ou muda de Programa ou da Erro
            break;  
            
        default:
            printf("(Depois do fork): PID = %u, PPID = %u\n", getpid(), getppid()); // Dá Print aos IDS( getpid() "Atual" e  getppid() "Pai") ID uma vez Pelo Filho (+1)

            if (wait(&stat) < 0)  // Espera que Processo Filho Acabe
            {
                perror("Ocorreu um erro enquanto o processo estava à espera que um processo filho terminasse.\n");
                return EXIT_FAILURE; // Erro
            }

            printf("Processo filho terminou:\n"); // Dá Print da Mensagem

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
