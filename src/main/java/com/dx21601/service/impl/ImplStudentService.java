package com.dx21601.service.impl;

import com.dx21601.common.ResponseCode;
import com.dx21601.common.ServerResponse;
import com.dx21601.dao.StudentMapper;
import com.dx21601.pojo.Student;
import com.dx21601.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplStudentService implements IStudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public ServerResponse<Student> login(String sSid, String sPassword) {
        Student student=studentMapper.selectBySsid(sSid);
        if (student==null){
            ServerResponse serverResponse=ServerResponse.createByErrorCodeMessage(ResponseCode.UnRegist.getCode(),"用户名不存在请注册！");
            return serverResponse;
        }
        if (!sPassword.equals(student.getsPassword())){
            return ServerResponse.createByErrorMessage("密码错误！");
        }
        return ServerResponse.createBySuccess(student);
    }
}
