package by.damirbek.test.controllers;

import by.damirbek.test.models.dto.RequestDTO;
import by.damirbek.test.models.entity.Request;
import by.damirbek.test.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/requests")
public class RequestController {

    private final RequestService requestService;

    @Autowired
    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping
    public ResponseEntity<Request> createRequest(@RequestBody RequestDTO requestDTO) {
        Request createdRequest = requestService.createRequest(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRequest);
    }

    @DeleteMapping("/{requestId}")
    public ResponseEntity<Void> deleteRequest(@PathVariable Long requestId) {
        requestService.deleteRequest(requestId);
        return ResponseEntity.noContent().build();
    }
}