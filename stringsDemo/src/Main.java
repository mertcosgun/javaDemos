public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        String message2 = "Bugün hava çok güzel.";
        System.out.println(message);

        System.out.println("Character Count: " + message.length());

        System.out.println("Fifth character: " + message.charAt(4));

        System.out.println(message.concat(" Yaşasın!"));

        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("l."));

        char[] characters = new char[5];
        message.getChars(0, 4, characters, 0);

        System.out.println(characters);

        System.out.println(message.indexOf('a'));

        System.out.println(message.lastIndexOf('a'));

        System.out.println(message.replace(' ', '-'));

        System.out.println(message.substring(2, 5));

        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());

        System.out.println(message.toUpperCase());

        System.out.println(message2.trim());

    }
}