public class LineComparison
{
    public static void main(String[] args)
    {
        int x1=3,x2=5,y1=2,y2=6;
        Double LENGTH_OF_FIRST_LINE = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        int x3=3,x4=5,y3=2,y4=6;
        Double LENGTH_OF_SECOND_LINE = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.printf("Length of First Line is :: %.2f \n",LENGTH_OF_FIRST_LINE);
        System.out.printf("Length of Second Line is :: %.2f \n",LENGTH_OF_SECOND_LINE);

        if (LENGTH_OF_FIRST_LINE.equals(LENGTH_OF_SECOND_LINE) )
        {
            System.out.println("Lines Are Equal");
        }
        else
        {
            System.out.println("Lines are not equal");
        }
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
}

