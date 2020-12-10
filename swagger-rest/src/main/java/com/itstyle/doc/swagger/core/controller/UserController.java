package com.itstyle.doc.swagger.core.controller;

import com.itstyle.doc.swagger.core.model.ModifyUserRequest;
import com.itstyle.doc.swagger.core.service.UserServcie;
import com.itstyle.doc.swagger.util.ValidatorUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(tags = {
        "User Services"
}, description = "User management services")
@RestController
@RequestMapping(value = "/user/um/v1/")
public class UserController {

    @Autowired
    private UserServcie userServcie;

    @ApiOperation(value = "Query User Information", notes = "Query User Information")
    @GetMapping("/")
    public String queryUser(
            @RequestParam String id

    ) {
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }
        return "chen";
    }


    @ApiOperation(value = "modify User Information", notes = "modify User Information")
    @PostMapping("/modifyUser")
    public String modifyUser(@RequestBody ModifyUserRequest request)
    {
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }
        ValidatorUtils.validateEntity(request);
        System.out.println(request);
        return "chen";
    }
}
