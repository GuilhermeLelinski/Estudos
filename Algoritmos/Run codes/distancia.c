#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>


int main(){
    int a, b, c, x0, y0, x1, y1; 
    float distancia;
    char v1[20], v2[20];

    scanf("%s", v1);
    scanf("%i", &x0);
    scanf("%i", &y0);
    scanf("%s", v2);


    if (strcmp(v2, "PONTO") == 0){
        scanf("%i", &x1);
        scanf("%i", &y1);
        distancia = sqrt(pow(x1 -x0, 2) + pow(y1 - y0, 2));
    } 
    else {
        scanf("%i", &a);
        scanf("%i", &b);
        scanf("%i", &c);
        distancia = abs(a * x0 + b * y0 + c) / sqrt(pow(a,2) + pow(b,2));
    }


    printf("%.2f\n", distancia);



    return 0;
}