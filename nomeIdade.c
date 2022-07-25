//Instruções do projeto
//Desenvolva um programa que recebe do usuário nome 
//completo e ano de nascimento que seja entre 1922 e 2021. A partir dessas informações, o sistema mostrará o nome do usuário e a idade que completou, ou completará, no ano atual (2022).
//Caso o usuário não digite um número ou apareça um inválido no campo do ano, o sistema informará o erro e continuará perguntando até que um valor correto seja preenchido.
//Trabalhe esse código em seu IDE, suba ele para sua conta no GitHub e compartilhe o link desse projeto no campo ao lado para que outros desenvolvedores possam analisá-lo.Instruções do projeto
//Desenvolva um programa que recebe do usuário nome completo e ano de nascimento que seja entre 1922 e 2021. A partir dessas informações, o sistema mostrará o nome do usuário e a idade que completou, ou completará, no ano atual (2022).

//Caso o usuário não digite um número ou apareça um inválido no campo do ano, o sistema informará o erro e continuará perguntando até que um valor correto seja preenchido.

//Trabalhe esse código em seu IDE, suba ele para sua conta no GitHub e compartilhe o link desse projeto no campo ao lado para que outros desenvolvedores possam analisá-lo.


#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>


int main(){
int dia,mes,ano, idade;
char nome[50];
struct tm *data_atual;
time_t segundos;
time (&segundos);
data_atual= localtime(&segundos);

printf("inserir nome: ");
fgets(nome,50,stdin);
printf("inserir dia de aniversario: ");
scanf("%d", &dia);
printf("inserir mes de aniversario: ");
scanf("%d", &mes);
inicio:
printf("inserir ano de aniversario: ");
scanf("%d", &ano);
  
  if (ano>=2021 || ano<=1922){
    printf("ano invalido, inserir novamente\n");
    goto inicio;
    }
    else {
    idade=(data_atual->tm_year+1900-ano);
   }

 if (mes<=data_atual->tm_mon+1){
   if(dia<=data_atual->tm_mday){
      printf("\n %s fez %d anos",nome, idade);
   }
  }

         else{
             printf("%s farah %d anos",nome, idade);
         }
       
    }





// http://linguagemc.com.br/exibindo-data-e-hora-com-time-h/
//https://www.youtube.com/watch?v=eTwXo5i-Ygc
//https://www.youtube.com/watch?v=dBUeYxctdQ8&t=159s
