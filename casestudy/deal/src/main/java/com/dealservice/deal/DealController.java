package com.dealservice.deal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deals")
public class DealController {

    @Autowired
    private DealRepository dealRepository;

    @GetMapping(value = "/list")
    public List<Deal> getAllDeal() {
        return dealRepository.findAll();
    }

    @PostMapping(value = "/add")
    public Deal addDeals(@RequestBody Deal deal){
        return dealRepository.save(deal);
    }

    @DeleteMapping(value="/delete/{dealId}")
    public void deleteDeal(@PathVariable String dealId) {
        System.out.println("Delete Method Called");
        dealRepository.deleteById(dealId);
    }
}
