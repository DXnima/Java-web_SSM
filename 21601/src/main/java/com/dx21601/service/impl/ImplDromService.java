package com.dx21601.service.impl;

import com.dx21601.dao.DromMapper;
import com.dx21601.service.IDromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplDromService implements IDromService {
    @Autowired
    DromMapper dromMapper;
}
