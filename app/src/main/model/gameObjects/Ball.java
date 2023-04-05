package main.model.gameObjects;

import main.common.*;
import main.model.gameObjects.bounding.CircleBoundingBox;

public class Ball extends GameObjectImpl {

	private CircleBoundingBox bbox;

	public Ball(final P2d center, final Double radius, final V2d vel){
		super(1,vel, TypeObj.BALL);
		this.bbox = new CircleBoundingBox(center, radius);
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
    public CircleBoundingBox getBBox() {
        return this.bbox;
    }
    
    // TODO two method only for ball
	public void flipVelOnY(){
		this.setSpeed(new V2d(this.getSpeed().getX(), -this.getSpeed().getY()));
	}
	public void flipVelOnX(){
		this.setSpeed(new V2d(-this.getSpeed().getX(), this.getSpeed().getY()));
	}
}
