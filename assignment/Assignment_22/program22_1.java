import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize = 0;

    public ArrayX(int iNo)
    {
        System.out.println("Inside");

        iSize = iNo;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;
        System.out.println("Enter the element of Array :");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt(); 
        }
    }

    public void Display()
    {
        int iCnt = 0;
        System.out.println("Elements of array are :");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public int DisplayEven()
    {
        int iCnt = 0, iValue = 0;
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt]%2 == 0)
            {
                iValue++;
            }
        }
        return iValue;
    }
}
class program22_1
{
    public static void main(String A[])
    {
        int iValue = 0, iEven = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj1 = new ArrayX(iValue);

        aobj1.Accept();
        iEven = aobj1.DisplayEven();
        System.out.println("Count of even numbers is : "+iEven);

        sobj = null;
        aobj1 = null;

        System.gc();
    }
}