package nyc.c4q.josiel.picassotest.recyclerview;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import nyc.c4q.josiel.picassotest.R;
import nyc.c4q.josiel.picassotest.backend.AvailableKey;

public class AvailableKeysViewHolder extends RecyclerView.ViewHolder {

    TextView keyName;

    public AvailableKeysViewHolder(View itemView) {
        super(itemView);
        keyName = (TextView) itemView.findViewById(R.id.key_name);
    }

    public void bind(AvailableKey myAvailableKey) {

        keyName.setText(myAvailableKey.getName());
        keyName.setTextColor(Color.parseColor(myAvailableKey.getTextColor()));
        itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });
    }
}
