package org.example.jpa.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.jpa.domain.item.Item;
import org.example.jpa.repository.ItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public Item save(Item item) {
        itemRepository.save(item);
        return item;
    }

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item findById(Long id) {
        return itemRepository.findById(id);
    }

}
