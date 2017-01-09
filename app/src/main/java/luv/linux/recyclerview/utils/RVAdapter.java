package luv.linux.recyclerview.utils;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import luv.linux.recyclerview.R;
import luv.linux.recyclerview.model.Person;

/**
 * Created by linuxluv on 1/5/17.
 *
 * class sebagai adapter untuk RecyclerView
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {
    //persons : data yang ditampilkan ke RecyclerView
    List<Person> persons;

    public RVAdapter(List<Person> persons){
        this.persons = persons;
    }

    @Override
    public RVAdapter.PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_card, parent, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(RVAdapter.PersonViewHolder personViewHolder, int position) {
        personViewHolder.personName.setText(persons.get(position).getName());
        personViewHolder.personAge.setText(persons.get(position).getAge());
        personViewHolder.personPhoto.setImageResource(persons.get(position).getPhotoId());
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    /* binding dari atribut person ke komponen-komponen layout di dalam CardView
     * nama masuk ke TextView personName
     * usia masuk ke TextView personAge
     * foto masuk ke ImageView personPhoto */
    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView personName;
        TextView personAge;
        ImageView personPhoto;

        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.person_name);
            personAge = (TextView)itemView.findViewById(R.id.person_age);
            personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
        }
    }
}
