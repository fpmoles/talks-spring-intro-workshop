package com.frankmoley.talks.spring.intro.service;

import com.frankmoley.talks.spring.intro.data.repository.ItemRepository;
import com.frankmoley.talks.spring.intro.data.repository.PersonRepository;
import com.frankmoley.talks.spring.intro.service.domain.model.DetailedInventoryItem;
import com.frankmoley.talks.spring.intro.service.domain.model.Inventory;

/**
 * The inventory service manages all of the user inventory information including adding, updating, and retrieving the relevant details of the user and his or her items.
 */
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
