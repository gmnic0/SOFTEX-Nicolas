//projeto
//Faça uma função calculadora que os números e as operações serão feitas pelo usuário. O código deve ficar rodando infinitamente até que o usuário escolha a opção de sair. No início, o programa mostrará a seguinte lista de operações:
//1: Soma
//2: Subtração
//3: Multiplicação
//4: Divisão
//0: Sair

//Digite o número para a operação correspondente e caso o usuário introduza qualquer outro, o sistema deve mostrar a mensagem “Essa opção não existe” e voltar ao menu de opções.

//Após a seleção, o sistema deve pedir para o usuário inserir o primeiro e segundo valor, um de cada. Depois precisa executar a operação e mostrar o resultado na tela. Quando o usuário escolher a opção “Sair”, o sistema irá parar. 

//É necessário que o sistema mostre as opções sempre que finalizar uma operação e mostrar o resultado. 

#include <stdio.h>

 
int main(){

float num1,num2, resultado;
int operador, i=0;

while (i<1){

printf ("digite numero: ");
scanf("%f", &num1);

printf ("digite numero: ");
scanf("%f", &num2);


printf ("                 digite operador\n 1.soma  2.subtracao  3.multiplicacao  4.divisao  0.Encerrar\n");
scanf("%d", &operador);

switch (operador){
    case 1:
    resultado=num1+num2;
    break;
    case 2:
    resultado=num1-num2;
    break;
    case 3:
    resultado=(num1*num2);
    break;
    case 4:
    
     if (num2==0){
        printf("operacao invalida");
     }
     else{
        resultado=num1/num2;
     }
    break;
    case 0:
    i=1;
    printf("calculadora encerrada");
    break;
    default:
    resultado=0;
    break;
}


printf ("\n         %f\n\n", resultado);
}

}
