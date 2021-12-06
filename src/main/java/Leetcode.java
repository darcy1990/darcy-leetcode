import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: Zhongming Yuan
 * @Date: 2021/8/24 6:41 下午
 */
public class Leetcode {

    public static void main(String[] args) throws IOException {
        TreeMap<Double, Integer> treeMap = new TreeMap<>(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o2 - o1 > 0 ? 1 : -1;
            }
        });
        String str = FileUtils.readFileToString(new File("/Users/yuanzhongming/Desktop/leetcode.txt"), "utf-8");
        JSONObject o = JSON.parseObject(str);
        JSONArray array = o.getJSONObject("data").getJSONArray("problemsetQuestionsDynamicInfos");
        for (int i = 0; i < array.size(); i++) {
            JSONObject k = JSON.parseObject(array.get(i).toString());
            treeMap.put(Double.parseDouble(k.get("freqBar").toString()), Integer.parseInt(k.get("questionId").toString()));
        }

        TreeMap<Integer, Double> ans = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1 > 0 ? -1 : 1;
            }
        });
        int c = 0;
        for (Map.Entry<Double, Integer> entry : treeMap.entrySet()) {
            Integer v = entry.getValue();
            if (v > 100000) {
                continue;
            }
            c ++;
            ans.put(v, entry.getKey());
            if (c > 500) {
                break;
            }
        }

        for (Map.Entry entry : ans.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
