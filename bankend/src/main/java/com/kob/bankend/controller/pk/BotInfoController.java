package com.kob.bankend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author JefferyRui
 * @version 1.0
 */
@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public Map<String,String> getBotInfo(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name","lalalla");
        return hashMap;
    }
}
