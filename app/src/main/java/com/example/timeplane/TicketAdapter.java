package com.example.timeplane;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class TicketAdapter extends BaseAdapter {
    private Context context;
    private List<Ticket> tickets;

    public TicketAdapter(Context context, List<Ticket> tickets) {
        this.context = context;
        this.tickets = tickets;
    }

    @Override
    public int getCount() {
        return tickets.size();
    }

    @Override
    public Object getItem(int position) {
        return tickets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.ticket_item, parent, false);
        }

        Ticket ticket = tickets.get(position);

        TextView flightNumberTextView = convertView.findViewById(R.id.flightNumberTextView);
        TextView departureTextView = convertView.findViewById(R.id.departureTextView);
        TextView destinationTextView = convertView.findViewById(R.id.destinationTextView);
        TextView dateTextView = convertView.findViewById(R.id.dateTextView);
        TextView priceTextView = convertView.findViewById(R.id.priceTextView);
        TextView price = convertView.findViewById(R.id.price);
        TextView flightClassTextView = convertView.findViewById(R.id.flightClassTextView);

        flightNumberTextView.setText(ticket.getFlightNumber());
        departureTextView.setText(ticket.getDeparture());
        destinationTextView.setText(ticket.getDestination());
        dateTextView.setText(ticket.getDate());
        priceTextView.setText(String.valueOf(ticket.getPrice()));
        price.setText(ticket.getPrice() + "$");
        flightClassTextView.setText(ticket.getFlightClass());

        return convertView;
    }
}
