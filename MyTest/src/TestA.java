

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class TestA {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (!scanner.hasNext(",")||scanner.hasNextInt()){
            System.out.println("error");
            scanner.next();
        }

//        String []mytest=test.split(",");
//        for (int i = 0; i <mytest.length ; i++) {
//            System.out.println(mytest[i]);
//        }

//        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
//        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
//        try {
//            String s = bufferedReader.readLine();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
    @Test
    public void ScannerTest(){
        System.out.println("222");
    }

}
