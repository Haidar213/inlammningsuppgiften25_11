public class logikKlass {


        public void räknaTecken(String text) {
        int tecken = text.replaceAll("\n", "").length();
        System.out.println("Antal tecken: " + tecken );
    }


        public void räknaRader(String text) {
        int rader = text.split("\n").length;
        System.out.println(rader + " rader i utskivna texten");
    }
}
