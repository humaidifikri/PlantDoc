package com.dicoding.asclepius.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/dicoding/asclepius/data/repository/ResultRepository;", "", "dao", "Lcom/dicoding/asclepius/data/database/AppDao;", "(Lcom/dicoding/asclepius/data/database/AppDao;)V", "delete", "", "classificationResult", "Lcom/dicoding/asclepius/data/database/ClassificationResult;", "(Lcom/dicoding/asclepius/data/database/ClassificationResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "Landroidx/lifecycle/LiveData;", "", "getById", "id", "", "insert", "Companion", "app_debug"})
public final class ResultRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.dicoding.asclepius.data.database.AppDao dao = null;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.dicoding.asclepius.data.repository.ResultRepository instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.dicoding.asclepius.data.repository.ResultRepository.Companion Companion = null;
    
    public ResultRepository(@org.jetbrains.annotations.NotNull()
    com.dicoding.asclepius.data.database.AppDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.dicoding.asclepius.data.database.ClassificationResult>> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.dicoding.asclepius.data.database.ClassificationResult> getById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.dicoding.asclepius.data.database.ClassificationResult classificationResult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.dicoding.asclepius.data.database.ClassificationResult classificationResult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/dicoding/asclepius/data/repository/ResultRepository$Companion;", "", "()V", "instance", "Lcom/dicoding/asclepius/data/repository/ResultRepository;", "getInstance", "dao", "Lcom/dicoding/asclepius/data/database/AppDao;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dicoding.asclepius.data.repository.ResultRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.dicoding.asclepius.data.database.AppDao dao) {
            return null;
        }
    }
}