#include <stdio.h>
#include <string.h>

int main (void){
    int kwh;
    char bandeira[11];

    //printf("\n Digite o consumo mensal de energia elétrica em Kwh: ");
    scanf("%i", &kwh);
    //printf("\n Digite a bandeira (VERDE, AMARELA, VERMELHA 1, VERMELHA 2");
    scanf(" %99[^\n]", bandeira);

    if (strcmp(bandeira, "VERDE") == 0){
        printf("%.2f\n", (kwh * .45));
        printf("VERDE\n");    
    } 
    if (strcmp(bandeira, "AMARELA") == 0){
        printf("%.2f\n", (kwh * .45 + 4.5));
        printf("AMARELA\n");
    } 
    if (strcmp(bandeira, "VERMELHA 1") == 0){
        printf("%.2f\n", (kwh * .45 + 9.0));
        printf("VERMELHA 1\n");
    } 
    if (strcmp(bandeira, "VERMELHA 2") == 0){
        printf("%.2f\n", (kwh * .45 + 13.5));
        printf("VERMELHA 2\n");
    }


    return 0;
}