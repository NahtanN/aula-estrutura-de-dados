package aula.DAO;

import aula.modelo.modeloPessoa.Funcionario;

public class No {

    private Funcionario funcionario;
    private No proximoNo;

    public No(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.proximoNo = null;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public No getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

}
