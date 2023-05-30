#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <malloc.h>
#define true 1
#define false 0
void inizio(int,char **);
int fattoriale(int);
float somma_di_n(int);
int divIntera(float,float,char **);
int fibonacci(int);
float operazione(int,float,float);
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
char *menu = "(1) somma di due numeri\n(2) moltiplicazione di due numeri\n(3) divisione intera tra due numeri\n(4) elevamento a potenza\n(5) succesione di fibonacci\n(6) calcolo fattoriale di n\n(7) somma di n numeri";
char var2;
char var3;
#define var4 (char) "c"
#define var1 (int) (!((true && false)) || true)
int costante = 5;
#define setSize (int) (10 + costante)
// MAIN FUNCTION
int main(int argc, char** argv){
inizio(0,argv);
return (EXIT_SUCCESS);
}
void inizio(int boh,char **ciao){
float num1 = 0.0;
float num2 = 0.0;
int num = 0;
int op;
char *ans = "si";
char *size = "piccolo";
while(!strcmp(ans,"si")){
printf("%s","Scegli che operazione fare inserendo il numero corrispondente:\n");
printf("%s",menu);
printf("\n");
scanf("%d",&op);
if(((((op == 1) || (op == 2)) || (op == 3)) || (op == 4))){
printf("inserisci in primo numero ");
scanf("%f",&num1);
printf("inserisci il secondo numero ");
scanf("%f",&num2);
if((op == 3)){
printf("%s","il risultato e': ");
printf("%d",divIntera(num1,num2,&size));
printf("%s",concat(concat(", un numero ",size),"!"));
printf("\n");
}
else{
printf("%s","il risultato e': ");
printf("%f",operazione(op,num1,num2));
printf("\n");
}
}
else{
if(((op == 5) || (op == 6))){
printf("inserisci un numero intero positivo ");
scanf("%d",&num);
while((num < 0)){
printf("il numero deve essere positivo! Prova ad inserirlo di nuovo ");
scanf("%d",&num);
}
if((op == 5)){
printf("%s","il risultato e': ");
printf("%d",fibonacci(num));
printf("\n");
}
if((op == 6)){
printf("%s","il risultato e': ");
printf("%d",fattoriale(num));
printf("\n");
}
}
else{
if((op == 7)){
float risultato;
int n;
printf("quanti numeri vuoi inserire? ");
scanf("%d",&n);
risultato = somma_di_n(n);
printf("%s","il risultato e': ");
printf("%f",risultato);
printf("\n");
}
else{
printf("%s","hai inserito un numero sbagliato!");
printf("\n");
}
}
}
printf("vuoi continuare? (si/no)");
ans = malloc(256);
scanf("%s",ans);
}
printf("%s","Arrivederci :)");
}
int fattoriale(int n){
int result;
if((n == 0)){
return 1;
}
else{
result = (n * fattoriale((n - 1)));
return result;
}
}
float somma_di_n(int n){
float somma = 0.0;
while((n != 0)){
float num;
printf("inserisci un numero: ");
scanf("%f",&num);
somma = (somma + num);
n = (n - 1);
}
return somma;
}
int divIntera(float a,float b,char **size){
int result = (a / b);
if((result >= setSize)){
*size = "grande";
}
return result;
}
int fibonacci(int a){
int risultato = 0;
if((a == 0)){
return 0;
}
if((a == 1)){
return 1;
}
return (fibonacci((a - 1)) + fibonacci((a - 2)));
}
float operazione(int op,float a,float b){
if((op == 1)){
return (a + b);
}
if((op == 2)){
float result = 0.0;
while((a >= 1)){
a = (a - 1);
result = (result + b);
}
return (result + (a * b));
}
if((op == 4)){
return pow((float)(a), (float)(b));
}
}
