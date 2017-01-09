package luv.linux.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import luv.linux.recyclerview.model.Person;
import luv.linux.recyclerview.utils.RVAdapter;

public class MainActivity extends AppCompatActivity {
	//list yang memuat data orang
    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		//mengisi variabel persons
        initializeData();

		//inisialisasi RecyclerView
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        rv.setHasFixedSize(true);

		//inisialisasi layout RecyclerView
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

		//inisialisasi adapter RecyclerView
        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);
    }
    
	//mengisi data orang ke dalam ArrayList
    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", R.drawable.ubuntu));
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.lm));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.debian));
    }
}
