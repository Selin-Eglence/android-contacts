package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {

    boolean theSameAs(T oldItem);
    boolean equals(Object oldItem) ;

}