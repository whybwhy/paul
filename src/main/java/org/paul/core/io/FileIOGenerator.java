package org.paul.core.io;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Component
public class FileIOGenerator {

    // Model 1
    @Deprecated
    public void io(String path) throws IOException {
        // TODO 파일 열기
        BufferedReader reader = new BufferedReader(new FileReader(path));

        String line = null;
        Map<String, Integer> map = new HashMap();

        // TODO 파일 읽기
        while((line = reader.readLine()) != null) {
            // TODO 데이터 프로세싱
            if (map.putIfAbsent(line, 1) != null)
                map.computeIfPresent(line, (k, v) -> v+1);
        }
        System.out.println(map);
        reader.close();

        // TODO 쓰기
        /**
         * Decorator 패턴을 중첩해서 사용
         * FileWriter​(File file, boolean append) -> 파일을 새로 만들지 갱신할지 사용하는 Flag
         */
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("")));
        writer.println(map);
        writer.close();
    }

    // Model2
    public boolean ioByTryCatchResource(String iPath, String oPath) {
        return this.ioByTryCatchResource(iPath, oPath, Boolean.FALSE);
    }

    // Model3
    public boolean ioByTryCatchResource(String iPath, String oPath, boolean isAppend) {

        String line = null;
        Map<String, Integer> map = new HashMap<>();

        try(
                BufferedReader reader = new BufferedReader(new FileReader(iPath))
        ) {
            while ((line = reader.readLine()) != null) {
                if (map.putIfAbsent(line, 1) != null) {
                    map.computeIfPresent(line, (k, v) -> v+1);
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }

        try(
                PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(oPath, isAppend)))
        ) {
            writer.println(map);
        } catch(Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

}
