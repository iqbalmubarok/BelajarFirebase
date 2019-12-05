package com.example.belajarfirebase;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class TrackList extends ArrayAdapter<Track> {
    private Activity context;
    private List<Track> tracks;

    public TrackList(Activity context, List<Track> tracks){
        super(context, R.layout.list_layout_track, tracks);
        this.context = context;
        this.tracks = tracks;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_layout_track,null,true);

        TextView txtTrackName = listViewItem.findViewById(R.id.txtNamaTrack);
        TextView txtRatingTrack = listViewItem.findViewById(R.id.txtRatingTrack);

        Track track = tracks.get(position);

        txtTrackName.setText(track.getTrackName());
        txtRatingTrack.setText(String.valueOf(track.getTrackRating()));

        return listViewItem;
    }
}
