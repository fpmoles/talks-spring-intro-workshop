package com.frankmoley.talks.spring.intro.service;

import com.frankmoley.talks.spring.intro.data.repository.ItemRepository;
import com.frankmoley.talks.spring.intro.data.repository.PersonRepository;
import com.frankmoley.talks.spring.intro.service.domain.model.DetailedInventoryItem;
import com.frankmoley.talks.spring.intro.service.domain.model.Inventory;

public class InventoryService {

    private final ItemRepository itemRepository;
    private final PersonRepository personRepository;

    public InventoryService(ItemRepository itemRepository, PersonRepository personRepository){
        super();
        this.itemRepository = itemRepository;
        this.personRepository = personRepository;
    }

    public Inventory getInventory(long personId){
        return new Inventory();
    }

    public Inventory updateInventory(Inventory inventory){
        return inventory;
    }

    public DetailedInventoryItem getDetailedInventoryItem(long personId, long itemId){
        return new DetailedInventoryItem();
    }


}
