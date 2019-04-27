package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> resultMap = collectionA;
        for (String value_A_key : object.get("value")) {
            if(resultMap.containsKey(value_A_key)){
                resultMap.put(value_A_key,resultMap.get(value_A_key)-1);
            }
        }
        return resultMap;
    }
}
