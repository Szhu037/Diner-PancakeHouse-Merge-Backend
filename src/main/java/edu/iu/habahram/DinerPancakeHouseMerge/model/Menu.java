package edu.iu.habahram.DinerPancakeHouseMerge.model;

import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuComponent;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;

import java.util.ArrayList;

public class Menu extends MenuComponent{
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public MenuItem[] getItems() {
        ArrayList<MenuItem> items = new ArrayList<>();
        for (MenuComponent component : menuComponents) {
            if (component instanceof MenuItem) {
                items.add((MenuItem) component);
            }
            else {
                Menu subMenu = (Menu) component;
                MenuItem[] subMenuItems = subMenu.getItems();
                for (MenuItem item : subMenuItems) {
                    items.add(item);
                }
            }
        }
        return items.toArray(new MenuItem[0]);
    }
}
