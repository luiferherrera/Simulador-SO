
package pruebas_so;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import javax.swing.table.DefaultTableModel;

/*Luis Herrera 27.877.087*/

public class admin extends javax.swing.JFrame {
    int Contador; //Contador del total de procesos que se van ingresando
    int Quantum=4; //Quantum de los procesos
    int memoria; //Memoria en uso
    
    //Crear e iniciar Objetos necesarios
    principal inicio = new principal();
    calculadora a = new calculadora();
    calendario b = new calendario();
    galeria c = new galeria();
    listaMusica d = new listaMusica();
    navegador e;
    notas f = new notas();
    Reproductor g = new Reproductor();
    
    Thread hilo = new Thread(new Hilo()); //Hilo a ejecutar

    
    public admin() {
        initNavegador();
        initComponents(); 
        
        inicio.setVisible(true); //Abir la interfaz sel SO
        inicio.abierto=true;
        hilo.start(); //Iniciar el hilo
    }
   
   private void initNavegador(){  // Inicair el Navegador
        NativeInterface.open();
        e = new navegador();
   }

    @SuppressWarnings("unchecked") //Generar la ventana
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtterminados = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtprocesos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbmemoria = new javax.swing.JProgressBar();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtmemoria = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtterminados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Estado", "Quantum", "Tiempo CPU"
            }
        ));
        jScrollPane2.setViewportView(jtterminados);

        jtprocesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Estado", "Quantum", "Tiempo CPU"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtprocesos);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Vista de procesos");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Activos");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Terminados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 98, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Procesos", jPanel1);

        jbmemoria.setMaximum(1500);

        jtmemoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Cantidad", "%"
            }
        ));
        jScrollPane3.setViewportView(jtmemoria);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setText("Uso de Memoria");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jbmemoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(105, 105, 105))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addComponent(jbmemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Memoria", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true); 
            }
        });
    }
    
    
    private class Hilo implements Runnable{ //Objeto de tipo Hilo con extension ejectubale
    @Override
    public void run(){
        int i=0; // contador de while

        while(true){
            verInicio();
            verCalculadora();
            verCalendario();
            verReproductor(); //Verificar cuales procesos se estan ejecutando
            verGaleria();
            verListaMusica();
            verNavegador();
            verNotas();
            jbmemoria.setValue(memoria); //Actualizar jbmemoria
            while(i<jtprocesos.getRowCount()){ //Recorrer las filas
                    for(int c=1; c<=Quantum; c++){ //Ejecutar Procesos
                        jtprocesos.setValueAt("Procesando",i,2);
                        int resto = (int) jtprocesos.getValueAt(i, 3);
                        jtprocesos.setValueAt((resto-1),i,3);
                        int tiempocpu= (int) jtprocesos.getValueAt(i, 4);
                        jtprocesos.setValueAt((tiempocpu + 1),i,4);              
                    }
                    jtprocesos.setValueAt("Espera",i,2);
                    jtprocesos.setValueAt(Quantum,i,3);
                    i++;    
            }
            i=0;   
        }       
    }}

    
    private void verInicio(){  //Verificar si el inicio esta en ejecucion
        boolean existe = false;
        if (inicio.abierto){
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Principal"){
                    existe = true; //Si esta abierto y existe se marca como true
                } 
            }
            if(existe==false){ //si esta abierto pero no exite se procese a agregar
                agregar("Principal");
                agregar("Procesos");
                agregar("Reloj");
                memoria(Contador-2,"Principal",360,"24%"); //Acualizar memoria
                memoria(Contador-1,"Procesos",105,"7%");
                memoria(Contador,"Reloj",45,"3%");   
            }    
        }else{
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Principal"){ // Si no esta abierto y existe se procede a elimiar
                    terminar(i); // Mover a los procesos terminados
                    eliminar(i); //eliminar proceso
                    memoria = memoria - 360-105 - 45; //Actualizar memoria
                } 
            }
        }      
    }
     

         
    private void verCalculadora(){ //Verificar si la Calculadora esta en ejecucion
        boolean existe = false;
        if (a.abierto){
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Calculadora"){
                    existe = true; //Si esta Abierto y  existe se marca como a true
                } 
            }
            if(existe==false){ //Si esta abierto pero no exite se agrega
                agregar("Calculadora");
                memoria(Contador,"Calculadora",90,"6%"); //Actualizar memoria
            }    
        }else{
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Calculadora"){ //Si no esta abierto y existe de elimina
                    terminar(i); //Mover a los procesos terminados
                    eliminar(i); //eliminar proceso                  
                    memoria = memoria-90; //actualizar memoria
                } 
            }
        }      
    }
    
    private void verCalendario(){  //Verificar si se esta ejecutando el calendario
        boolean existe = false;
        if (b.abierto){
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Calendario"){
                    existe = true; // si esta abierto y exisste se marca como true
                } 
            }
            if(existe==false){ // si esta abierto y no existe pasa a agregarlo
                agregar("Calendario");
                memoria(Contador,"Calendario",90,"6%"); //actualizar memoria
            }
        }else{
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Calendario"){ //sí no esta abierto y existe se elimina 
                    terminar(i); //mover a los procesos terminador
                    eliminar(i); //eliminar proceso                  
                    memoria = memoria-90; //actualizar memoria
                } 
            }
        }     
    }
        
    private void verGaleria(){ // verificar si la galeria esta abierta
        boolean existe = false;
        if (c.abierto){
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Galeria"){
                    existe = true;  // si esta abierto y exisste se marca como true
                } 
            }
            if(existe==false){ //si esta abierto y no existe se agrega 
                agregar("Galeria");
                memoria(Contador,"Galeria",105,"7%");
            }
        }else{
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Galeria"){
                    terminar(i); //mover a procesos eliminados
                    eliminar(i); //eliminar proceso
                    memoria = memoria - 105; //actualizar memoria
                } 
            }
        }     
    }  
            
    private void verListaMusica(){ // verificar si la lista de musica esta abierta
        boolean existe = false;
        if (d.abierto){
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Musica"){
                    existe = true; // si esta abierto y exisste se marca como true
                } 
            }
            if(existe==false){ //si esta abierto y no existe se agrega 
                agregar("Musica");
                memoria(Contador,"Musica",105,"7%");
            }
        }else{
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Musica"){
                    terminar(i); //mover a procesos eliminados
                    eliminar(i); //eliminar proceso
                    memoria = memoria -105; //actualizar memoria
                } 
            }
        }     
    }  
        
    private void verNavegador(){ // verificar si el navegador esta abierto
        boolean existe = false;
        if (e.abierto){
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Navegador"){
                    existe = true; // si esta abierto y exisste se marca como true
                } 
            }
            if(existe==false){ //si esta abierto y no existe se agrega 
                agregar("Navegador"); 
                agregar("Internet");
                memoria(Contador-1,"Navegador",195,"13%");
                memoria(Contador,"Internet",90,"6%");
            }
        }else{
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Navegador"){
                    terminar(i); //mover a procesos eliminados
                    terminar(i+1); //mover a procesos eliminados
                    eliminar(i); //eliminar proceso
                    eliminar(i); //eliminar proceso
                    memoria = memoria-195-90; //actualizar memoria
                } 
            }
        }     
    }    
    
    
    private void verNotas(){ // verificar si las notas estan abiertas
        boolean existe = false;
        if (f.abierto){
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Notas"){
                    existe = true; // si esta abierto y exisste se marca como true
                } 
            }
            if(existe==false){ //si esta abierto y no existe se agrega 
                agregar("Notas"); 
                memoria(Contador,"Notas",90,"6%");
            }
        }else{
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Notas"){
                    terminar(i); //mover a procesos eliminados
                    eliminar(i); //eliminar proceso
                    memoria = memoria-90; //actualizar memoria
                } 
            }
        }     
    }
    
    private void verReproductor(){ // verificar si el reproductor de musica esta abierto
        boolean existe = false;
        if (g.estado()==0 || g.estado()==1){
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Reproductor"){
                    existe = true; // si esta abierto y exisste se marca como true
                } 
            }
            if(existe==false){ //si esta abierto y no existe se agrega 
                agregar("Reproductor");
                agregar("Controlador");
                memoria(Contador-1,"Reproductor",150,"10%");
                memoria(Contador,"Controlador",75,"5%");
            }
        }else{
            for (int i=0;i<jtprocesos.getRowCount();i++){
                if(jtprocesos.getValueAt(i, 1)=="Reproductor"){
                    terminar(i); //mover a procesos eliminados
                    terminar(i+1); //mover a procesos eliminados
                    eliminar(i); //eliminar proceso
                    eliminar(i); //eliminar proceso
                    memoria = memoria -150-75; //actualizar memoria

                } 
            }
        }      
    }
    
    private void eliminar(int i){
        DefaultTableModel modelo=(DefaultTableModel) jtprocesos.getModel();  
        modelo.removeRow(i); //eliminar de los procesos abiertos
        jtprocesos.setModel(modelo);        
        
        DefaultTableModel modeloM=(DefaultTableModel) jtmemoria.getModel();  
        modeloM.removeRow(i); //eliminar de el consumo de memoria
        jtmemoria.setModel(modeloM); 
        
    }
    
    private void agregar(String nombre){
        DefaultTableModel modelo=(DefaultTableModel) jtprocesos.getModel();
        Contador ++;
        Object[] tabla2 = new Object[5];
        tabla2[0]= Contador; 
        tabla2[1]= nombre;
        tabla2[2]= "Espera";
        tabla2[3]= Quantum;
        tabla2[4]= 0;
        modelo.addRow(tabla2); //agregar el nuevo proceso             
        jtprocesos.setModel(modelo);
     }
    
    private void memoria(int id1, String nombre, int cantidad, String porcejate){
        DefaultTableModel modelo=(DefaultTableModel) jtmemoria.getModel();
        Object[] miTabla = new Object[4];
        miTabla[0]= id1;
        miTabla[1]= nombre;
        miTabla[2]= cantidad;
        miTabla[3]= porcejate;
        modelo.addRow(miTabla);
        jtmemoria.setModel(modelo); //agregar al consumo de memoria
        
        memoria = memoria + cantidad;
     }
    
    private void terminar(int i){
        DefaultTableModel modelo=(DefaultTableModel) jtterminados.getModel();
        Object[] miTabla = new Object[5];
        miTabla[0]= jtprocesos.getValueAt(i, 0) ;
        miTabla[1]= jtprocesos.getValueAt(i, 1);
        miTabla[2]= "Termiado";
        miTabla[3]= Quantum;
        miTabla[4]= jtprocesos.getValueAt(i, 4);
        modelo.addRow(miTabla);
        jtterminados.setModel(modelo); //agregar a los procesos terminados
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JProgressBar jbmemoria;
    private javax.swing.JTable jtmemoria;
    private javax.swing.JTable jtprocesos;
    private javax.swing.JTable jtterminados;
    // End of variables declaration//GEN-END:variables
}
