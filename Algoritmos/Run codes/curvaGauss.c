#include <stdio.h>


int main (void){
    int posicao, i;
    float MAX = 0, v1[10], v2[10];

    for (i = 0; i < 10; i++){
        scanf("%f", &v1[i]);
    }
    for (i = 0; i < 10; i++){
        if (v1[i] > MAX) {
            MAX = v1[i];
            posicao = i;
        }

    }

    for (i = 0; i < 10; i++){
        if (v1[i] == MAX){
            v2[i] = 10;
        }
        else {
            v2[i] = v1[i] * (10.0/MAX);
        }
    }

    printf("%.1f\n", MAX);
    printf("%i\n", posicao);
    printf("%.3f\n", (10.0/MAX));
    printf ("Notas Originais | Notas Ajustadas\n");

    for (i = 0; i < 10; i++){
        printf("%.1f | %.1f\n", v1[i], v2[i]);
    }



    return 0;
}
