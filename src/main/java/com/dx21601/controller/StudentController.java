package com.dx21601.controller;

import com.dx21601.common.ServerResponse;
import com.dx21601.pojo.Student;
import com.dx21601.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/student/")
public class StudentController {
    @Autowired
    IStudentService iStudentService;

    //登陆
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse Login(@RequestBody Student student, HttpSession session){
        String username=student.getsSid();
        String password=student.getsPassword() ;
        ServerResponse serverResponse = iStudentService.login(username, password);
        if (serverResponse.isSuccess()){
            session.setAttribute("user",serverResponse.getData());
            return serverResponse;
        }
        return  serverResponse;
    }
}
