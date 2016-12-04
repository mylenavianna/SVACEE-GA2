package svacee.gui;

//@autor Lorena, Mylena, Joás

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import svacee.ctrl.DadoConsumoCtrl;
import svacee.model.DadoConsumo;

public class TelaInicial extends javax.swing.JFrame {

    DadoConsumoCtrl dcc = new DadoConsumoCtrl();
    private String itemSelecionado;
    
    
    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jtpAbas14 = new javax.swing.JTabbedPane();
        jpDadosTabular14 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTabelaDado = new javax.swing.JTable();
        jpDadosGrafico = new javax.swing.JPanel();
        jbVisualizarGrafico = new javax.swing.JButton();
        jlInfo = new javax.swing.JLabel();
        jcbPontoColeta = new javax.swing.JComboBox<String>();
        jpTelaInicial = new javax.swing.JPanel();
        jlImg = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jmbMenu = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmiObterDadosCSV = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();
        jmVisualizar = new javax.swing.JMenu();
        jmiTabelaDados = new javax.swing.JMenuItem();
        jmiGraficoConsumo = new javax.swing.JMenuItem();
        jmAjuda = new javax.swing.JMenu();
        jmiSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Inicial");

        jToolBar1.setRollover(true);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/gui/icones/arquivo.gif"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/gui/icones/tabela.png"))); // NOI18N
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator4);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/gui/icones/grafico.jpg"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator5);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/gui/icones/sobre.png"))); // NOI18N
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator7);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/gui/icones/sair.png"))); // NOI18N
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jtpAbas14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTabelaDado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data e Hora", "Equipamento Coleta", "Valor KwH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(jTabelaDado);

        javax.swing.GroupLayout jpDadosTabular14Layout = new javax.swing.GroupLayout(jpDadosTabular14);
        jpDadosTabular14.setLayout(jpDadosTabular14Layout);
        jpDadosTabular14Layout.setHorizontalGroup(
            jpDadosTabular14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosTabular14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpDadosTabular14Layout.setVerticalGroup(
            jpDadosTabular14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosTabular14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpAbas14.addTab("Tabela", jpDadosTabular14);

        jbVisualizarGrafico.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jbVisualizarGrafico.setText("Plotar Gráfico");
        jbVisualizarGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVisualizarGraficoActionPerformed(evt);
            }
        });

        jlInfo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlInfo.setText("Para plotar um gráfico, selecione um Equipamento");

        jcbPontoColeta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione..." }));
        jcbPontoColeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPontoColetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDadosGraficoLayout = new javax.swing.GroupLayout(jpDadosGrafico);
        jpDadosGrafico.setLayout(jpDadosGraficoLayout);
        jpDadosGraficoLayout.setHorizontalGroup(
            jpDadosGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosGraficoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpDadosGraficoLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jcbPontoColeta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpDadosGraficoLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jbVisualizarGrafico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDadosGraficoLayout.setVerticalGroup(
            jpDadosGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosGraficoLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jlInfo)
                .addGap(18, 18, 18)
                .addComponent(jcbPontoColeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(jbVisualizarGrafico)
                .addGap(140, 140, 140))
        );

        jtpAbas14.addTab("Visualizar Gráfico", jpDadosGrafico);

        jlImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/svacee/gui/icones/ener.png"))); // NOI18N
        jLabel1.setText("SVACEE");

        javax.swing.GroupLayout jpTelaInicialLayout = new javax.swing.GroupLayout(jpTelaInicial);
        jpTelaInicial.setLayout(jpTelaInicialLayout);
        jpTelaInicialLayout.setHorizontalGroup(
            jpTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTelaInicialLayout.createSequentialGroup()
                .addComponent(jLabel34)
                .addGroup(jpTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTelaInicialLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jlImg)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpTelaInicialLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))))
        );
        jpTelaInicialLayout.setVerticalGroup(
            jpTelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTelaInicialLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlImg)
                .addGap(39, 39, 39))
            .addGroup(jpTelaInicialLayout.createSequentialGroup()
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtpAbas14.addTab("Página Inicial", jpTelaInicial);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpAbas14, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtpAbas14, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jmbMenu.setBackground(new java.awt.Color(66, 127, 226));

        jmArquivo.setText("Arquivo");
        jmArquivo.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N

        jmiObterDadosCSV.setText("Obter Dados de CSV");
        jmiObterDadosCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiObterDadosCSVActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiObterDadosCSV);

        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiSair);

        jmbMenu.add(jmArquivo);

        jmVisualizar.setText("Visualizar");
        jmVisualizar.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N

        jmiTabelaDados.setText("Tabela de Dados");
        jmiTabelaDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTabelaDadosActionPerformed(evt);
            }
        });
        jmVisualizar.add(jmiTabelaDados);

        jmiGraficoConsumo.setText("Gráfico de Consumo");
        jmiGraficoConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGraficoConsumoActionPerformed(evt);
            }
        });
        jmVisualizar.add(jmiGraficoConsumo);

        jmbMenu.add(jmVisualizar);

        jmAjuda.setText("Ajuda");
        jmAjuda.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N

        jmiSobre.setText("Sobre");
        jmiSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSobreActionPerformed(evt);
            }
        });
        jmAjuda.add(jmiSobre);

        jmbMenu.add(jmAjuda);

        setJMenuBar(jmbMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void buscarArquivoCSV() {

        try {
            dcc.getDados().clear();
            JFileChooser jfc = new JFileChooser();
            int retorno = jfc.showOpenDialog(null);
            if (retorno == JFileChooser.APPROVE_OPTION) {
                File arq = jfc.getSelectedFile();

                dcc.obterDadosCSV(arq);
                dcc.preencherPontoColeta();
                preencherTabela();
                preencherComboBox();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public void preencherTabela() {
        DefaultTableModel model = (DefaultTableModel) jTabelaDado.getModel();
        model.getDataVector().removeAllElements();

        for (DadoConsumo sdc : dcc.getDados()) {
            model.addRow(new Object[]{sdc.getDataHora(), sdc.getIdColeta(), sdc.getValorKwH()});
        }
    }

    public void preencherComboBox() {
        jcbPontoColeta.removeAllItems();

        Iterator i = dcc.getPontoColetaLista().iterator();
        while (i.hasNext()) {
            jcbPontoColeta.addItem((String) i.next());
        }
    }

    public void criarGrafico() {
        if (dcc.getTesteArq()== 2) {
            if (jtpAbas14.getTabCount() == 4) {
                jtpAbas14.remove(3);
            }

            JPanel grafico = createChartPanel();
            jtpAbas14.add(grafico, "Gráfico de Consumo "+itemSelecionado);
            jtpAbas14.setSelectedComponent(grafico);
        } else {
            JOptionPane.showMessageDialog(this, "Erros Foram Encontrados Durante o processo de plotagem!"
                    + "\nPor Favor Tente Novamente!",
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

    }

    private JPanel createChartPanel() {
        String chartTitle = "Gráfico de Consumo: " + itemSelecionado;
        String xAxisLabel = "Horário Coleta";
        String yAxisLabel = "Valor em KwH";

        XYDataset dataset = createDataset();

        JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,
                xAxisLabel, yAxisLabel, dataset);

        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setRenderer(renderer);

        return new ChartPanel(chart);
    }

    private XYDataset createDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries linha = new XYSeries(itemSelecionado);

        SimpleDateFormat formataHora = new SimpleDateFormat("HH.mm");

        for (DadoConsumo dc : dcc.getGraficoLista()) {
            linha.add(Double.parseDouble(formataHora.format(dc.getDataHora())), dc.getValorKwH());
        }
        dataset.addSeries(linha);

        return dataset;
    }

    private void jmiTabelaDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTabelaDadosActionPerformed
        jtpAbas14.setSelectedComponent(jpDadosTabular14);        
    }//GEN-LAST:event_jmiTabelaDadosActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiObterDadosCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiObterDadosCSVActionPerformed
        buscarArquivoCSV();
    }//GEN-LAST:event_jmiObterDadosCSVActionPerformed

    private void jmiGraficoConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGraficoConsumoActionPerformed
        jtpAbas14.setSelectedComponent(jpDadosGrafico);
    }//GEN-LAST:event_jmiGraficoConsumoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TelaInfo obj= new TelaInfo();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jtpAbas14.setSelectedComponent(jpDadosGrafico);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jtpAbas14.setSelectedComponent(jpDadosTabular14);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buscarArquivoCSV();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbVisualizarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVisualizarGraficoActionPerformed
        criarGrafico();
    }//GEN-LAST:event_jbVisualizarGraficoActionPerformed

    private void jcbPontoColetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPontoColetaActionPerformed
        dcc.getGraficoLista().clear();
        String item = (String) jcbPontoColeta.getSelectedItem();
        dcc.preencherGrafico(item);
        itemSelecionado = item;
    }//GEN-LAST:event_jcbPontoColetaActionPerformed

    private void jmiSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSobreActionPerformed
  TelaInfo obj= new TelaInfo();
        obj.setVisible(true);
    }//GEN-LAST:event_jmiSobreActionPerformed

