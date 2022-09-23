package cn.pccpa.officialweb.controller;

import cn.pccpa.officialweb.bean.FirstPage;
import cn.pccpa.officialweb.service.FirstPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2022年09月21日 15:36
 */

@RestController
@RequestMapping(value = "/data")
public class LoginController {


    @Autowired
    //FirstPageService firstPageService;

    @GetMapping(value = "/home")
//    @CrossOrigin(value = "http://localhost:8080",maxAge = 1800,allowedHeaders = "*")
    public List<FirstPage> get() {
       // List<FirstPage> all = firstPageService.getAll();

        System.out.println("home");
      //  return all;

    }


}
