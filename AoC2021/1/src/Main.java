import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Depth depth = new Depth();
        int result = depth.countMeters();
        System.out.println(result);
    }
}
