public class itensDoPedido{
        private String nomeDoPrato;
        private double precoDoPrato;
        private int quantidade;

        public itensDoPedido(String nomeDoPrato, double precoDoPrato, int quantidade){
            this.nomeDoPrato = nomeDoPrato;
            this.precoDoPrato = precoDoPrato;
            this.quantidade = quantidade;
        }
        
        public double calcularTotal(){
            return precoDoPrato * quantidade;
        }
        
        public String toString(){
            return quantidade + "x " + nomeDoPrato + " (R$ " + precoDoPrato + " cada) - Total: R$ " + calcularTotal();
    }
}