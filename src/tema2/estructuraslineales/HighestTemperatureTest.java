package tema2.estructuraslineales;

import java.util.ArrayList;
import java.util.List;

public class HighestTemperatureTest {
    public static void main(String...args) {
        List<Integer> temperatures = new ArrayList<>();
        
        temperatures.add(21);
        temperatures.add(36);
        temperatures.add(21);
        temperatures.add(29);
        temperatures.add(37);
        
        HighestTemperatures.solve(temperatures);
        
    }
}
