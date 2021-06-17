package fontys.fhict.request.controller;

import fontys.fhict.request.dto.Requestdto;
import fontys.fhict.request.entity.Request;
import fontys.fhict.request.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/request")
public class RequestController {

    @Autowired
    RequestService requestService;

    @PostMapping("/send")
    public ResponseEntity<Request> request(@RequestBody Requestdto requestdto) {
        Request request = new Request(requestdto);
        System.out.println(request.getRequestId());
        System.out.println(request.getBreederId());

        Request response = requestService.request(request);

        if(response!= null){
            return ResponseEntity.ok(response);
        }
        else
        {
            return null;
        }
    }

    @GetMapping("/getAllBy/{id}")
    public ResponseEntity<ArrayList<Request>> getAllRequestsbyId(@PathVariable String id){
        System.out.println(id);
        return ResponseEntity.ok(requestService.findAllByBreederId(Long.parseLong(id)));
    }
}
