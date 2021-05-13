package fontys.fhict.request.controller;

import fontys.fhict.request.dto.Requestdto;
import fontys.fhict.request.entity.Request;
import fontys.fhict.request.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
public class RequestController {

    @Autowired
    RequestService requestService;

    @PostMapping("/send")
    public ResponseEntity<Request> request(@RequestBody Requestdto requestdto) {
        Request request = new Request(requestdto);
        Request response = requestService.request(request);

        if(response!= null){
            return ResponseEntity.ok(response);
        }
        else
        {
            return null;
        }
    }
}
