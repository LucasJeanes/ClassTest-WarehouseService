package ie.atu.classtestwarehouseservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {

    @PostMapping("/addWarehouse")
    public Warehouses addWarehouse(@RequestBody Warehouses warehouses) {
        return warehouses;
    }
    @PostMapping("/capacity")
    public boolean capacityCheck(Warehouses warehouses) {
        if(warehouses.getCapacity() > 0) {
            return true;
        }
        else {return false;}
    }
}
