// Area of Sqaure
#include<stdio.h>

int Square(int iLenght)
{
    int iAns = 0;
    iAns = iLenght*iLenght;
    
    return iAns;
}

int main()
{
    int iValue = 2;
    int iRes = 0;

    printf("Enter the Number to Squared : ");
    scanf("%d",&iValue);

    iRes = Square(iValue);
    
    printf("Square of %d is %d",iValue , iRes );
    return 0;
}