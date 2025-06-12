package model;

public class Organizador extends Pessoa {
    private String funcaoAdministrativa;

    public Organizador(String nome, String email, String funcaoAdministrativa) {
        super(nome, email);
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    // Getters and Setters
    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }
}