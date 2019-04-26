package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        //选出1集合中与2集合中相同的元素
        List<String> resultLsit = new ArrayList<String>();
        for(String element:collection1){
            if(collection2.contains(element)){
                resultLsit.add(element);
            }
        }
        return resultLsit;
    }
}
