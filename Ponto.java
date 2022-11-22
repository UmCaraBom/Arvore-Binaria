package Arvore;

public class Ponto <interger> {
    
        private String valor;
        private Ponto esquerda;
        private Ponto direita;

        public Ponto(String valor) {
            this.valor = valor;
            this.esquerda = null;
            this.direita = null;
        }

        public String getValor() {
            return valor;
        }

        public void setValor(String valor) {
            this.valor = valor;
        }

        public Ponto getEsquerda() {
            return esquerda;
        }

        public void setEsquerda(Ponto esquerda) {
            this.esquerda = esquerda;
        }

        public Ponto getDireita() {
            return direita;
        }

        public void setDireita(Ponto direita) {
            this.direita = direita;
        }

    }