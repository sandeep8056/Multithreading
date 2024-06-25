package joinThreadExample;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Mythread thread = new Mythread();
		
		
		Thread t = new Thread(thread);
//		t.start();
//		
//		t.join(10000);
//		
//		for(int i =0;i<10;i++) {
//			System.out.println("Main called");
//			
//			
//		}
		
		/*
		 * 
		 * URI uri = ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("/project-planning/active-sprint/details/{projectId}/{issueId}")
                .buildAndExpand(projectId, issueId)
                .toUri();

        return ResponseEntity.ok(uri.toString());
		 * 
		 * 
		 */
		//
		
		thread.mt = Thread.currentThread();
		
		t.start();
		
		for(int i =0;i<10;i++) {
			System.out.println("Main thread");
			
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
		
		
	}

}
