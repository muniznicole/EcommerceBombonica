package br.unitins.topicos1.model;

public enum TipoChocolate {
    AO_LEITE(1, "Ao Leite"),
    AMARGO(2, "Amargo"),
    BRANCO(3, "Branco"),
    MEIO_AMARGO(4, "Meio Amargo");

    private int id;
    private String label;

    TipoChocolate(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public static TipoChocolate valueOf(Integer id) throws IllegalArgumentException {
        if (id == null)
            return null;
        for(TipoChocolate tipoChocolate : TipoChocolate.values()) {
            if (id.equals(tipoChocolate.getId()))
                return tipoChocolate;
        } 
        throw new IllegalArgumentException("Id inválido:" + id);
    }

    public String getTipoChocolate() {
        return null;
    }

}

