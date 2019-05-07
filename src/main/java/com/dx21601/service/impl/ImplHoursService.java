package com.dx21601.service.impl;

import com.dx21601.dao.HoursMapper;
import com.dx21601.service.IHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplHoursService implements IHoursService {
    @Autowired
    HoursMapper hoursMapper;
}
