package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        //选出1集合中与2集合中子数组的元素相同的元素
        List<String> resultList = new ArrayList<String>();
        for (List<String> strings : collection2) {
            collection1.forEach(obj -> {if(strings.contains(obj)){ resultList.add(obj);}});
        }
        return resultList;
    }
}
