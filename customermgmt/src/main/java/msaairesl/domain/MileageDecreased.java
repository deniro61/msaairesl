package msaairesl.domain;

import msaairesl.domain.*;
import msaairesl.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class MileageDecreased extends AbstractEvent {

    private Long id;
    private Long customerId;
    private Integer mileage;

    public MileageDecreased(Mileage aggregate){
        super(aggregate);
    }
    public MileageDecreased(){
        super();
    }
}
