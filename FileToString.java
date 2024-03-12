import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileToString {

    public String fileToString(String File) throws IOException {


        String paperContent = FileUtils.readFileToString(new File(File), "UTF-8");
        return paperContent;
    }
}
