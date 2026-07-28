import java.util.*;
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }
            else{
                map.put(words[i],1);
            }
        }
        ArrayList<Map.Entry<String, Integer>> al=new ArrayList<>(map.entrySet());
        //Collections.sort(al,(a,b)-> b.getValue()-a.getValue());
        Collections.sort(al,(a,b)-> {
    if(b.getValue() != a.getValue()) {
        return b.getValue() - a.getValue();
    }
    else {
        return a.getKey().compareTo(b.getKey());
    }
});
        LinkedHashMap<String, Integer> sortedmap=new LinkedHashMap<>();
        for(Map.Entry<String, Integer>entry: al){
            sortedmap.put(entry.getKey(),entry.getValue());

        }
        ArrayList<String>als=new ArrayList<>();
        int count=0;
        for(Map.Entry<String, Integer> entry: sortedmap.entrySet()){
            if(k==count){
                break;
            }
            als.add(entry.getKey());
            count=count+1;
        }
return als;

    }
}