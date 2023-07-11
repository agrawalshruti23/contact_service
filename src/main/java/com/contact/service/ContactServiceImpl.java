package com.contact.service;


import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {
    //    fake contacts lists

    List<Contact> list= List.of(
            new Contact(1L,"shruti@gmail.com","Shruti", 1311L),
            new Contact(2L,"shreya@gmail.com","Shreya", 1312L),
            new Contact(3L,"vinita@gmail.com","Vinita", 1313L),
            new Contact(4L,"rajesh@gmail.com","Rajesh", 1314L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return this.list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }



//    @Override
//    public User getUser(Long id) {
//        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
//    }
}
