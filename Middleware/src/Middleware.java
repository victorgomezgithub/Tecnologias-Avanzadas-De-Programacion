public abstract class Middleware {
	
    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String usuario, String password, String accion);
    
    protected boolean checkNext(String usuario, String password, String accion) {
        if (next == null) {
            return true;
        }
        return next.check(usuario, password, accion);
    }
}