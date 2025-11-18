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

    public int CheckAddressNumber(int iNo)
    {
        int iCnt = 0;
        for(iCnt = iSize-1; iCnt >= 0; iCnt--)
        {
            if(Arr[iCnt]== iNo)
            {
                return iCnt;
            }
        }
        return -1;
    }

}
class program23_3
{
    public static void main(String A[])
    {
        int iValue = 0, iNum = 0, iRes = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj1 = new ArrayX(iValue);

        aobj1.Accept();

        System.out.println("Enter the frequency : ");
        iNum = sobj.nextInt();

        iRes = aobj1.CheckAddressNumber(iNum);

        if(iRes == -1)
        {
            System.out.println(iNum+" is not present in list");
        }
        else
        {
            System.out.println(iNum+" is present in list at "+iRes+" location");
        }

        sobj = null;
        aobj1 = null;

        System.gc();
    }
}