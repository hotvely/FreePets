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
        Event target = EventDAO.findById(event.getEventCode()).orElse(null);
        if(target!=null) {
            return dao.save(event);
        }
        return null;
    }

    public Event delete(int id){
        Event target = dao.findById(id).orElse(null);
        dao.delete(target);
        return target;
    }
    public Event create(Event event) {
        return dao.save(event);
    }
}
