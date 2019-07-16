public class MegaBytesConv {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        kiloBytes = 4000;
        if (kiloBytes <= 0){
            System.out.println("Invalid Value");
        } else if(kiloBytes > 0) {
            int megaByte = kiloBytes/1024;
            int remainder = kiloBytes%1024;
            System.out.println(kiloBytes+" MB = "+megaByte+" MB and "+remainder+" KB ");
        }

    }

}