package com.ekta.collections;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'compareFriends' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY frndsList as parameter.
     */

    public static List<String> compareFriends(List<String> frndsList) {

        List<String> output= new ArrayList<>();
            if(null!=frndsList && frndsList.size()>0){
                Iterator<String> itr= frndsList.iterator();
                
                while(itr.hasNext()){
                    String s = itr.next();
                    String[] a = s.split(",");
                    String s2 = a[1]+","+a[0];

                    for(int i=0;i<frndsList.size();i++){
                    	if(s.equalsIgnoreCase(itr.next().toString())){
                            continue;
                        }else{
                            output.add(s);
                        }	
                    }
                    
                    
                }
            }

return output;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int frndsListCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> frndsList = new ArrayList<>();/*IntStream.range(0, frndsListCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());*/

        frndsList.add("U1,U2");
        frndsList.add("U3,U4");
        frndsList.add("U2,U1");
        frndsList.add("U1,U5");
        
        List<String> result = Result.compareFriends(frndsList);

      /*  bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
