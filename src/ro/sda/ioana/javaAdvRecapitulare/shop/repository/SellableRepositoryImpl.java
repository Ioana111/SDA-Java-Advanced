package ro.sda.ioana.javaAdvRecapitulare.shop.repository;

import ro.sda.ioana.javaAdvRecapitulare.shop.model.product.Sellable;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * **8. Collections (and Maps)**
 * - Create the implementation for the generic repository. Optimize the collection that will store the elements for all the existing actions.
 */
public class SellableRepositoryImpl<T extends Sellable> implements SellableRepository<T> {

    private final Map<String, T> sellableMap = new HashMap<>();

    @Override
    public void add(T sellable) {
        sellableMap.put(sellable.getName(), sellable);
    }

    @Override
    public T search(String id) {
       return sellableMap.get(id);
    }

    @Override
    public void remove(String id) {
        sellableMap.remove(id);
    }

    @Override
    public void update(T sellable) {
        sellableMap.put(sellable.getName(), sellable);
    }

    @Override
    public List<T> getAllOrderedByPrice() {
        return sellableMap
                .values()
                .stream()
                .sorted(Comparator.comparing(T::getPrice))
                .collect(Collectors.toList());
    }
}
