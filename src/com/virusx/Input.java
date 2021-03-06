package com.virusx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Input {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    static List<Integer> spaceSeparatedListInt() throws IOException {
        return Stream.of(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
    }

    static int[] spaceSeparatedIntArray() throws IOException {
        List<Integer> list = Stream.of(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    static List<String> spaceSeparatedListString() throws IOException {
        return Stream.of(bufferedReader.readLine().split(" "))
                .collect(Collectors.toList());
    }

    static int singleInt() throws IOException {
        return Integer.parseInt(bufferedReader.readLine());
    }

    static String singleString() throws IOException {
        return bufferedReader.readLine();
    }
}
