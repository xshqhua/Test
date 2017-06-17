package study;

import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * Created by qinghan on 2017/6/12.
 */
public class test1 {
    public static void main(String args[])
    {
        new test1().init();
    }

    public void init() {
        String filePath = "./text.txt";
        List<String> lines=new ArrayList<>();
        lines =readTxtFile(filePath);

        //Set set=new HashSet();
        Map<String,Integer> map=new HashMap();
        for (String line:lines) {
                  // System.out.println();
            String words[]=line.split(" ");
            for (int i = 0; i <words.length ; i++) {
                if(map.containsKey(words[i])){
                    map.put(words[i],map.get(words[i])+1);

                }
                else {
                    map.put(words[i],1);
                }
            }

        }
        List<String> wordss=new ArrayList<>();
        Iterator<Map.Entry<String,Integer>> iter=map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String,Integer> entry=iter.next();
            System.out.println(entry.getKey()+"\t"+entry.getValue());

            wordss.add(entry.getKey()+"\t"+entry.getValue());
        }

        writeTxtFile(wordss,"./target1");

    }

    //读文件
    public List<String> readTxtFile(String filePath) {
        //filePath="./text.txt";
        List<String> lines= new ArrayList<>();
        File file = new File(filePath);
        String line = "";
        int count = 0;//读取的行数
        try {
            if (file.isFile() && file.exists()) {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                while ((line = br.readLine()) != null) {
                    count++;//计算读取的行数
//                    System.out.println(line.trim());

                    //去任何非单词字符用空格替换，trim()函数是去掉String字符串的首尾空格
                    if(!line.equals("")){
                        String newline=line.replaceAll("\\W+"," ").trim();
                        lines.add(newline);
                    }
                    //
                }
                System.out.println("读取" + count + "行");
                br.close();
                fr.close();
            } else {
                System.out.println("找不到文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return lines;
    }

    //写文件
    public static void writeTxtFile(List<String> lines, String fileName) {
        File file = new File(fileName);
        try {
            if (file.isFile() && file.exists()) {
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                for (String line : lines) {
                    fileWriter.write(line);
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                fileWriter.close();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
