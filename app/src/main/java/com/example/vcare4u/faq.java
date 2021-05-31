package com.example.vcare4u;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class faq extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        final TextView textView1=(TextView)findViewById(R.id.textView1);
        final Button button1 =  (Button)findViewById(R.id.mybutton1);
        final TextView textView2=(TextView)findViewById(R.id.textView2);
        final Button button2 =  (Button)findViewById(R.id.mybutton2);
        final TextView textView3=(TextView)findViewById(R.id.textView3);
        final Button button3 =  (Button)findViewById(R.id.mybutton3);
        final TextView textView4=(TextView)findViewById(R.id.textView4);
        final Button button4 =  (Button)findViewById(R.id.mybutton4);
        final TextView textView5=(TextView)findViewById(R.id.textView5);
        final Button button5 =  (Button)findViewById(R.id.mybutton5);
        final TextView textView6=(TextView)findViewById(R.id.textView6);
        final Button button6 =  (Button)findViewById(R.id.mybutton6);
        final TextView textView7=(TextView)findViewById(R.id.textView7);
        final Button button7 =  (Button)findViewById(R.id.mybutton7);
        final TextView textView8=(TextView)findViewById(R.id.textView8);
        final Button button8 =  (Button)findViewById(R.id.mybutton8);
        final TextView textView9=(TextView)findViewById(R.id.textView9);
        final Button button9 =  (Button)findViewById(R.id.mybutton9);
        final TextView textView10=(TextView)findViewById(R.id.textView10);
        final Button button10 =  (Button)findViewById(R.id.mybutton10);




        //Implement listener for your button so that when you click the
        //button, android will listen to it.

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                textView1.setText("Government has identified high-risk groups to be vaccinated on priority." +
                        "The first group includes healthcare and frontline workers." +
                        " The second group will be persons over 50 years and persons with comorbid conditions. " +
                        "Subsequently,the vaccine will be made available to all others in need");

            }         });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                textView2.setText("Vaccination for COVID-19 is voluntary." +
                        "However,it is advisible to receive the complete schedule of COVID-19 vaccine for protecting oneself and limiting the spread of the disease.");

            }         });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                textView3.setText("1) You must rest at the vaccination centre for atleast half an hour after taking the COVID-19 vaccine." +
                        "2) Inform the nearest health authorities/ANM/ASHA incase you subsequently feel any discomfort or uneasiness." +
                        "3) Remember to continue following COVID appropriate behaviours like wearing masks,maintaining hand sanitization and physical distancing ");
            }         });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                textView4.setText("Two doses of vaccine.28 days apart,need to be taken by an individual to complete the vaccination schedule.");
            }         });


        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                textView5.setText("1)COVID vaccine will be introduced only when the safety is proven." +
                        "2)As is true for other vaccines,the common side effects in some individuals could be mild fever,pain,etc.at the site of injection." +
                        "3) States have been asked to start making arrangements to deal with any COVID-19 vaccine-related side-effects.");}         });


        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                textView6.setText("It is advisable to receive a complete schedule of the vaccine irrrespective of the past history of infection as it will help in developing a strong immune response.");
            }         });
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                textView7.setText("Infected individuals should defer vaccination for 14 days after symptoms resolution as they may increase the risk of spreading the virus to others at the vaccination site.");
            }         });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                textView8.setText("Any of the below-mentioned ID with photo may be produced at the time of registration:" +
                        "1) Aadhar/Driving License/Voter ID/PAN Card/Passport/Job Card/Pension Document." +
                        "2) Health Insurance Smart Card issued under the scheme of Ministry of Labour." +
                        "3) Mahatma Gandhi National Rural Employment Guarantee Act(MGNREGA)." +
                        "4) Official identity cards issued to MPs/MLAs/MLCs." +
                        "5) Passbooks issued by Bank/Post Office." +
                        "6) Service ID Card issued by Central/State Government/Public LImited Companies.");
            }         });
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                textView9.setText("No." +
                        "Registration is mandatory for COVID-19 vaccination.Only after registration,the information on the session site and time will be shared.");
            }         });
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                textView10.setText("India already has two approved COVID-19 vaccines," +
                        "1) Covishield and 2) Covaxin" +
                        "that are currently being administered to eligible indians.");
            }         });

    }
}