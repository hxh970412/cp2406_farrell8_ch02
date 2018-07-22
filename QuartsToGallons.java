public class QuartsToGallons
{
    public static void main (String[] args)
    {
        final int QUARTS_IN_GALON = 4;
        int QuartsNeeded = 18;
        int GallonsNeeded;
        int ExtraQuartsNeeded;
        GallonsNeeded = QuartsNeeded / QUARTS_IN_GALON;
        ExtraQuartsNeeded = QuartsNeeded % QUARTS_IN_GALON;
        System.out.println("A job needs " + QuartsNeeded + " quarts requires " + GallonsNeeded +
                " gallons plus " + ExtraQuartsNeeded + " quarts.");
    }
}
