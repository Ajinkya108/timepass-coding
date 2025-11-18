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

    public int DisplayDiffrance()
    {
        int iCnt = 0, iEven = 0, iOdd = 0, iCal = 0;
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt]%2 == 0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }
        return iEven-iOdd;
    }

}
class program22_2
{
    public static void main(String A[])
    {
        int iValue = 0, iDiff = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj1 = new ArrayX(iValue);

        aobj1.Accept();
        iDiff = aobj1.DisplayDiffrance();

        if(iDiff < 0)
        {
            iDiff = -iDiff;
        }

        System.out.println("Diffrance between Frequency of even and odd number is : "+iDiff);

        sobj = null;
        aobj1 = null;

        System.gc();
    }
}