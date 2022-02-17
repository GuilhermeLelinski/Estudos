#include <stdio.h>
#include <stdbool.h>


bool primos(int nb){
    int mp = 0, j;

    if (nb == 0 || nb ==1){
        return false;
    }
    for (j = 2; j < nb; j++){
        if (nb % j ==0) {
            mp++;
        }
    }

    if (mp == 0){
        return true;
    }
    else  {
        return false;
    }
}



int main(void){
    int N1, N2, i;

    scanf("%i", &N1);
    scanf("%i", &N2);

    for (i = N1; i < N2; i++){
        if (primos(i) == true){
            printf("%i ", i);
        }
    }


    return 0;
}