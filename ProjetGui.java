import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;
import static java.util.logging.Level.parse;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*Projet POO Maxim Faraj/Alison Dos Santos L2 MIASHS TD4 */
public class ProjetGui extends javax.swing.JFrame {
    public ProjetGui() {
        initComponents();
        
        /*Change la couleur de fond (code RVB vert)*/
        Color fond=new Color (152,253,180);
        getContentPane().setBackground(fond);
       
        Object[][] datas=new Object[][]{
        };
        DefaultTableModel dataModel=(DefaultTableModel) table.getModel();
        
        for (Object[] data : datas) {
            dataModel.addRow(data);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        quitter = new javax.swing.JButton();
        ajouter = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        effacer = new javax.swing.JButton();
        importer = new javax.swing.JButton();
        exporter = new javax.swing.JButton();
        enregistrer = new javax.swing.JButton();
        classement = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        chanteur = new javax.swing.JLabel();
        ZTclassement = new javax.swing.JTextField();
        ZTtitre = new javax.swing.JTextField();
        ZTchanteur = new javax.swing.JTextField();
        ZTdatesortie = new javax.swing.JTextField();
        chanteur1 = new javax.swing.JLabel();
        ZTpoids = new javax.swing.JTextField();
        chanteur2 = new javax.swing.JLabel();
        chanteur3 = new javax.swing.JLabel();
        ecouter = new javax.swing.JButton();
        ZTtelecharge = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        rechercher = new javax.swing.JButton();
        ZtRecherche = new javax.swing.JTextField();
        filtrer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maxim & Alison ");
        setBackground(new java.awt.Color(204, 255, 204));

        quitter.setBackground(new java.awt.Color(255, 51, 0));
        quitter.setFont(new java.awt.Font("Bradley Hand ITC", 0, 12)); // NOI18N
        quitter.setIcon(new javax.swing.ImageIcon("C:\\Users\\33781\\Downloads\\quit.jpg")); // NOI18N
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });

