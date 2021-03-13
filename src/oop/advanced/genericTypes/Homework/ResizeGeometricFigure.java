package oop.advanced.genericTypes.Homework;

public class ResizeGeometricFigure<T extends GeometricObject>{
    private T geometricObject;
    private int percent;

    public ResizeGeometricFigure(T geometricObject){
        this.geometricObject = geometricObject;
    }

    public void resize(){
        geometricObject.setOneDimension(geometricObject.getDimension()*((100+percent)/100));
    }

    public T getGeometricObject(){
        return geometricObject;
    }
}
