package Human;

public class Human {

	//we are goint to inject object of heart
		private Heart heart;

		public Heart getHeart() {
			return heart;
		}

		public void setHeart(Heart heart) {
			this.heart = heart;
		}
		
		public void func() {
			heart.heart_fun();
		}

	
		
		
	}


