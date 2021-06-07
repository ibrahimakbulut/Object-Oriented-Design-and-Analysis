public class Camera_4xzoom implements Camera{

    int pixelOffrontcamera;
    int pixelOfrearcamera;


    public Camera_4xzoom(int pixelOffrontcamera,int pixelOfrearcamera){
        this.pixelOffrontcamera=pixelOffrontcamera;
        this.pixelOfrearcamera=pixelOfrearcamera;
    }

    public String toString(){
        return "Camera: " + pixelOffrontcamera + " Mp front, " + pixelOfrearcamera + " Mp rear, Opt 4x zoom";
    }
    public void functiondump(){
        return;
    }
}
