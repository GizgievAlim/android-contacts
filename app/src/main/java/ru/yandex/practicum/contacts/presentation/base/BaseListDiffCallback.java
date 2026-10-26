package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<B extends ListDiffInterface<B>> extends DiffUtil.ItemCallback<B> {
    @Override
    public boolean areItemsTheSame(@NonNull B oldItem, @NonNull B newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull B oldItem, @NonNull B newItem) {
        return false;
    }
}
