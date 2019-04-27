package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> resultMap = new HashMap<>();

        //统计collectionA中各个字符的个数
        for (String s : collectionA) {
            if(resultMap.containsKey(s)){
                resultMap.put(s,resultMap.get(s)+1);
            }
            else {
                resultMap.put(s,1);
            }
        }

        //选出与object中对应的元素，满三减一
        for (String value_resultMap_key : object.get("value")) {
            if(resultMap.containsKey(value_resultMap_key)){
                int temp = resultMap.get(value_resultMap_key)/3;
                resultMap.put(value_resultMap_key,resultMap.get(value_resultMap_key)-temp);
            }
        }
        return resultMap;
    }
}
