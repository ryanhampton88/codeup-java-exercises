public class ServerNameGenerator {

    public static String[] adjectives = {"smart", "athletic", "clever", "fast", "slow", "quick", "confident", "shy", "stylish", "particular"};
    public static String[] nouns = {"building", "table", "computer", "floor", "door", "cup", "sign", "candy", "window", "watch"};

    public static String returnString(String[] array){
        int random = (int) (Math.random() * 10 - (1 + 1) + 1);
        return array[random];
    }

    public static void main(String[] args) {

        System.out.println("Here is your server name:");
        System.out.println(returnString(adjectives) + "-" + returnString(nouns));
    }

}
