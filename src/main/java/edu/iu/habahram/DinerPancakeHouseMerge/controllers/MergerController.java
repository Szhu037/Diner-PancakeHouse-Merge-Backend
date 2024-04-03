package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.Menu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.MergerRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.PancakeHouseRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/merger")
public class MergerController {

    MergerRepository mergerRepository;
    PancakeHouseRepository pancakeHouseRepository;

    public MergerController(MergerRepository mergerRepository, PancakeHouseRepository pancakeHouseRepository) {
        this.mergerRepository = mergerRepository;
        this.pancakeHouseRepository = pancakeHouseRepository;
    }

    @GetMapping
    public List<MenuItem> get() {
        List<MenuItem> menuItems = new ArrayList<>();
        ArrayList<Menu> lunchItems = mergerRepository.getTheMenus();
        for (Menu menu: lunchItems) {
            Iterator<MenuItem> menuIterator = menu.createIterator();
            while (menuIterator.hasNext()) {
                menuItems.add(menuIterator.next());
            }
        }
        return menuItems;
    }
}