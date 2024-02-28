public class female_student implements Runnable {
	String notebook;
	String pencil;
	Thread t;

	female_student(String notebook, String pencil) {
	
		this.notebook = notebook;
		this.pencil = pencil;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		while (true) {
		// wait for the notebook to become available
			synchronized (notebook) {
			
				System.out.println(this + " has the notebook.");
				
				// now wait for pencil to become available.
				synchronized (pencil) {
					System.out.println(this + " has the pencil.");
					System.out.println(this + " has pencil and notebook so they can write");
				}
				
			}
		}
	}
}