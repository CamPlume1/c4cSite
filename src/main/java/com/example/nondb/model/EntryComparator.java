package com.example.nondb.model;

import java.util.Comparator;
import java.util.Map;

public class EntryComparator implements Comparator<Entry> {

    private Map<String, SortType> mapping = Map.of(
            "likes_asc", SortType.LIKES_ASCENDING,
            "likes_desc", SortType.LIKES_DESCENDING,
            "time_asc", SortType.TIME_ASCENDING,
            "time_desc", SortType.TIME_DESCENDING);

    private SortType sortType;

    public EntryComparator(String strRep){
        this.sortType = mapping.get(strRep);
    }

    @Override
    public int compare(Entry o1, Entry o2) {
        return switch (this.sortType) {
            case LIKES_ASCENDING -> Integer.compare(o1.getLikes(), o2.getLikes());
            case LIKES_DESCENDING -> Integer.compare(o2.getLikes(), o1.getLikes());
            case TIME_ASCENDING -> Integer.compare(o1.getMessageId(), o2.getMessageId());
            case TIME_DESCENDING -> Integer.compare(o2.getMessageId(), o1.getMessageId());
            default -> throw new IllegalArgumentException("Invalid sortType");
        };
    }
}



