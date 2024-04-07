package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItemRecord;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.MergerRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/merger")

public class MergerController {

    MergerRepository mergerRepository;

    public MergerController(MergerRepository mergerRepository) {
        this.mergerRepository = mergerRepository;
    }
    @GetMapping
    public List<MenuItemRecord> get() {
        List<MenuItemRecord> items = mergerRepository.getTheMenuItems();
        return items;
    }
    
    @GetMapping("/supper")
    public List<MenuItemRecord> getDinner() {
        List<MenuItemRecord> items = mergerRepository.getDinnerMenuItems();
        return items;
    }
    
    @GetMapping("/lunch")
    public List<MenuItemRecord> getLunch() {
        List<MenuItemRecord> items = mergerRepository.getLunchMenuItems();
        return items;
    }
    
    
    @GetMapping("/vegetarian")
    public List<MenuItemRecord> getVegetarian() {
        List<MenuItemRecord> items = mergerRepository.getVegetarianMenuItems();
        return items;
    }
    
    @GetMapping("/breakfast")
    public List<MenuItemRecord> getPancakehouse() {
        List<MenuItemRecord> items = mergerRepository.getBreakfastMenuItems();
        return items;
    }
    
    
}
