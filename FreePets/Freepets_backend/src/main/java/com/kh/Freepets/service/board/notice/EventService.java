package com.kh.Freepets.service.board.notice;

import com.kh.Freepets.domain.board.notice.Event;
import com.kh.Freepets.repo.board.notice.EventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventDAO dao;

    public List<Event> showEventAll(int eventCode){
        return dao.showEventAll(eventCode);
    }
    public Event update(Event event){
        Event target = EventDAO
    }

    public Event delete(int id){
        Event target = dao.findById(id).orElse(null);
        EventDAO.delete(target);
        return target;
    }
}
