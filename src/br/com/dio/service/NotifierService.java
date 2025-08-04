package br.com.dio.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotifierService {

    private Map<EventEnum, List<EventListener>> listener = new HashMap<>() {{
        put(EventEnum.CLEAR_SPACE, new ArrayList<>());
    }};

    private final Map<EventEnum, List<EventListener>> listeners = new HashMap<>();

    public void subscriber(final EventEnum eventType, EventListener listener){
        var selectedListeners = listeners.get(eventType);
        if (selectedListeners == null) {
            selectedListeners = new ArrayList<>();
            listeners.put(eventType, selectedListeners);
        }
        selectedListeners.add(listener);
    }

    public void notify(final EventEnum eventType){
        listener.get(eventType).forEach(l -> l.update(eventType));
    }

}
