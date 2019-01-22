#include<stdio.h>
 
void Fibonacci(int);
 
int main()
{
   int n;
 
   scanf("%d",&n);
 
   printf("Fibonacci series\n");
 	Fibonacci(n);
   return 0;
}
 
void Fibonacci(int n)
{
   if ( n == 0 )
      printf("%d, " n);
   else if ( n == 1 )
      printf("%d, " n);
   else
      printf("%d, " Fibonacci(n-1) + Fibonacci(n-2) );
} 
