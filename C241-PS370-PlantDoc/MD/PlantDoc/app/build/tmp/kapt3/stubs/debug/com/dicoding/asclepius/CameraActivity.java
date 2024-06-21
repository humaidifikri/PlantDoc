package com.dicoding.asclepius;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0014J\b\u0010\u0019\u001a\u00020\u0014H\u0014J+\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00a2\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0014H\u0014J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/dicoding/asclepius/CameraActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "REQUEST_CODE_PERMISSIONS", "", "REQUIRED_PERMISSIONS", "", "", "[Ljava/lang/String;", "binding", "Lcom/dicoding/asclepius/databinding/ActivityCameraBinding;", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "cameraSelector", "Landroidx/camera/core/CameraSelector;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "allPermissionsGranted", "", "hideSystemUI", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onRequestPermissionsResult", "requestCode", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "startCamera", "takePhoto", "app_debug"})
public final class CameraActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.dicoding.asclepius.databinding.ActivityCameraBinding binding;
    @org.jetbrains.annotations.Nullable()
    private androidx.camera.core.ImageCapture imageCapture;
    @org.jetbrains.annotations.NotNull()
    private androidx.camera.core.CameraSelector cameraSelector;
    @org.jetbrains.annotations.Nullable()
    private androidx.camera.lifecycle.ProcessCameraProvider cameraProvider;
    private final int REQUEST_CODE_PERMISSIONS = 10;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] REQUIRED_PERMISSIONS = {"android.permission.CAMERA"};
    
    public CameraActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    private final boolean allPermissionsGranted() {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void takePhoto() {
    }
    
    private final void startCamera() {
    }
    
    private final void hideSystemUI() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}