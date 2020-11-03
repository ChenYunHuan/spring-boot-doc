package com.itstyle.doc.swagger.core.controller;

import com.itstyle.doc.swagger.core.service.UserServcie;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
        return "chen";
    }
}
