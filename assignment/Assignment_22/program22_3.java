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

    public boolean CheckNumber(int iNo)
    {
        int iCnt = 0;
        boolean bFlag = false;
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt]== iNo)
            {
                bFlag = true;
            }
        }
        return bFlag;
    }

}
class program22_3
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRes = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj1 = new ArrayX(iValue);

        aobj1.Accept();
        bRes = aobj1.CheckNumber(11);

        if(bRes == true)
        {
            System.out.println("11 is present ");
        }
        else
        {
            System.out.println("11 is NOT present");
        }
        

        sobj = null;
        aobj1 = null;

        System.gc();
    }
}