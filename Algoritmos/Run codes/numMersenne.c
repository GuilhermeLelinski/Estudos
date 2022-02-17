#include <stdio.h>
#include <math.h>
#include <stdbool.h>


bool primo(int n) {
    int j, multiplica = 0;

    if (n == 0 || n == 1) {
        return false;
    }
    for (j = 2; j < n; j++){
        if (n % j == 0) {
            multiplica++;
        }
    }

    if (multiplica == 0) {
        return true;
    } 
        else {
            return false;
        }
}


int main(void) {
    int caso, i = 0, p = 0, x;
    
    scanf("%i", &caso);

    while (i < caso){
        if (primo(( pow(2, p)) - 1) == true) {
            x = pow(2, (p - 1))*(( pow(2, p)) - 1);
            printf("%i\n", x);
            i++;
        }
        p++;
    }

    return 0;
}