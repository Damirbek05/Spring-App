package by.damirbek.test.service;

import by.damirbek.test.models.dto.RequestDTO;
import by.damirbek.test.models.entity.Request;

public interface RequestService {
    Request createRequest(RequestDTO requestDTO);
    void deleteRequest(Long requestId);
}
