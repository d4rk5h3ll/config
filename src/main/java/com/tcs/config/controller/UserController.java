/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.config.controller;
import com.tcs.config.dto.UserDto;
import com.tcs.config.models.Hibernate;
import com.tcs.config.repository.UserRepo;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author nil
 */
@RestController
//@Controller
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    UserRepo userrepo;
    
    @RequestMapping("/hi")
//    @ResponseBody
    public ModelAndView index(){
        ModelAndView MandV = new ModelAndView();
        MandV.setViewName("index");
        return MandV;
    }
    @RequestMapping("/getdata")
    public String getData(){
//        Optional<Hibernate> hiberuser =  userrepo.findById(3);
        Hibernate hiberuser = userrepo.findByfirstName("abc");
        return "name:- "+hiberuser.getLastName();
    }
    @RequestMapping("/pathvar/{name}/{age}")
    public String getPathVar(@PathVariable("name") String name,@PathVariable("age") String age){
        return "name:- "+name+" age:-"+age;
        
    }
    @RequestMapping("/reqparam")
    public String getParam(@RequestParam("name") String name,@RequestParam("id") int id){
        return "name:- "+name+" id:-"+id;
        
    }
    @RequestMapping("/save")
    public String saveData(@Valid UserDto userdto, BindingResult result){
//        Hibernate hiberinsert = new Hibernate();
//        hiberinsert.put
        return "fname:- "+userdto.getFname()+" lname:- "+userdto.getLname();
        
    }
    
}
