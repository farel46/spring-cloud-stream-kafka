package com.example.stream_db.service;

import com.example.stream_db.model.Event;
import com.example.stream_db.repository.EventRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Transactional
    public void saveEvent(String event) {
        eventRepository.save(new Event(null, event));
    }
}
