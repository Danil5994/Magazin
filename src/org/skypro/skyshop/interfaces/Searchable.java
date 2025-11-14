package org.skypro.skyshop.interfaces;

public interface Searchable {
    String getSearchTerm();
    String getContentType();
    String getName();


    default String getStringRepresentation(String keyword){
        return getName() + " - " + getContentType();
    }
}



