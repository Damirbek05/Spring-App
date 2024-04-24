package by.damirbek.test.service.impl;

import by.damirbek.test.models.dto.RequestDTO;
import by.damirbek.test.models.entity.Request;
import by.damirbek.test.repository.RequestRepository;
import by.damirbek.test.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestServiceImpl implements RequestService {

    private final RequestRepository requestRepository;

    @Autowired
    public RequestServiceImpl(RequestRepository requestRepository){
        this.requestRepository = requestRepository;
    }

    @Override
    public Request createRequest(RequestDTO requestDTO) {
        Request request = new Request();
        request.setProduct(requestDTO.getProduct());
        request.setQuantity(requestDTO.getQuantity());
        request.setPhoneNumber(requestDTO.getPhoneNumber());
        request.setDeliveryAddress(requestDTO.getDeliveryAddress());

        return requestRepository.save(request);
    }

    @Override
    public void deleteRequest(Long requestId) {
        requestRepository.deleteById(requestId);
    }
}
