#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// Função para gerar aleatoriamente um número dentro da faixa especificada
int gerarNumero(int limite_inferior, int limite_superior) {
    return rand() % (limite_superior - limite_inferior + 1) + limite_inferior;
}

int main(int argc, char *argv[]) {
    if (argc != 3) {
        printf("Uso: %s limite_inferior limite_superior\n", argv[0]);
        return 1;
    }

    int limite_inferior = atoi(argv[1]);
    int limite_superior = atoi(argv[2]);

    if (limite_inferior >= limite_superior) {
        printf("Erro: limite_inferior deve ser menor que limite_superior.\n");
        return 1;
    }

    // Inicializa o gerador de números aleatórios com uma semente diferente a cada execução
    srand(time(NULL));

    int numero_aleatorio = gerarNumero(limite_inferior, limite_superior);
    int tentativa, num_tentativas = 0;

    printf("Adivinhe o número entre %d e %d:\n", limite_inferior, limite_superior);

    do {
        printf("Tentativa %d: ", num_tentativas + 1);
        scanf("%d", &tentativa);

        if (tentativa < numero_aleatorio) {
            printf("Mais alto!\n");
        } else if (tentativa > numero_aleatorio) {
            printf("Mais baixo!\n");
        }

        num_tentativas++;
    } while (tentativa != numero_aleatorio);

    printf("Parabéns! Você adivinhou o número %d em %d tentativas.\n", numero_aleatorio, num_tentativas);

    return 0;
}
