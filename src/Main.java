public class Main {
    public static void main(String[] args) {
        String poem = "Мишка косолапый\n" +
                "По лесу идёт,\n" +
                "Шишки собирает,\n" +
                "Песенки поёт.\n" +
                "Вдруг, упала шишка.\n" +
                "Прямо мишке в лоб…\n" +
                "Оступился Мишка\n" +
                "И об землю – хлоп!";

        String[] lines = poem.split("\n");

        for (String line : lines) {
            String[] words = line.split("\s");

            for (int j = 0; j < words.length; j++) {
                String word = words[j];

                if (j == words.length - 1) {
                    System.out.println(word);
                } else {
                    System.out.print(word + " ");
                }
            }
        }
    }
}
