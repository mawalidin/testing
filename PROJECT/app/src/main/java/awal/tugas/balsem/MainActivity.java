package awal.tugas.balsem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

//tanggal pengerjaan: 5//6/2020
//nim: 10117094
//nama: Muhammad Walidin
//kelas: IF-3
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigation = findViewById(R.id.bottomNavBar);
        bottomNavigation.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ProfilFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment= null;

            switch (item.getItemId()) {
                case R.id.menuProfile:
                    selectedFragment = new ProfilFragment();
                    break;
                case R.id.menuContact:
                    selectedFragment = new ContactFragment();
                    break;
                case R.id.list:
                    selectedFragment = new ListFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
            return true;
        }
    };
}
