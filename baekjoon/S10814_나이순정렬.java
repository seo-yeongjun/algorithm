package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10814
public class S10814_나이순정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        Age[] ages = new Age[num];
        StringTokenizer st;
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            ages[i] = new Age(Integer.parseInt(st.nextToken()), st.nextToken());
        }
        Arrays.sort(ages, (x, y) -> {
            if (x.age == y.age)
                return 0;
            else
                return x.age - y.age;
        });
       for(Age a : ages){
          bw.write(a.age+" "+a.name+"\n");
       }
       bw.flush();
       br.close();
       bw.close();
    }

    static class Age {
        int age;
        String name;

        Age(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

}
