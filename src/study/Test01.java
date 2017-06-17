package study;

import java.awt.geom.Line2D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

/**
 * Created by qinghan on 2017/6/9.
 */
public class Test01{
    public static void main(String [] args){
        new Test01().init();

//        System.out.println("TT");
    }

    public void init(){
        String fileName = "./text.txt";
        List<String> lines = new ArrayList<>();
        lines=readFile(fileName);

        Set set=new HashSet();
        for (String line:lines) {
//            System.out.println(line);

            String[] words=line.split(" ");

            for (int i = 0; i < words.length; i++) {
                set.add(words[i]);
            }
        }

        Map<String,Integer> map = new HashMap();
//        Iterator<String> iterator=set.iterator();
//        int i=0;
//        while(iterator.hasNext()){
//            String tep =iterator.next();
//            map.put(tep,0);
//
//
//            System.out.print(tep);
//            System.out.print(" ");
//            i++;
//            if (i>=10){
//                System.out.println();
//                i=0;
//            }
//
//
//        }



        for (String line:lines) {
//            System.out.println(line);

            String[] words=line.split(" ");

            for (int j = 0; j < words.length; j++) {
//                set.add(words[i]);
                if(map.containsKey(words[j])){
                    map.put(words[j], map.get(words[j]) + 1);
                }else{
//                    ?
                    map.put(words[j],1);
                }


            }

//





        }

        List<String> wordsFreq =  new ArrayList<>();
        Iterator<Map.Entry<String,Integer>> iterator1 = map.entrySet().iterator();
        while(iterator1.hasNext()){
            Map.Entry<String,Integer> entry = iterator1.next();
            System.out.println(entry.getKey()+"\t"+entry.getValue());
            wordsFreq.add(entry.getKey()+"\t"+entry.getValue());

        }


        writeFile(wordsFreq,"./target");




    }
    public void splitString(){
        String fileName = "./text.txt";
        List<String> lines = new ArrayList<>();
        lines=readFile(fileName);
        for (String line:lines) {
            System.out.println(line);

            String[] words=line.split(" ");
            String str="";
            for (int i = 0; i <words.length ; i++) {
                // System.out.printf(" "+(i+1)+": "+words[i]);
                str=str+(i+1)+": "+words[i]+" ";
            }
            str=str.trim();
//            System.out.println(str);
        }
    }
    public List readFile(String fileName){
        List<String> lines = new ArrayList<>();
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while((line=br.readLine())!=null){
                //line = line.trim();
//                System.out.println(line);
                if(!line.equals("")){
                   String newline= line.replaceAll("\\W+"," ").trim();
                    lines.add(newline);
                }
            }
            br.close();
            fr.close();
        }catch (Exception e){

        }

        return lines;


    }
    public void writeFile(List<String> lines,String fileName){
//        List<String> lines = new ArrayList<>();
        try{
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            String line = "";

            for (String line:lines){
                bufferedWriter.write(line);
                bufferedWriter.newLine();

            }
//
//            while((line=bufferedWriter.write())!=null){
//                //line = line.trim();
////                System.out.println(line);
//                if(!line.equals("")){
//                    String newline= line.replaceAll("\\W+"," ").trim();
//                    lines.add(newline);
//                }
//            }
            bufferedWriter.close();
            fileWriter.close();
        }catch (Exception e){

        }

//        return lines;


    }

}
