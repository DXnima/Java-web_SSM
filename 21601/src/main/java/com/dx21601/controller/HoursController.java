package com.dx21601.controller;

import com.dx21601.service.IHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hours/")
public class HoursController {
    @Autowired
    IHoursService iHoursService;

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    @ResponseBody
}
