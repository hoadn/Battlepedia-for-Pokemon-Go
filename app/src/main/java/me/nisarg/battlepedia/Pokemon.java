package me.nisarg.battlepedia;

import android.content.Context;

/**
 * Created by nisarg on 20/7/16.
 */

public class Pokemon {
    public int ndex;
    public int cpMultiplier;
    public int hpBase;
    public int maxTotalCP;
    public int maxTotalHP;
    public String basicAttack;
    public String specialAttack;
    public int stamina;
    public int attack;
    public int defence;
    public String name;
    public String type1;
    public String type2;
    public String imageName;
    public static boolean isFav;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }
}