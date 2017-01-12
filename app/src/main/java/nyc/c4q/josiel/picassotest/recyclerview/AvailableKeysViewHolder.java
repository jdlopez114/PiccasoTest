package nyc.c4q.josiel.picassotest.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import nyc.c4q.josiel.picassotest.KeyPicFragment;
import nyc.c4q.josiel.picassotest.R;
import nyc.c4q.josiel.picassotest.backend.AvailableKey;


public class AvailableKeysViewHolder extends RecyclerView.ViewHolder {

    TextView keyName;

    public AvailableKeysViewHolder(View itemView) {
        super(itemView);
        keyName = (TextView) itemView.findViewById(R.id.key_name);

        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (getAdapterPosition() != RecyclerView.NO_POSITION) {
                    Context c = v.getContext();
                    Intent intent = new Intent(v.getContext(), KeyPicFragment.class);
                    c.startActivity(intent);
                }
            }
        });
    }

    public void bind(AvailableKey myAvailableKey) {

        keyName.setText(myAvailableKey.getName());
        keyName.setTextColor(Color.parseColor(myAvailableKey.getTextColor()));
//        itemView.setOnClickListener(new View.OnClickListener() {

//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(v.getContext(), KeyPicFragment.class);
//                startActivity(intent);
//        });
//
//    }

    }
}
