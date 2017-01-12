package nyc.c4q.josiel.picassotest.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

import nyc.c4q.josiel.picassotest.backend.AvailableKey;

public class AvailableKeysAdapter extends RecyclerView.Adapter<AvailableKeysViewHolder> {

    List<AvailableKey> availableKeyList;

    public AvailableKeysAdapter(List<AvailableKey> availableKeyList){
        this.availableKeyList = availableKeyList;
    }

    @Override
    public AvailableKeysViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(nyc.c4q.josiel.picassotest.R.layout.item_view, parent, false);
        return new AvailableKeysViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AvailableKeysViewHolder holder, int position) {
        AvailableKey myAvailableKey = availableKeyList.get(position);
        holder.bind(myAvailableKey);
    }

    @Override
    public int getItemCount() {
        return availableKeyList.size();
    }
}
