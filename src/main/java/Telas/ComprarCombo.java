/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import com.sun.tools.javac.Main;
import java.awt.CardLayout;
import java.awt.Color;

/**
 *
 * @author santi
 */
public class ComprarCombo extends javax.swing.JFrame {

    /**
     * Creates new form ComprarCombo
     */
    
    CardLayout cardLayout;
    
    public ComprarCombo() {
        initComponents();
        cardLayout = (CardLayout) (mainCard.getLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        but1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        but2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        but3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        but4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        but5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        mainCard = new javax.swing.JPanel();
        perfil = new javax.swing.JPanel();
        Header2 = new javax.swing.JLabel();
        combos = new javax.swing.JPanel();
        Header1 = new javax.swing.JLabel();
        desc3 = new javax.swing.JLabel();
        desc1 = new javax.swing.JLabel();
        desc2 = new javax.swing.JLabel();
        subtitle1 = new javax.swing.JLabel();
        Combo1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Combo2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Combo3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Filmes = new javax.swing.JPanel();
        Header3 = new javax.swing.JLabel();
        Sessoes = new javax.swing.JPanel();
        Header4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Combo");
        setName("frame"); // NOI18N
        setPreferredSize(null);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        Menu.setBackground(new java.awt.Color(51, 0, 102));
        Menu.setMaximumSize(new java.awt.Dimension(120, 32767));
        Menu.setMinimumSize(new java.awt.Dimension(107, 107));
        Menu.setPreferredSize(new java.awt.Dimension(120, 497));

        but1.setBackground(new java.awt.Color(140, 101, 255));
        but1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but1MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Perfil");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout but1Layout = new javax.swing.GroupLayout(but1);
        but1.setLayout(but1Layout);
        but1Layout.setHorizontalGroup(
            but1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        but1Layout.setVerticalGroup(
            but1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        but2.setBackground(new java.awt.Color(102, 51, 255));
        but2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Filmes");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout but2Layout = new javax.swing.GroupLayout(but2);
        but2.setLayout(but2Layout);
        but2Layout.setHorizontalGroup(
            but2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        but2Layout.setVerticalGroup(
            but2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        but3.setBackground(new java.awt.Color(102, 51, 255));
        but3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sessões");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout but3Layout = new javax.swing.GroupLayout(but3);
        but3.setLayout(but3Layout);
        but3Layout.setHorizontalGroup(
            but3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        but3Layout.setVerticalGroup(
            but3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        but4.setBackground(new java.awt.Color(102, 51, 255));
        but4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Combos");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout but4Layout = new javax.swing.GroupLayout(but4);
        but4.setLayout(but4Layout);
        but4Layout.setHorizontalGroup(
            but4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        but4Layout.setVerticalGroup(
            but4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        but5.setBackground(new java.awt.Color(102, 51, 255));
        but5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sair");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout but5Layout = new javax.swing.GroupLayout(but5);
        but5.setLayout(but5Layout);
        but5Layout.setHorizontalGroup(
            but5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        but5Layout.setVerticalGroup(
            but5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(but5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(but3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(but4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(but5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(but1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(but2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        getContentPane().add(Menu);

        mainCard.setBackground(new java.awt.Color(0, 0, 51));
        mainCard.setLayout(new java.awt.CardLayout());

        perfil.setBackground(new java.awt.Color(0, 0, 51));
        perfil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        perfil.setMaximumSize(new java.awt.Dimension(771, 100));

        Header2.setBackground(new java.awt.Color(255, 255, 255));
        Header2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Header2.setForeground(new java.awt.Color(255, 255, 255));
        Header2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header2.setText("Perfil");
        Header2.setAlignmentX(0.5F);

        javax.swing.GroupLayout perfilLayout = new javax.swing.GroupLayout(perfil);
        perfil.setLayout(perfilLayout);
        perfilLayout.setHorizontalGroup(
            perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perfilLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(Header2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        perfilLayout.setVerticalGroup(
            perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfilLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Header2)
                .addContainerGap(437, Short.MAX_VALUE))
        );

        mainCard.add(perfil, "perfil");

        combos.setBackground(new java.awt.Color(0, 0, 51));
        combos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        combos.setMaximumSize(new java.awt.Dimension(771, 100));

        Header1.setBackground(new java.awt.Color(255, 255, 255));
        Header1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Header1.setForeground(new java.awt.Color(255, 255, 255));
        Header1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header1.setText("Escolha Seu Combo");
        Header1.setAlignmentX(0.5F);

        desc3.setBackground(new java.awt.Color(102, 102, 102));
        desc3.setForeground(new java.awt.Color(204, 204, 204));
        desc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc3.setText("20% de Desconto");

        desc1.setBackground(new java.awt.Color(102, 102, 102));
        desc1.setForeground(new java.awt.Color(204, 204, 204));
        desc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc1.setText("10% de Desconto");

        desc2.setBackground(new java.awt.Color(102, 102, 102));
        desc2.setForeground(new java.awt.Color(204, 204, 204));
        desc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc2.setText("15% de Desconto");

        subtitle1.setBackground(new java.awt.Color(153, 153, 153));
        subtitle1.setForeground(new java.awt.Color(204, 204, 204));
        subtitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitle1.setText("Escolha um combo e ganhe desconto no seu pedido");

        Combo1.setBackground(new java.awt.Color(51, 0, 102));

        jLabel1.setBackground(new java.awt.Color(51, 0, 102));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Refri + Chocolate");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout Combo1Layout = new javax.swing.GroupLayout(Combo1);
        Combo1.setLayout(Combo1Layout);
        Combo1Layout.setHorizontalGroup(
            Combo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Combo1Layout.setVerticalGroup(
            Combo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Combo2.setBackground(new java.awt.Color(51, 0, 102));

        jLabel3.setBackground(new java.awt.Color(51, 0, 102));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Refri + pipoca");
        jLabel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout Combo2Layout = new javax.swing.GroupLayout(Combo2);
        Combo2.setLayout(Combo2Layout);
        Combo2Layout.setHorizontalGroup(
            Combo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Combo2Layout.setVerticalGroup(
            Combo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Combo3.setBackground(new java.awt.Color(51, 0, 102));

        jLabel7.setBackground(new java.awt.Color(51, 0, 102));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Refri + Pipoca");
        jLabel7.setToolTipText("");
        jLabel7.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel8.setBackground(new java.awt.Color(51, 0, 102));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("+ Chocolate");
        jLabel8.setToolTipText("");
        jLabel8.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout Combo3Layout = new javax.swing.GroupLayout(Combo3);
        Combo3.setLayout(Combo3Layout);
        Combo3Layout.setHorizontalGroup(
            Combo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Combo3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Combo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Combo3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addComponent(jLabel7))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        Combo3Layout.setVerticalGroup(
            Combo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Combo3Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        javax.swing.GroupLayout combosLayout = new javax.swing.GroupLayout(combos);
        combos.setLayout(combosLayout);
        combosLayout.setHorizontalGroup(
            combosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(combosLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(combosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(combosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(subtitle1)
                        .addComponent(Header1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(combosLayout.createSequentialGroup()
                        .addGroup(combosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desc1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(combosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desc2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(combosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(desc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Combo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        combosLayout.setVerticalGroup(
            combosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(combosLayout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(Header1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(combosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Combo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(combosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desc1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        mainCard.add(combos, "combos");

        Filmes.setBackground(new java.awt.Color(0, 0, 51));
        Filmes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Filmes.setMaximumSize(new java.awt.Dimension(771, 100));

        Header3.setBackground(new java.awt.Color(255, 255, 255));
        Header3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Header3.setForeground(new java.awt.Color(255, 255, 255));
        Header3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header3.setText("Filmes");
        Header3.setAlignmentX(0.5F);

        javax.swing.GroupLayout FilmesLayout = new javax.swing.GroupLayout(Filmes);
        Filmes.setLayout(FilmesLayout);
        FilmesLayout.setHorizontalGroup(
            FilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilmesLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(Header3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        FilmesLayout.setVerticalGroup(
            FilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilmesLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Header3)
                .addContainerGap(437, Short.MAX_VALUE))
        );

        mainCard.add(Filmes, "filmes");

        Sessoes.setBackground(new java.awt.Color(0, 0, 51));
        Sessoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Sessoes.setMaximumSize(new java.awt.Dimension(771, 100));

        Header4.setBackground(new java.awt.Color(255, 255, 255));
        Header4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Header4.setForeground(new java.awt.Color(255, 255, 255));
        Header4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header4.setText("Sessoes");
        Header4.setAlignmentX(0.5F);

        javax.swing.GroupLayout SessoesLayout = new javax.swing.GroupLayout(Sessoes);
        Sessoes.setLayout(SessoesLayout);
        SessoesLayout.setHorizontalGroup(
            SessoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SessoesLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(Header4, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        SessoesLayout.setVerticalGroup(
            SessoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SessoesLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Header4)
                .addContainerGap(437, Short.MAX_VALUE))
        );

        mainCard.add(Sessoes, "sessoes");

        getContentPane().add(mainCard);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
   
    Color selected = new Color(140,101,255);
    Color reset = new Color(102,51,255);
    
    
    private void but2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but2MouseClicked
        cardLayout.show(mainCard, "filmes");
        but2.setBackground(selected);
        but1.setBackground(reset);
        but3.setBackground(reset);
        but4.setBackground(reset);
    }//GEN-LAST:event_but2MouseClicked

    private void but5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_but5MouseClicked

    private void but1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but1MouseClicked
        cardLayout.show(mainCard, "perfil");
        but2.setBackground(reset);
        but1.setBackground(selected);
        but3.setBackground(reset);
        but4.setBackground(reset);
    }//GEN-LAST:event_but1MouseClicked

    private void but3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but3MouseClicked
        cardLayout.show(mainCard, "sessoes");
        but2.setBackground(reset);
        but1.setBackground(reset);
        but3.setBackground(selected);
        but4.setBackground(reset);
    }//GEN-LAST:event_but3MouseClicked

    private void but4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but4MouseClicked
        cardLayout.show(mainCard, "combos");
        but2.setBackground(reset);
        but1.setBackground(reset);
        but3.setBackground(reset);
        but4.setBackground(selected);
    }//GEN-LAST:event_but4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ComprarCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprarCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprarCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprarCombo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprarCombo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Combo1;
    private javax.swing.JPanel Combo2;
    private javax.swing.JPanel Combo3;
    private javax.swing.JPanel Filmes;
    private javax.swing.JLabel Header1;
    private javax.swing.JLabel Header2;
    private javax.swing.JLabel Header3;
    private javax.swing.JLabel Header4;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Sessoes;
    private javax.swing.JPanel but1;
    private javax.swing.JPanel but2;
    private javax.swing.JPanel but3;
    private javax.swing.JPanel but4;
    private javax.swing.JPanel but5;
    private javax.swing.JPanel combos;
    private javax.swing.JLabel desc1;
    private javax.swing.JLabel desc2;
    private javax.swing.JLabel desc3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel mainCard;
    private javax.swing.JPanel perfil;
    private javax.swing.JLabel subtitle1;
    // End of variables declaration//GEN-END:variables
}