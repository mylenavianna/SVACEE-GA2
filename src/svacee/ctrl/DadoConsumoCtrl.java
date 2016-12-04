package svacee.ctrl;

//@autor Lorena, Mylena, Joás

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import svacee.model.DadoConsumo;

public class DadoConsumoCtrl {

    private File arq;
    private int testeArq;
    
    private List<DadoConsumo> dados = new ArrayList<>();
    private List<String> pontoColetaLista = new ArrayList<>();
    private List<DadoConsumo> graficoLista = new ArrayList<>();
    
   public void obterDadosCSV(File arq) throws FileNotFoundException, IOException {

        setArq(arq);

        String linha = "";
        String[] linhas;
        String[] coluna;

        BufferedReader br = null;
        FileReader fr = new FileReader(arq);
        
        br = new BufferedReader(fr);

        DadoConsumo dc;

        while ((linha = br.readLine()) != null) {
            linhas = linha.split(";");

            for (String v : linhas) {
                coluna = v.split(",");

                dc = new DadoConsumo();

                dc.setDataHora(Timestamp.valueOf(coluna[0]));
                dc.setIdColeta(coluna[1]);
                dc.setValorKwH(Double.parseDouble(coluna[2]));

                getDados().add(dc);
            }
        }
        setTesteArq(2);
    }
    
    public void preencherPontoColeta() {
        for (DadoConsumo sdc : getDados()) {
            if (!pontoColetaLista.contains(sdc.getIdColeta())) {
                getPontoColetaLista().add(sdc.getIdColeta());
            }
        }
    }

    public void preencherGrafico(String item) {
        for (DadoConsumo sdc : getDados()) {
            if (sdc.getIdColeta().equalsIgnoreCase(item)) {
                sdc.getDataHora();
                sdc.getValorKwH();
                getGraficoLista().add(sdc);

            }
        }
    }

    public int getTesteArq() {
        return testeArq;
    }

    public void setTesteArq(int testeArq) {
        this.testeArq = testeArq;
    }

    
    
    public List<String> getPontoColetaLista() {
        return pontoColetaLista;
    }

    public void setPontoColetaLista(List<String> pontoColetaLista) {
        this.pontoColetaLista = pontoColetaLista;
    }

    public List<DadoConsumo> getGraficoLista() {
        return graficoLista;
    }

    public void setGraficoLista(List<DadoConsumo> graficoLista) {
        this.graficoLista = graficoLista;
    }
    
    public File getArq() {
        return arq;
    }

    public void setArq(File arq) {
        this.arq = arq;
    }

    public List<DadoConsumo> getDados() {
        return dados;
    }

    public void setDados(List<DadoConsumo> dados) {
        this.dados = dados;
    }
}