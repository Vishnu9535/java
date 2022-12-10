#include<stdio.h>

void main()

{
    int a,b,result;
    char ch;
    
    printf("Enter the expression");
    scanf ("%d %c %d",&a,&ch,&b);
    
    switch(ch)
    {
        case '+':
            result= a+b;
            break;
        
        case '-':
            result= a-b;
            break;
            
        case '*':
            result= a*b;
            break;
            
        case '/':
            result= a/b;
            break;
            
        case '%':
            result= a%b;
            break;
        
    default:
        printf("Invalid choice");
        break;
    }
    printf("Result = %d",result);
}