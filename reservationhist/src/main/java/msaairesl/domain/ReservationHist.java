package msaairesl.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="ReservationHist_table")
@Data
public class ReservationHist {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long reservationId;
        private Long schduleId;
        private String reservationStatus;
        private String scheduleStatus;
        private Integer milieage;
        private Long customerId;
        private String eventType;


}
