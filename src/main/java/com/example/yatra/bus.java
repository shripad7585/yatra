package com.example.yatra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {
@GetMapping("/myBUS")
public String getdata(){
        return"Please book your BUS ticket, SHRI EXPRESS";

        }
        }