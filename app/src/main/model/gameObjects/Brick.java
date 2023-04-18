package main.model.gameObjects;

import main.common.P2d;
import main.common.V2d;
import main.model.WorldImpl;
import main.model.gameObjects.bounding.RectBoundingBox;

public class Brick extends GameObjectImpl{

    private TypePower powerUp;
	private RectBoundingBox bbox;

    public Brick(final P2d pos, final Double widthToSet, final Double heightToSet, final int lifeToSet) {
        super(lifeToSet, new V2d(0, 0), WorldImpl.TypeObj.BRICK);
        this.powerUp = TypePower.NULL;
        this.bbox = new RectBoundingBox(pos, widthToSet, heightToSet);
    }

    public void setPowerUp(TypePower powerUpToSet) {
        this.powerUp = powerUpToSet;
    }

    public TypePower getPowerUp(){
        return this.powerUp;
    }

    @Override
    public P2d getPosition() {
        return bbox.getP2d();
    }
    
    @Override
    public void setPosition(P2d newPosition) {
        bbox.setP2d(newPosition);
    }
    
    @Override
    public RectBoundingBox getBBox() {
        return this.bbox;
    }

}
