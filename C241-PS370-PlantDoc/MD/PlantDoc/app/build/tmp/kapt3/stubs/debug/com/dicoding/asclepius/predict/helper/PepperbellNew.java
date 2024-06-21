package com.dicoding.asclepius.predict.helper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0002\u0012\u0013B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/dicoding/asclepius/predict/helper/PepperbellNew;", "", "context", "Landroid/content/Context;", "classifierListener", "Lcom/dicoding/asclepius/predict/helper/PepperbellNew$ClassifierListener;", "modelName", "", "(Landroid/content/Context;Lcom/dicoding/asclepius/predict/helper/PepperbellNew$ClassifierListener;Ljava/lang/String;)V", "classifyStaticImage", "", "imageUri", "Landroid/net/Uri;", "uploadImage", "bitmap", "Landroid/graphics/Bitmap;", "uriToBitmap", "uri", "ClassifierListener", "Companion", "app_debug"})
public final class PepperbellNew {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private final com.dicoding.asclepius.predict.helper.PepperbellNew.ClassifierListener classifierListener = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String modelName = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "PepperbellNew";
    @org.jetbrains.annotations.NotNull()
    public static final com.dicoding.asclepius.predict.helper.PepperbellNew.Companion Companion = null;
    
    public PepperbellNew(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.dicoding.asclepius.predict.helper.PepperbellNew.ClassifierListener classifierListener, @org.jetbrains.annotations.NotNull()
    java.lang.String modelName) {
        super();
    }
    
    public final void classifyStaticImage(@org.jetbrains.annotations.NotNull()
    android.net.Uri imageUri) {
    }
    
    private final void uploadImage(android.graphics.Bitmap bitmap) {
    }
    
    private final android.graphics.Bitmap uriToBitmap(android.net.Uri uri) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/dicoding/asclepius/predict/helper/PepperbellNew$ClassifierListener;", "", "onError", "", "error", "", "onResults", "results", "inferenceTime", "", "app_debug"})
    public static abstract interface ClassifierListener {
        
        public abstract void onError(@org.jetbrains.annotations.NotNull()
        java.lang.String error);
        
        public abstract void onResults(@org.jetbrains.annotations.Nullable()
        java.lang.String results, long inferenceTime);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/dicoding/asclepius/predict/helper/PepperbellNew$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}