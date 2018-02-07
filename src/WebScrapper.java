import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebScrapper {

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    //String text = urlToString("http://erdani.com/tdpl/hamlet.txt");
    // make a new function you would have to call it in one below

    // split string on key word and count how many splits  have to subtract 1 from string array split


    public static void main(String[] unused) {
        System.out.println("http://erdani.com/tdpl/hamlet.txt");
        String text = urlToString("http://erdani.com/tdpl/hamlet.txt");
        String[] words = text.split(" ");
        System.out.print(words.length - 1);
        //g
    }
}
