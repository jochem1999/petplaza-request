package fontys.fhict.request.service;

import fontys.fhict.request.entity.Request;
import fontys.fhict.request.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RequestService {

    @Autowired
    RequestRepository requestRepository;

    public Request request(Request request){
        return requestRepository.save(request);
    }

    public ArrayList<Request> findAllByBreederId(long id){
        return requestRepository.findAllByBreederId(id);
    }

}
