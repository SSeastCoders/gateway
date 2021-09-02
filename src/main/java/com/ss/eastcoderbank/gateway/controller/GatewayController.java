package com.ss.eastcoderbank.gateway.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class GatewayController {

    private final RestTemplate restTemplate;
    @Value("${card-api}")
    String cardapi;

   // @GetMapping("api/card")
   // public ResponseEntity<String> getCredit(){
   //     //return restTemplate.getForEntity("http://localhost:8225/credit-cards/dummy", String.class);//.getBody();
   //     return this.restTemplate.exchange("http://"+(cardapi)+"/credit-cards/dummy", HttpMethod.GET, null, String.class);
   // }

   // @GetMapping("api")
   // public String dummy(){
     //   return "dummy";
   // }

    //@GetMapping("api/cards")
   //public List<CreditCardDto> getCreditReal(){
   ////     return restTemplate.getForEntity("http://localhost:8225/credit-cards", List.class).getBody();
    //}

}
