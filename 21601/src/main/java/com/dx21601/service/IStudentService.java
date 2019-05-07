package com.dx21601.service;

import com.dx21601.common.ServerResponse;
import com.dx21601.pojo.Student;

public interface IStudentService {
    //登陆
    ServerResponse<Student> login(String sSid, String sPassword);
}
