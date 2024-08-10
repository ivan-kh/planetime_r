package com.example.timeplane;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private TicketAdapter adapter;
    private List<Ticket> tickets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        tickets = new ArrayList<>();
        tickets.add(new Ticket("AA130", "Kyiv", "New York", "2024-08-15", 1100, "Середній клас"));
        tickets.add(new Ticket("BA026", "London", "Toronto", "2024-09-01", 650, "Економ-клас"));
        tickets.add(new Ticket("DL834", "Paris", "Tokyo", "2024-07-22", 2500, "Бізнес-клас"));
        tickets.add(new Ticket("BB731", "Madrid", "Washington", "2024-08-15", 1500, "Середній клас"));
        tickets.add(new Ticket("VI460", "Brazil", "Lviv", "2024-09-01", 900, "Економ-клас"));

        adapter = new TicketAdapter(this, tickets);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Ticket selectedTicket = tickets.get(position);
                String message = "Вибрано рейс " + selectedTicket.getFlightNumber() +
                        " з " + selectedTicket.getDeparture() +
                        " до " + selectedTicket.getDestination() +
                        " (" + selectedTicket.getFlightClass() + ")";
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
