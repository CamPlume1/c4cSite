package com.example.nondb;

import com.example.nondb.model.Entry;
import com.example.nondb.model.EntryComparator;
import com.sun.net.httpserver.Authenticator;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@RestController
@RequestMapping("/api")
public class AppController {

    private static int currentEntryNumber;

    private List<Entry> entries;

    String url;

    int port;

    public AppController(){
        entries = new ArrayList<>();
        currentEntryNumber = 0;
    }

    //See all entries in the database. spec gives the sort type
    @CrossOrigin
    @RequestMapping("/entries/{spec}")
    public List<Entry> getEntries(@PathVariable String spec){
        entries.sort(new EntryComparator(spec));
        return entries;
    }

    //WHAT return type should I use here? I want to return either success or Failure, with a reason
    //Change to response entities
    @CrossOrigin
    @RequestMapping("addEntry/{username}/{content}")
    public String addEntry(@PathVariable String username, @PathVariable String content){
        Entry temp;
        try {
            temp = new Entry(username, content, currentEntryNumber);
        } catch (IllegalArgumentException e){
            currentEntryNumber += 1;
            return "FAILURE";
        }
        currentEntryNumber += 1;
        entries.add(temp);
        return "SUCCESS";
    }

    @CrossOrigin
    @RequestMapping("login/{username}")
    public String login(@PathVariable String username){
        System.out.println(username);
        return "SUCCESS";
    }

    @CrossOrigin
    @RequestMapping("like/{index}")
    public String like(@PathVariable String index){
        int pos = Integer.parseInt(index);
        entries.get(pos).like();
        return "SUCCESS";
    }


}

/**
    //Create an account with the given username and password
    @RequestMapping("/create_account/{username}/{password}")
    public void createAccount(@PathVariable String username, @PathVariable String password){
        logins.put(username, password);
    }
**/