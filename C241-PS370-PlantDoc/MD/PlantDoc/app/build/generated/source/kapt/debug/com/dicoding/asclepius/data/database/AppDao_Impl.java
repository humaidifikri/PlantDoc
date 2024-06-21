package com.dicoding.asclepius.data.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDao_Impl implements AppDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ClassificationResult> __insertionAdapterOfClassificationResult;

  private final EntityDeletionOrUpdateAdapter<ClassificationResult> __deletionAdapterOfClassificationResult;

  public AppDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfClassificationResult = new EntityInsertionAdapter<ClassificationResult>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `ClassificationResult` (`id`,`timestamp`,`image_uri`,`label`) VALUES (?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ClassificationResult entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        statement.bindLong(2, entity.getTimestamp());
        if (entity.getImageUri() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getImageUri());
        }
        if (entity.getLabel() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getLabel());
        }
      }
    };
    this.__deletionAdapterOfClassificationResult = new EntityDeletionOrUpdateAdapter<ClassificationResult>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `ClassificationResult` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ClassificationResult entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
      }
    };
  }

  @Override
  public Object insert(final ClassificationResult[] classificationResults,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfClassificationResult.insert(classificationResults);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final ClassificationResult classificationResult,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfClassificationResult.handle(classificationResult);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public LiveData<List<ClassificationResult>> getAll() {
    final String _sql = "SELECT * FROM classificationresult ORDER BY timestamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"classificationresult"}, false, new Callable<List<ClassificationResult>>() {
      @Override
      @Nullable
      public List<ClassificationResult> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfImageUri = CursorUtil.getColumnIndexOrThrow(_cursor, "image_uri");
          final int _cursorIndexOfLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "label");
          final List<ClassificationResult> _result = new ArrayList<ClassificationResult>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ClassificationResult _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final String _tmpImageUri;
            if (_cursor.isNull(_cursorIndexOfImageUri)) {
              _tmpImageUri = null;
            } else {
              _tmpImageUri = _cursor.getString(_cursorIndexOfImageUri);
            }
            final String _tmpLabel;
            if (_cursor.isNull(_cursorIndexOfLabel)) {
              _tmpLabel = null;
            } else {
              _tmpLabel = _cursor.getString(_cursorIndexOfLabel);
            }
            _item = new ClassificationResult(_tmpId,_tmpTimestamp,_tmpImageUri,_tmpLabel);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<ClassificationResult> getClassificationResultById(final int id) {
    final String _sql = "SELECT * FROM classificationresult WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[] {"classificationresult"}, false, new Callable<ClassificationResult>() {
      @Override
      @Nullable
      public ClassificationResult call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfImageUri = CursorUtil.getColumnIndexOrThrow(_cursor, "image_uri");
          final int _cursorIndexOfLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "label");
          final ClassificationResult _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final String _tmpImageUri;
            if (_cursor.isNull(_cursorIndexOfImageUri)) {
              _tmpImageUri = null;
            } else {
              _tmpImageUri = _cursor.getString(_cursorIndexOfImageUri);
            }
            final String _tmpLabel;
            if (_cursor.isNull(_cursorIndexOfLabel)) {
              _tmpLabel = null;
            } else {
              _tmpLabel = _cursor.getString(_cursorIndexOfLabel);
            }
            _result = new ClassificationResult(_tmpId,_tmpTimestamp,_tmpImageUri,_tmpLabel);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
