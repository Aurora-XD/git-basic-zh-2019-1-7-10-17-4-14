package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> resultMap = new HashMap<>();

        for (String s : collection1) {

            //正常字符添加到resultMap中
            if(resultMap.containsKey(s)){
                resultMap.put(s,resultMap.get(s)+1);
            }
            else{
                resultMap.put(s,1);
            }

            /**特殊字符经过处理后添加到resultMap中，具体处理方法为：
             * step1：拆分字符串
             * step2：将特殊字符表示的数据数量添加到resultMap中，注意首次出现和非首次出现情况
             */
            String[] temp = s.split("-|:|\\[|\\]");
            if(temp.length>1){
                if (resultMap.containsKey(temp[0])) {
                    resultMap.put(temp[0], resultMap.get(temp[0]) + Integer.parseInt(temp[1]));
                    resultMap.remove(s);
                }
                else {
                    resultMap.put(temp[0], Integer.parseInt(temp[1]));
                    resultMap.remove(s);
                }
            }
        }

        return resultMap;
    }
}
