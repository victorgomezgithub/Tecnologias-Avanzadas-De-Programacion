public class Server {
	
    private Middleware middleware;

    
    public Server() {
    	
    }
    
    public Server(Middleware middlware) {
    	this.middleware = middlware;
    }
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean requestAction(String usuario, String password, String accion) {
        if (middleware.check(usuario, password,accion))
        {	
        	return true;
        }
        return false;
    }
    
    
}