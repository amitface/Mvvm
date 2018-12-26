package hcg.com.mvvvm.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Word.class}, version = 1, exportSchema = false)
public abstract class WordRoomDatabase extends RoomDatabase {
   public abstract WordDao wordDao();

   private static volatile WordRoomDatabase INSTANCE;

   static WordRoomDatabase getDatabase(final Context context) {
      if (INSTANCE == null) {
         synchronized (WordRoomDatabase.class) {
            if (INSTANCE == null) {
               // Create database here
               // Create database here
               INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                       WordRoomDatabase.class, "word_database")
                       .build();
            }
         }
      }
      return INSTANCE;
   }

}