package com.example.springcloudfeign.client;

import com.example.springcloudfeign.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "http://jsonplaceholder.typicode.com/users", name = "USER-CLIENT")
public interface UserClient {

    @GetMapping("/")
    public List<UserResponse> getUsers();

}
