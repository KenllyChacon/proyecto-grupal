package uce.edu.ec.appbooks.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uce.edu.ec.appbooks.dtos.AuthorDto;

@Service
public class AuthorRestClient   {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${app.authors.url}")
    private String authorsUrl;

    public AuthorDto findById(Integer id) {
        return restTemplate.getForObject(authorsUrl + "/authors/" + id, AuthorDto.class);
    }

}