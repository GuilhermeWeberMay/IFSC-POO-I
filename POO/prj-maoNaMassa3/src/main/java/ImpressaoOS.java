public class ImpressaoOS {
    public static String imprimirOS (OrdemServico os){
        StringBuilder dados = new StringBuilder();

        dados.append(os.getNumero()).append("\n");
        dados.append(os.getAgenda()).append("\n");
        dados.append(os.getStatus()).append("\n");
        dados.append(os.getVeiculo().getCliente().getNome()).append("\n");
        dados.append(os.getVeiculo().getPlaca()).append("\n");
        dados.append(os.getVeiculo().getModelo().getDescricao()).append("\n");
        dados.append("========================\n");

        try {
            int nItem = 1;
            for (ItemOS itemOS : os.getItensOS()) {
                dados.append(nItem)
                        .append(" ")
                        .append(itemOS.getServico().getDescricao())
                        .append("\n");

                dados.append(itemOS.getServico().getValor())
                        .append("\n");

                nItem++;
            }
        } catch (ExceptionLavacao e) {
            dados.append(e.getMessage()).append("\n");
        }

        try {
            dados.append(os.getTotal()).append("\n");
            dados.append(os.getDesconto()).append("\n");
            dados.append(os.getTotal()).append("\n");
        } catch (ExceptionLavacao e) {
            dados.append(e.getMessage()).append("\n");
        }

        return dados.toString();
    }
}
