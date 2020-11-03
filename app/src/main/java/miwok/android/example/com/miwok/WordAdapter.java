package miwok.android.example.com.miwok;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Movie;
import android.util.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    Context context;
    ArrayList<Word> words;
    private int viewColor;

    public WordAdapter(Activity context, ArrayList<Word> words,int color){
            super(context,0, words);
            this.words = words;
            viewColor = color;
            this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.word_item,parent,false);

        listItem.setBackgroundColor(context.getResources().getColor(viewColor));

        TextView miwWord = (TextView) listItem.findViewById(R.id.miwokTextView);
        miwWord.setText(words.get(position).getMiwWord());

        TextView engWord = (TextView) listItem.findViewById(R.id.englishTextView);
        engWord.setText(words.get(position).getEngWord());

        ImageView image = (ImageView) listItem.findViewById(R.id.imageView);

        if(words.get(position).getImageRes() == 0)
            image.setVisibility(View.GONE);
        else
        image.setImageResource(words.get(position).getImageRes());

        return listItem;
    }
}
