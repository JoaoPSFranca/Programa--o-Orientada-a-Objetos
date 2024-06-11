package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.dao.DAO;
import br.edu.ifsp.pep.dao.PessoaDao;
import br.edu.ifsp.pep.jdbc.PessoaDao_JDBC;
import br.edu.ifsp.pep.model.Pessoa;
import java.awt.Component;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PessoaForm extends javax.swing.JFrame {
    private DAO pessoaDao = new PessoaDao_JDBC();
    private boolean validarAlterar = false;
    
    public PessoaForm() {
        initComponents();
        controlarVisibilidadeBotoes(true);
        controlarVisibilidadeComponentes(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        pGeral = new javax.swing.JPanel();
        lblCadastro = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblDataNasc = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        dtDataChooser = new com.toedter.calendar.JDateChooser();
        tfNome = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        ftTelefone = new javax.swing.JFormattedTextField();
        ftEmail = new javax.swing.JFormattedTextField();
        lblTelefone = new javax.swing.JLabel();
        ftSalario = new javax.swing.JFormattedTextField();
        pButtons = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        ftCodigo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pGeral.setBackground(new java.awt.Color(186, 186, 202));
        pGeral.setForeground(new java.awt.Color(218, 165, 32));

        lblCadastro.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblCadastro.setText("Cadastro de Pessoa");
        lblCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNome.setText("Nome");

        lblDataNasc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDataNasc.setText("Data Nascimento");

        lblEndereco.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEndereco.setText("Endereço");

        lblEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEmail.setText("Email");

        lblSalario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSalario.setText("Salário");

        dtDataChooser.setDateFormatString("dd/MM/yyyy");

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        try {
            ftTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftTelefoneActionPerformed(evt);
            }
        });

        lblTelefone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTelefone.setText("Telefone");

        ftSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        ftSalario.setToolTipText("");

        pButtons.setBackground(new java.awt.Color(186, 186, 202));

        btnCadastrar.setBackground(new java.awt.Color(229, 241, 247));
        btnCadastrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(229, 241, 247));
        btnAlterar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(229, 241, 247));
        btnExcluir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnGravar.setBackground(new java.awt.Color(229, 241, 247));
        btnGravar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(229, 241, 247));
        btnCancelar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pButtonsLayout = new javax.swing.GroupLayout(pButtons);
        pButtons.setLayout(pButtonsLayout);
        pButtonsLayout.setHorizontalGroup(
            pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pButtonsLayout.createSequentialGroup()
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        pButtonsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnCadastrar, btnCancelar, btnExcluir, btnGravar});

        pButtonsLayout.setVerticalGroup(
            pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pButtonsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnGravar)
                    .addComponent(btnCancelar)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pButtonsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnCadastrar, btnCancelar, btnExcluir, btnGravar});

        lblCodigo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCodigo.setText("Código");

        ftCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        ftCodigo.setToolTipText("");
        ftCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftCodigoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pGeralLayout = new javax.swing.GroupLayout(pGeral);
        pGeral.setLayout(pGeralLayout);
        pGeralLayout.setHorizontalGroup(
            pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pGeralLayout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pGeralLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblCadastro))
                    .addComponent(pButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pGeralLayout.createSequentialGroup()
                        .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataNasc)
                            .addComponent(lblNome)
                            .addComponent(lblEndereco)
                            .addComponent(lblTelefone)
                            .addComponent(lblEmail)
                            .addComponent(lblSalario)
                            .addComponent(lblCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dtDataChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ftSalario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ftEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ftTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ftCodigo))))
                .addContainerGap())
        );
        pGeralLayout.setVerticalGroup(
            pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ftCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataNasc)
                    .addComponent(dtDataChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefone)
                    .addComponent(ftTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(ftEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario)
                    .addComponent(ftSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void ftTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftTelefoneActionPerformed

    //<editor-fold defaultstate="collapsed" desc="TEste">
    
    //</editor-fold>
    
    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        String nome = tfNome.getText();
        Date dataNascimento = dtDataChooser.getDate();
        String email = ftEmail.getText();
        String endereco = tfEndereco.getText();
        Number salario = (Number) ftSalario.getValue();
        String telefone = ftTelefone.getText();
        
        Pessoa p = new Pessoa(nome, dataNascimento, email, endereco, salario.doubleValue(), telefone);
        pessoaDao.adicionar(p);
        
        controlarVisibilidadeBotoes(true);
        controlarVisibilidadeComponentes(false);
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        controlarVisibilidadeComponentes(!validarAlterar);
        
        if(validarAlterar){
            btnCadastrar.setEnabled(true);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnGravar.setEnabled(false);
            btnCancelar.setEnabled(false);
            
            String nome = tfNome.getText();
            Date dataNascimento = dtDataChooser.getDate();
            String email = ftEmail.getText();
            String endereco = tfEndereco.getText();
            Number salario = (Number) ftSalario.getValue();
            String telefone = ftTelefone.getText();

            Pessoa p = new Pessoa(nome, dataNascimento, email, endereco, salario.doubleValue(), telefone);
            
            try {
                pessoaDao.alterar(p);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR);
            }
        } else {
            btnCadastrar.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnGravar.setEnabled(false);
            btnCancelar.setEnabled(true);
            
            try {
                Pessoa pessoa = pessoaDao.getPessoa(1);
                tfNome.setText(pessoa.getNome());
                ftEmail.setText(pessoa.getEmail());
                tfEndereco.setText(pessoa.getEndereco());
                ftTelefone.setText(pessoa.getTelefone());
                dtDataChooser.setDate(pessoa.getDataNascimento());
                ftSalario.setValue(pessoa.getSalario()); 
                
                ftCodigo.setEnabled(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR);
            }
        }
        
        validarAlterar = !validarAlterar;
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        btnCadastrar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnGravar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        controlarVisibilidadeComponentes(true);
        limparCampos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        controlarVisibilidadeBotoes(true);
        controlarVisibilidadeComponentes(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void ftCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftCodigoKeyTyped
        Number codigo = (Number) ftCodigo.getValue();
        Pessoa pessoa;
        try {
            pessoa = pessoaDao.getPessoa(codigo.intValue());
            tfNome.setText(pessoa.getNome());
            ftEmail.setText(pessoa.getEmail());
            tfEndereco.setText(pessoa.getEndereco());
            ftTelefone.setText(pessoa.getTelefone());
            dtDataChooser.setDate(pessoa.getDataNascimento());
            ftSalario.setValue(pessoa.getSalario()); 
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR);
        }
    }//GEN-LAST:event_ftCodigoKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private com.toedter.calendar.JDateChooser dtDataChooser;
    private javax.swing.JFormattedTextField ftCodigo;
    private javax.swing.JFormattedTextField ftEmail;
    private javax.swing.JFormattedTextField ftSalario;
    private javax.swing.JFormattedTextField ftTelefone;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pButtons;
    private javax.swing.JPanel pGeral;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

    private void controlarVisibilidadeBotoes(Boolean status){
        btnCadastrar.setEnabled(status);
        btnAlterar.setEnabled(status);
        btnExcluir.setEnabled(status);
        
        btnGravar.setEnabled(!status);
        btnCancelar.setEnabled(!status);
    }

    private void controlarVisibilidadeComponentes(boolean status) {
        Component componentes[] = pGeral.getComponents();
        for (Component componente : componentes) {
            if (!(componente instanceof JLabel)){
                componente.setEnabled(status);
            }
        }
        
        ftCodigo.setEnabled(false);
    }
    
    private void limparCampos() {
        tfNome.setText("");
        ftEmail.setText("");
        tfEndereco.setText("");
        ftTelefone.setText("");
        ftSalario.setValue(0);
        dtDataChooser.setDate(null);
    }
}