        ajouter.setBackground(new java.awt.Color(0, 0, 0));
        ajouter.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        ajouter.setForeground(new java.awt.Color(255, 255, 255));
        ajouter.setText("Add");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });

        supprimer.setBackground(new java.awt.Color(0, 0, 0));
        supprimer.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        supprimer.setForeground(new java.awt.Color(255, 255, 255));
        supprimer.setText("Delete");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        modifier.setBackground(new java.awt.Color(0, 0, 0));
        modifier.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        modifier.setForeground(new java.awt.Color(255, 255, 255));
        modifier.setText("Edit");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(204, 204, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Classement", "Titre", "Chanteur", "Date sortie", "Poids (Mo)", "Nb d'ecoutes", "Telecharge"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        effacer.setBackground(new java.awt.Color(0, 0, 0));
        effacer.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        effacer.setForeground(new java.awt.Color(255, 255, 255));
        effacer.setText("Clear");
        effacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effacerActionPerformed(evt);
            }
        });

        importer.setBackground(new java.awt.Color(0, 0, 0));
        importer.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        importer.setForeground(new java.awt.Color(255, 255, 255));
        importer.setText("Import");
        importer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importerActionPerformed(evt);
            }
        });

        exporter.setBackground(new java.awt.Color(0, 0, 0));
        exporter.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        exporter.setForeground(new java.awt.Color(255, 255, 255));
        exporter.setText("Export");
        exporter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exporterActionPerformed(evt);
            }
        });

        enregistrer.setBackground(new java.awt.Color(0, 0, 0));
        enregistrer.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        enregistrer.setForeground(new java.awt.Color(255, 255, 255));
        enregistrer.setText("Save");
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });

        classement.setBackground(new java.awt.Color(0, 0, 0));
        classement.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        classement.setText("Classement");
        classement.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titre.setBackground(new java.awt.Color(0, 0, 0));
        titre.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        titre.setText("Titre");
        titre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        chanteur.setBackground(new java.awt.Color(0, 0, 0));
        chanteur.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        chanteur.setText("Chanteur");
        chanteur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ZTclassement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZTclassementActionPerformed(evt);
            }
        });

        ZTdatesortie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZTdatesortieActionPerformed(evt);
            }
        });

        chanteur1.setBackground(new java.awt.Color(0, 0, 0));
        chanteur1.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        chanteur1.setText("Date sortie");
        chanteur1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ZTpoids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZTpoidsActionPerformed(evt);
            }
        });

        chanteur2.setBackground(new java.awt.Color(0, 0, 0));
        chanteur2.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        chanteur2.setText("Poids (Mo)");
        chanteur2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        chanteur3.setBackground(new java.awt.Color(0, 0, 0));
        chanteur3.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        chanteur3.setText("Téléchargé");
        chanteur3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ecouter.setBackground(new java.awt.Color(0, 0, 0));
        ecouter.setFont(new java.awt.Font("Bradley Hand ITC", 0, 12)); // NOI18N
        ecouter.setIcon(new javax.swing.ImageIcon("C:\\Users\\33781\\Downloads\\listenmusic.jpg")); // NOI18N
        ecouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecouterActionPerformed(evt);
            }
        });

        ZTtelecharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZTtelechargeActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setText("         Max & Ali Spotify ");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        rechercher.setBackground(new java.awt.Color(0, 0, 0));
        rechercher.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        rechercher.setForeground(new java.awt.Color(255, 255, 255));
        rechercher.setIcon(new javax.swing.ImageIcon("C:\\Users\\33781\\Downloads\\loupe.jpg")); // NOI18N
        rechercher.setText("Search");
        rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherActionPerformed(evt);
            }
        });

        ZtRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZtRechercheActionPerformed(evt);
            }
        });

        filtrer.setBackground(new java.awt.Color(0, 0, 0));
        filtrer.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        filtrer.setForeground(new java.awt.Color(255, 255, 255));
        filtrer.setText("Downloaded music");
        filtrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrerActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/33781/Downloads/Spotify.jpg")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(232, 232, 232)
                                    .addComponent(ecouter, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(importer)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(exporter)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(supprimer)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(modifier)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chanteur, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ZTchanteur))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(classement, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ZTclassement))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ZTtitre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chanteur2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ZTpoids))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chanteur1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ZTdatesortie))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chanteur3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ZTtelecharge, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ajouter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enregistrer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(effacer))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(filtrer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rechercher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ZtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(classement)
                            .addComponent(ZTclassement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titre)
                            .addComponent(ZTtitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chanteur)
                            .addComponent(ZTchanteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chanteur1)
                            .addComponent(ZTdatesortie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chanteur2)
                            .addComponent(ZTpoids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ZTtelecharge)
                                .addGap(157, 173, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chanteur3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(modifier)
                                        .addComponent(supprimer)
                                        .addComponent(importer)
                                        .addComponent(exporter))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ajouter)
                                            .addComponent(effacer)
                                            .addComponent(enregistrer))
                                        .addGap(40, 40, 40)))
                                .addGap(23, 23, 23))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(ecouter, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ZtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(filtrer))
                    .addComponent(jLabel2))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Supprime une ligne selectionnée*/
    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
        /*getSelectedRow permet de connaitre le numero de la ligne selectionnée*/
        int i=table.getSelectedRow();
        DefaultTableModel dataModel=(DefaultTableModel) table.getModel();
        /*removeRow permet de supprimer la i ème ligne*/
        dataModel.removeRow(i);
    }//GEN-LAST:event_supprimerActionPerformed
    
    /*Ajoute une ligne en fonction des valeurs rentrées dans les différentes zones de texte*/
    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        /*Prend les valeurs de chaque zone de texte*/
        String varclassement=ZTclassement.getText();
        String vartitre=ZTtitre.getText();
        String varchanteur=ZTchanteur.getText();
        String datesortie=ZTdatesortie.getText();
        String poids=ZTpoids.getText();
        boolean vartelecharge;
        /*Vérifie que la checkBox est cochée avec isSelected()*/
        vartelecharge = ZTtelecharge.isSelected();
     
        DefaultTableModel dataModel = (DefaultTableModel) table.getModel();
        
        /*Crée une ligne avec 7 colonnes qui représentent nos différentes zones de texte*/
        Object[] row= new Object[7];
        
        /*Nos différentes zones de texte pour chaque colonne*/
        row[0]=varclassement;
        row[1]=vartitre;
        row[2]=varchanteur;
        row[3]=datesortie;
        row[4]=poids;
        row[5]=cpt;
        row[6]=vartelecharge;
        
        dataModel.addRow(row);
    }//GEN-LAST:event_ajouterActionPerformed

    /*Met les valeurs d'une ligne selectionnée dans les zones de texte afin que l'utilisateur puisse les modifier*/
    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        int i=table.getSelectedRow();
        DefaultTableModel dataModel = (DefaultTableModel) table.getModel();
        
        /*Copie dans les zones de texte les valeurs de la i ème ligne pour chaque colonne*/
        ZTclassement.setText(dataModel.getValueAt(i,0).toString());
        ZTtitre.setText(dataModel.getValueAt(i,1).toString());
        ZTchanteur.setText(dataModel.getValueAt(i,2).toString());
        ZTdatesortie.setText(dataModel.getValueAt(i,3).toString());
        ZTpoids.setText(dataModel.getValueAt(i,4).toString());
        ZTtelecharge.setText(dataModel.getValueAt(i,5).toString());   
    }//GEN-LAST:event_modifierActionPerformed

    /*Efface les valeurs dans les différentes zones de texte*/
    private void effacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effacerActionPerformed
        /*Met la valeur "null" à chaque zone de texte*/
        ZTclassement.setText(null);
        ZTtitre.setText(null);
        ZTchanteur.setText(null);
        ZTdatesortie.setText(null);
        ZTpoids.setText(null);
        ZTtelecharge.setSelected(false);    
    }//GEN-LAST:event_effacerActionPerformed

    private void ZTdatesortieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZTdatesortieActionPerformed

    }//GEN-LAST:event_ZTdatesortieActionPerformed

    private void ZTpoidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZTpoidsActionPerformed

    }//GEN-LAST:event_ZTpoidsActionPerformed

    /*Incrémente le nombre d'écoutes pour une musique selectionnée quand l'utilisateur informe qu'il écoute la musique*/
    private void ecouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecouterActionPerformed
        DefaultTableModel dataModel = (DefaultTableModel) table.getModel();
        int j=table.getSelectedRow();
        cpt=(int) dataModel.getValueAt(j, 5);
        cpt++;
        
        /*Modifie la valeur du nombre d'écoutes en fonction de la ligne selectionnée, dans la 5ème colonne (colonne "Nb d'écoutes")*/
        dataModel.setValueAt(cpt,j,5);
        
        /*Remet le compteur à 0 pour les nouvelles lignes*/
        cpt=0;
    }//GEN-LAST:event_ecouterActionPerformed

    private void ZTclassementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZTclassementActionPerformed

    }//GEN-LAST:event_ZTclassementActionPerformed

    private void ZTtelechargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZTtelechargeActionPerformed

    }//GEN-LAST:event_ZTtelechargeActionPerformed

    /*Ferme le formulaire*/
    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_quitterActionPerformed

    /*Enregistre les nouvelles valeurs entrées après une modification d'une ligne*/
    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
        int j= table.getSelectedRow();
        
        DefaultTableModel dataModel = (DefaultTableModel) table.getModel();
        
        /*Remplace l'ancienne valeur avec la nouvelle valeur renseignée dans les zones de texte pour la j ème ligne pour chaque colonne*/
        dataModel.setValueAt(ZTclassement.getText(),j,0);
        dataModel.setValueAt(ZTtitre.getText(),j,1);
        dataModel.setValueAt(ZTchanteur.getText(),j,2);
        dataModel.setValueAt(ZTdatesortie.getText(),j,3);
        dataModel.setValueAt(ZTpoids.getText(),j,4);
        dataModel.setValueAt(ZTtelecharge.isSelected(),j,6);
    }//GEN-LAST:event_enregistrerActionPerformed

    /*Copie les valeurs de notre tableau "table" dans un fichier*/
    private void exporterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exporterActionPerformed

        /*Encapsule le chemin absolu du fichier d'arrivée*/
        String filePath = "C:\\Users\\33781\\Desktop\\POO et Projet POO S4 2022\\PROJET\\fichiervide.txt";
        File file = new File(filePath);
        FileWriter fw = null;
        /*Traite les exceptions*/
        try {
            fw = new FileWriter(file);
        } catch (IOException ex) {
            Logger.getLogger(ProjetGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*Appel de la sous-classe "BufferedWriter" afin d'écrire les données de notre tableau dans le fichier
        d'arrivée*/
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i = 0; i < table.getRowCount(); i++){//rows
            for(int j = 0; j < table.getColumnCount(); j++){try {
                //columns
                bw.write(table.getValueAt(i, j).toString()+" ");
                } catch (IOException ex) {
                    Logger.getLogger(ProjetGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                bw.newLine();
            } catch (IOException ex) {
                Logger.getLogger(ProjetGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(ProjetGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ProjetGui.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_exporterActionPerformed

    /*Copie les valeurs d'un fichier dans notre tableau "table"*/
    @SuppressWarnings("empty-statement")
    private void importerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importerActionPerformed

        /*Encapsule le chemin absolu du fichier d'entrée*/
        String filePath = "C:\\Users\\33781\\Desktop\\POO et Projet POO S4 2022\\PROJET\\fichier.txt";
        File file = new File(filePath);

        try {   
            /*Appel de la sous-classe "BufferedReader" afin de lire les données du fichier d'entrée pour les copier
            dans notre tableau*/
            BufferedReader br = new BufferedReader(new FileReader(file));
            /*Lit la première ligne, et sépare en colonnes lorsqu'il y a le caractère ","*/
            String firstLine = br.readLine().trim();
            String[] NomColonnes = firstLine.split(",");
            DefaultTableModel dataModel = (DefaultTableModel) table.getModel();
            dataModel.setColumnIdentifiers(NomColonnes);

            Object[] LignesTable = br.lines().toArray();

            /*Lit chaque ligne, et sépare lorsqu'il y a le caractère "/"*/
            for(int i = 0; i<LignesTable.length; i++)
            {
                String line = LignesTable[i].toString().trim();
                String[] donneeLignes = line.split("/");
                Object[] donneeTable = new Object [donneeLignes.length];
                
                /*Conversion des types (autres que String) pour le fonctionnement de l'importation*/
                donneeTable[0] = new Integer(donneeLignes[0]);
                donneeTable[1] = donneeLignes[1];
                donneeTable[2] = donneeLignes[2];
                donneeTable[3] = donneeLignes[3];
                donneeTable[4] = new Integer(donneeLignes[4]);
                donneeTable[5] = new Integer(donneeLignes[5]);
                donneeTable[6] = new Boolean (donneeLignes[6]);
                   
                /*Ajoute chaque ligne dans dataModel*/
                dataModel.addRow(donneeTable);
            }
        } catch (IOException ex) {
            Logger.getLogger(ProjetGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_importerActionPerformed

    /*Recherche une ligne à partir de son index*/
    private void rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherActionPerformed
        String place=ZtRecherche.getText();
        /*Parcours l'ensemble des lignes du tableau, et vérifie que la valeur de la i ème ligne et première colonne
        correspond à la valeur de la zone de texte ZtRecherche*/
        for(int i=0;i<table.getRowCount();i++){
            if(table.getValueAt(i,0).toString().equals(place)){
                /*Selectionne uniquement la i ème ligne correspondante*/
                table.setRowSelectionInterval(i,i);
            }
        }
    }//GEN-LAST:event_rechercherActionPerformed

    private void ZtRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZtRechercheActionPerformed

    }//GEN-LAST:event_ZtRechercheActionPerformed
    
    /*Filtre sur la colonne des téléchargements lorsque la musique est téléchargée*/
    private void filtrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrerActionPerformed

        DefaultTableModel dataModel = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<>(dataModel);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("true", 6));
    }//GEN-LAST:event_filtrerActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ProjetGui().setVisible(true);
        });
    }
    
    /*Déclaration d'une variable pour la fonction "ecouter"*/
    public static int cpt=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ZTchanteur;
    private javax.swing.JTextField ZTclassement;
    private javax.swing.JTextField ZTdatesortie;
    private javax.swing.JTextField ZTpoids;
    private javax.swing.JCheckBox ZTtelecharge;
    private javax.swing.JTextField ZTtitre;
    private javax.swing.JTextField ZtRecherche;
    private javax.swing.JButton ajouter;
    private javax.swing.JLabel chanteur;
    private javax.swing.JLabel chanteur1;
    private javax.swing.JLabel chanteur2;
    private javax.swing.JLabel chanteur3;
    private javax.swing.JLabel classement;
    private javax.swing.JButton ecouter;
    private javax.swing.JButton effacer;
    private javax.swing.JButton enregistrer;
    private javax.swing.JButton exporter;
    private javax.swing.JButton filtrer;
    private javax.swing.JButton importer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifier;
    private javax.swing.JButton quitter;
    private javax.swing.JButton rechercher;
    private javax.swing.JButton supprimer;
    private javax.swing.JTable table;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables
}
