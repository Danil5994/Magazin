package org.skypro.skyshop.interfaces;

// SearchEngine.java
public class SearchEngine {
    private Searchable[] searchableItems;

    public SearchEngine(int size) {
        this.searchableItems = new Searchable[size];
    }

    public void addItem(Searchable item) {
        for (int i = 0; i < searchableItems.length; i++) {
            if (searchableItems[i] == null) {
                searchableItems[i] = item;
                return;
            }
        }
        System.out.println("Невозможно добавить эелемент");
    }


    public Searchable[] searchAll(String keyword) {
        System.out.println("Выполнение поиска для ключевого слова: \"" + keyword + "\"");
        Searchable[] result = new Searchable[5];
        int position = 0;
        for (Searchable item : searchableItems) {
            if (position >= 5) {
                break;
            }
            if (item != null && item.getSearchTerm().contains(keyword)) {
                result[position] = item;
                position++;
            }
        }

        return result;
    }
}
