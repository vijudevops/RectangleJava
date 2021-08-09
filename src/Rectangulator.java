public class Rectangulator{
    public static void mani(String[] args) {
        int lenth = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        Rectangle instanceRect = new Rectangle (length, width);
        String output = String.format(" ****Your Rectangle ***\n \nLenght: %d\n Width: %d \n Area: %d \n Perimeter: %d \n\n", instanceRect.Lenght, instanceRect.width, instanceRect.getArea, instanceRect.getPerimeter);

        System.out.println(output);
    }

}