public class Rectangulator{
    public static void main(String[] args) {
        int lenth = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        Rectangle instanceRect = new Rectangle (lenth, width);
        String output = String.format(" ****Your Rectangle ***\n \nLength: %d\n Width: %d \n Area: %d \n Perimeter: %d \n\n", instanceRect.length, instanceRect.width, instanceRect.getArea(), instanceRect.getPerimeter());

        System.out.println(output);
    }

}