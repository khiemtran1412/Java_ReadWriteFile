package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public void writeToFile(List<User> list) {
        try {
            FileWriter fw = new FileWriter("data.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (User o : list) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        User u = new User("cao thi hong tham", 21, 10);
        User u1 = new User("tran van khiem", 21, 10);
        List<User> list = new ArrayList<>();
        list.add(u);
        list.add(u1);

        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
