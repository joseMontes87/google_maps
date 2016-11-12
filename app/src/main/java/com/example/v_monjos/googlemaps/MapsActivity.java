package com.example.v_monjos.googlemaps;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng davinci = new LatLng(-34.604346, -58.395783);
        mMap.addMarker(new MarkerOptions().position(davinci).title("Escuela Da Vinci"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(davinci, 14.0f));

        LatLng avaya = new LatLng(-34.603114, -58.393598);
        mMap.addMarker(new MarkerOptions().position(avaya).title("Avaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(avaya));
        mMap.setTrafficEnabled();
    }
}
