
public class MyGame extends SimpleApplication {

    public static void main(String[] args) {
        MyGame app = new MyGame();
        app.start();
    }


    public void simpleInitApp() {
        Box box = new Box(1, 1, 1);
        Geometry geometry = new Geometry("Box", box);
        Material material = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        material.setColor("Color", ColorRGBA.Blue);
        geometry.setMaterial(material);
        rootNode.attachChild(geometry);
        cam.setLocation(new Vector3f(0, 0, 3));
    }

}
