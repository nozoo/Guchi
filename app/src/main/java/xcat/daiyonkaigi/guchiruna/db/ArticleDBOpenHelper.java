package xcat.daiyonkaigi.guchiruna.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * SQLiteデータベースを生成するクラスです。
 */
public class ArticleDBOpenHelper extends SQLiteOpenHelper {

    public ArticleDBOpenHelper(Context context) {
        super(context, "guchi", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table article(" + "article text," + "date text" + ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
