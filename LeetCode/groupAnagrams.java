import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] unsortedArr = strs.clone();
        ArrayList<String> list;
        HashMap<String, ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        int i = 0;
        while (i < strs.length) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            strs[i++] = String.copyValueOf(charArr);
        }
        i = 0;
        while (i < strs.length) {
            list = new ArrayList<>();
            if (!map.containsKey(strs[i])) {
                list.add(unsortedArr[i]);
                map.put(strs[i], list);
            } else {
                list = map.get(strs[i]);
                list.add(unsortedArr[i]);
                map.replace(strs[i], list);
            }
            i++;
        }
        Collection<ArrayList<String>> collection = map.values();
        List<List<String>> resultList = new ArrayList<>();
        for (ArrayList<String> arrayList : collection) {
            List<String> innerList = new ArrayList<>();
            innerList.addAll(arrayList);
            resultList.add(innerList);
        }
        return resultList;
    }
}