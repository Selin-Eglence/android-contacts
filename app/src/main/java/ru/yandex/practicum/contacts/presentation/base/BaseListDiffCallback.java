package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;


public class BaseListDiffCallback <Smth extends ListDiffInterface<Smth>> extends DiffUtil.ItemCallback<Smth> {

    @Override
    public boolean areItemsTheSame(@NonNull Smth oldItem, @NonNull Smth newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull Smth oldItem, @NonNull Smth newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull Smth oldItem, @NonNull Smth newItem) {
        return newItem;
    }
}

