package msaairesl.domain;

import msaairesl.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Mileageincreased extends AbstractEvent {

    private Long id;
    private Integer mileage;
    private Long customerId;
}
