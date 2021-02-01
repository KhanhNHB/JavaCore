import java.io.*;

class Result {
    /*
     * Complete the 'countingValleys' function below. The function is expected to
     * return an INTEGER. The function accepts following parameters: 1. INTEGER
     * steps 2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        return 0;
    }
}

public class CoutingVallery {

    public static void main(String[] args) throws IOException {
        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            // BufferedWriter bufferedWriter = new BufferedWriter(new
            // FileWriter(System.getenv("OUTPUT_PATH")));

            int steps = Integer.parseInt(bufferedReader.readLine().trim());
            System.out.println(steps);

            String path = bufferedReader.readLine();

            int result = Result.countingValleys(steps, path);
            ;
            // bufferedWriter.write(String.valueOf(result));
            // bufferedWriter.newLine();

            bufferedReader.close();
            // bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
