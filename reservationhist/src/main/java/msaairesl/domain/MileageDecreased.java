package msaairesl.domain;

import msaairesl.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class MileageDecreased extends AbstractEvent {

    private Long id;
    private Long customerId;
    private Integer mileage;
}
