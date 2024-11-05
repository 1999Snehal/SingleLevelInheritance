

class Shape1
{
    public  void  area()
    {

        System.out.println("Displays area");
    }
}
  class Triangle extends Shape1
{
    public  void area(int l, int h)
    {
        l = 4;
        h = 3;
        System.out.println(1/2*l*h);
    }
}
public  class Main
{
    public static void main(String args[])
    {

    }
}