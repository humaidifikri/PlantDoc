package com.dicoding.asclepius.view.result;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/dicoding/asclepius/view/result/ResultActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/dicoding/asclepius/databinding/ActivityResultBinding;", "pepperbellNew", "Lcom/dicoding/asclepius/predict/helper/PepperbellNew;", "result", "Lcom/dicoding/asclepius/data/database/ClassificationResult;", "viewModel", "Lcom/dicoding/asclepius/view/result/ResultViewModel;", "getViewModel", "()Lcom/dicoding/asclepius/view/result/ResultViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "extractLabelFromJson", "", "json", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "updateView", "imageUri", "Landroid/net/Uri;", "label", "Companion", "app_debug"})
public final class ResultActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.dicoding.asclepius.databinding.ActivityResultBinding binding;
    private com.dicoding.asclepius.predict.helper.PepperbellNew pepperbellNew;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.dicoding.asclepius.data.database.ClassificationResult result;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_IMAGE_URI = "extra_image_uri";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_RESULT = "extra_result";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_INFERENCE_TIME = "extra_inference_time";
    @org.jetbrains.annotations.NotNull()
    public static final com.dicoding.asclepius.view.result.ResultActivity.Companion Companion = null;
    
    public ResultActivity() {
        super();
    }
    
    private final com.dicoding.asclepius.view.result.ResultViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.lang.String extractLabelFromJson(java.lang.String json) {
        return null;
    }
    
    private final void updateView(android.net.Uri imageUri, java.lang.String label) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/dicoding/asclepius/view/result/ResultActivity$Companion;", "", "()V", "EXTRA_IMAGE_URI", "", "EXTRA_INFERENCE_TIME", "EXTRA_RESULT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}