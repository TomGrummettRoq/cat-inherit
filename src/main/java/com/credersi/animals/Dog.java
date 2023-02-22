package com.credersi.animals;

public class Dog extends Animal {
	
	@Override
	public boolean feeds() {

		if (this.hunger > 0) {
			this.hunger -= 20;
		} else if (this.hunger < 0) {
			this.dies();
		} 
		return this.isAlive();
	}
}