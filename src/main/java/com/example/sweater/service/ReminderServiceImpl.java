package com.example.sweater.service;


import com.example.sweater.entity.Remind;
import com.example.sweater.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderServiceImpl implements ReminderService {

    @Autowired
    private RemindRepository repository;


    @Override
    public List<Remind> All() {
        return null;
    }

    @Override
    public Remind One(long id) {
        return null;
    }

    @Override
    public Remind save(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    @Override
    public void remove(long id) {
        repository.deleteById(id);
    }
}
