package ie.atu.classtestwarehouseservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Warehouses {
    @JsonProperty("warehouseId")
    private int warehouseId;
    @JsonProperty("location")
    private String location;
    @JsonProperty("capacity")
    private int capacity;
}
