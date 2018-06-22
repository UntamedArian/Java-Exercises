/* 

Demonstrate the If Statment

Filename is kept as IfSample.java

*/

class IfSample 
{
    public static void main (String args[])
    {
        int x,y;
        x=10;
        y=20;

        if (x < y) System.out.println(" X is less than Y");

        x=x*2;
        
        if (x==y) System.out.println(" X is equivelent to Y");

        x=x*2;

        if (x > y) System.out.println(" X is now greater than Y");

        // the next piece won't display anything because x will never be equal to y

        if (x == y) System.out.println(" X is again equivelent to Y");
    }
}
