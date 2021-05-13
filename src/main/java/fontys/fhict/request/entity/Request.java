package fontys.fhict.request.entity;

import fontys.fhict.request.dto.Requestdto;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Request {

    @Id
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
}
