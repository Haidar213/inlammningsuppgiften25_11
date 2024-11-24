public class main {

    public static void main(String[] args) {

        String text = "Hej\nJag gillar inte Djurgården\nMen däremot gillar jag Mff";;
        logikKlass logik = new logikKlass();

        //denna raden skapar mellanrum
         System.out.println();

        // detta är texten
        System.out.println(text);

        // denna raden skapar mellanrum
         System.out.println();

         logik.räknaTecken(text);
         logik.räknaRader(text);    }
         }
