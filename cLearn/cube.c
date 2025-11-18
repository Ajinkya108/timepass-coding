#include<stdio.h>

int Cube(int iNo1)
{
    int iRes = 0;

    iRes = iNo1 * iNo1 * iNo1;

    return iRes;
}

int main()
{
    int iValue = 0;
    int iAns = 0;
    printf("Enter a Number : ");
    scanf("%d",&iValue);

    iAns = Cube(iValue);
    
    printf("Cube of Number is : %d", iAns);
    return 0;
}