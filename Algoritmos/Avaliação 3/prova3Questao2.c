#include <stdio.h>
#include <math.h>

char operacao;
/*tipo_de_retorno nome_da_função (listagem de parâmetros) {
  instruções;
  retorno_da_função;
} */
int calculaValor(int a, int b){
  int res;
  
  if(operacao == 'S'){
    res = pow(a, 3) + (3 * pow(a, 2) * b) + (3 * a * pow(b, 2) + pow(b, 3));
  }
    else{
        res = pow(a, 3) - (3 * pow(a, 2) * b) + (3 * a * pow(b, 2) - pow(b, 3));
    }
  return res;
}

int main(void) {
  int v1, v2, resultado;
  
  printf("Digite S para soma ou D para diferença: \n");
  scanf(" %c", &operacao);
  printf("Digite o primeiro valor: \n");
  scanf("%d", &v1);
  printf("Digite o segundo valor: \n");
  scanf("%d", &v2);
  
  resultado = calculaValor(v1, v2); //chamada da função

  printf("O valor calculado foi = %d\n", resultado);

  return 0;
}