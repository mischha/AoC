import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class Depth {

    public int countMeters() throws IOException {
        List<String> list = Files.readAllLines(new File("imput.txt").toPath(), Charset.defaultCharset() );

        List<Integer> intList = list.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        int count = 0;
        for(int n = 0; n < intList.size() - 3; n++){
            if(intList.get(n)+ intList.get(n+1) + intList.get(n+2) < intList.get(n+1) + intList.get(n+2) + intList.get(n+3)){
                count++;
            }
        }
        return count;
    }

}
