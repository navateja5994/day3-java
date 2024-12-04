class bitwise
{
    public static void main(String args[])
    {
        int a=54;
        int pos=2;
        if((a&(1<<pos))!=0)
        {
            System.out.println("SET BIT");
        }
        else
        {
            System.out.println("NOT A SET BIT");
        }
    }
}      