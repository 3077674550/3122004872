import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.text.similarity.*;

public class search {
    public static void main(String[] args) {
        try {
            // 读取待检测的论文内容
            String paperContent = FileUtils.readFileToString(new File("C:/Users/86157/Desktop/orig.txt"),"UTF-8");

            // 读取数据库中的论文内容
            String databaseContent = FileUtils.readFileToString(new File("C:/Users/86157/Desktop/orig_0.8_add.txt"), "UTF-8");

            // 预处理论文内容（例如去除标点符号、停用词等）
            String processedPaperContent = preprocess(paperContent);
            String processedDatabaseContent = preprocess(databaseContent);

            // 计算相似度
            double similarityScore = calculateSimilarity(processedPaperContent, processedDatabaseContent);
            System.out.println(similarityScore);
            // 判断是否抄袭
            if (similarityScore > 0.8) {
                System.out.println("chao zuo xian yi");
            } else {
                System.out.println("mei cao zuo xian yi");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String preprocess(String content) {
        // TODO: 实现论文内容的预处理操作
        return content;
    }

    private static double calculateSimilarity(String paperContent, String databaseContent) {
        // 使用余弦相似度计算相似度分数
        JaccardSimilarity js=new JaccardSimilarity();
        return js.apply(paperContent, databaseContent);
    }
}
