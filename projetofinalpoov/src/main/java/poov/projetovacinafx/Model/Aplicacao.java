package poov.projetovacinafx.Model;

import java.time.LocalDate;

public class Aplicacao {
    private Long codigo;
    private LocalDate data;
    private Pessoa pessoa;
    private Vacina vacina;
    private Situacao situacao;

    public Aplicacao() {
    }

    public Aplicacao(LocalDate data, Pessoa pessoa, Vacina vacina, Situacao situacao) {
        this.data = data;
        this.pessoa = pessoa;
        this.vacina = vacina;
        this.situacao = situacao;
    }

    public Aplicacao(Long codigo, LocalDate data, Pessoa pessoa, Vacina vacina, Situacao situacao) {
        this.codigo = codigo;
        this.data = data;
        this.pessoa = pessoa;
        this.vacina = vacina;
        this.situacao = situacao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
        result = prime * result + ((vacina == null) ? 0 : vacina.hashCode());
        result = prime * result + ((situacao == null) ? 0 : situacao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aplicacao other = (Aplicacao) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        if (pessoa == null) {
            if (other.pessoa != null)
                return false;
        } else if (!pessoa.equals(other.pessoa))
            return false;
        if (vacina == null) {
            if (other.vacina != null)
                return false;
        } else if (!vacina.equals(other.vacina))
            return false;
        if (situacao == null) {
            if (other.situacao != null)
                return false;
        } else if (!situacao.equals(other.situacao))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Aplicacao [codigo=" + codigo + ", data=" + data + ", pessoa=" + pessoa + ", vacina=" + vacina
                + ", situacao=" + situacao + "]";
    }
}
