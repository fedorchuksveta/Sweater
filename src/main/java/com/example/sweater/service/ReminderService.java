package com.example.sweater.service;

import com.example.sweater.entity.Remind;

import java.util.List;

public interface ReminderService {
List<Remind> All();
Remind One(long id);
Remind save(Remind remind);
void remove(long id);


}
