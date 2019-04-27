package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> resultMap = collectionA;
        for (String value_A_key : object.get("value")) {
            if(resultMap.containsKey(value_A_key)){
                int temp = resultMap.get(value_A_key)/3;
                resultMap.put(value_A_key,resultMap.get(value_A_key)-temp);
            }
        }
        return resultMap;
    }
}
