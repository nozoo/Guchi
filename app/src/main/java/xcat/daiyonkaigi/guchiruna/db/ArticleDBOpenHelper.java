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

        //【奥村追加】ネガポジ用のテーブル
        db.execSQL("create table negapoji(" +
                "id INTEGER PRIMARY KEY " +
                ",Pozi REAR " +
                ",Nega REAR " +
                ",Year INTEGER " +
                ",Month INTEGER " +
                ",Day INTEGER " +
                ");");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
