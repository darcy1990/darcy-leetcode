package com.mucang;

import com.google.common.collect.Lists;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {
        List<String> lines = FileUtils.readLines(new File("/Users/yuanzhongming/Desktop/deleteTopicIds.txt"), "utf-8");
        List<String> ret = Lists.newArrayList();
        for (String line : lines) {
            ret.add("https://www.jiakaobaodian.com/bbs/topic/" + line + ".html");
        }
        FileUtils.writeLines(new File("/Users/yuanzhongming/Desktop/output.txt"), ret);
    }
}
