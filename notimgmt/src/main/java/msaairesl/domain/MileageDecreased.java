package msaairesl.domain;

import msaairesl.domain.*;
import msaairesl.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class MileageDecreased extends AbstractEvent {

    private Long id;
    private Long customerId;
    private Integer mileage;
}


