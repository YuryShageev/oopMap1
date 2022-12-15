import java.util.HashMap;
import java.util.Map;

public class Methods {

    private Map<String, Integer> map = new HashMap<>();
    private String laptopName;
    private Integer cost;

    public Methods(String laptopName, Integer cost) {
        this.laptopName = laptopName;
        this.cost = cost;

    }



    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
