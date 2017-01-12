package nyc.c4q.josiel.picassotest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.josiel.picassotest.Backend.AvailableKeys;

public class AvailableKeysAdapter extends RecyclerView.Adapter<AvailableKeysViewHolder> {

    List<AvailableKeys> availableKeysList;

    public AvailableKeysAdapter(List<AvailableKeys> availableKeysList){
        this.availableKeysList = availableKeysList;
    }

    @Override
    public AvailableKeysViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);

        return new AvailableKeysViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AvailableKeysViewHolder holder, int position) {
        AvailableKeys myAvailableKeys = availableKeysList.get(position);
        holder.bind(myAvailableKeys);
    }

    @Override
    public int getItemCount() {
        return availableKeysList.size();
    }
}
