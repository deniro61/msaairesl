package msaairesl.domain;

import msaairesl.domain.ReservationCreated;
import msaairesl.domain.ReservationCancelled;
import msaairesl.ReservationmgmtApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Reservation_table")
@Data

public class Reservation  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long reservationId;
    
    
    
    
    
    private Long customerId;
    
    
    
    
    
    private Integer peopleNo;
    
    
    
    
    
    private Integer mileageToIncrease;
    
    
    
    
    
    private Long scheduleId;

    @PostPersist
    public void onPostPersist(){


        ReservationCreated reservationCreated = new ReservationCreated(this);
        reservationCreated.publishAfterCommit();



        ReservationCancelled reservationCancelled = new ReservationCancelled(this);
        reservationCancelled.publishAfterCommit();

        // Get request from Schedule
        //msaairesl.external.Schedule schedule =
        //    Application.applicationContext.getBean(msaairesl.external.ScheduleService.class)
        //    .getSchedule(/** mapping value needed */);

    }

    public static ReservationRepository repository(){
        ReservationRepository reservationRepository = ReservationmgmtApplication.applicationContext.getBean(ReservationRepository.class);
        return reservationRepository;
    }






}
