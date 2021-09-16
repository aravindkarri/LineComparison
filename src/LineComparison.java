public class LineComparison
{
    public void equalsMethod(Double LENGTH_OF_FIRST_LINE,Double LENGTH_OF_SECOND_LINE)
    {
        if (LENGTH_OF_FIRST_LINE.equals(LENGTH_OF_SECOND_LINE) )
        {
            System.out.println("Lines Are Equal");
        }
        else
        {
            System.out.println("Lines are not equal");
        }
    }
    public void compareToMethod(Double LENGTH_OF_FIRST_LINE,Double LENGTH_OF_SECOND_LINE)
    {
        int compare = LENGTH_OF_FIRST_LINE.compareTo(LENGTH_OF_SECOND_LINE);
        if ( compare == 0)
        {
            System.out.println("The Two Line are equal");
        }
        else if(compare < 0)
        {
            System.out.println("Line 2 is greater than Line 1 ");
        }
        else
        {
            System.out.println("Line 1 is greater than Line 2");
        }
    }
    public static double lengthOfLine(int x1,int y1,int x2,int y2)
    {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }
    public static void main(String[] args)
    {
        Double LENGTH_OF_FIRST_LINE = lengthOfLine(2,5,6,10);
        Double LENGTH_OF_SECOND_LINE = lengthOfLine(4,7,2,9);
        System.out.printf("Length of First Line is :: %.2f \n",LENGTH_OF_FIRST_LINE);
        System.out.printf("Length of Second Line is :: %.2f \n",LENGTH_OF_SECOND_LINE);
        LineComparison obj = new LineComparison();
        obj.equalsMethod(LENGTH_OF_FIRST_LINE,LENGTH_OF_SECOND_LINE);
        obj.compareToMethod(LENGTH_OF_FIRST_LINE,LENGTH_OF_SECOND_LINE);
    }
}

