package msaairesl.domain;

import msaairesl.domain.*;
import msaairesl.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Mileageincreased extends AbstractEvent {

    private Long id;
    private Integer mileage;
    private Long customerId;
}


