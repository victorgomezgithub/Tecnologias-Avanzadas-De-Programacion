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

    public boolean logIn(String usuario, String password) {
        if (middleware.check(usuario, password))
        {	
        	AlmacenUsuarios.booleanUpdateLogin(usuario);
        	return true;
        }
        return false;
    }
    
    public boolean unlockUser(String usuario, String password) {
        if (middleware.accion(usuario))
        {	
        	return true;
        }
        return false;
    }
    
    public boolean desbloquearUsuario() {
    	return false;
    }
    
}