package easy._1436;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {

    public String destCity(List<List<String>> paths) {

        Map<String, String> map = paths.stream().collect(Collectors.toMap(p -> p.get(0), p -> p.get(1)));
        return map.values().stream().filter(v -> !map.containsKey(v)).findFirst().get();
    }
}