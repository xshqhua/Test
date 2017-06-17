package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by qinghan on 2017/6/14.
 */
public class RegexMail {
    public static String filefath="./src/com/data/String.txt";
    public static String tarfilefath="./src/com/data/Str.txt";
    public String regexTel="^1[3-8]\\d{9}$";
    public String regexMail="\\w{2,}[.]?\\w+@\\w{2,}[.]((com)|(com.cn)|(edu.cn)|(zte.com.cn))";
    public Pattern p1=Pattern.compile(regexTel);
    public Pattern p2=Pattern.compile(regexMail);

    public static void main(String[] args){
        RegexMail rm=new RegexMail();
        rm.init();
    }
    public void init(){
        List<String> lines=new ArrayList<>();
        lines=readFile(filefath);

        lines=checkMailAndTel(lines);

        writeFile(lines,tarfilefath);
    }

    public List<String> checkMailAndTel(List<String> lines){
        List<String> tarStrings=new ArrayList<>();

        for(String line:lines){
            Matcher mT=p1.matcher(line);
            Matcher mE=p2.matcher(line);
//            System.out.println(line);
            if(mT.matches()){
//                System.out.println("true");
                line+="\t"+"Phone";
            }else if(mE.matches()){
//                System.out.println(false);
                line+="\t"+"Email";
            }else{
                line+="\t"+"false";
            }
            System.out.println(line);
            tarStrings.add(line);
        }

        return tarStrings;
    }

    //读文件
    public List<String> readFile(String filefath){
        List<String> lines=new ArrayList<>();
        try{
            FileReader fr=new FileReader(filefath);
            BufferedReader br=new BufferedReader(fr);
            String line="";
            while ((line=br.readLine())!=null){
                lines.add(line.trim());
            }
            br.close();
            fr.close();
        }catch(Exception e){
            System.out.println("文件内部错误");
            e.printStackTrace();
        }
        return lines;
    }

    //写文件
    public void writeFile(List<String> lines,String filefath){
        FileWriter fw;
        BufferedWriter bw;
        try{
            fw=new FileWriter(filefath);
            bw=new BufferedWriter(fw);

            for(String line:lines){
                   bw.write(line);
                   bw.newLine();
            }
            bw.close();
            fw.close();
            }catch(Exception e){
                e.printStackTrace();
            }
    }
}
