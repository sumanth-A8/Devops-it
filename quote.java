import java.util.Random;

public class App {

    private static final String[] quotes = {
        "The only limit to our realization of tomorrow is our doubts of today. - Franklin D. Roosevelt",
        "In the end, we will remember not the words of our enemies, but the silence of our friends. - Martin Luther King Jr.",
        "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment. - Ralph Waldo Emerson",
        "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
        "Do not wait to strike till the iron is hot, but make it hot by striking. - William Butler Yeats",
        "Life is what happens when you're busy making other plans. - John Lennon"
    };

    public static String getRandomQuote() {
        Random random = new Random();
        int index = random.nextInt(quotes.length);
        return quotes[index];
    }

    public static void main(String[] args) {
        String randomQuote = getRandomQuote();
        System.out.println("Random Quote: " + randomQuote);
    }
}