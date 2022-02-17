#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>

int main() {
    int x0, y0, x1, y1, a, b, c;
    float d;
    char n1[20], n2[20];

    scanf("%s", n1);
    scanf("%i", &x0);
    scanf("%i", &y0);
    scanf("%s", n2);

    if (strcmp(n2, "P") == 0) {
        scanf("%i", &x1);
        scanf("%i", &y1);
        d = sqrt(pow(x1 - x0, 2) + pow(y1 - y0, 2));
    } 
        else {
            scanf("%i", &a);
            scanf("%i", &b);
            scanf("%i", &c);
            d = abs(a * x0 + b * y0 + c) / sqrt(pow(a,2) + pow(b,2));
        }

    printf("%.2f\n", d);

    return 0;
}