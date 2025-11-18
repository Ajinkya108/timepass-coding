#include<stdio.h>

int perimeterRectangle(int iLenght,int iWidth)
{
    int iAns = 0;
    
    iAns = 2 * ( iLenght + iWidth );

    return iAns;
}

int main()
{
    int iValue1 = 0, iValue2 = 0;
    int iCal;

    printf("Enter Lenght of Rectangle :");
    scanf("%d",&iValue1);
    printf("Enter Width of Rectangle :");
    scanf("%d",&iValue2);

    iCal = perimeterRectangle(iValue1,iValue2);

    printf("Perimeter of Rectangle is : %d",iCal);

    return 0;
}