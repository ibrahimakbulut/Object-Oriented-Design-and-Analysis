public class Camera_2xzoom implements Camera{

    int pixelOffrontcamera;
    int pixelOfrearcamera;


    public Camera_2xzoom(int pixelOffrontcamera,int pixelOfrearcamera){
        this.pixelOffrontcamera=pixelOffrontcamera;
        this.pixelOfrearcamera=pixelOfrearcamera;
    }

    public String toString(){
        return "Camera: " + pixelOffrontcamera + " Mp front, " + pixelOfrearcamera + " Mp rear, Opt 2x zoom";
    }
    public void functiondump(){
        return;
    }
}
