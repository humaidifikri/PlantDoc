package com.dicoding.asclepius;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0002J\"\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0017J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#H\u0016J-\u0010$\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020#0&2\u0006\u0010\'\u001a\u00020(H\u0016\u00a2\u0006\u0002\u0010)J\u001a\u0010*\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010#2\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0010H\u0002J\u0010\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020#H\u0002J\b\u00101\u001a\u00020\u0010H\u0002J\b\u00102\u001a\u00020\u0010H\u0002J\b\u00103\u001a\u00020\u0010H\u0002J\b\u00104\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/dicoding/asclepius/ScanFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/dicoding/asclepius/predict/helper/PepperbellNew$ClassifierListener;", "()V", "binding", "Lcom/dicoding/asclepius/databinding/FragmentScanBinding;", "cameraResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "currentImageUri", "Landroid/net/Uri;", "launcherGallery", "Landroidx/activity/result/PickVisualMediaRequest;", "pepperbellNew", "Lcom/dicoding/asclepius/predict/helper/PepperbellNew;", "analyzeImage", "", "moveToCrop", "uri", "onActivityResult", "requestCode", "", "resultCode", "data", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onError", "error", "", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResults", "results", "inferenceTime", "", "showImage", "showToast", "message", "startCamera", "startCameraWithPermissionCheck", "startGallery", "updateButtonStatus", "Companion", "app_debug"})
public final class ScanFragment extends androidx.fragment.app.Fragment implements com.dicoding.asclepius.predict.helper.PepperbellNew.ClassifierListener {
    private com.dicoding.asclepius.databinding.FragmentScanBinding binding;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri currentImageUri;
    private androidx.activity.result.ActivityResultLauncher<androidx.activity.result.PickVisualMediaRequest> launcherGallery;
    @org.jetbrains.annotations.Nullable()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> cameraResultLauncher;
    private com.dicoding.asclepius.predict.helper.PepperbellNew pepperbellNew;
    public static final int CAMERA_X_RESULT = 200;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "NewsFragment";
    private static final int REQUEST_CAMERA_PERMISSION = 100;
    @org.jetbrains.annotations.NotNull()
    public static final com.dicoding.asclepius.ScanFragment.Companion Companion = null;
    
    public ScanFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void startGallery() {
    }
    
    private final void startCameraWithPermissionCheck() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void startCamera() {
    }
    
    private final void moveToCrop(android.net.Uri uri) {
    }
    
    @java.lang.Override()
    @java.lang.Deprecated()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void showImage() {
    }
    
    private final void analyzeImage() {
    }
    
    private final void updateButtonStatus() {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void onResults(@org.jetbrains.annotations.Nullable()
    java.lang.String results, long inferenceTime) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/dicoding/asclepius/ScanFragment$Companion;", "", "()V", "CAMERA_X_RESULT", "", "REQUEST_CAMERA_PERMISSION", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}