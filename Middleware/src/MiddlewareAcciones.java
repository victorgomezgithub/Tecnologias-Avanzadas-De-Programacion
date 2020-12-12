public abstract class MiddlewareAcciones {
	
    private MiddlewareAcciones next;

    public MiddlewareAcciones linkWith(MiddlewareAcciones next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String usuario, String password);

    protected boolean checkNext(String usuario, String password) {
        if (next == null) {
            return true;
        }
        return next.check(usuario, password);
    }
}