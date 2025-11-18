// Addition of two numbers
#include<stdio.h>

int Addition(int iValue1, int iValue2)
{
    int iAns=0;

    iAns = iValue1+iValue2;

    return iAns;
}


int main()
{
    int iFirst = 0, iSecond = 0;
    int iCal = 0;

    printf("Enter First Number :");
    scanf("%d",&iFirst);
    printf("Enter Second Number :");
    scanf("%d",&iSecond);

    iCal = Addition(iFirst,iSecond);

    printf("Addition of code is : %d",iCal);
}