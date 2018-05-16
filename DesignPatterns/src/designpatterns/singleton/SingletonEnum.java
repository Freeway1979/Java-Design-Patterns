package designpatterns.singleton;

/**
 *  Usage:
 *  SingletonEnum.INSTANCE.getCamera();
 */
public enum SingletonEnum {
    INSTANCE;
	
	//example class
	public static class Camera
    {
    }

    private Camera camera = null;
    private SingletonEnum()
    {
        camera = new Camera();
    }

    public Camera getCamera()
    {
        return camera;
    }
}
