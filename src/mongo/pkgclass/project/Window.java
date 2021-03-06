/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongo.pkgclass.project;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.*;
import org.bson.types.ObjectId;
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    FindIterable<Document> cursor1;
    ObjectId objectId;
    
    public Window() {
        cursor1 = null;
        objectId = null;
        
        initComponents();
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "movie title", "actor name","director name","genre" }));
        
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rating", "Votes","Awards","Runtime", "Year" }));
        
    }
     private FindIterable<Document> searchByTitle(String title){
        return MongoClassProject.searchByTitle(title);
    }
    private FindIterable<Document> searchgenre(String genre){
        return MongoClassProject.searchByGenre(genre);
    }
    private FindIterable<Document> searchdirector(String dname){
        return  MongoClassProject.searchByDirectorName(dname);
    }
    private FindIterable<Document> searchonactor(String actorName){
        return MongoClassProject.searchByActorName(actorName);
    }
    private MongoCursor<Document> sortbyyear(FindIterable<Document> cursor){

        return MongoClassProject.sortONYear(cursor);
    }
    private MongoCursor<Document> sortbyruntime(FindIterable<Document> cursor){
        return MongoClassProject.sortByRuntime(cursor);
    }
    private MongoCursor<Document>sort(FindIterable<Document> cursor, BasicDBObject basicDBObject){

        return MongoClassProject.sortByrating(cursor, basicDBObject);
    }
    private String getId(){

        String title = this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(),0).toString();
        FindIterable<Document> findIterable = MongoClassProject.searchByTitle(title);
        MongoCursor<Document> cursor = findIterable.iterator();
        while (cursor.hasNext()){
            objectId = cursor.next().getObjectId("_id");
            break;
        }



        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        comments = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("sort");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sort");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title", "year", "Runtime", "plot", "Type", "Director", "Imdb Rating", "votes", "countries", "genres"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        comments.setText("Comments");
        comments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(comments, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comments)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          FindIterable<Document> cursor;

                try {

                    String selectedsearch = this.jComboBox1.getSelectedItem().toString();
                    String data = this.search.getText();
                    switch (selectedsearch){
                        case "movie title":
                            cursor1 = searchByTitle(data);
                            break;
                        case "actor name":
                            cursor1 = searchonactor(data);
                            break;
                        case "director name":
                            cursor1 = searchdirector(data);
                            break;
                        case "genre":
                            cursor1 = searchgenre(data);
                            break;
                    }
                    if(cursor1.iterator().hasNext() == false)
                        JOptionPane.showMessageDialog(rootPane, "no record found");
                    else {
                    cursor = cursor1;
                    MongoCursor<Document> mongoCursor =cursor.iterator();
                    DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
                    Document document = new Document();
                    Document document1 = new Document();

                        model.setRowCount(0);
                        while (mongoCursor.hasNext()) {
                            document = mongoCursor.next();
                            document1 = (Document) document.get("imdb");
                            model.addRow(new Object[]{

                                document.getString("title"),
                                String.valueOf(document.getInteger("year")),
                                String.valueOf(document.getInteger("runtime")),
                                document.getString("plot"),
                                document.getString("type"),
                                document.get("directors").toString(),
                                //String.valueOf(document1.get("rating")),
                                document1.get("rating"),
                                document1.get("votes"),
                                document.get("countries"),
                                document.get("genres").toString()

                            });
                        }
                        
                    }
                   

                   

                }catch(Exception e) {
                    e.printStackTrace();
                }
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        BasicDBObject basicDBObject = new BasicDBObject("imdb.rating",1); // for sorting by imdb raiting
                BasicDBObject basicDBObject1 = new BasicDBObject("imdb.votes",1); // for sort by votes
                BasicDBObject basicDBObject2 = new BasicDBObject("awards.award",1);// for sort in the basis of awards
                MongoCursor<Document> iterator = null;
                String selectedsearch = this.jComboBox2.getSelectedItem().toString();
                try {
                    switch (selectedsearch){
                        case "Rating":
                            iterator = sort(cursor1, basicDBObject);
                            break;
                        case "Votes":
                            iterator = sort(cursor1,basicDBObject1);
                            break;
                        case "Awards":
                            iterator= sort(cursor1,basicDBObject2);
                            break;
                        case "Year":
                            iterator= sortbyyear(cursor1);
                            break;
                        case "Runtime":
                            iterator= sortbyruntime(cursor1);
                            break;
                    }

                    DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
                    

                    Document document = new Document();
                    Document document1 = new Document();

                    model.setRowCount(0);
                    while(iterator.hasNext()) {
                        document = iterator.next();
                        document1 =(Document) document.get("imdb");// getting the imdb and storing it in another document as it is an embedded document
                        model.addRow(new Object[]{

                                document.getString("title"),
                                String.valueOf(document.getInteger("year")),
                                String.valueOf(document.getInteger("runtime")),
                                document.getString("plot"),
                                document.getString("type"),
                                document.get("directors").toString(),
                                //String.valueOf(document1.get("rating")),
                                document1.get("rating"),
                                document1.get("votes"),
                                document.get("countries"),
                                document.get("genres").toString()

                        });
                       
                    }
                }catch(Exception e){
                
                    e.printStackTrace();
                }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void commentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentsActionPerformed
        // TODO add your handling code here:
        String name = String.valueOf(this.jTable1.getModel().getValueAt(this.jTable1.getSelectedRow(),0 ));
        System.out.println(name);
        ObjectId id= null; 
        FindIterable<Document> cursor1 = MongoClassProject.searchByTitle(name);
        MongoCursor<Document> iterator = cursor1.iterator();
        if(iterator.hasNext()){
            while(iterator.hasNext()){
                id = iterator.next().getObjectId("_id");
                break;
                
            }
            new Comments(String.valueOf(id)).setVisible(rootPaneCheckingEnabled);
        }
    }//GEN-LAST:event_commentsActionPerformed

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comments;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
