public class Strings {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel";
        System.out.println(message);
        System.out.println("Eleman Sayısı : " + message.length());
        System.out.println("5. Eleman : " + message.charAt(4));
        System.out.println(message.concat(" yaşasın"));
        System.out.println(message.startsWith("Bugün"));
        System.out.println(message.endsWith("güzel"));
        char[] karakterler = new char[5];
        message.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("a"));
        System.out.println(message.replace(" ", "-"));
        System.out.println(message.substring(2,5));
        for (String kelime : message.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }

}
