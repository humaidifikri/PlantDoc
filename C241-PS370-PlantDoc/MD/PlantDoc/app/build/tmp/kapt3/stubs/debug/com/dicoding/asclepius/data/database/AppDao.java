package com.dicoding.asclepius.data.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u000b\u001a\u00020\fH\'J\"\u0010\r\u001a\u00020\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000f\"\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/dicoding/asclepius/data/database/AppDao;", "", "delete", "", "classificationResult", "Lcom/dicoding/asclepius/data/database/ClassificationResult;", "(Lcom/dicoding/asclepius/data/database/ClassificationResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "Landroidx/lifecycle/LiveData;", "", "getClassificationResultById", "id", "", "insert", "classificationResults", "", "([Lcom/dicoding/asclepius/data/database/ClassificationResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface AppDao {
    
    @androidx.room.Query(value = "SELECT * FROM classificationresult ORDER BY timestamp DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dicoding.asclepius.data.database.ClassificationResult>> getAll();
    
    @androidx.room.Query(value = "SELECT * FROM classificationresult WHERE id = :id")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.dicoding.asclepius.data.database.ClassificationResult> getClassificationResultById(int id);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.dicoding.asclepius.data.database.ClassificationResult[] classificationResults, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.dicoding.asclepius.data.database.ClassificationResult classificationResult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}