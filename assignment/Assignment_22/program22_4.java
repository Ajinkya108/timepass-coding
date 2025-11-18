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

    public int CheckCountNumber(int iNo)
    {
        int iCnt = 0, iSum = 0;
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt]== iNo)
            {
                iSum++;
            }
        }
        return iSum;
    }

}
class program22_4
{
    public static void main(String A[])
    {
        int iValue = 0, iRes = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj1 = new ArrayX(iValue);

        aobj1.Accept();
        iRes = aobj1.CheckCountNumber(11);

        System.out.println("Frequency of 11 is : "+iRes);

        sobj = null;
        aobj1 = null;

        System.gc();
    }
}