package vista;

import java.awt.Frame;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.consultas;

/**
 *
 * @author gudiel
 */
public class principal extends javax.swing.JFrame {

    Icon iconoInfo = new ImageIcon(getClass().getResource("/images/icons8-ayuda-64.png"));
    static boolean maximized = false;
    int xMouse;
    int yMouse;

    Date dateHoy = new Date();
    java.sql.Date fechaHoy = new java.sql.Date(dateHoy.getTime());

    public principal() {
        initComponents();

        this.fechaInicial.setDatoFecha(fechaHoy);
        this.fechaFinal.setDatoFecha(fechaHoy);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popRegistros = new javax.swing.JPopupMenu();
        menuConfirmar = new javax.swing.JMenuItem();
        menuModificarBoleta = new javax.swing.JMenuItem();
        menuModificar = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenuItem();
        panelPrincipal = new javax.swing.JPanel();
        panelEncabezado = new rspanelgradiente.RSPanelGradiente();
        btnCerrarVentana = new rojerusan.RSButtonHover();
        btnMaximizar = new rojerusan.RSButtonHover();
        btnMinimizar = new rojerusan.RSButtonHover();
        jLabel17 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        btnRegistros = new rojerusan.RSButtonHover();
        btnAgregar = new rojerusan.RSButtonHover();
        btnBusqueda = new rojerusan.RSButtonHover();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panelEscritorio = new javax.swing.JPanel();
        panelBienvenida = new javax.swing.JPanel();
        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        vistaAgregarRegistro = new javax.swing.JPanel();
        txtBoleta = new rojeru_san.RSMTextFull();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cbxBanco = new rojerusan.RSComboMetro();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtValor = new rojeru_san.RSMTextFull();
        jLabel4 = new javax.swing.JLabel();
        txtCliente = new rojeru_san.RSMTextFull();
        txtTelefono = new rojeru_san.RSMTextFull();
        jLabel5 = new javax.swing.JLabel();
        fechaUso = new rojeru_san.componentes.RSDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtHora = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAtendio = new rojeru_san.RSMTextFull();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new rojeru_san.RSButton();
        txtFactura = new rojeru_san.RSMTextFull();
        jLabel14 = new javax.swing.JLabel();
        btnCancelarRegistro = new rojeru_san.RSButton();
        vistaRegistro = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistros = new rojerusan.RSTableMetro();
        vistaBusqueda = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBusqueda = new rojerusan.RSTableMetro();
        fechaInicial = new rojeru_san.componentes.RSDateChooser();
        btnBuscar = new rojeru_san.complementos.ButtonHover();
        fechaFinal = new rojeru_san.componentes.RSDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtBuscarBoleta = new rojeru_san.RSMTextFull();
        jLabel18 = new javax.swing.JLabel();

        menuConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-marca-de-verificación-32.png"))); // NOI18N
        menuConfirmar.setText("Confirmar Depósito");
        popRegistros.add(menuConfirmar);

        menuModificarBoleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-editar-32.png"))); // NOI18N
        menuModificarBoleta.setText("Modificar Número De Boleta");
        popRegistros.add(menuModificarBoleta);

        menuModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-actualizar-32.png"))); // NOI18N
        menuModificar.setText("Modificar Datos ");
        popRegistros.add(menuModificar);

        menuEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-eliminar-32.png"))); // NOI18N
        menuEliminar.setText("Eliminar Registro");
        popRegistros.add(menuEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 118, 210), 1, true));

        panelEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        panelEncabezado.setColorPrimario(new java.awt.Color(25, 118, 210));
        panelEncabezado.setColorSecundario(new java.awt.Color(133, 193, 233));
        panelEncabezado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelEncabezadoMouseDragged(evt);
            }
        });
        panelEncabezado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEncabezadoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelEncabezadoMousePressed(evt);
            }
        });

        btnCerrarVentana.setBackground(new java.awt.Color(133, 193, 233));
        btnCerrarVentana.setBorder(null);
        btnCerrarVentana.setText("X");
        btnCerrarVentana.setBorderPainted(false);
        btnCerrarVentana.setColorHover(new java.awt.Color(255, 102, 102));
        btnCerrarVentana.setColorText(new java.awt.Color(204, 204, 204));
        btnCerrarVentana.setFocusPainted(false);
        btnCerrarVentana.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCerrarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVentanaActionPerformed(evt);
            }
        });

        btnMaximizar.setBackground(new java.awt.Color(133, 193, 233));
        btnMaximizar.setBorder(null);
        btnMaximizar.setText("^");
        btnMaximizar.setBorderPainted(false);
        btnMaximizar.setColorHover(new java.awt.Color(248, 249, 249));
        btnMaximizar.setColorText(new java.awt.Color(204, 204, 204));
        btnMaximizar.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnMaximizar.setFocusPainted(false);
        btnMaximizar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMaximizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaximizarActionPerformed(evt);
            }
        });

        btnMinimizar.setBackground(new java.awt.Color(133, 193, 233));
        btnMinimizar.setBorder(null);
        btnMinimizar.setText("-");
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setColorHover(new java.awt.Color(248, 249, 249));
        btnMinimizar.setColorText(new java.awt.Color(204, 204, 204));
        btnMinimizar.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnMinimizar.setFocusPainted(false);
        btnMinimizar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-panel-de-control-40.png"))); // NOI18N
        jLabel17.setText("CONTROL DE BOLETAS");

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMaximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCerrarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEncabezadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCerrarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMaximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelMenu.setBackground(new java.awt.Color(250, 250, 250));

        btnRegistros.setBackground(new java.awt.Color(250, 250, 250));
        btnRegistros.setBorder(null);
        btnRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-carpeta-32.png"))); // NOI18N
        btnRegistros.setText("REGISTROS");
        btnRegistros.setBorderPainted(false);
        btnRegistros.setColorHover(new java.awt.Color(250, 250, 250));
        btnRegistros.setColorText(new java.awt.Color(153, 153, 153));
        btnRegistros.setColorTextHover(new java.awt.Color(25, 118, 210));
        btnRegistros.setFocusPainted(false);
        btnRegistros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrosActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(250, 250, 250));
        btnAgregar.setBorder(null);
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-más-32.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setColorHover(new java.awt.Color(250, 250, 250));
        btnAgregar.setColorText(new java.awt.Color(153, 153, 153));
        btnAgregar.setColorTextHover(new java.awt.Color(25, 118, 210));
        btnAgregar.setFocusPainted(false);
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBusqueda.setBackground(new java.awt.Color(250, 250, 250));
        btnBusqueda.setBorder(null);
        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-búsqueda-32.png"))); // NOI18N
        btnBusqueda.setText("BUSCAR");
        btnBusqueda.setBorderPainted(false);
        btnBusqueda.setColorHover(new java.awt.Color(250, 250, 250));
        btnBusqueda.setColorText(new java.awt.Color(153, 153, 153));
        btnBusqueda.setColorTextHover(new java.awt.Color(25, 118, 210));
        btnBusqueda.setFocusPainted(false);
        btnBusqueda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        jLabel19.setText("Credits: Gudiel Cobón");

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        jLabel20.setText("Contact: gudielcobon@gmail.com");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(8, 8, 8))
        );

        panelEscritorio.setBackground(new java.awt.Color(255, 255, 255));
        panelEscritorio.setLayout(new java.awt.CardLayout());

        panelBienvenida.setBackground(new java.awt.Color(255, 255, 255));

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(247, 220, 111));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(142, 68, 173));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-panel-de-control-100.png"))); // NOI18N
        jLabel15.setText("CONTROL DE BOLETAS");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-apretón-de-manos-100.png"))); // NOI18N
        jLabel16.setText(" BIENVENIDO");

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE))
                .addContainerGap())
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBienvenidaLayout = new javax.swing.GroupLayout(panelBienvenida);
        panelBienvenida.setLayout(panelBienvenidaLayout);
        panelBienvenidaLayout.setHorizontalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBienvenidaLayout.setVerticalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelEscritorio.add(panelBienvenida, "card5");

        vistaAgregarRegistro.setBackground(new java.awt.Color(255, 255, 255));

        txtBoleta.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtBoleta.setForeground(new java.awt.Color(25, 118, 210));
        txtBoleta.setModoMaterial(true);
        txtBoleta.setNextFocusableComponent(txtValor);
        txtBoleta.setPlaceholder("Número de boleta");
        txtBoleta.setSoloNumeros(true);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("NUEVO REGISTRO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbxBanco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Banco-Cuenta:", "AG-BR-TSL", "AG-BR-TLH", "C-BR-TSL", "C-BR-TLH", "AGENCIA-G&T-TSL", "AGENTE-G&T-TSL" }));
        cbxBanco.setColorArrow(new java.awt.Color(25, 118, 210));
        cbxBanco.setColorBorde(new java.awt.Color(25, 118, 210));
        cbxBanco.setColorFondo(new java.awt.Color(25, 118, 210));
        cbxBanco.setNextFocusableComponent(txtBoleta);

        jLabel1.setText("Cuenta:");

        jLabel2.setText("Número de boleta:");

        jLabel3.setText("Valor:");

        txtValor.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtValor.setForeground(new java.awt.Color(25, 118, 210));
        txtValor.setModoMaterial(true);
        txtValor.setNextFocusableComponent(txtCliente);
        txtValor.setPlaceholder("Valor");
        txtValor.setSoloNumeros(true);

        jLabel4.setText("Fecha de uso:");

        txtCliente.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtCliente.setForeground(new java.awt.Color(25, 118, 210));
        txtCliente.setMayusculas(true);
        txtCliente.setModoMaterial(true);
        txtCliente.setNextFocusableComponent(txtTelefono);
        txtCliente.setPlaceholder("Nombre y apellido");

        txtTelefono.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtTelefono.setForeground(new java.awt.Color(25, 118, 210));
        txtTelefono.setModoMaterial(true);
        txtTelefono.setPlaceholder("Télefono:");
        txtTelefono.setSoloNumeros(true);

        jLabel5.setText("Hora de uso:");

        fechaUso.setColorBackground(new java.awt.Color(25, 118, 210));
        fechaUso.setColorButtonHover(new java.awt.Color(133, 193, 233));
        fechaUso.setColorForeground(new java.awt.Color(25, 118, 210));
        fechaUso.setFormatoFecha("dd/MM/yyyy");
        fechaUso.setNextFocusableComponent(txtHora);
        fechaUso.setPlaceholder("(dd/mm/aaaa)");

        jLabel6.setText("Cliente:");

        txtHora.setForeground(new java.awt.Color(25, 118, 210));
        try {
            txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHora.setText("--:--");
        txtHora.setCaretColor(new java.awt.Color(25, 118, 210));
        txtHora.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtHora.setNextFocusableComponent(txtAtendio);

        jLabel7.setText("Teléfono:");

        txtAtendio.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtAtendio.setForeground(new java.awt.Color(25, 118, 210));
        txtAtendio.setMayusculas(true);
        txtAtendio.setModoMaterial(true);
        txtAtendio.setNextFocusableComponent(txtFactura);
        txtAtendio.setPlaceholder("Atendió");
        txtAtendio.setSoloLetras(true);

        jLabel8.setText("Atendió:");

        btnGuardar.setBackground(new java.awt.Color(25, 118, 210));
        btnGuardar.setBorder(null);
        btnGuardar.setText("GUARDAR");
        btnGuardar.setColorHover(new java.awt.Color(162, 217, 206));
        btnGuardar.setColorTextHover(new java.awt.Color(25, 118, 210));

        txtFactura.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtFactura.setForeground(new java.awt.Color(25, 118, 210));
        txtFactura.setModoMaterial(true);
        txtFactura.setNextFocusableComponent(btnGuardar);
        txtFactura.setPlaceholder("Factura");
        txtFactura.setSoloNumeros(true);

        jLabel14.setText("Factura:");

        btnCancelarRegistro.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelarRegistro.setBorder(null);
        btnCancelarRegistro.setText("CANCELAR");
        btnCancelarRegistro.setColorHover(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout vistaAgregarRegistroLayout = new javax.swing.GroupLayout(vistaAgregarRegistro);
        vistaAgregarRegistro.setLayout(vistaAgregarRegistroLayout);
        vistaAgregarRegistroLayout.setHorizontalGroup(
            vistaAgregarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(vistaAgregarRegistroLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(vistaAgregarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaUso, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(txtBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(cbxBanco, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtendio, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(vistaAgregarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(vistaAgregarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHora)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        vistaAgregarRegistroLayout.setVerticalGroup(
            vistaAgregarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vistaAgregarRegistroLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(cbxBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(vistaAgregarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vistaAgregarRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, 0)
                        .addComponent(txtBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vistaAgregarRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(vistaAgregarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vistaAgregarRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, 0)
                        .addGroup(vistaAgregarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(vistaAgregarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel7))
                .addGap(0, 0, 0)
                .addGroup(vistaAgregarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(vistaAgregarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel8))
                .addGap(0, 0, 0)
                .addGroup(vistaAgregarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAtendio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(vistaAgregarRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panelEscritorio.add(vistaAgregarRegistro, "card2");

        vistaRegistro.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("BOLETAS REGISTRADAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(null);

        tablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro No.", "Fecha Registro", "Boleta", "Bco-Cuenta", "Valor", "Factura", "Cliente", "Teléfono", "Fecha Uso", "Hora Uso", "Responsable", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaRegistros.setColorBackgoundHead(new java.awt.Color(204, 204, 204));
        tablaRegistros.setColorFilasForeground1(new java.awt.Color(25, 118, 210));
        tablaRegistros.setColorFilasForeground2(new java.awt.Color(25, 118, 210));
        tablaRegistros.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        tablaRegistros.setComponentPopupMenu(popRegistros);
        tablaRegistros.setFuenteFilas(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tablaRegistros.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tablaRegistros.setFuenteHead(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        tablaRegistros.setGrosorBordeFilas(0);
        tablaRegistros.setGrosorBordeHead(0);
        jScrollPane1.setViewportView(tablaRegistros);

        javax.swing.GroupLayout vistaRegistroLayout = new javax.swing.GroupLayout(vistaRegistro);
        vistaRegistro.setLayout(vistaRegistroLayout);
        vistaRegistroLayout.setHorizontalGroup(
            vistaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        vistaRegistroLayout.setVerticalGroup(
            vistaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vistaRegistroLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE))
        );

        panelEscritorio.add(vistaRegistro, "card3");

        vistaBusqueda.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("BÚSQUEDA EXPLÍCITA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setBorder(null);

        tablaBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro No.", "Fecha Registro", "Boleta", "Bco-Cuenta", "Valor", "Factura", "Cliente", "Teléfono", "Fecha Uso", "Hora Uso", "Responsable", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBusqueda.setColorBackgoundHead(new java.awt.Color(204, 204, 204));
        tablaBusqueda.setColorFilasBackgound2(new java.awt.Color(215, 219, 221));
        tablaBusqueda.setColorFilasForeground1(new java.awt.Color(25, 118, 210));
        tablaBusqueda.setColorFilasForeground2(new java.awt.Color(25, 118, 210));
        tablaBusqueda.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        tablaBusqueda.setComponentPopupMenu(popRegistros);
        tablaBusqueda.setFuenteFilas(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tablaBusqueda.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tablaBusqueda.setFuenteHead(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        tablaBusqueda.setGrosorBordeFilas(0);
        tablaBusqueda.setGrosorBordeHead(0);
        jScrollPane2.setViewportView(tablaBusqueda);

        fechaInicial.setColorBackground(new java.awt.Color(25, 118, 210));
        fechaInicial.setColorButtonHover(new java.awt.Color(133, 193, 233));
        fechaInicial.setColorForeground(new java.awt.Color(25, 118, 210));
        fechaInicial.setFormatoFecha("dd/MM/yyyy");
        fechaInicial.setPlaceholder("Fecha Inicial");

        btnBuscar.setBackground(new java.awt.Color(25, 118, 210));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setColorHover(new java.awt.Color(162, 217, 206));
        btnBuscar.setColorTextHover(new java.awt.Color(25, 118, 210));
        btnBuscar.setFocusPainted(false);

        fechaFinal.setColorBackground(new java.awt.Color(25, 118, 210));
        fechaFinal.setColorButtonHover(new java.awt.Color(133, 193, 233));
        fechaFinal.setColorForeground(new java.awt.Color(25, 118, 210));
        fechaFinal.setFormatoFecha("dd/MM/yyyy");
        fechaFinal.setPlaceholder("Fecha final");

        jLabel12.setText("Fecha Inicial:");

        jLabel13.setText("Fecha Final:");

        txtBuscarBoleta.setForeground(new java.awt.Color(25, 118, 210));
        txtBuscarBoleta.setBordeColorFocus(new java.awt.Color(25, 118, 210));
        txtBuscarBoleta.setBotonColor(new java.awt.Color(25, 118, 210));
        txtBuscarBoleta.setCaretColor(new java.awt.Color(25, 118, 210));
        txtBuscarBoleta.setModoMaterial(true);
        txtBuscarBoleta.setPlaceholder("Ingrese número de boleta");
        txtBuscarBoleta.setSoloNumeros(true);

        jLabel18.setText("Buscar por número de boleta:");

        javax.swing.GroupLayout vistaBusquedaLayout = new javax.swing.GroupLayout(vistaBusqueda);
        vistaBusqueda.setLayout(vistaBusquedaLayout);
        vistaBusquedaLayout.setHorizontalGroup(
            vistaBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(vistaBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vistaBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGroup(vistaBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vistaBusquedaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vistaBusquedaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(vistaBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vistaBusquedaLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(vistaBusquedaLayout.createSequentialGroup()
                        .addComponent(txtBuscarBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        vistaBusquedaLayout.setVerticalGroup(
            vistaBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vistaBusquedaLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(vistaBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18))
                .addGap(1, 1, 1)
                .addGroup(vistaBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(vistaBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBuscarBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
        );

        panelEscritorio.add(vistaBusqueda, "card4");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrosActionPerformed
        
        panelEscritorio.removeAll();
        panelEscritorio.revalidate();
        panelEscritorio.repaint();
        panelEscritorio.add(vistaRegistro);
        
        consultas con = new consultas();
        con.MostrarRegistros(tablaRegistros);
    }//GEN-LAST:event_btnRegistrosActionPerformed

    private void btnCerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarVentanaActionPerformed

        int x = JOptionPane.showConfirmDialog(null, "Salir del programa?", "Exit", 1, HEIGHT, iconoInfo);
        if (x == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_btnCerrarVentanaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        panelEscritorio.removeAll();
        panelEscritorio.revalidate();
        panelEscritorio.repaint();

        panelEscritorio.add(vistaAgregarRegistro);

        btnGuardar.setText("GUARDAR");
        txtBoleta.setEnabled(true);
        cbxBanco.setEnabled(true);
        txtAtendio.setEnabled(true);
        txtCliente.setEnabled(true);
        txtFactura.setEnabled(true);
        txtHora.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtValor.setEnabled(true);
        fechaUso.setEnabled(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
      
        txtBuscarBoleta.setText("");

        panelEscritorio.removeAll();
        panelEscritorio.revalidate();
        panelEscritorio.repaint();
        panelEscritorio.add(vistaBusqueda);

    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btnMaximizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaximizarActionPerformed
        if (maximized == false) {
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            maximized = true;
        } else {
            setExtendedState(JFrame.NORMAL);
            maximized = false;
        }
    }//GEN-LAST:event_btnMaximizarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void panelEncabezadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEncabezadoMouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - xMouse, mueve.y - yMouse);
    }//GEN-LAST:event_panelEncabezadoMouseDragged

    private void panelEncabezadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEncabezadoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelEncabezadoMousePressed

    private void panelEncabezadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEncabezadoMouseClicked
        int clic = evt.getClickCount();

        if (clic == 2) {
            if (maximized == false) {
                this.setExtendedState(JFrame.MAXIMIZED_BOTH);
                maximized = true;
            }
        }
    }//GEN-LAST:event_panelEncabezadoMouseClicked

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover btnAgregar;
    public static rojeru_san.complementos.ButtonHover btnBuscar;
    private rojerusan.RSButtonHover btnBusqueda;
    public static rojeru_san.RSButton btnCancelarRegistro;
    private rojerusan.RSButtonHover btnCerrarVentana;
    public static rojeru_san.RSButton btnGuardar;
    private rojerusan.RSButtonHover btnMaximizar;
    private rojerusan.RSButtonHover btnMinimizar;
    private rojerusan.RSButtonHover btnRegistros;
    public static rojerusan.RSComboMetro cbxBanco;
    public static rojeru_san.componentes.RSDateChooser fechaFinal;
    public static rojeru_san.componentes.RSDateChooser fechaInicial;
    public static rojeru_san.componentes.RSDateChooser fechaUso;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JMenuItem menuConfirmar;
    public static javax.swing.JMenuItem menuEliminar;
    public static javax.swing.JMenuItem menuModificar;
    public static javax.swing.JMenuItem menuModificarBoleta;
    public static javax.swing.JPanel panelBienvenida;
    private rspanelgradiente.RSPanelGradiente panelEncabezado;
    public static javax.swing.JPanel panelEscritorio;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPopupMenu popRegistros;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    public static rojerusan.RSTableMetro tablaBusqueda;
    public static rojerusan.RSTableMetro tablaRegistros;
    public static rojeru_san.RSMTextFull txtAtendio;
    public static rojeru_san.RSMTextFull txtBoleta;
    public static rojeru_san.RSMTextFull txtBuscarBoleta;
    public static rojeru_san.RSMTextFull txtCliente;
    public static rojeru_san.RSMTextFull txtFactura;
    public static javax.swing.JFormattedTextField txtHora;
    public static rojeru_san.RSMTextFull txtTelefono;
    public static rojeru_san.RSMTextFull txtValor;
    public static javax.swing.JPanel vistaAgregarRegistro;
    public static javax.swing.JPanel vistaBusqueda;
    public static javax.swing.JPanel vistaRegistro;
    // End of variables declaration//GEN-END:variables
}
