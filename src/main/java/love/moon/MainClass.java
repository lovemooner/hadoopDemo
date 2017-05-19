package love.moon;

import org.apache.commons.lang.ArrayUtils;

import java.util.StringTokenizer;

/**
 * User: lovemooner
 * Date: 17-3-29
 * Time: 上午10:56
 */
public class MainClass {

    public static void main(String[] args) {
        String line = "Hello World Bye World";
        StringTokenizer tokenizer = new StringTokenizer(line);
        while (tokenizer.hasMoreTokens()) {
            System.out.println("map--word:" + tokenizer.nextToken());
        }
    }
}
