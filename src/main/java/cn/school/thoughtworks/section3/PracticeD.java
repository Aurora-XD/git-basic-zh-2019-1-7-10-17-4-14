package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> resultMap = new HashMap<>();

        //生成中间结果，该Map中的key为collectionA中的元素，value为对应元素出现的次数
        for (String s : collectionA) {
            //正常字符
            if (resultMap.containsKey(s)){
                resultMap.put(s,resultMap.get(s)+1);
            }
            else {
                resultMap.put(s,1);
            }
            //包含-的字符
            String[] s_Split = s.split("-");
            if(s_Split.length>1){
                if(resultMap.containsKey(s_Split[0])){
                    resultMap.put(s_Split[0],resultMap.get(s_Split[0])+Integer.parseInt(s_Split[1]));
                    resultMap.remove(s);
                }
                else {
                    resultMap.put(s_Split[0],Integer.parseInt(s_Split[1]));
                    resultMap.remove(s);
                }
            }
        }

        //选出与object中value字段对应的元素，满三减一
        for (String value_resultMap_key : object.get("value")) {
            if(resultMap.containsKey(value_resultMap_key)){
                int temp = resultMap.get(value_resultMap_key)/3;
                resultMap.put(value_resultMap_key,resultMap.get(value_resultMap_key)-temp);
            }
        }

        return resultMap;
    }
}
