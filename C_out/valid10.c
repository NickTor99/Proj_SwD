#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <malloc.h>
#define true 1
#define false 0
void esercizio();
void stampa(char *);
float sommac(int,int,float,char **);
char* intToString(int var){
char *int_str = malloc(256) ;
sprintf(int_str, "%d", var);
return int_str;
}
char* doubleToString(double var){
char *double_str= malloc(256);
sprintf(double_str, "%f", var);
return double_str;
}
char* boolToString(int var){
if(var == 1){
return "true";
}
if(var == 0){
return "false";
}
return "";
}
char* concat(char *s1, char* i) {
char* s = malloc(256);
sprintf(s, "%s%s", s1, i);
return s;
}
int c = 1;
// MAIN FUNCTION
int main(int argc, char** argv){
esercizio();
return (EXIT_SUCCESS);
}
void esercizio(){
int c = 2;
float risultato;
int ans = 0;
char *taglia = "";
float b;
int a;
int x;
a = 3;
b = 2.2;
x = 1;
printf("%d",c);
printf("\n");
risultato = sommac(a,x,b,&taglia);
stampa("la somma  incrementata  è ");
printf("%s",taglia);
printf("\n");
stampa(" ed è pari a ");
printf("%f",risultato);
printf("\n");
printf("%s","vuoi continuare? (1/si 0/no)");
printf("\n");
scanf("%d",&ans);
while((ans == 1)){
printf("inserisci un intero:");
scanf("%d",&a);
printf("inserisci un reale:");
scanf("%f",&b);
risultato = sommac(a,x,b,&taglia);
stampa("la somma  incrementata  è ");
printf("%s",taglia);
printf("\n");
stampa(" ed è pari a ");
printf("%f",risultato);
printf("\n");
printf("vuoi continuare? (1/si 0/no):");
scanf("%d",&ans);
}
printf("%s","");
printf("\n");
printf("%s","ciao");
}
void stampa(char *messaggio){
int i;
int a;
int x;
for(x = 4;x <= 1;x++){
printf("%s","");
printf("\n");
}
printf("%s",messaggio);
printf("\n");
}
float sommac(int a,int d,float b,char **size){
float result;
result = (((a + b) + c) + d);
if((result > 100)){
char *valore = "grande";
*size = valore;
}
else{
char *valore = "piccola";
*size = valore;
}
return result;
}
