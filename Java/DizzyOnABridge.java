public class DizzyOnABridge {
    public static void main(String[] args) {
        int bridgeSize = 15;
        int manPosition = (int) ((bridgeSize + 1) / 2);
        int dracula = 0;
        while (true) {
            double randomNumber = Math.random();
            if (randomNumber < 0.5) manPosition--;
            else manPosition++;

            for (int dvacula = 1; dvacula <= bridgeSize; dvacula++) {
                if (dvacula == manPosition) System.out.print("o");
                else System.out.print("-");
            }
            System.out.print("\n");

            if (manPosition < 1 || manPosition > bridgeSize) break;
            dracula++;
        }
        System.out.println("The man moved forward " + dracula + " times " +
                           "before falling off the bridge.");
    }
}
