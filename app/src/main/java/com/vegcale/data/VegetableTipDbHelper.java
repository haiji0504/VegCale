/*
 * Copyright 2020 Vegetable Calendar Project
 ********************************************
 *    Editor    *    Date    *    Reason    *
 *------------------------------------------*
 *    Kisho     * 2020/9/30  *    Launch    *
 *------------------------------------------*
 */

package com.vegcale.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.vegcale.R;
import com.vegcale.data.VegetableTipContract.VegetableTipEntry;

public class VegetableTipDbHelper extends SQLiteOpenHelper {

    /** Name of the database file */
    public static final int DATABASE_VERSION = 1;

    /** Database version. If we change the database schema, increase this number */
    public static final String DATABASE_NAME = "vegetable_tips.db";

    /** Context */
    private Context mContext;

    public VegetableTipDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        mContext = context;
    }

    /**
     * Called when the database is created for the first time. This is where the
     * creation of tables and the initial population of the tables should happen.
     *
     * @param sqLiteDatabase The database.
     */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // CREATE TABLE vegetableTips (_id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT NOT NULL,
        // description1 TEXT NOT NULL, description2 TEXT NOT NULL);
        // Create a String that contains the SQL statement to create the vegetableTips table
        String SQL_CREATE_VEGETABLES_TABLE = "CREATE TABLE " + VegetableTipEntry.TABLE_NAME + "("
                + VegetableTipEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + VegetableTipEntry.COLUMN_TITLE + " TEXT NOT NULL, "
                + VegetableTipEntry.COLUMN_DESCRIPTION + " TEXT NOT NULL, "
                + VegetableTipEntry.COLUMN_IMAGE + " TEXT NOT NULL);";

        sqLiteDatabase.execSQL(SQL_CREATE_VEGETABLES_TABLE);

        prepopulateVegetableTipsData(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion1) { }
    
    public void prepopulateVegetableTipsData(SQLiteDatabase sqLiteDatabase) {
        // TODO: Change the photos
        // Tip of tomatoes planter
        ContentValues tomatoesPlanter = new ContentValues();
        tomatoesPlanter.put(VegetableTipEntry.COLUMN_TITLE, mContext.getResources().getString(R.string.title_things_have_to_check_to_choose_tomatoes_planter));
        tomatoesPlanter.put(VegetableTipEntry.COLUMN_DESCRIPTION, mContext.getResources().getString(R.string.article_things_have_to_check_to_choose_tomatoes_planter));
        tomatoesPlanter.put(VegetableTipEntry.COLUMN_IMAGE, mContext.getResources().getResourceEntryName(R.drawable.ic_cherry_tomato_circle));
        sqLiteDatabase.insert(VegetableTipEntry.TABLE_NAME, null, tomatoesPlanter);

        // Tip of tomatoes soil
        ContentValues tomatoesSoil = new ContentValues();
        tomatoesSoil.put(VegetableTipEntry.COLUMN_TITLE, mContext.getResources().getString(R.string.title_things_have_to_check_to_choose_tomatoes_soil));
        tomatoesSoil.put(VegetableTipEntry.COLUMN_DESCRIPTION, mContext.getResources().getString(R.string.article_the_frequency_of_tomatoes_watering));
        tomatoesSoil.put(VegetableTipEntry.COLUMN_IMAGE, mContext.getResources().getResourceEntryName(R.drawable.ic_cherry_tomato_circle));
        sqLiteDatabase.insert(VegetableTipEntry.TABLE_NAME, null, tomatoesSoil);

        // Tip of tomatoes planting pot
        ContentValues tomatoesPlantPlace = new ContentValues();
        tomatoesPlantPlace.put(VegetableTipEntry.COLUMN_TITLE, mContext.getResources().getString(R.string.title_where_to_place_tomatoes_flower_pot));
        tomatoesPlantPlace.put(VegetableTipEntry.COLUMN_DESCRIPTION, mContext.getResources().getString(R.string.article_where_to_place_tomatoes_flower_pot));
        tomatoesPlantPlace.put(VegetableTipEntry.COLUMN_IMAGE, mContext.getResources().getResourceEntryName(R.drawable.ic_cherry_tomato_circle));
        sqLiteDatabase.insert(VegetableTipEntry.TABLE_NAME, null, tomatoesPlantPlace);

        // Tip of tomatoes watering
        ContentValues tomatoesWatering = new ContentValues();
        tomatoesWatering.put(VegetableTipEntry.COLUMN_TITLE, mContext.getResources().getString(R.string.title_the_frequency_of_tomatoes_watering));
        tomatoesWatering.put(VegetableTipEntry.COLUMN_DESCRIPTION, mContext.getResources().getString(R.string.article_the_frequency_of_tomatoes_watering));
        tomatoesWatering.put(VegetableTipEntry.COLUMN_IMAGE, mContext.getResources().getResourceEntryName(R.drawable.ic_cherry_tomato_circle));
        sqLiteDatabase.insert(VegetableTipEntry.TABLE_NAME, null, tomatoesWatering);

        // Tip of tomatoes planter
        ContentValues strawberriesPlanter = new ContentValues();
        strawberriesPlanter.put(VegetableTipEntry.COLUMN_TITLE, mContext.getResources().getString(R.string.title_things_have_to_check_to_choose_strawberries_planter));
        strawberriesPlanter.put(VegetableTipEntry.COLUMN_DESCRIPTION, mContext.getResources().getString(R.string.article_things_have_to_check_to_choose_strawberries_planter));
        strawberriesPlanter.put(VegetableTipEntry.COLUMN_IMAGE, mContext.getResources().getResourceEntryName(R.drawable.ic_strawberry_circle));
        sqLiteDatabase.insert(VegetableTipEntry.TABLE_NAME, null, strawberriesPlanter);

        // Tip of rocks in the bottom of a pot
        ContentValues tomatoesBottomRocksInAPlanter = new ContentValues();
        tomatoesBottomRocksInAPlanter.put(VegetableTipEntry.COLUMN_TITLE, mContext.getResources().getString(R.string.title_things_have_to_check_to_choose_rocks_put_in_bottom_of_a_planter));
        tomatoesBottomRocksInAPlanter.put(VegetableTipEntry.COLUMN_DESCRIPTION, mContext.getResources().getString(R.string.article_things_have_to_check_to_choose_rocks_put_in_bottom_of_a_planter));
        tomatoesBottomRocksInAPlanter.put(VegetableTipEntry.COLUMN_IMAGE, mContext.getResources().getResourceEntryName(R.drawable.ic_cherry_tomato_circle));
        sqLiteDatabase.insert(VegetableTipEntry.TABLE_NAME, null, tomatoesBottomRocksInAPlanter);
    }
}
