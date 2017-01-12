package nyc.c4q.josiel.picassotest;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.josiel.picassotest.Backend.AvailableKeys;


public class AvailableKeysViewHolder extends RecyclerView.ViewHolder {

    TextView keyName;

    public AvailableKeysViewHolder(View itemView) {
        super(itemView);
        keyName = (TextView) itemView.findViewById(R.id.key_name);
    }

    public void bind(AvailableKeys myAvailableKeys) {
        keyName.setText(myAvailableKeys.getName());
        keyName.setTextColor(Color.parseColor(myAvailableKeys.getTextColor()));
        itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });
    }
}
