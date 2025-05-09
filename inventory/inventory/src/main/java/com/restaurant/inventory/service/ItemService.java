package com.restaurant.inventory.service;

import com.restaurant.inventory.model.Item;
import com.restaurant.inventory.model.Category;
import com.restaurant.inventory.repository.ItemRepository;
import com.restaurant.inventory.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    public Item updateItem(Long id, Item updatedItem) {
        return itemRepository.findById(id).map(item -> {
            item.setName(updatedItem.getName());
            item.setQuantity(updatedItem.getQuantity());

            // Optional: Handle category update properly
            if (updatedItem.getCategory() != null && updatedItem.getCategory().getId() != null) {
                Category category = categoryRepository.findById(updatedItem.getCategory().getId())
                        .orElseThrow(() -> new RuntimeException("Category not found"));
                item.setCategory(category);
            }

            return itemRepository.save(item);
        }).orElseThrow(() -> new RuntimeException("Item not found"));
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
