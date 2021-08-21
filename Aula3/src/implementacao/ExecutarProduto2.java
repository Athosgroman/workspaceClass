package implementacao;

import javax.swing.JOptionPane;

import beans.Produto;

public class ExecutarProduto2 {

	public static void main(String[] args) {

		int resp;
		Produto impressora = new Produto();
		
		impressora.setDescricao("deskJet");
		System.out.println(impressora.getDescricao());
				
		impressora.setDescricao(JOptionPane.showInputDialog("Descricao"));
		impressora.setMarca(JOptionPane.showInputDialog("Marca"));
		impressora.setValor(Float.parseFloat(JOptionPane.showInputDialog("Preço")));
		impressora.setPromocao(false);
		
		resp = JOptionPane.showConfirmDialog(null,"Promocão?", "digite",JOptionPane.YES_NO_OPTION);
		
		if (resp == 0) 
		    impressora.setPromocao(true);
		
		System.out.println(impressora.detalhe());
				
		
		// Construtor ja com as informações
		
		Produto note = new Produto(JOptionPane.showInputDialog("Descricao"),
								JOptionPane.showInputDialog("Marca"),
								Float.parseFloat(JOptionPane.showInputDialog("Preço")),
								Boolean.parseBoolean(JOptionPane.showInputDialog("Promoçao?")));
		
		System.out.println(note.detalhe());
		
	}

}
