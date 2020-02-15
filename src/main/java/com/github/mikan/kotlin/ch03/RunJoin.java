package com.github.mikan.kotlin.ch03;

import com.github.mikan.kotlin.ch03.strings.JoinKt;

import java.util.Arrays;
import java.util.List;

/**
 * P66
 */
public class RunJoin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        String joined = JoinKt.joinToString(list, ", ", "", "");
        System.out.println(joined);
    }
}

// Result:
// 1, 2, 3
