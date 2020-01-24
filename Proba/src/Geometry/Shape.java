package Geometry;

import java.awt.Graphics;

public abstract class Shape implements Comparable {
		protected boolean selected;

		public Shape() {
			super();
		}

		public Shape(boolean selected) {
			this.selected = selected;
		}
		
		public abstract boolean contains(int x, int y);
		public abstract void draw(Graphics g);

		public boolean isSelected() {
			return selected;
		}

		public void setSelected(boolean selected) {
			this.selected = selected;
		}
		
		
}
