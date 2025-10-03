#include <stdio.h>

// Função para encontrar o valor máximo no array
int encontrarMaximo(int array[], int tamanho) {
    int maximo = array[0];
    for (int i = 1; i < tamanho; i++) {
        if (array[i] > maximo) {
            maximo = array[i];
        }
    }
    return maximo;
}

// Função para encontrar o valor mínimo no array
int encontrarMinimo(int array[], int tamanho) {
    int minimo = array[0];
    for (int i = 1; i < tamanho; i++) {
        if (array[i] < minimo) {
            minimo = array[i];
        }
    }
    return minimo;
}

// Função para calcular a média dos valores no array
double calcularMedia(int array[], int tamanho) {
    double soma = 0.0;
    for (int i = 0; i < tamanho; i++) {
        soma += array[i];
    }
    return soma / tamanho;
}

int main() {
    int valores[] = {10, 5, 7, 8, 12}; // Exemplo de array de valores
    int tamanho = sizeof(valores) / sizeof(valores[0]); // Calcula o tamanho do array

    // Chama as funções para encontrar o máximo, mínimo e média
    int maximo = encontrarMaximo(valores, tamanho);
    int minimo = encontrarMinimo(valores, tamanho);
    double media = calcularMedia(valores, tamanho);

    // Imprime os resultados
    printf("Valor máximo: %d\n", maximo);
    printf("Valor mínimo: %d\n", minimo);
    printf("Média: %.2f\n", media);

    return 0;
}
