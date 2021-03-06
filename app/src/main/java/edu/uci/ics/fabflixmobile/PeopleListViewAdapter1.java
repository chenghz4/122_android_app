package edu.uci.ics.fabflixmobile;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PeopleListViewAdapter1 extends ArrayAdapter<Movie> {
    private ArrayList<Movie> people;

    public PeopleListViewAdapter1(ArrayList<Movie> people, Context context) {
        super(context, R.layout.layout_listview_row1, people);
        this.people = people;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.layout_listview_row1, parent, false);

        Movie person = people.get(position);

        TextView titleView = (TextView)view.findViewById(R.id.title);
        TextView yearView = (TextView)view.findViewById(R.id.year);
        TextView directorView = (TextView)view.findViewById(R.id.director);
        TextView list_sView = (TextView)view.findViewById(R.id.list_s);
        TextView list_gView = (TextView)view.findViewById(R.id.list_g);



        titleView.setText(person.getName());
        yearView.setText(person.getBirthYear().toString());
        directorView.setText(person.getDirectname());
        list_sView.setText(person.getStarlist());
        list_gView.setText(person.getGenreslist());


        return view;
    }
}
