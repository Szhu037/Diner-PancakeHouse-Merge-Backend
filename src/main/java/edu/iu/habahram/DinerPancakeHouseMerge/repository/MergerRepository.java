package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.*;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.model.Menu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuComponent;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Repository
public class MergerRepository {

    public List<MenuItemRecord> getTheMenuItems() {
    	MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));
    
    	List<MenuItem> menuItems = new ArrayList();
        List<MenuItemRecord> records = new ArrayList();
        Iterator iterator = allMenus.createIterator();
        while(iterator.hasNext()) {
        	MenuComponent menuComponent = (MenuComponent)iterator.next();
        	try {
        		if(menuComponent instanceof Menu) {
        			Iterator itemIterator = menuComponent.createIterator();
        			while(itemIterator.hasNext())
        				menuItems.add((MenuItem)itemIterator.next());
        		}
        	} catch(UnsupportedOperationException e) {}
        }
        for(MenuItem item : menuItems) {
     	   records.add(new MenuItemRecord(item.getName(),item.getDescription(),item.isVegetarian(),item.getPrice()));
     	}
        return records;
    }
    
    public List<MenuItemRecord> getDinnerMenuItems() {
    	MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));
        List<MenuItem> menuItems = new ArrayList();
        List<MenuItemRecord> records = new ArrayList();
        Iterator iterator = allMenus.createIterator();
        while(iterator.hasNext()) {
        	MenuComponent menuComponent = (MenuComponent)iterator.next();
        	try {
        		if(menuComponent instanceof CafeMenu) {
        			Iterator itemIterator = menuComponent.createIterator();
        			while(itemIterator.hasNext())
        				menuItems.add((MenuItem)itemIterator.next());
        		}
        	} catch(UnsupportedOperationException e) {}
        }
        for(MenuItem item : menuItems) {
     	   records.add(new MenuItemRecord(item.getName(),item.getDescription(),item.isVegetarian(),item.getPrice()));
     	}
        return records;
        
    }
    
    public List<MenuItemRecord> getLunchMenuItems() {
    	MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));
        List<MenuItem> menuItems = new ArrayList();
        List<MenuItemRecord> records = new ArrayList();
        Iterator iterator = allMenus.createIterator();
        while(iterator.hasNext()) {
        	MenuComponent menuComponent = (MenuComponent)iterator.next();
        	try {
        		if(menuComponent instanceof DinerMenu) {
        			Iterator itemIterator = menuComponent.createIterator();
        			while(itemIterator.hasNext())
        				menuItems.add((MenuItem)itemIterator.next());
        		}
        	} catch(UnsupportedOperationException e) {}
        }
        for(MenuItem item : menuItems) {
     	   records.add(new MenuItemRecord(item.getName(),item.getDescription(),item.isVegetarian(),item.getPrice()));
     	}
        return records;
        
    }
    
    public List<MenuItemRecord> getBreakfastMenuItems() {
    	MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));
        List<MenuItem> menuItems = new ArrayList();
        List<MenuItemRecord> records = new ArrayList();
        Iterator iterator = allMenus.createIterator();
        while(iterator.hasNext()) {
        	MenuComponent menuComponent = (MenuComponent)iterator.next();
        	try {
        		if(menuComponent instanceof PancakeHouseMenu) {
        			Iterator itemIterator = menuComponent.createIterator();
        			while(itemIterator.hasNext())
        				menuItems.add((MenuItem)itemIterator.next());
        		}
        	} catch(UnsupportedOperationException e) {}
        }
        for(MenuItem item : menuItems) {
     	   records.add(new MenuItemRecord(item.getName(),item.getDescription(),item.isVegetarian(),item.getPrice()));
     	}
        return records;
        
    }
    
    public List<MenuItemRecord> getVegetarianMenuItems() {
    	MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));
        List<MenuItem> menuItems = new ArrayList();
        List<MenuItemRecord> records = new ArrayList();
        Iterator iterator = allMenus.createIterator();
        while(iterator.hasNext()) {
        	MenuComponent menuComponent = (MenuComponent)iterator.next();
        	try {
        		if(menuComponent.isVegetarian()) {
        		  menuItems.add((MenuItem) menuComponent);
        		}
        	} catch(UnsupportedOperationException e) {}
        }
        for(MenuItem item : menuItems) {
     	   records.add(new MenuItemRecord(item.getName(),item.getDescription(),item.isVegetarian(),item.getPrice()));
     	}
        return records;
        
    }
}