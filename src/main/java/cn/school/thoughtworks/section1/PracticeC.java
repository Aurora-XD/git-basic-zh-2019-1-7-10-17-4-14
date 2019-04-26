package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> resultList = new ArrayList<>();
        for(Object key : collection2.keySet()){
            List<String> temp = collection2.get(key);
            collection1.forEach(obj -> {if(temp.contains(obj)){resultList.add(obj);}});
        }
        return resultList;
    }
}
