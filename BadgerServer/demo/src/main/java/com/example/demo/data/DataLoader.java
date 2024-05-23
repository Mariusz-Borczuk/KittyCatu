package com.example.demo.data;

import com.example.demo.model.Client;
import com.example.demo.model.Order;
import com.example.demo.repository.clientRepo;
import com.example.demo.repository.orderRepo;
import java.util.Date;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final clientRepo clientRepository;
    private final orderRepo orderRepository;

    @Autowired
    public DataLoader(clientRepo clientRepository, orderRepo orderRepository) {
        this.clientRepository = clientRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Order Bigdildo = new Order();
        Bigdildo.setClient_id((long) 1);
        Bigdildo.setOrder_list("Dildo, Panties, Lube");
        Bigdildo.setDate(new Date(2021, 10, 10));
        orderRepository.save(Bigdildo);

        Order SmallDildo = new Order();
        SmallDildo.setClient_id((long) 2);
        SmallDildo.setOrder_list("Dildo, Lube");
        SmallDildo.setDate(new Date(2021, 10, 10));
        orderRepository.save(SmallDildo);

        Client John = new Client();
        John.setName("John");
        John.setAddress("1234 Fake St|Katowice|Poland");
        John.setPhone("951753258");
        John.setEmail("J

        
    
}
