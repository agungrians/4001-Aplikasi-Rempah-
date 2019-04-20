package android.example.com.aplikasirempah;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Product> mData;

    public RecycleViewAdapter(Context mContext, List<Product> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.tv_product_title.setText(mData.get(position).getTitle());
        holder.img_product_tumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,Product_Activity.class);
                //passing data to the Product_Activity
                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Price",mData.get(position).getPrice());
                intent.putExtra("Address",mData.get(position).getAddress());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());
                //start in the activity
                mContext.startActivity(intent);

            }
        });

        //set list licstener

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_product_title;
        ImageView img_product_tumbnail;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_product_title = (TextView) itemView.findViewById(R.id.product_title_id);
            img_product_tumbnail = (ImageView) itemView.findViewById(R.id.product_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_item);

        }
    }

}
