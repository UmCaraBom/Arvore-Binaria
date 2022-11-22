package Arvore;

//criar arvore binaria que imprime em ordem crescente, normal, pre-ordem e pos-ordem 
public class Arvore<interger> {
    
        private Ponto raiz;
    
        public Arvore() {
            this.raiz = null;
        }
    
        public void inserir(String valor) {
            Ponto novo = new Ponto(valor);
            if (raiz == null) {
                raiz = novo;
            } else {
                Ponto atual = raiz;
                Ponto anterior = null;
                while (atual != null) {
                    anterior = atual;
                    if (Integer.parseInt(valor) < Integer.parseInt(atual.getValor())) {
                        atual = atual.getEsquerda();
                    } else {
                        atual = atual.getDireita();
                    }
                }
                if (Integer.parseInt(valor) < Integer.parseInt(anterior.getValor())) {
                    anterior.setEsquerda(novo);
                } else {
                    anterior.setDireita(novo);
                }
            }
        }
    
        public void imprimirOrdemCrescente() {
            imprimirOrdemCrescente(raiz);
        }
    
        private void imprimirOrdemCrescente(Ponto ponto) {
            if (ponto != null) {
                imprimirOrdemCrescente(ponto.getEsquerda());
                System.out.println(ponto.getValor());
                imprimirOrdemCrescente(ponto.getDireita());
            }
        }
    
        public void imprimirPreOrdem() {
            imprimirPreOrdem(raiz);
        }
    
        private void imprimirPreOrdem(Ponto ponto) {
            if (ponto != null) {
                System.out.println(ponto.getValor());
                imprimirPreOrdem(ponto.getEsquerda());
                imprimirPreOrdem(ponto.getDireita());
            }
        }
    
        public void imprimirPosOrdem() {
            imprimirPosOrdem(raiz);
        }
    
        private void imprimirPosOrdem(Ponto ponto) {
            if (ponto != null) {
                imprimirPosOrdem(ponto.getEsquerda());
                imprimirPosOrdem(ponto.getDireita());
                System.out.println(ponto.getValor());
            }
        }
        //metodo para imprimir em ordem normal que utiliza o primeiro valor como raiz
        public void imprimirOrdem() {
            imprimirOrdem(raiz);

        }
        private void imprimirOrdem(Ponto raiz) {
            if (raiz != null) {
                System.out.println(raiz.getValor());
                imprimirOrdem(raiz.getDireita());
                imprimirOrdem(raiz.getEsquerda());
            }
        }
    
    }
