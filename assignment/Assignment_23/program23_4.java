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

        System.out.println("Elements in range are :");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            
        }
    }

    public int Range(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            
        }
    }

}
class program23_3
{
    public static void main(String A[])
    {
        int iValue = 0, iNum1 = 0, iNum2 = 0 iRes = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj1 = new ArrayX(iValue);

        aobj1.Accept();

        System.out.println("Enter the Strating number : ");
        iNum1 = sobj.nextInt();
        System.out.println("Enter the Ending number : ");
        iNum2 = sobj.nextInt();

        iRes = aobj1.Range(iNum1, iNum2);

        

        sobj = null;
        aobj1 = null;

        System.gc();
    }
}