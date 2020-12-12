public abstract class Middleware {
	
    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String usuario, String password);
    
    public abstract boolean accion(String usuario);

    protected boolean checkNext(String usuario, String password) {
        if (next == null) {
            return true;
        }
        return next.check(usuario, password);
    }
}