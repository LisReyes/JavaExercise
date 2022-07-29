class libro {
    protected String titulo,ISBN;
    protected boolean abierto = false;
    protected int numPaginas,paginaActual=0;
    public libro(){}

    public void Abrir(){
        abierto = true;
    }
    public void Cerrado(){
        abierto = false;
    }
}
