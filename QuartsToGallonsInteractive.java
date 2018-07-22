import java.util.Scanner;
public class QuartsToGallonsInteractive {
    public static void main(String[] args)
    {
        final int QUARTS_IN_GALON = 4;
        int QuartsNeeded = 18;
        int GallonsNeeded;
        int ExtraQuartsNeeded;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter quarts needed >>>");
        QuartsNeeded = input.nextInt();
        GallonsNeeded = QuartsNeeded / QUARTS_IN_GALON;
        ExtraQuartsNeeded = QuartsNeeded % QUARTS_IN_GALON;
        System.out.println("A job that needs " + QuartsNeeded + " quarts requires " + GallonsNeeded +
        " galons plus " + ExtraQuartsNeeded + " quarts.");
    }
}
