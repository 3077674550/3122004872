
import java.io.IOException;
import java.util.Scanner;

import com.example.demo.calculateSimilarity;
import com.example.demo.preprocess;


public class search {
    public static void main(String[] args) {
        try {
            // 读取待检测的论文内容
            System.out.println("请输入文件路径");
            Scanner sc=new Scanner(System.in);
            String paperContents= sc.next();

            System.out.println("请输入查重文件路径");
            String databaseContents=sc.next();

            FileToString file=new FileToString();

            String paperContent=file.fileToString(paperContents);
            String databaseContent= file.fileToString(databaseContents);
            // 读取数据库中的论文内容


            preprocess Preprocess = new preprocess();
            calculateSimilarity CalculateSimilarity=new calculateSimilarity();
            // 预处理论文内容（例如去除标点符号、停用词等）
            String processedPaperContent = Preprocess.preprocess(paperContent);
            String processedDatabaseContent = Preprocess.preprocess(databaseContent);

            // 计算相似度
            double similarityScore = CalculateSimilarity.CalculateSimilarity(processedPaperContent, processedDatabaseContent);

            System.out.println(similarityScore);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


