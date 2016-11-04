package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by ReaL PC on 11/4/2016.
 */

public final class PetContract {

    public PetContract() {
    }

    public static abstract class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";

        public static final String COLUMN_PET_ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";


        /**
         * Possible values for the style of the headphone.
         */
        public static final int STYLE_UNKNWON = 0;
        public static final int STYLE_MALE = 1;
        public static final int STYLE_FEMALE = 2;


    }
}
