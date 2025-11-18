//Area of circle
#include<stdio.h>

int AreaCircle(int iValue)
{
    float pi = 3.14, fCircle = 0.0f;

    fCircle = pi * iValue * iValue;
    printf("%f",fCircle);
    return fCircle;
}

int main()
{
    int iRed = 0;
    float fArea = 0.0f;
    
    printf("Enter the redius :");
    scanf("%d",&iRed);

    fArea = AreaCircle(iRed);

    printf("%d redius of Area of Circle is : %f",iRed, fArea);

    return 0;
}