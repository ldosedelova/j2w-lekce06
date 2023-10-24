package cz.czechitas.java2webapps.lekce6.controller.cokolada;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;

public class CokoladaForm {
    @NotBlank
    private String cokolada;

    @NotBlank
    private String jmeno;

    private String email;

    @AssertTrue
    private boolean obchodniPodminky;

    public String getCokolada() {
        return cokolada;
    }

    public void setCokolada(String cokolada) {
        this.cokolada = cokolada;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isObchodniPodminky() {
        return obchodniPodminky;
    }

    public void setObchodniPodminky(boolean obchodniPodminky) {
        this.obchodniPodminky = obchodniPodminky;
    }
}
