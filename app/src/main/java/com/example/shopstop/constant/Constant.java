package com.example.shopstop.constant;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.shopstop.HomeActivity;
import com.example.shopstop.MenuFiles.AddProduct;
import com.example.shopstop.model.Product;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public final class Constant {

    StorageReference storageReference;

    public static final List<Integer> QUANTITY_LIST = new ArrayList<Integer>();

    static {
        for (int i = 1; i < 11; i++) QUANTITY_LIST.add(i);
    }

    public static final Product PRODUCT1 = new Product(1, "Redmi Note 11T", BigDecimal.valueOf(16999),
            "3.5mm Jack\nIR Blaster\nX-Axis Linear Vibration Motor\nCorning gorilla glass 3 protection\n" +
                    "Dual Stereo Speakers for immersive audio experience\nHi-Res certified audio\n" +
                    "Splash, Water and Dust Resistant- IP53", "redmi_note_11t");
    public static final Product PRODUCT2 = new Product(2, "OnePlus Nord CE", BigDecimal.valueOf(24999),
            "Camera 4500mAH lithium-ion battery (non-removable)\nNightscape, Automated AI Photo Enhancer, Portrait mode, and filters\nIn-display fingerprint" +
                    "sensor\nFront camera features - Face Unlock, HDR, Screen Flash, face retouching, and filters\n" +
                    "Thickness: 7.9mm, slimmest OnePlus phone since the OnePlus 6T\nWeight: 170g",
            "oneplus_nord_ce");
    public static final Product PRODUCT3 = new Product(3, "Samsung Galaxy F42", BigDecimal.valueOf(17899),
            "6 GB RAM\n128 GB ROM\nExpandable Upto 1 TB\n" +
                    "16.76 cm (6.6 inch) Full HD+ Display\n" +
                    "64MP + 5MP + 2MP | 8MP Front Camera\n" +
                    "5000 mAh Lithium-ion Battery\n" +
                    "MediaTek Dimensity 700 Processor",
            "samsung_galaxy_f42");

    public static final List<Product> PRODUCT_LIST = new ArrayList<Product>();

    static {
        PRODUCT_LIST.add(PRODUCT1);
        PRODUCT_LIST.add(PRODUCT2);
        PRODUCT_LIST.add(PRODUCT3);
    }

    public static final String CURRENCY = "₹";

}