//    public void obterDadosCSV (método para ser usado em mais de um lugar)
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JTable jTabelaDado;
    private javax.swing.JTable jTabelaDados;
    private javax.swing.JTable jTabelaDados1;
    private javax.swing.JTable jTabelaDados10;
    private javax.swing.JTable jTabelaDados11;
    private javax.swing.JTable jTabelaDados12;
    private javax.swing.JTable jTabelaDados13;
    private javax.swing.JTable jTabelaDados2;
    private javax.swing.JTable jTabelaDados3;
    private javax.swing.JTable jTabelaDados4;
    private javax.swing.JTable jTabelaDados5;
    private javax.swing.JTable jTabelaDados6;
    private javax.swing.JTable jTabelaDados7;
    private javax.swing.JTable jTabelaDados8;
    private javax.swing.JTable jTabelaDados9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbVisualizarGrafico;
    private javax.swing.JComboBox<String> jcbPontoColeta;
    private javax.swing.JLabel jlImg;
    private javax.swing.JLabel jlInfo;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmVisualizar;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenuItem jmiGraficoConsumo;
    private javax.swing.JMenuItem jmiObterDadosCSV;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiSobre;
    private javax.swing.JMenuItem jmiTabelaDados;
    private javax.swing.JPanel jpDadosGrafico;
    private javax.swing.JPanel jpDadosTabular;
    private javax.swing.JPanel jpDadosTabular1;
    private javax.swing.JPanel jpDadosTabular10;
    private javax.swing.JPanel jpDadosTabular11;
    private javax.swing.JPanel jpDadosTabular12;
    private javax.swing.JPanel jpDadosTabular13;
    private javax.swing.JPanel jpDadosTabular14;
    private javax.swing.JPanel jpDadosTabular2;
    private javax.swing.JPanel jpDadosTabular3;
    private javax.swing.JPanel jpDadosTabular4;
    private javax.swing.JPanel jpDadosTabular5;
    private javax.swing.JPanel jpDadosTabular6;
    private javax.swing.JPanel jpDadosTabular7;
    private javax.swing.JPanel jpDadosTabular8;
    private javax.swing.JPanel jpDadosTabular9;
    private javax.swing.JPanel jpTelaInicial;
    private javax.swing.JTabbedPane jtpAbas;
    private javax.swing.JTabbedPane jtpAbas1;
    private javax.swing.JTabbedPane jtpAbas10;
    private javax.swing.JTabbedPane jtpAbas11;
    private javax.swing.JTabbedPane jtpAbas12;
    private javax.swing.JTabbedPane jtpAbas13;
    private javax.swing.JTabbedPane jtpAbas14;
    private javax.swing.JTabbedPane jtpAbas2;
    private javax.swing.JTabbedPane jtpAbas3;
    private javax.swing.JTabbedPane jtpAbas4;
    private javax.swing.JTabbedPane jtpAbas5;
    private javax.swing.JTabbedPane jtpAbas6;
    private javax.swing.JTabbedPane jtpAbas7;
    private javax.swing.JTabbedPane jtpAbas8;
    private javax.swing.JTabbedPane jtpAbas9;
    // End of variables declaration//GEN-END:variables
}
