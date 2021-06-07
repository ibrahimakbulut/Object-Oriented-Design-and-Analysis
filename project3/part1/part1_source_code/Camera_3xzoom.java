public class Camera_3xzoom implements Camera{

    int pixelOffrontcamera;
    int pixelOfrearcamera;


    public Camera_3xzoom(int pixelOffrontcamera,int pixelOfrearcamera){
        this.pixelOffrontcamera=pixelOffrontcamera;
        this.pixelOfrearcamera=pixelOfrearcamera;
    }

    public String toString(){
        return "Camera: " + pixelOffrontcamera + " Mp front, " + pixelOfrearcamera + " Mp rear, Opt 3x zoom";
    }
    public void functiondump(){
        return;
    }
}
