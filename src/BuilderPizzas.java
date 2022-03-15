public class BuilderPizzas {

    protected Pizzas _pizza;

    public Pizzas build(){

    return this._pizza;

    }

    public BuilderPizzas(){

    _pizza = new Pizzas();

    }

    public BuilderPizzas setTipoMasa (int tipoMasa){
        _pizza.setTipoMasa(tipoMasa);
        return this;
    }

    public BuilderPizzas setSize (int size){
        _pizza.setSize(size);
        return this;
    }

    public BuilderPizzas setRelleno (boolean relleno){
        _pizza.setRellena(relleno);
        return this;
    }

    public BuilderPizzas setCebolla (boolean cebolla){
        _pizza.setCebolla(cebolla);
        return this;
    }

    public BuilderPizzas setSinGluten (boolean sinGluten){
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    public BuilderPizzas setRecojida (int recojida){
        _pizza.setRecojida(recojida);
        return this;
    }

}
