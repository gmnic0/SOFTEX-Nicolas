// apesar de usar a ferramenta SLEEP, não consegui ver o tempo correndo corretamente. 


#include <stdio.h>
#include <locale.h>
#include <windows.h>



 int main(){
    int i;
      
    
    for(i=10;i>0;i--){
        system("cls");
        printf("%d",i);
                  
    }
    
    system("cls");
    printf("BUUUUUM!");
     

     sleep(1000);

 }
