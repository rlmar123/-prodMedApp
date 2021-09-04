package com.example.prod_med_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.prod_med_app.Model.Medication;
import com.example.prod_med_app.UI.RecyclerMedicationAdapt;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.utils.HorizontalCalendarListener;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener
{

    BottomNavigationView test_bar;
    FrameLayout frameLayout;

    private ImageView lines;
    private ImageView settinds;

    private RecyclerView recycler_view = null;
    private RecyclerMedicationAdapt recycler_adapter= null;


    //data storage
    private List<Medication> our_medication_list = null;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect to activity_my_list.xml widget
        recycler_view = findViewById(R.id.test_recycler);
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));

        our_medication_list = new ArrayList<>();

        // will delete
        our_medication_list.add(new Medication("Tylenol", "Acetimono[pehn", "James", "Jones", 45, 45, 2 ));
        our_medication_list.add(new Medication("Tylenol", "Acetimono[pehn", "James", "Jones", 45, 45, 2 ));
        our_medication_list.add(new Medication("Tylenol", "Acetimono[pehn", "James", "Jones", 45, 45, 2 ));
        our_medication_list.add(new Medication("Tylenol", "Acetimono[pehn", "James", "Jones", 45, 45, 2 ));
        our_medication_list.add(new Medication("Tylenol", "Acetimono[pehn", "James", "Jones", 45, 45, 2 ));


        //setup recycler_adapter
        recycler_adapter = new RecyclerMedicationAdapt(this, our_medication_list);
        recycler_view.setAdapter(recycler_adapter);

        //keeps data up to date
        recycler_adapter.notifyDataSetChanged();

        lines = findViewById(R.id.home_three_bars);
        test_bar = findViewById(R.id.bottom_nav);
        test_bar.setOnNavigationItemSelectedListener(navListener);

        /* starts before 1 month from now */
        Calendar startDate = Calendar.getInstance();
        startDate.add(Calendar.MONTH, -1);

        /* ends after 1 month from now */
        Calendar endDate = Calendar.getInstance();
        endDate.add(Calendar.MONTH, 1);

        HorizontalCalendar horizontalCalendar = new HorizontalCalendar.Builder(this, R.id.calendarView)
                .range(startDate, endDate)
                .datesNumberOnScreen(5)
                .build();

        horizontalCalendar.setCalendarListener(new HorizontalCalendarListener() {
            @Override
            public void onDateSelected(Calendar date, int position) {

                Toast.makeText(MainActivity.this, "TITLE" , Toast.LENGTH_LONG).show();

            }
        });

        lines.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Toast.makeText(MainActivity.this, "FROM HOME", Toast.LENGTH_LONG).show();
      //          showPopup(v); FINISH HERE tomorrow

            }
        });





    } // end onCreate

    // fragments change here
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item)
                {
                    Fragment selectedFragment = null;

                    switch (item.getItemId())
                    {
                        case R.id.home_icon:
                              /*  selectedFragment = new TestFragment();
                                getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,
                                        selectedFragment).commit();*/

                            Toast.makeText(MainActivity.this, "HOME!!!!" , Toast.LENGTH_LONG).show();
                            break;

                        case R.id.refill_icon:

                                /*selectedFragment = new NextFragment();
                                getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,
                                        selectedFragment).commit();*/
                            Toast.makeText(MainActivity.this, "REFILL!!!!" , Toast.LENGTH_LONG).show();

                            break;

                        case R.id.doctor_info:
                            test_bar.setBackgroundResource(R.color.black);
                            Toast.makeText(MainActivity.this, "DOCTOR INFO!!!!" , Toast.LENGTH_LONG).show();
                            break;
                    }

                    return true;
                }
            };

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return false;
    }
} // end MainActivity