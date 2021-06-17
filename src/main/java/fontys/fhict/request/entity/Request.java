package fontys.fhict.request.entity;

import fontys.fhict.request.dto.Requestdto;
import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Data
@Entity
public class Request {

    @Id
    @GeneratedValue
    private long requestId;
    @Column
    private long breederId;
    @Column
    private String name;
    @Column
    private Status status;
    @Column
    private String email;
    @Column
    private String topic;
    @Column
    private String message;

    public Request(Requestdto requestDto){
        this.message = requestDto.getMessageValue();
        this.breederId = requestDto.getBreederIdValue();
        this.name = requestDto.getNameValue();
        this.status = Status.AWAIT;
        this.email = requestDto.getEmailValue();
        this.topic = requestDto.getTopicValue();
    }

    public Request(){

    }

}
