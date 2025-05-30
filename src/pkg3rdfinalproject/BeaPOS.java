/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg3rdfinalproject;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author A315
 */
public class BeaPOS extends javax.swing.JFrame {
    
   
    
    

    //mango bravo
    int mangoQty = 0;
    int mangoBasePrice = 0;
    
    // RedVelvet
    int redVelvetQty = 0;
    int redVelvetBasePrice = 0;

    // StrawberryShortcake
    int strawberryShortcakeQty = 0;
    int strawberryShortcakeBasePrice = 0;

    //bento cake
    int bentoCakeQty = 0;
    int bentoCakeBasePrice = 0;
    
    //chesecake
    int cheesecakeQuantity = 0;
    int cheesecakeBasePrice = 0;
    
    //caramel flan de leche
    int caramelFlanQty = 0;
    int caramelFlanBasePrice = 0;
    
    //mango bravo tub
    int mangoBravoTubQty = 0;
    int mangoBravoTubBasePrice = 0;
    
    //slice cheese cake
    int slicecheesecakeQty = 0;
    int slicecheesecakeBasePrice = 0;
    
    //mini cupcakes
    int miniCupcakesQty = 0;
    int miniCupcakesBasePrice = 0;
    
    //pisces cupcakes
    int piscesCupcakesQty = 0;
    int piscesCupcakesBasePrice = 0;
    
    //yema cake
    int yemaCakeQty = 0;
    int yemaCakeBasePrice = 0;
    
    //ube pandesal
    int ubePandesalQty = 0;
    int ubePandesalBasePrice = 0;
    
    //banana loaf
    int bananaLoafQty = 0;
    int bananaLoafBasePrice = 0;
    
    //brownies
    int browniesQty = 0;
    int browniesBasePrice = 0;
    
    //classic cinnamon
    int classicCinnamonQty = 0;
    int classicCinnamonBasePrice = 0;
    
    //milky cheese donut
    int milkyCheeseDonutQty = 0;
    int milkyCheeseDonutBasePrice = 0;
    
    //banana muffin
    int bananaMuffinQty = 0;
    int bananaMuffinBasePrice = 0;
    
    private String mangoBravocurrentSelectedSize = "4x2";
    
    private String redVelvetCurrentSelectedSize = "5x2";
    
    
    
   



    
    /**
     * Creates new form BeaPOS
     */
    
    
    
    
    public BeaPOS(){
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                confirmExit();
            }
        });
        
    LocalDate today = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
    String formattedDate = today.format(formatter);
    dateLabel.setText(formattedDate);
        
    // mango bravo action listeners
    mangoBravo6x2button.addActionListener(e -> { // 6x2
    mangoBasePrice = 699;
    mangoBravocurrentSelectedSize = "6x2";
    updateMangoPrice();
    
    });
    
    mangoBravo5x2button.addActionListener(e -> { // 5x2
    mangoBasePrice = 399;
    mangoBravocurrentSelectedSize = "5x2";
    updateMangoPrice();
    
    });
    
    mangoBravo4x2button.addActionListener(e -> { // 4x2
    mangoBasePrice = 299;
    mangoBravocurrentSelectedSize = "4x2";
    updateMangoPrice();
    
    });

    
    //red velvet action listeners
    redVelvet6x2sizebutton.addActionListener(e->{
    redVelvetBasePrice = 799;
    redVelvetCurrentSelectedSize = "6x2";
    updateRedVelvetPrice();
    });
    
    redVelvet5x2sizeButton.addActionListener(e->{
    redVelvetBasePrice = 499;
    redVelvetCurrentSelectedSize = "5x2";
    updateRedVelvetPrice();
    });
    
    
    //strawberry shortcake listeners
    strawberryshortcake4x3sizebtn.addActionListener(e->{
    strawberryShortcakeBasePrice = 299;
    updateStrawberryShortPrice();    
    });
    
    strawberryshortcake5x3sizebtn.addActionListener(e->{
    strawberryShortcakeBasePrice = 499;
    updateStrawberryShortPrice();  
    });
    strawberryshortcake6x3sizebtn.addActionListener(e->{
    strawberryShortcakeBasePrice = 699;    
    });
    strawberryshortcake8x3sizebtn.addActionListener(e->{
    strawberryShortcakeBasePrice = 999; 
    updateStrawberryShortPrice();     
    });
    
    
    //bento cake listener
    bentoCakeSizebutton.addActionListener(e->{
    bentoCakeBasePrice = 340; 
    updateBentoCakePrice();     
    });
    
    //chesecake 
    btn8Cheesecake.addActionListener(e->{
    cheesecakeBasePrice = 1400; 
    updateCheeseCakePrice();     
    });
    
    //caramel de leche flan 
    btn6x2CaramelFlan.addActionListener(e->{
        caramelFlanBasePrice = 699;
        updateCaramelLechePrice();
        
    });
    btn5x2CaramelFlan.addActionListener(e->{
        caramelFlanBasePrice = 399;
        updateCaramelLechePrice();
    });
    btn4x2CaramelFlan.addActionListener(e->{
        caramelFlanBasePrice = 299;
        updateCaramelLechePrice();
    });
    
    //mini cupcakes
    btn6PcsMiniCupcake.addActionListener(e->{
        miniCupcakesBasePrice = 98;
        updateMiniCupcakesPrice();
        
    });
    btn12PcsMiniCupcake.addActionListener(e->{
        miniCupcakesBasePrice = 169;
        updateMiniCupcakesPrice();
    });
    
    //pisces cupcakes
    btn1pcPisces.addActionListener(e->{ 
        piscesCupcakesBasePrice = 55;
        updatePiscesCupcakesPrice();        
    });
    btn3PcsPisces.addActionListener(e->{ 
        piscesCupcakesBasePrice = 99;
        updatePiscesCupcakesPrice();        
    });
    btn4PcsPisces.addActionListener(e->{ 
        piscesCupcakesBasePrice = 149;
        updatePiscesCupcakesPrice();        
    });
    btn6PcsPisces.addActionListener(e->{ 
        piscesCupcakesBasePrice = 300;
        updatePiscesCupcakesPrice();        
    });
    btn12PcsPisces.addActionListener(e->{ 
        piscesCupcakesBasePrice = 600;
        updatePiscesCupcakesPrice();        
    });
    
    //yema cake
    btn6x2Yemacake.addActionListener(e->{
        yemaCakeBasePrice = 699;
        updateYemaCakePrice();
    });
    btn5x2Yemacake.addActionListener(e->{
        yemaCakeBasePrice = 399;
        updateYemaCakePrice();
    });
    btn4x2Yemacake.addActionListener(e->{
        yemaCakeBasePrice = 299;
        updateYemaCakePrice();
    });
    
    
    //ube pandesal 
    btnUbeCheesedesal.addActionListener(e->{
        ubePandesalBasePrice = 170;
        updateCheesePandesalPrice();
    });
    btnUbeHalayaCheesedesal.addActionListener(e->{
        ubePandesalBasePrice = 185;
        updateCheesePandesalPrice();
    });
    
    //bananaloaf 
    btnMoistBananaChocoChipLoaf.addActionListener(e->{
        bananaLoafBasePrice =  160;
        updateBananaLoafPrice();
    });
    btnMoistBananaChocoChipAlmondLoaf.addActionListener(e->{
        bananaLoafBasePrice =  190;
        updateBananaLoafPrice();
    });
    
    //brownies
    btn6PcsBrownies.addActionListener(e->{
        browniesBasePrice = 150;
        updateBrowniesPrice();
    });
    btn12PcsBrownies.addActionListener(e->{
        browniesBasePrice = 280;
        updateBrowniesPrice();
    });
    btn30PcsBrownies.addActionListener(e->{
        browniesBasePrice = 750;
        updateBrowniesPrice();
    });
    
    //classicCinnamon
    btnBoxof4ClassicCinnamon.addActionListener(e->{
        classicCinnamonBasePrice = 185;
        updateCinnamonPrice();
    });
    btnBoxof6ClassicCinnamon.addActionListener(e->{
        classicCinnamonBasePrice = 280;
        updateCinnamonPrice();
    });
    
    //milky cheese Donut
    btn5PcsMilkyDonut.addActionListener(e->{
        milkyCheeseDonutBasePrice = 125;
        updateMilkyCheeseDonutPrice();
    });
    btn10PcsMilkyDonut.addActionListener(e->{
        milkyCheeseDonutBasePrice = 240;
        updateMilkyCheeseDonutPrice();
    });
    
    //banana muffim
    btn6PcsBananaMuffin.addActionListener(e->{
        bananaMuffinBasePrice = 109;
        updateBananaMuffinPrice();
    });
    
    
    
    
    
    
    
    
    
    
    
    
    //actionlisteners for radiobuttons
    mangoRadioButton.addActionListener(e -> {
    if (mangoRadioButton.isSelected()) {
        updateMangoBravoBill();
    } else {
        removeMangoBravoFromBill();
    }
});
   
    redVelvetRadioButton.addActionListener(e -> {
    if (redVelvetRadioButton.isSelected()) {
        updateRedVelvetBill();
    } else {
        removeRedVelvetFromBill();
    }
});
      }
    //methods for actionListeners
private void removeMangoBravoFromBill() {
    subTotalamountlabel.setText("₱0.00");
    totalAmountLabel.setText("₱0.00");
    productNameLabel.setText("");
    quantityLabel.setText("");
    sizeorVariationLabel.setText("");
}
private void removeRedVelvetFromBill() {
    subTotalamountlabel.setText("₱0.00");
    totalAmountLabel.setText("₱0.00");
    productNameLabel.setText("");
    quantityLabel.setText("");
    sizeorVariationLabel.setText("");
}


public void updateMangoBravoBill() {
    
    double unitPrice = 0.0;
    String size = "";
    switch(mangoBravocurrentSelectedSize) {
        case "6x2": size = "6 x 2\""; unitPrice = 699.00; break;
        case "5x2": size = "5 x 2\""; unitPrice = 399.00; break;
        case "4x2": size = "4 x 2\""; unitPrice = 299.00; break;
        default: size = "Unknown Size"; unitPrice = 0.0; break;
    }
    double subtotal = mangoQty * unitPrice;
    // update the bill panel labels
    subTotalamountlabel.setText(String.format("₱%.2f", subtotal));
    totalAmountLabel.setText(String.format("₱%.2f", subtotal));
    productNameLabel.setText("Mango Bravo");
    quantityLabel.setText(String.valueOf(mangoQty));
    sizeorVariationLabel.setText(size);

}
 
 public void updateRedVelvetBill() {
    
    double unitPrice = 0.0;
    String size = "";
    switch(redVelvetCurrentSelectedSize) {
        case "6x2": size = "6 x 2\""; unitPrice = 799.00; break;
        case "5x2": size = "5 x 2\""; unitPrice = 499.00; break;
       
        default: size = "Unknown Size"; unitPrice = 0.0; break;
    }
    double subtotal = redVelvetQty * unitPrice;
    
    subTotalamountlabel.setText(String.format("₱%.2f", subtotal));
    totalAmountLabel.setText(String.format("₱%.2f", subtotal));
    productNameLabel.setText("Red Velvet");
    quantityLabel.setText(String.valueOf(redVelvetQty));
    sizeorVariationLabel.setText(size);

}
    
    
    
    
    
    
    
    
    
    
    
    
    private void confirmExit(){
        int choice = JOptionPane.showConfirmDialog(this,"Are you sure you want to Exit?", "Exit",JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        productsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCake = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBreadSweets1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        BillPanel = new javax.swing.JPanel();
        dashLinelabel1 = new javax.swing.JLabel();
        BillLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        dashLineLabel2 = new javax.swing.JLabel();
        productStaticLabel = new javax.swing.JLabel();
        productNameLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        sizeorvariationstaticLabel = new javax.swing.JLabel();
        sizeorVariationLabel = new javax.swing.JLabel();
        dashLineLabel3 = new javax.swing.JLabel();
        subtotalstaticlabel = new javax.swing.JLabel();
        totalstaticlabel = new javax.swing.JLabel();
        subTotalamountlabel = new javax.swing.JLabel();
        totalAmountLabel = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jButton9 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel71 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cakesPanel = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        mangoToppings = new javax.swing.JToggleButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        minusButtonMango = new javax.swing.JButton();
        mangoBravoQuantity = new javax.swing.JLabel();
        addButtonMango = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        mangoPrice = new javax.swing.JLabel();
        mangoBravo5x2button = new javax.swing.JToggleButton();
        mangoBravo6x2button = new javax.swing.JToggleButton();
        mangoBravo4x2button = new javax.swing.JToggleButton();
        mangoRadioButton = new javax.swing.JRadioButton();
        jLabel72 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        Jpanel = new javax.swing.JPanel();
        redVelvetMinusButton = new javax.swing.JButton();
        redvelvetlabel = new javax.swing.JLabel();
        RedVelvetPlusButton = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        redVelvetCakePrice = new javax.swing.JLabel();
        redVelvet6x2sizebutton = new javax.swing.JToggleButton();
        redVelvet5x2sizeButton = new javax.swing.JToggleButton();
        redVelvetRadioButton = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        strawberryshortminusbutton = new javax.swing.JButton();
        strawberyshortcakelbl = new javax.swing.JLabel();
        strawberryshortplusbutton = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        strawberryShortCakePrice = new javax.swing.JLabel();
        strawberryshortcake6x3sizebtn = new javax.swing.JToggleButton();
        strawberryshortcake5x3sizebtn = new javax.swing.JToggleButton();
        strawberryshortcake8x3sizebtn = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        strawberryshortcake4x3sizebtn = new javax.swing.JToggleButton();
        jLabel71 = new javax.swing.JLabel();
        strawberryshortcakeradioButton = new javax.swing.JRadioButton();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        bentoCakeminusButton = new javax.swing.JButton();
        bentocakelbl = new javax.swing.JLabel();
        bentoCakePlusButton = new javax.swing.JButton();
        jPanel54 = new javax.swing.JPanel();
        bentoCakePrice = new javax.swing.JLabel();
        bentoCakeSizebutton = new javax.swing.JToggleButton();
        bentoCakeRadioButton = new javax.swing.JRadioButton();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        btnMinusCaramelFlan = new javax.swing.JButton();
        lbqtycaramelflan = new javax.swing.JLabel();
        btnPlusCaramelFlan = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        caramelFlanDeLecheCakePrice = new javax.swing.JLabel();
        btn4x2CaramelFlan = new javax.swing.JToggleButton();
        btn6x2CaramelFlan = new javax.swing.JToggleButton();
        btn5x2CaramelFlan = new javax.swing.JToggleButton();
        jLabel57 = new javax.swing.JLabel();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        btnMinusCheesecake = new javax.swing.JButton();
        lblquantitycheesecake = new javax.swing.JLabel();
        btnPlusCheesecake = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        cheeseCakePrice = new javax.swing.JLabel();
        btn8Cheesecake = new javax.swing.JToggleButton();
        jToggleButton23 = new javax.swing.JToggleButton();
        jToggleButton24 = new javax.swing.JToggleButton();
        jToggleButton25 = new javax.swing.JToggleButton();
        jToggleButton26 = new javax.swing.JToggleButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel61 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        btnMinusSliceCheesecake = new javax.swing.JButton();
        slicecheesecakelblqty = new javax.swing.JLabel();
        btnPlusSliceCheesecake = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        sliceCheesecakePrice = new javax.swing.JLabel();
        jToggleButton28 = new javax.swing.JToggleButton();
        jToggleButton29 = new javax.swing.JToggleButton();
        jToggleButton30 = new javax.swing.JToggleButton();
        jToggleButton31 = new javax.swing.JToggleButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel66 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        btnMinusMangoBravoTub = new javax.swing.JButton();
        mangobravotublblqty = new javax.swing.JLabel();
        btnPlusMangoBravoTub = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        mangoBravoTubPrice = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        btnMinusMiniCupcake = new javax.swing.JButton();
        lbQtyMiniCupcake = new javax.swing.JLabel();
        btnPlusMiniCupcake = new javax.swing.JButton();
        jPanel46 = new javax.swing.JPanel();
        miniCupcakesPrice = new javax.swing.JLabel();
        btn6PcsMiniCupcake = new javax.swing.JToggleButton();
        btn12PcsMiniCupcake = new javax.swing.JToggleButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        btnMinusPiscesCupcake = new javax.swing.JButton();
        lbzeroqty = new javax.swing.JLabel();
        btnPlusPiscescupcake = new javax.swing.JButton();
        jPanel50 = new javax.swing.JPanel();
        piscesCupcakesPrice = new javax.swing.JLabel();
        btn1pcPisces = new javax.swing.JToggleButton();
        btn3PcsPisces = new javax.swing.JToggleButton();
        btn4PcsPisces = new javax.swing.JToggleButton();
        btn6PcsPisces = new javax.swing.JToggleButton();
        btn12PcsPisces = new javax.swing.JToggleButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jPanel55 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jPanel57 = new javax.swing.JPanel();
        btnCustomeCakeIcingCake = new javax.swing.JToggleButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jPanel84 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jPanel86 = new javax.swing.JPanel();
        btnMinimalistCakeCustomCake = new javax.swing.JToggleButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jPanel88 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jPanel90 = new javax.swing.JPanel();
        customCakeButton = new javax.swing.JButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jPanel92 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jPanel94 = new javax.swing.JPanel();
        btnMinusYemaCake = new javax.swing.JButton();
        yemaCakeLabelQty = new javax.swing.JLabel();
        btnPlusYemaCake = new javax.swing.JButton();
        jPanel95 = new javax.swing.JPanel();
        lbPhpYemaCake = new javax.swing.JLabel();
        jRadioButton20 = new javax.swing.JRadioButton();
        btn6x2Yemacake = new javax.swing.JToggleButton();
        btn5x2Yemacake = new javax.swing.JToggleButton();
        btn4x2Yemacake = new javax.swing.JToggleButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        breadsandsweetsPanel = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        btnMinusUbePandesal = new javax.swing.JButton();
        lbzeroUbePandesal = new javax.swing.JLabel();
        btnPlusUbePandesal = new javax.swing.JButton();
        jPanel62 = new javax.swing.JPanel();
        lbPhpUbePandesal = new javax.swing.JLabel();
        btnUbeCheesedesal = new javax.swing.JToggleButton();
        btnUbeHalayaCheesedesal = new javax.swing.JToggleButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jPanel63 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        btnMinusBananaLoaf = new javax.swing.JButton();
        lbzeroBananaLoaf = new javax.swing.JLabel();
        btnPlusBananaLoaf = new javax.swing.JButton();
        jPanel66 = new javax.swing.JPanel();
        lbPhpBananaLoaf = new javax.swing.JLabel();
        btnMoistBananaChocoChipLoaf = new javax.swing.JToggleButton();
        btnMoistBananaChocoChipAlmondLoaf = new javax.swing.JToggleButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jPanel67 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        btnMinusBrownies = new javax.swing.JButton();
        lbzeroBrownies = new javax.swing.JLabel();
        btnPlusBrownies = new javax.swing.JButton();
        jPanel70 = new javax.swing.JPanel();
        lbPhpBrownies = new javax.swing.JLabel();
        btn6PcsBrownies = new javax.swing.JToggleButton();
        btn12PcsBrownies = new javax.swing.JToggleButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        btn30PcsBrownies = new javax.swing.JToggleButton();
        jPanel72 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jPanel74 = new javax.swing.JPanel();
        btnMinusClassicCinnamon = new javax.swing.JButton();
        lbzeroClassicCinnamon = new javax.swing.JLabel();
        btnPlusClassicCinnamon = new javax.swing.JButton();
        jPanel75 = new javax.swing.JPanel();
        lbPhpClassicCinnamon = new javax.swing.JLabel();
        btnBoxof4ClassicCinnamon = new javax.swing.JToggleButton();
        btnBoxof6ClassicCinnamon = new javax.swing.JToggleButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jPanel76 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jPanel78 = new javax.swing.JPanel();
        btnMinusMilkyDonut = new javax.swing.JButton();
        lbzeroMilkyDonut = new javax.swing.JLabel();
        btnPlusMilkyDonut = new javax.swing.JButton();
        jPanel79 = new javax.swing.JPanel();
        lbPhpMilkyDonut = new javax.swing.JLabel();
        btn5PcsMilkyDonut = new javax.swing.JToggleButton();
        btn10PcsMilkyDonut = new javax.swing.JToggleButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jPanel80 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jPanel82 = new javax.swing.JPanel();
        btnMinuMuffin = new javax.swing.JButton();
        lbzeroMuffin = new javax.swing.JLabel();
        btnPlusMuffin = new javax.swing.JButton();
        jPanel83 = new javax.swing.JPanel();
        lbPhpMuffin = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        btn6PcsBananaMuffin = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(44, 204, 98));

        jPanel2.setBackground(new java.awt.Color(225, 135, 44));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));

        jPanel8.setBackground(new java.awt.Color(255, 255, 153));
        jPanel8.setForeground(new java.awt.Color(225, 135, 44));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loupe.png"))); // NOI18N

        txtSearch.setBackground(new java.awt.Color(255, 255, 153));
        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(225, 135, 44));
        txtSearch.setText("Search");
        txtSearch.setBorder(null);
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(225, 135, 44));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BeA D' Lites.1png_1.png"))); // NOI18N
        jLabel6.setText("Bea D Lites Point & Stock");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(81, 81, 81)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(574, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, 1300, 50));

        productsPanel.setBackground(new java.awt.Color(255, 255, 153));
        productsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cake (1).png"))); // NOI18N
        jLabel1.setText(" Cakes");
        productsPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, -1));

        btnCake.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCake.setForeground(new java.awt.Color(0, 0, 0));
        btnCake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Top view of cake with cinnamon sticks _ Premium Photo.png"))); // NOI18N
        btnCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCakeActionPerformed(evt);
            }
        });
        productsPanel.add(btnCake, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 70));

        jLabel2.setBackground(new java.awt.Color(255, 204, 102));
        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 102));
        jLabel2.setText("& Sweets");
        productsPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 70, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bakery.png"))); // NOI18N
        jLabel3.setText("Breads ");
        productsPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 100, -1));

        btnBreadSweets1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBreadSweets1.setForeground(new java.awt.Color(0, 0, 0));
        btnBreadSweets1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Premium Photo _ Pastries.jpg"))); // NOI18N
        btnBreadSweets1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btnBreadSweets1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBreadSweets1ActionPerformed(evt);
            }
        });
        productsPanel.add(btnBreadSweets1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, 70));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(225, 135, 44));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pastry");
        productsPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, -1));

        backButton.setBackground(new java.awt.Color(255, 255, 153));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(225, 135, 44));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        productsPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 490, 160, 40));

        jPanel3.add(productsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 58, 190, 690));

        BillPanel.setBackground(new java.awt.Color(255, 255, 153));

        dashLinelabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dashLinelabel1.setForeground(new java.awt.Color(255, 204, 102));
        dashLinelabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashLinelabel1.setText("------------------------");

        BillLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BillLabel.setForeground(new java.awt.Color(225, 135, 44));
        BillLabel.setText("Bill");

        dateLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(225, 135, 44));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateLabel.setText("day");

        dashLineLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dashLineLabel2.setForeground(new java.awt.Color(255, 204, 102));
        dashLineLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashLineLabel2.setText("------------------------");

        productStaticLabel.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        productStaticLabel.setForeground(new java.awt.Color(0, 0, 0));
        productStaticLabel.setText("- Product");

        productNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        productNameLabel.setForeground(new java.awt.Color(102, 102, 102));
        productNameLabel.setText("Product name");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Quantity");

        quantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(102, 102, 102));
        quantityLabel.setText("Qty");

        sizeorvariationstaticLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sizeorvariationstaticLabel.setForeground(new java.awt.Color(0, 0, 0));
        sizeorvariationstaticLabel.setText("Size/Variation");

        sizeorVariationLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sizeorVariationLabel.setForeground(new java.awt.Color(102, 102, 102));
        sizeorVariationLabel.setText("What Size");

        dashLineLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dashLineLabel3.setForeground(new java.awt.Color(255, 204, 102));
        dashLineLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashLineLabel3.setText("______________________");

        subtotalstaticlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        subtotalstaticlabel.setForeground(new java.awt.Color(0, 0, 0));
        subtotalstaticlabel.setText("Subtotal");

        totalstaticlabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalstaticlabel.setForeground(new java.awt.Color(0, 0, 0));
        totalstaticlabel.setText("Total");

        subTotalamountlabel.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        subTotalamountlabel.setForeground(new java.awt.Color(102, 102, 102));
        subTotalamountlabel.setText("Amount");

        totalAmountLabel.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        totalAmountLabel.setForeground(new java.awt.Color(102, 102, 102));
        totalAmountLabel.setText("Amount");

        jToggleButton2.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(225, 135, 44));
        jToggleButton2.setText("Pay By Cash");

        jToggleButton3.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(225, 135, 44));
        jToggleButton3.setText("Pay By Gcash");

        jButton9.setBackground(new java.awt.Color(255, 204, 102));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(225, 135, 44));
        jButton9.setText("Done");

        javax.swing.GroupLayout BillPanelLayout = new javax.swing.GroupLayout(BillPanel);
        BillPanel.setLayout(BillPanelLayout);
        BillPanelLayout.setHorizontalGroup(
            BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillPanelLayout.createSequentialGroup()
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(BillLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BillPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(dashLineLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BillPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BillPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BillPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dashLinelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BillPanelLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(BillPanelLayout.createSequentialGroup()
                                    .addComponent(productStaticLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(productNameLabel))
                                .addGroup(BillPanelLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BillPanelLayout.createSequentialGroup()
                                            .addComponent(sizeorvariationstaticLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sizeorVariationLabel))
                                        .addGroup(BillPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(quantityLabel))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillPanelLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(dashLineLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BillPanelLayout.createSequentialGroup()
                                .addComponent(subtotalstaticlabel)
                                .addGap(103, 103, 103)
                                .addComponent(subTotalamountlabel))
                            .addGroup(BillPanelLayout.createSequentialGroup()
                                .addComponent(totalstaticlabel)
                                .addGap(115, 115, 115)
                                .addComponent(totalAmountLabel)))))
                .addGap(27, 27, 27))
        );
        BillPanelLayout.setVerticalGroup(
            BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BillLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BillPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(dashLinelabel1)
                .addGap(16, 16, 16)
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productStaticLabel)
                    .addComponent(productNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(quantityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeorvariationstaticLabel)
                    .addComponent(sizeorVariationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dashLineLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(dashLineLabel3)
                .addGap(95, 95, 95)
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtotalstaticlabel)
                    .addGroup(BillPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(subTotalamountlabel)))
                .addGap(18, 18, 18)
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalstaticlabel)
                    .addGroup(BillPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(totalAmountLabel)))
                .addGap(32, 32, 32)
                .addComponent(jToggleButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(BillPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 60, 210, 690));

        jPanel71.setBackground(new java.awt.Color(225, 135, 44));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        cakesPanel.setBackground(new java.awt.Color(255, 255, 153));

        jPanel15.setBackground(new java.awt.Color(255, 204, 102));

        mangoToppings.setBackground(new java.awt.Color(255, 255, 153));
        mangoToppings.setForeground(new java.awt.Color(255, 204, 102));
        mangoToppings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mango.png"))); // NOI18N

        jPanel9.setBackground(new java.awt.Color(255, 255, 153));

        jLabel43.setBackground(new java.awt.Color(225, 135, 44));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mango bravo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 204, 102));

        minusButtonMango.setBackground(new java.awt.Color(255, 204, 102));
        minusButtonMango.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        minusButtonMango.setForeground(new java.awt.Color(225, 135, 44));
        minusButtonMango.setText("-");
        minusButtonMango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonMangoActionPerformed(evt);
            }
        });

        mangoBravoQuantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mangoBravoQuantity.setForeground(new java.awt.Color(225, 135, 44));
        mangoBravoQuantity.setText("0");

        addButtonMango.setBackground(new java.awt.Color(255, 204, 102));
        addButtonMango.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButtonMango.setForeground(new java.awt.Color(225, 135, 44));
        addButtonMango.setText("+");
        addButtonMango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonMangoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minusButtonMango, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(mangoBravoQuantity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButtonMango, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minusButtonMango)
                    .addComponent(mangoBravoQuantity)
                    .addComponent(addButtonMango))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 153));
        jPanel13.setForeground(new java.awt.Color(225, 135, 44));

        mangoPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mangoPrice.setForeground(new java.awt.Color(225, 135, 44));
        mangoPrice.setText("Php: 0.00");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mangoPrice)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mangoPrice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mangoBravo5x2button.setBackground(new java.awt.Color(255, 255, 153));
        mangoBravo5x2button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mangoBravo5x2button.setForeground(new java.awt.Color(225, 135, 44));
        mangoBravo5x2button.setText("5 x 2\"");

        mangoBravo6x2button.setBackground(new java.awt.Color(255, 255, 153));
        mangoBravo6x2button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mangoBravo6x2button.setForeground(new java.awt.Color(225, 135, 44));
        mangoBravo6x2button.setText("6 x 2\"");

        mangoBravo4x2button.setBackground(new java.awt.Color(255, 255, 153));
        mangoBravo4x2button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mangoBravo4x2button.setForeground(new java.awt.Color(225, 135, 44));
        mangoBravo4x2button.setText("4 x 2\"");

        mangoRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mangoRadioButton.setForeground(new java.awt.Color(225, 135, 44));
        mangoRadioButton.setText("Mango Bravo");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(225, 135, 44));
        jLabel72.setText("Topping:");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mangoToppings, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mangoBravo5x2button)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mangoBravo6x2button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mangoBravo4x2button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(mangoRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mangoRadioButton)
                .addGap(1, 1, 1)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mangoBravo6x2button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mangoBravo5x2button)
                            .addComponent(mangoBravo4x2button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mangoToppings, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72))
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(255, 204, 102));

        jPanel17.setBackground(new java.awt.Color(255, 255, 153));

        jLabel45.setBackground(new java.awt.Color(225, 135, 44));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b81690e5-b1dd-4a5f-8dd0-4d09b24d2ecf.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        Jpanel.setBackground(new java.awt.Color(255, 204, 102));

        redVelvetMinusButton.setBackground(new java.awt.Color(255, 204, 102));
        redVelvetMinusButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        redVelvetMinusButton.setForeground(new java.awt.Color(225, 135, 44));
        redVelvetMinusButton.setText("-");
        redVelvetMinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redVelvetMinusButtonActionPerformed(evt);
            }
        });

        redvelvetlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        redvelvetlabel.setForeground(new java.awt.Color(225, 135, 44));
        redvelvetlabel.setText("0");

        RedVelvetPlusButton.setBackground(new java.awt.Color(255, 204, 102));
        RedVelvetPlusButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RedVelvetPlusButton.setForeground(new java.awt.Color(225, 135, 44));
        RedVelvetPlusButton.setText("+");
        RedVelvetPlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedVelvetPlusButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelLayout = new javax.swing.GroupLayout(Jpanel);
        Jpanel.setLayout(JpanelLayout);
        JpanelLayout.setHorizontalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(redVelvetMinusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(redvelvetlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RedVelvetPlusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JpanelLayout.setVerticalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redVelvetMinusButton)
                    .addComponent(redvelvetlabel)
                    .addComponent(RedVelvetPlusButton))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 153));

        redVelvetCakePrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        redVelvetCakePrice.setForeground(new java.awt.Color(225, 135, 44));
        redVelvetCakePrice.setText("Php: 0.00");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(redVelvetCakePrice)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(redVelvetCakePrice)
                .addContainerGap())
        );

        redVelvet6x2sizebutton.setBackground(new java.awt.Color(255, 255, 153));
        redVelvet6x2sizebutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        redVelvet6x2sizebutton.setForeground(new java.awt.Color(225, 135, 44));
        redVelvet6x2sizebutton.setText("6 x 2\"");

        redVelvet5x2sizeButton.setBackground(new java.awt.Color(255, 255, 153));
        redVelvet5x2sizeButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        redVelvet5x2sizeButton.setForeground(new java.awt.Color(225, 135, 44));
        redVelvet5x2sizeButton.setText("5 x 2\"");

        redVelvetRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        redVelvetRadioButton.setForeground(new java.awt.Color(225, 135, 44));
        redVelvetRadioButton.setText("Red Velvet Cake");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(redVelvetRadioButton)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(redVelvet6x2sizebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(redVelvet5x2sizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(redVelvetRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(redVelvet6x2sizebutton)
                            .addComponent(redVelvet5x2sizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );

        jPanel23.setBackground(new java.awt.Color(255, 204, 102));

        jPanel24.setBackground(new java.awt.Color(255, 255, 153));

        jLabel49.setBackground(new java.awt.Color(225, 135, 44));
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/strawberry cake.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel25.setBackground(new java.awt.Color(255, 204, 102));

        strawberryshortminusbutton.setBackground(new java.awt.Color(255, 204, 102));
        strawberryshortminusbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        strawberryshortminusbutton.setForeground(new java.awt.Color(225, 135, 44));
        strawberryshortminusbutton.setText("-");
        strawberryshortminusbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strawberryshortminusbuttonActionPerformed(evt);
            }
        });

        strawberyshortcakelbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        strawberyshortcakelbl.setForeground(new java.awt.Color(225, 135, 44));
        strawberyshortcakelbl.setText("0");

        strawberryshortplusbutton.setBackground(new java.awt.Color(255, 204, 102));
        strawberryshortplusbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        strawberryshortplusbutton.setForeground(new java.awt.Color(225, 135, 44));
        strawberryshortplusbutton.setText("+");
        strawberryshortplusbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strawberryshortplusbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(strawberryshortminusbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(strawberyshortcakelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(strawberryshortplusbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strawberryshortminusbutton)
                    .addComponent(strawberyshortcakelbl)
                    .addComponent(strawberryshortplusbutton))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 153));

        strawberryShortCakePrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        strawberryShortCakePrice.setForeground(new java.awt.Color(225, 135, 44));
        strawberryShortCakePrice.setText("Php: 0.00");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(strawberryShortCakePrice)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(strawberryShortCakePrice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        strawberryshortcake6x3sizebtn.setBackground(new java.awt.Color(255, 255, 153));
        strawberryshortcake6x3sizebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        strawberryshortcake6x3sizebtn.setForeground(new java.awt.Color(225, 135, 44));
        strawberryshortcake6x3sizebtn.setText("6x3\"");

        strawberryshortcake5x3sizebtn.setBackground(new java.awt.Color(255, 255, 153));
        strawberryshortcake5x3sizebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        strawberryshortcake5x3sizebtn.setForeground(new java.awt.Color(225, 135, 44));
        strawberryshortcake5x3sizebtn.setText("5x3\"");

        strawberryshortcake8x3sizebtn.setBackground(new java.awt.Color(255, 255, 153));
        strawberryshortcake8x3sizebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        strawberryshortcake8x3sizebtn.setForeground(new java.awt.Color(225, 135, 44));
        strawberryshortcake8x3sizebtn.setText("8x3\"");

        jToggleButton10.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton10.setForeground(new java.awt.Color(255, 204, 102));
        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/strawberry.png"))); // NOI18N

        strawberryshortcake4x3sizebtn.setBackground(new java.awt.Color(255, 255, 153));
        strawberryshortcake4x3sizebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        strawberryshortcake4x3sizebtn.setForeground(new java.awt.Color(225, 135, 44));
        strawberryshortcake4x3sizebtn.setText("4x3\"");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(225, 135, 44));
        jLabel71.setText("Topping:");

        strawberryshortcakeradioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        strawberryshortcakeradioButton.setForeground(new java.awt.Color(225, 135, 44));
        strawberryshortcakeradioButton.setText("Strawberry Shortcake");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel71)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                    .addComponent(strawberryshortcake4x3sizebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(strawberryshortcake5x3sizebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(strawberryshortcake6x3sizebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(strawberryshortcake8x3sizebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(strawberryshortcakeradioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(strawberryshortcakeradioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(strawberryshortcake5x3sizebtn)
                            .addComponent(strawberryshortcake4x3sizebtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(strawberryshortcake8x3sizebtn)
                            .addComponent(strawberryshortcake6x3sizebtn)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel71))))
                .addGap(13, 13, 13))
        );

        jPanel51.setBackground(new java.awt.Color(255, 204, 102));

        jPanel52.setBackground(new java.awt.Color(255, 255, 153));

        jLabel82.setBackground(new java.awt.Color(225, 135, 44));
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bento .jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel82)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel82)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel53.setBackground(new java.awt.Color(255, 204, 102));
        jPanel53.setForeground(new java.awt.Color(225, 135, 44));

        bentoCakeminusButton.setBackground(new java.awt.Color(255, 204, 102));
        bentoCakeminusButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bentoCakeminusButton.setForeground(new java.awt.Color(225, 135, 44));
        bentoCakeminusButton.setText("-");
        bentoCakeminusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bentoCakeminusButtonActionPerformed(evt);
            }
        });

        bentocakelbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bentocakelbl.setForeground(new java.awt.Color(225, 135, 44));
        bentocakelbl.setText("0");

        bentoCakePlusButton.setBackground(new java.awt.Color(255, 204, 102));
        bentoCakePlusButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bentoCakePlusButton.setForeground(new java.awt.Color(225, 135, 44));
        bentoCakePlusButton.setText("+");
        bentoCakePlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bentoCakePlusButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bentoCakeminusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bentocakelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bentoCakePlusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bentoCakeminusButton)
                    .addComponent(bentocakelbl)
                    .addComponent(bentoCakePlusButton))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel54.setBackground(new java.awt.Color(255, 255, 153));

        bentoCakePrice.setBackground(new java.awt.Color(255, 255, 153));
        bentoCakePrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bentoCakePrice.setForeground(new java.awt.Color(225, 135, 44));
        bentoCakePrice.setText("Php 0.00");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel54Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(bentoCakePrice)
                .addContainerGap())
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bentoCakePrice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bentoCakeSizebutton.setBackground(new java.awt.Color(255, 255, 153));
        bentoCakeSizebutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bentoCakeSizebutton.setForeground(new java.awt.Color(225, 135, 44));
        bentoCakeSizebutton.setText("4 x 2\" + 2 pcs cupcake");

        bentoCakeRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bentoCakeRadioButton.setForeground(new java.awt.Color(225, 135, 44));
        bentoCakeRadioButton.setText("Bento Cake");

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel51Layout.createSequentialGroup()
                                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                                .addComponent(bentoCakeSizebutton, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addComponent(bentoCakeRadioButton)))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bentoCakeRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel51Layout.createSequentialGroup()
                        .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bentoCakeSizebutton)))
                .addGap(40, 40, 40))
        );

        jPanel27.setBackground(new java.awt.Color(255, 204, 102));

        jPanel28.setBackground(new java.awt.Color(255, 255, 153));

        jLabel53.setBackground(new java.awt.Color(225, 135, 44));
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/87960fcc-fa36-41bd-92dd-bfa842c9fe36.png"))); // NOI18N

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel29.setBackground(new java.awt.Color(255, 204, 102));

        btnMinusCaramelFlan.setBackground(new java.awt.Color(255, 204, 102));
        btnMinusCaramelFlan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMinusCaramelFlan.setForeground(new java.awt.Color(225, 135, 44));
        btnMinusCaramelFlan.setText("-");
        btnMinusCaramelFlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusCaramelFlanActionPerformed(evt);
            }
        });

        lbqtycaramelflan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbqtycaramelflan.setForeground(new java.awt.Color(225, 135, 44));
        lbqtycaramelflan.setText("0");

        btnPlusCaramelFlan.setBackground(new java.awt.Color(255, 204, 102));
        btnPlusCaramelFlan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlusCaramelFlan.setForeground(new java.awt.Color(225, 135, 44));
        btnPlusCaramelFlan.setText("+");
        btnPlusCaramelFlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusCaramelFlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMinusCaramelFlan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lbqtycaramelflan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlusCaramelFlan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinusCaramelFlan)
                    .addComponent(lbqtycaramelflan)
                    .addComponent(btnPlusCaramelFlan))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(255, 255, 153));

        caramelFlanDeLecheCakePrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        caramelFlanDeLecheCakePrice.setForeground(new java.awt.Color(225, 135, 44));
        caramelFlanDeLecheCakePrice.setText("Php: 0.00");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(caramelFlanDeLecheCakePrice)
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caramelFlanDeLecheCakePrice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn4x2CaramelFlan.setBackground(new java.awt.Color(255, 255, 153));
        btn4x2CaramelFlan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn4x2CaramelFlan.setForeground(new java.awt.Color(225, 135, 44));
        btn4x2CaramelFlan.setText("4x2\"");

        btn6x2CaramelFlan.setBackground(new java.awt.Color(255, 255, 153));
        btn6x2CaramelFlan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn6x2CaramelFlan.setForeground(new java.awt.Color(225, 135, 44));
        btn6x2CaramelFlan.setText(" 6x2\"");
        btn6x2CaramelFlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6x2CaramelFlanActionPerformed(evt);
            }
        });

        btn5x2CaramelFlan.setBackground(new java.awt.Color(255, 255, 153));
        btn5x2CaramelFlan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn5x2CaramelFlan.setForeground(new java.awt.Color(225, 135, 44));
        btn5x2CaramelFlan.setText("5x2\"");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(225, 135, 44));
        jLabel57.setText("Topping:");

        jToggleButton18.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton18.setForeground(new java.awt.Color(255, 204, 102));
        jToggleButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/caramel.png"))); // NOI18N

        jToggleButton19.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton19.setForeground(new java.awt.Color(255, 204, 102));
        jToggleButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pudding.png"))); // NOI18N

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(225, 135, 44));
        jRadioButton2.setText("Caramel flan de leche cake");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                                        .addComponent(btn5x2CaramelFlan, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))
                                    .addGroup(jPanel27Layout.createSequentialGroup()
                                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn6x2CaramelFlan, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                    .addComponent(btn4x2CaramelFlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jToggleButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton2))
                .addGap(6, 6, 6))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6x2CaramelFlan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4x2CaramelFlan)
                            .addComponent(btn5x2CaramelFlan)))
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addComponent(jToggleButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jPanel31.setBackground(new java.awt.Color(255, 204, 102));

        jPanel32.setBackground(new java.awt.Color(255, 255, 153));

        jLabel58.setBackground(new java.awt.Color(225, 135, 44));
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cheesecake(1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel58)
                .addGap(17, 17, 17))
        );

        jPanel33.setBackground(new java.awt.Color(255, 204, 102));

        btnMinusCheesecake.setBackground(new java.awt.Color(255, 204, 102));
        btnMinusCheesecake.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMinusCheesecake.setForeground(new java.awt.Color(225, 135, 44));
        btnMinusCheesecake.setText("-");
        btnMinusCheesecake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusCheesecakeActionPerformed(evt);
            }
        });

        lblquantitycheesecake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblquantitycheesecake.setForeground(new java.awt.Color(225, 135, 44));
        lblquantitycheesecake.setText("0");

        btnPlusCheesecake.setBackground(new java.awt.Color(255, 204, 102));
        btnPlusCheesecake.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlusCheesecake.setForeground(new java.awt.Color(225, 135, 44));
        btnPlusCheesecake.setText("+");
        btnPlusCheesecake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusCheesecakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMinusCheesecake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lblquantitycheesecake)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlusCheesecake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinusCheesecake)
                    .addComponent(lblquantitycheesecake)
                    .addComponent(btnPlusCheesecake))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel34.setBackground(new java.awt.Color(255, 255, 153));

        cheeseCakePrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cheeseCakePrice.setForeground(new java.awt.Color(225, 135, 44));
        cheeseCakePrice.setText("Php: 0.00");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cheeseCakePrice)
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cheeseCakePrice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn8Cheesecake.setBackground(new java.awt.Color(255, 255, 153));
        btn8Cheesecake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn8Cheesecake.setForeground(new java.awt.Color(225, 135, 44));
        btn8Cheesecake.setText("8\"");
        btn8Cheesecake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8CheesecakeActionPerformed(evt);
            }
        });

        jToggleButton23.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton23.setForeground(new java.awt.Color(255, 204, 102));
        jToggleButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blueberry.png"))); // NOI18N

        jToggleButton24.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton24.setForeground(new java.awt.Color(255, 204, 102));
        jToggleButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mango.png"))); // NOI18N

        jToggleButton25.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton25.setForeground(new java.awt.Color(255, 204, 102));
        jToggleButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/biscuit.png"))); // NOI18N

        jToggleButton26.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton26.setForeground(new java.awt.Color(255, 204, 102));
        jToggleButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/strawberry.png"))); // NOI18N

        jRadioButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(225, 135, 44));
        jRadioButton8.setText("Cheesecake");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(225, 135, 44));
        jLabel61.setText("Topping:");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8Cheesecake, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jToggleButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton8))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn8Cheesecake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addGap(13, 13, 13))
        );

        jPanel35.setBackground(new java.awt.Color(255, 204, 102));

        jPanel36.setBackground(new java.awt.Color(255, 255, 153));

        jLabel63.setBackground(new java.awt.Color(225, 135, 44));
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/per slice cheesee cake.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel37.setBackground(new java.awt.Color(255, 204, 102));

        btnMinusSliceCheesecake.setBackground(new java.awt.Color(255, 204, 102));
        btnMinusSliceCheesecake.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMinusSliceCheesecake.setForeground(new java.awt.Color(225, 135, 44));
        btnMinusSliceCheesecake.setText("-");
        btnMinusSliceCheesecake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusSliceCheesecakeActionPerformed(evt);
            }
        });

        slicecheesecakelblqty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        slicecheesecakelblqty.setForeground(new java.awt.Color(225, 135, 44));
        slicecheesecakelblqty.setText("0");

        btnPlusSliceCheesecake.setBackground(new java.awt.Color(255, 204, 102));
        btnPlusSliceCheesecake.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlusSliceCheesecake.setForeground(new java.awt.Color(225, 135, 44));
        btnPlusSliceCheesecake.setText("+");
        btnPlusSliceCheesecake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusSliceCheesecakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMinusSliceCheesecake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(slicecheesecakelblqty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlusSliceCheesecake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinusSliceCheesecake)
                    .addComponent(slicecheesecakelblqty)
                    .addComponent(btnPlusSliceCheesecake))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel38.setBackground(new java.awt.Color(255, 255, 153));

        sliceCheesecakePrice.setBackground(new java.awt.Color(255, 204, 102));
        sliceCheesecakePrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sliceCheesecakePrice.setForeground(new java.awt.Color(225, 135, 44));
        sliceCheesecakePrice.setText("Php: 0.00");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sliceCheesecakePrice)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sliceCheesecakePrice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToggleButton28.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton28.setForeground(new java.awt.Color(255, 204, 102));
        jToggleButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blueberry.png"))); // NOI18N

        jToggleButton29.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton29.setForeground(new java.awt.Color(255, 204, 102));
        jToggleButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mango.png"))); // NOI18N

        jToggleButton30.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton30.setForeground(new java.awt.Color(255, 204, 102));
        jToggleButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/biscuit.png"))); // NOI18N

        jToggleButton31.setBackground(new java.awt.Color(255, 255, 153));
        jToggleButton31.setForeground(new java.awt.Color(255, 204, 102));
        jToggleButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/strawberry.png"))); // NOI18N

        jRadioButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(209, 127, 45));
        jRadioButton7.setText("Slice Cheesecake");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(225, 135, 44));
        jLabel66.setText("Topping:");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jToggleButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton7))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addGap(13, 13, 13))
        );

        jPanel39.setBackground(new java.awt.Color(255, 204, 102));

        jPanel40.setBackground(new java.awt.Color(255, 255, 153));

        jLabel68.setBackground(new java.awt.Color(225, 135, 44));
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b183dd51-ca7d-43cf-a2e3-da67038c0f2a (1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel68)
                .addGap(29, 29, 29))
        );

        jPanel41.setBackground(new java.awt.Color(255, 204, 102));
        jPanel41.setForeground(new java.awt.Color(225, 135, 44));

        btnMinusMangoBravoTub.setBackground(new java.awt.Color(255, 204, 102));
        btnMinusMangoBravoTub.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMinusMangoBravoTub.setForeground(new java.awt.Color(225, 135, 44));
        btnMinusMangoBravoTub.setText("-");
        btnMinusMangoBravoTub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusMangoBravoTubActionPerformed(evt);
            }
        });

        mangobravotublblqty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mangobravotublblqty.setForeground(new java.awt.Color(225, 135, 44));
        mangobravotublblqty.setText("0");

        btnPlusMangoBravoTub.setBackground(new java.awt.Color(255, 204, 102));
        btnPlusMangoBravoTub.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlusMangoBravoTub.setForeground(new java.awt.Color(225, 135, 44));
        btnPlusMangoBravoTub.setText("+");
        btnPlusMangoBravoTub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMangoBravoTubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMinusMangoBravoTub, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mangobravotublblqty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlusMangoBravoTub, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinusMangoBravoTub)
                    .addComponent(mangobravotublblqty)
                    .addComponent(btnPlusMangoBravoTub))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel42.setBackground(new java.awt.Color(255, 255, 153));

        mangoBravoTubPrice.setBackground(new java.awt.Color(255, 255, 153));
        mangoBravoTubPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mangoBravoTubPrice.setForeground(new java.awt.Color(225, 135, 44));
        mangoBravoTubPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mangoBravoTubPrice.setText("Php 0.00");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mangoBravoTubPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mangoBravoTubPrice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(225, 135, 44));
        jRadioButton1.setText("Mango Bravo Tub");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jRadioButton1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(51, 51, 51)
                        .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel43.setBackground(new java.awt.Color(255, 204, 102));

        jPanel44.setBackground(new java.awt.Color(255, 255, 153));

        jLabel74.setBackground(new java.awt.Color(225, 135, 44));
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minicupcake.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel74)
                .addGap(29, 29, 29))
        );

        jPanel45.setBackground(new java.awt.Color(255, 204, 102));
        jPanel45.setForeground(new java.awt.Color(225, 135, 44));

        btnMinusMiniCupcake.setBackground(new java.awt.Color(255, 204, 102));
        btnMinusMiniCupcake.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMinusMiniCupcake.setForeground(new java.awt.Color(225, 135, 44));
        btnMinusMiniCupcake.setText("-");
        btnMinusMiniCupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusMiniCupcakeActionPerformed(evt);
            }
        });

        lbQtyMiniCupcake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbQtyMiniCupcake.setForeground(new java.awt.Color(225, 135, 44));
        lbQtyMiniCupcake.setText("0");

        btnPlusMiniCupcake.setBackground(new java.awt.Color(255, 204, 102));
        btnPlusMiniCupcake.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlusMiniCupcake.setForeground(new java.awt.Color(225, 135, 44));
        btnPlusMiniCupcake.setText("+");
        btnPlusMiniCupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMiniCupcakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMinusMiniCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbQtyMiniCupcake)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlusMiniCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinusMiniCupcake)
                    .addComponent(lbQtyMiniCupcake)
                    .addComponent(btnPlusMiniCupcake))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel46.setBackground(new java.awt.Color(255, 255, 153));

        miniCupcakesPrice.setBackground(new java.awt.Color(255, 255, 153));
        miniCupcakesPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        miniCupcakesPrice.setForeground(new java.awt.Color(225, 135, 44));
        miniCupcakesPrice.setText("Php 0,00");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(miniCupcakesPrice)
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(miniCupcakesPrice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn6PcsMiniCupcake.setBackground(new java.awt.Color(255, 255, 153));
        btn6PcsMiniCupcake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn6PcsMiniCupcake.setForeground(new java.awt.Color(225, 135, 44));
        btn6PcsMiniCupcake.setText("6PCS");

        btn12PcsMiniCupcake.setBackground(new java.awt.Color(255, 255, 153));
        btn12PcsMiniCupcake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn12PcsMiniCupcake.setForeground(new java.awt.Color(225, 135, 44));
        btn12PcsMiniCupcake.setText("12PCS");

        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(225, 135, 44));
        jRadioButton4.setText("Mini Cupcakes");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(btn6PcsMiniCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn12PcsMiniCupcake))
                    .addComponent(jRadioButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                        .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                        .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6PcsMiniCupcake)
                    .addComponent(btn12PcsMiniCupcake))
                .addGap(55, 55, 55))
        );

        jPanel47.setBackground(new java.awt.Color(255, 204, 102));

        jPanel48.setBackground(new java.awt.Color(255, 255, 153));

        jLabel78.setBackground(new java.awt.Color(225, 135, 44));
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cupcake.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel78)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel78)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel49.setBackground(new java.awt.Color(255, 204, 102));
        jPanel49.setForeground(new java.awt.Color(225, 135, 44));

        btnMinusPiscesCupcake.setBackground(new java.awt.Color(255, 204, 102));
        btnMinusPiscesCupcake.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMinusPiscesCupcake.setForeground(new java.awt.Color(225, 135, 44));
        btnMinusPiscesCupcake.setText("-");
        btnMinusPiscesCupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusPiscesCupcakeActionPerformed(evt);
            }
        });

        lbzeroqty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbzeroqty.setForeground(new java.awt.Color(225, 135, 44));
        lbzeroqty.setText("0");

        btnPlusPiscescupcake.setBackground(new java.awt.Color(255, 204, 102));
        btnPlusPiscescupcake.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlusPiscescupcake.setForeground(new java.awt.Color(225, 135, 44));
        btnPlusPiscescupcake.setText("+");
        btnPlusPiscescupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusPiscescupcakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMinusPiscesCupcake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbzeroqty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlusPiscescupcake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinusPiscesCupcake)
                    .addComponent(lbzeroqty)
                    .addComponent(btnPlusPiscescupcake))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel50.setBackground(new java.awt.Color(255, 255, 153));

        piscesCupcakesPrice.setBackground(new java.awt.Color(255, 255, 153));
        piscesCupcakesPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        piscesCupcakesPrice.setForeground(new java.awt.Color(225, 135, 44));
        piscesCupcakesPrice.setText("Php 0.00");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(piscesCupcakesPrice)
                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(piscesCupcakesPrice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn1pcPisces.setBackground(new java.awt.Color(255, 255, 153));
        btn1pcPisces.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn1pcPisces.setForeground(new java.awt.Color(225, 135, 44));
        btn1pcPisces.setText("1 PC");

        btn3PcsPisces.setBackground(new java.awt.Color(255, 255, 153));
        btn3PcsPisces.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn3PcsPisces.setForeground(new java.awt.Color(225, 135, 44));
        btn3PcsPisces.setText("3 PCS");

        btn4PcsPisces.setBackground(new java.awt.Color(255, 255, 153));
        btn4PcsPisces.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn4PcsPisces.setForeground(new java.awt.Color(225, 135, 44));
        btn4PcsPisces.setText("4 PCS");

        btn6PcsPisces.setBackground(new java.awt.Color(255, 255, 153));
        btn6PcsPisces.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn6PcsPisces.setForeground(new java.awt.Color(225, 135, 44));
        btn6PcsPisces.setText("6 PCS");

        btn12PcsPisces.setBackground(new java.awt.Color(255, 255, 153));
        btn12PcsPisces.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn12PcsPisces.setForeground(new java.awt.Color(225, 135, 44));
        btn12PcsPisces.setText("12 PCS");

        jRadioButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(225, 135, 44));
        jRadioButton5.setText("Pisces Cupcake");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn1pcPisces, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3PcsPisces, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn6PcsPisces, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(btn4PcsPisces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn12PcsPisces))
                    .addComponent(jRadioButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel47Layout.createSequentialGroup()
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1pcPisces)
                            .addComponent(btn4PcsPisces))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn3PcsPisces)
                            .addComponent(btn6PcsPisces)
                            .addComponent(btn12PcsPisces))
                        .addGap(30, 30, 30))))
        );

        jPanel55.setBackground(new java.awt.Color(255, 204, 102));

        jPanel56.setBackground(new java.awt.Color(255, 255, 153));

        jLabel67.setBackground(new java.awt.Color(225, 135, 44));
        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icing cake.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel67)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel57.setBackground(new java.awt.Color(255, 204, 102));

        btnCustomeCakeIcingCake.setBackground(new java.awt.Color(255, 255, 153));
        btnCustomeCakeIcingCake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCustomeCakeIcingCake.setForeground(new java.awt.Color(225, 135, 44));
        btnCustomeCakeIcingCake.setText("Custom Cake");
        btnCustomeCakeIcingCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomeCakeIcingCakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCustomeCakeIcingCake)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnCustomeCakeIcingCake, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jRadioButton11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton11.setForeground(new java.awt.Color(209, 127, 45));
        jRadioButton11.setText("Icing Cake");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton11))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        jPanel84.setBackground(new java.awt.Color(255, 204, 102));

        jPanel85.setBackground(new java.awt.Color(255, 255, 153));

        jLabel70.setBackground(new java.awt.Color(225, 135, 44));
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimalist.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel85Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel86.setBackground(new java.awt.Color(255, 204, 102));

        btnMinimalistCakeCustomCake.setBackground(new java.awt.Color(255, 255, 153));
        btnMinimalistCakeCustomCake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMinimalistCakeCustomCake.setForeground(new java.awt.Color(225, 135, 44));
        btnMinimalistCakeCustomCake.setText("Custom Cake");
        btnMinimalistCakeCustomCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimalistCakeCustomCakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnMinimalistCakeCustomCake)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMinimalistCakeCustomCake, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jRadioButton18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton18.setForeground(new java.awt.Color(209, 127, 45));
        jRadioButton18.setText("Minimalist Cake");

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel84Layout.createSequentialGroup()
                        .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton18))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        jPanel88.setBackground(new java.awt.Color(255, 204, 102));

        jPanel89.setBackground(new java.awt.Color(255, 255, 153));

        jLabel77.setBackground(new java.awt.Color(225, 135, 44));
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondant.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel77)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel89Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel90.setBackground(new java.awt.Color(255, 204, 102));

        customCakeButton.setBackground(new java.awt.Color(255, 255, 153));
        customCakeButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        customCakeButton.setForeground(new java.awt.Color(225, 135, 44));
        customCakeButton.setText("Custom Cake");
        customCakeButton.setToolTipText("");
        customCakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customCakeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customCakeButton)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customCakeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jRadioButton19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton19.setForeground(new java.awt.Color(209, 127, 45));
        jRadioButton19.setText("Fondant Cake");

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel88Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel88Layout.createSequentialGroup()
                        .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton19))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel88Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        jPanel92.setBackground(new java.awt.Color(255, 204, 102));

        jPanel93.setBackground(new java.awt.Color(255, 255, 153));

        jLabel73.setBackground(new java.awt.Color(225, 135, 44));
        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/YemaCake.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel93Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel93Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel94.setBackground(new java.awt.Color(255, 204, 102));

        btnMinusYemaCake.setBackground(new java.awt.Color(255, 204, 102));
        btnMinusYemaCake.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMinusYemaCake.setForeground(new java.awt.Color(225, 135, 44));
        btnMinusYemaCake.setText("-");
        btnMinusYemaCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusYemaCakeActionPerformed(evt);
            }
        });

        yemaCakeLabelQty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        yemaCakeLabelQty.setForeground(new java.awt.Color(225, 135, 44));
        yemaCakeLabelQty.setText("0");

        btnPlusYemaCake.setBackground(new java.awt.Color(255, 204, 102));
        btnPlusYemaCake.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlusYemaCake.setForeground(new java.awt.Color(225, 135, 44));
        btnPlusYemaCake.setText("+");
        btnPlusYemaCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusYemaCakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel94Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMinusYemaCake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yemaCakeLabelQty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlusYemaCake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel94Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinusYemaCake)
                    .addComponent(yemaCakeLabelQty)
                    .addComponent(btnPlusYemaCake))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel95.setBackground(new java.awt.Color(255, 255, 153));

        lbPhpYemaCake.setBackground(new java.awt.Color(255, 204, 102));
        lbPhpYemaCake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPhpYemaCake.setForeground(new java.awt.Color(225, 135, 44));
        lbPhpYemaCake.setText("Php: 0.00");

        javax.swing.GroupLayout jPanel95Layout = new javax.swing.GroupLayout(jPanel95);
        jPanel95.setLayout(jPanel95Layout);
        jPanel95Layout.setHorizontalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel95Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPhpYemaCake, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
        );
        jPanel95Layout.setVerticalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel95Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPhpYemaCake)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jRadioButton20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton20.setForeground(new java.awt.Color(209, 127, 45));
        jRadioButton20.setText("Yema Cake");

        btn6x2Yemacake.setBackground(new java.awt.Color(255, 255, 153));
        btn6x2Yemacake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn6x2Yemacake.setForeground(new java.awt.Color(225, 135, 44));
        btn6x2Yemacake.setText(" 6x2\"");

        btn5x2Yemacake.setBackground(new java.awt.Color(255, 255, 153));
        btn5x2Yemacake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn5x2Yemacake.setForeground(new java.awt.Color(225, 135, 44));
        btn5x2Yemacake.setText("5x2\"");

        btn4x2Yemacake.setBackground(new java.awt.Color(255, 255, 153));
        btn4x2Yemacake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn4x2Yemacake.setForeground(new java.awt.Color(225, 135, 44));
        btn4x2Yemacake.setText("4x2\"");
        btn4x2Yemacake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4x2YemacakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel92Layout.createSequentialGroup()
                        .addComponent(jRadioButton20)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel92Layout.createSequentialGroup()
                        .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel92Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel92Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel92Layout.createSequentialGroup()
                                        .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel92Layout.createSequentialGroup()
                                                .addComponent(btn5x2Yemacake, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn4x2Yemacake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel92Layout.createSequentialGroup()
                                                .addComponent(btn6x2Yemacake, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(6, 6, 6))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel92Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))))))
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel92Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel92Layout.createSequentialGroup()
                        .addComponent(jPanel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn5x2Yemacake)
                            .addComponent(btn4x2Yemacake)))
                    .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn6x2Yemacake, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout cakesPanelLayout = new javax.swing.GroupLayout(cakesPanel);
        cakesPanel.setLayout(cakesPanelLayout);
        cakesPanelLayout.setHorizontalGroup(
            cakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cakesPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(cakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cakesPanelLayout.createSequentialGroup()
                        .addGroup(cakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(cakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(cakesPanelLayout.createSequentialGroup()
                        .addGroup(cakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel88, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        cakesPanelLayout.setVerticalGroup(
            cakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cakesPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(cakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cakesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel88, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(358, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(cakesPanel);

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1178, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("cakes", jPanel71);

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        breadsandsweetsPanel.setBackground(new java.awt.Color(255, 255, 153));

        jPanel59.setBackground(new java.awt.Color(255, 204, 102));

        jPanel60.setBackground(new java.awt.Color(255, 255, 153));

        jLabel48.setBackground(new java.awt.Color(225, 135, 44));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ube Pandesal.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel61.setBackground(new java.awt.Color(255, 204, 102));

        btnMinusUbePandesal.setBackground(new java.awt.Color(255, 204, 102));
        btnMinusUbePandesal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMinusUbePandesal.setForeground(new java.awt.Color(225, 135, 44));
        btnMinusUbePandesal.setText("-");
        btnMinusUbePandesal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusUbePandesalActionPerformed(evt);
            }
        });

        lbzeroUbePandesal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbzeroUbePandesal.setForeground(new java.awt.Color(225, 135, 44));
        lbzeroUbePandesal.setText("0");

        btnPlusUbePandesal.setBackground(new java.awt.Color(255, 204, 102));
        btnPlusUbePandesal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlusUbePandesal.setForeground(new java.awt.Color(225, 135, 44));
        btnPlusUbePandesal.setText("+");
        btnPlusUbePandesal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusUbePandesalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMinusUbePandesal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lbzeroUbePandesal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlusUbePandesal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinusUbePandesal)
                    .addComponent(lbzeroUbePandesal)
                    .addComponent(btnPlusUbePandesal))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel62.setBackground(new java.awt.Color(255, 255, 153));

        lbPhpUbePandesal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPhpUbePandesal.setForeground(new java.awt.Color(225, 135, 44));
        lbPhpUbePandesal.setText("Php: 0.00");

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPhpUbePandesal)
                .addContainerGap())
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPhpUbePandesal)
                .addContainerGap())
        );

        btnUbeCheesedesal.setBackground(new java.awt.Color(255, 255, 153));
        btnUbeCheesedesal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUbeCheesedesal.setForeground(new java.awt.Color(225, 135, 44));
        btnUbeCheesedesal.setText("Ube Cheesedesal");

        btnUbeHalayaCheesedesal.setBackground(new java.awt.Color(255, 255, 153));
        btnUbeHalayaCheesedesal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUbeHalayaCheesedesal.setForeground(new java.awt.Color(225, 135, 44));
        btnUbeHalayaCheesedesal.setText("Ube  Halaya Cheesedesal");

        jRadioButton12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton12.setForeground(new java.awt.Color(225, 135, 44));
        jRadioButton12.setText("Ube Pandesal");

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUbeCheesedesal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton12)
                            .addGroup(jPanel59Layout.createSequentialGroup()
                                .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnUbeHalayaCheesedesal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUbeCheesedesal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUbeHalayaCheesedesal)
                .addGap(10, 10, 10))
        );

        jPanel63.setBackground(new java.awt.Color(255, 204, 102));

        jPanel64.setBackground(new java.awt.Color(255, 255, 153));

        jLabel62.setBackground(new java.awt.Color(225, 135, 44));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Banana loaf.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel62)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel65.setBackground(new java.awt.Color(255, 204, 102));

        btnMinusBananaLoaf.setBackground(new java.awt.Color(255, 204, 102));
        btnMinusBananaLoaf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMinusBananaLoaf.setForeground(new java.awt.Color(225, 135, 44));
        btnMinusBananaLoaf.setText("-");
        btnMinusBananaLoaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusBananaLoafActionPerformed(evt);
            }
        });

        lbzeroBananaLoaf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbzeroBananaLoaf.setForeground(new java.awt.Color(225, 135, 44));
        lbzeroBananaLoaf.setText("0");

        btnPlusBananaLoaf.setBackground(new java.awt.Color(255, 204, 102));
        btnPlusBananaLoaf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlusBananaLoaf.setForeground(new java.awt.Color(225, 135, 44));
        btnPlusBananaLoaf.setText("+");
        btnPlusBananaLoaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusBananaLoafActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMinusBananaLoaf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lbzeroBananaLoaf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlusBananaLoaf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinusBananaLoaf)
                    .addComponent(lbzeroBananaLoaf)
                    .addComponent(btnPlusBananaLoaf))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel66.setBackground(new java.awt.Color(255, 255, 153));

        lbPhpBananaLoaf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPhpBananaLoaf.setForeground(new java.awt.Color(225, 135, 44));
        lbPhpBananaLoaf.setText("Php: 0.00");

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel66Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPhpBananaLoaf)
                .addContainerGap())
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel66Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPhpBananaLoaf)
                .addContainerGap())
        );

        btnMoistBananaChocoChipLoaf.setBackground(new java.awt.Color(255, 255, 153));
        btnMoistBananaChocoChipLoaf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMoistBananaChocoChipLoaf.setForeground(new java.awt.Color(225, 135, 44));
        btnMoistBananaChocoChipLoaf.setText("Moist Banana Choco Chip Loaf");

        btnMoistBananaChocoChipAlmondLoaf.setBackground(new java.awt.Color(255, 255, 153));
        btnMoistBananaChocoChipAlmondLoaf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMoistBananaChocoChipAlmondLoaf.setForeground(new java.awt.Color(225, 135, 44));
        btnMoistBananaChocoChipAlmondLoaf.setText("Moist Banana Choco Chip Almond Loaf");

        jRadioButton13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton13.setForeground(new java.awt.Color(225, 135, 44));
        jRadioButton13.setText("Banana Loaf");

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton13)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnMoistBananaChocoChipAlmondLoaf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMoistBananaChocoChipLoaf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMoistBananaChocoChipLoaf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMoistBananaChocoChipAlmondLoaf)
                .addGap(10, 10, 10))
        );

        jPanel67.setBackground(new java.awt.Color(255, 204, 102));

        jPanel68.setBackground(new java.awt.Color(255, 255, 153));

        jLabel86.setBackground(new java.awt.Color(225, 135, 44));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Brownies.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel69.setBackground(new java.awt.Color(255, 204, 102));

        btnMinusBrownies.setBackground(new java.awt.Color(255, 204, 102));
        btnMinusBrownies.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMinusBrownies.setForeground(new java.awt.Color(225, 135, 44));
        btnMinusBrownies.setText("-");
        btnMinusBrownies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusBrowniesActionPerformed(evt);
            }
        });

        lbzeroBrownies.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbzeroBrownies.setForeground(new java.awt.Color(225, 135, 44));
        lbzeroBrownies.setText("0");

        btnPlusBrownies.setBackground(new java.awt.Color(255, 204, 102));
        btnPlusBrownies.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlusBrownies.setForeground(new java.awt.Color(225, 135, 44));
        btnPlusBrownies.setText("+");
        btnPlusBrownies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusBrowniesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMinusBrownies, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lbzeroBrownies)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlusBrownies, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinusBrownies)
                    .addComponent(lbzeroBrownies)
                    .addComponent(btnPlusBrownies))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel70.setBackground(new java.awt.Color(255, 255, 153));

        lbPhpBrownies.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPhpBrownies.setForeground(new java.awt.Color(225, 135, 44));
        lbPhpBrownies.setText("Php: 0.00");

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel70Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPhpBrownies)
                .addContainerGap())
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel70Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPhpBrownies)
                .addContainerGap())
        );

        btn6PcsBrownies.setBackground(new java.awt.Color(255, 255, 153));
        btn6PcsBrownies.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn6PcsBrownies.setForeground(new java.awt.Color(225, 135, 44));
        btn6PcsBrownies.setText("6 PCS");

        btn12PcsBrownies.setBackground(new java.awt.Color(255, 255, 153));
        btn12PcsBrownies.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn12PcsBrownies.setForeground(new java.awt.Color(225, 135, 44));
        btn12PcsBrownies.setText("12 PCS");

        jRadioButton14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton14.setForeground(new java.awt.Color(225, 135, 44));
        jRadioButton14.setText("Brownies");

        btn30PcsBrownies.setBackground(new java.awt.Color(255, 255, 153));
        btn30PcsBrownies.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn30PcsBrownies.setForeground(new java.awt.Color(225, 135, 44));
        btn30PcsBrownies.setText("30 PCS");

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton14)
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn12PcsBrownies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn6PcsBrownies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn30PcsBrownies)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel67Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6PcsBrownies)
                    .addComponent(btn30PcsBrownies))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn12PcsBrownies)
                .addGap(10, 10, 10))
        );

        jPanel72.setBackground(new java.awt.Color(255, 204, 102));

        jPanel73.setBackground(new java.awt.Color(255, 255, 153));

        jLabel89.setBackground(new java.awt.Color(225, 135, 44));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cinnamon.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel74.setBackground(new java.awt.Color(255, 204, 102));

        btnMinusClassicCinnamon.setBackground(new java.awt.Color(255, 204, 102));
        btnMinusClassicCinnamon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMinusClassicCinnamon.setForeground(new java.awt.Color(225, 135, 44));
        btnMinusClassicCinnamon.setText("-");
        btnMinusClassicCinnamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusClassicCinnamonActionPerformed(evt);
            }
        });

        lbzeroClassicCinnamon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbzeroClassicCinnamon.setForeground(new java.awt.Color(225, 135, 44));
        lbzeroClassicCinnamon.setText("0");

        btnPlusClassicCinnamon.setBackground(new java.awt.Color(255, 204, 102));
        btnPlusClassicCinnamon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlusClassicCinnamon.setForeground(new java.awt.Color(225, 135, 44));
        btnPlusClassicCinnamon.setText("+");
        btnPlusClassicCinnamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusClassicCinnamonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMinusClassicCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lbzeroClassicCinnamon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlusClassicCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinusClassicCinnamon)
                    .addComponent(lbzeroClassicCinnamon)
                    .addComponent(btnPlusClassicCinnamon))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel75.setBackground(new java.awt.Color(255, 255, 153));

        lbPhpClassicCinnamon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPhpClassicCinnamon.setForeground(new java.awt.Color(225, 135, 44));
        lbPhpClassicCinnamon.setText("Php: 0.00");

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel75Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPhpClassicCinnamon)
                .addContainerGap())
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel75Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPhpClassicCinnamon)
                .addContainerGap())
        );

        btnBoxof4ClassicCinnamon.setBackground(new java.awt.Color(255, 255, 153));
        btnBoxof4ClassicCinnamon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBoxof4ClassicCinnamon.setForeground(new java.awt.Color(225, 135, 44));
        btnBoxof4ClassicCinnamon.setText("Box of 4");

        btnBoxof6ClassicCinnamon.setBackground(new java.awt.Color(255, 255, 153));
        btnBoxof6ClassicCinnamon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBoxof6ClassicCinnamon.setForeground(new java.awt.Color(225, 135, 44));
        btnBoxof6ClassicCinnamon.setText("Box of 6");

        jRadioButton15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton15.setForeground(new java.awt.Color(225, 135, 44));
        jRadioButton15.setText("Classic Cinnamon Roll");

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton15)
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addComponent(btnBoxof4ClassicCinnamon, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoxof6ClassicCinnamon)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel72Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBoxof6ClassicCinnamon)
                    .addComponent(btnBoxof4ClassicCinnamon))
                .addGap(27, 27, 27))
        );

        jPanel76.setBackground(new java.awt.Color(255, 204, 102));

        jPanel77.setBackground(new java.awt.Color(255, 255, 153));

        jLabel92.setBackground(new java.awt.Color(225, 135, 44));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Milky donut.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel78.setBackground(new java.awt.Color(255, 204, 102));

        btnMinusMilkyDonut.setBackground(new java.awt.Color(255, 204, 102));
        btnMinusMilkyDonut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMinusMilkyDonut.setForeground(new java.awt.Color(225, 135, 44));
        btnMinusMilkyDonut.setText("-");
        btnMinusMilkyDonut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusMilkyDonutActionPerformed(evt);
            }
        });

        lbzeroMilkyDonut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbzeroMilkyDonut.setForeground(new java.awt.Color(225, 135, 44));
        lbzeroMilkyDonut.setText("0");

        btnPlusMilkyDonut.setBackground(new java.awt.Color(255, 204, 102));
        btnPlusMilkyDonut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlusMilkyDonut.setForeground(new java.awt.Color(225, 135, 44));
        btnPlusMilkyDonut.setText("+");
        btnPlusMilkyDonut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMilkyDonutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMinusMilkyDonut, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lbzeroMilkyDonut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlusMilkyDonut, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinusMilkyDonut)
                    .addComponent(lbzeroMilkyDonut)
                    .addComponent(btnPlusMilkyDonut))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel79.setBackground(new java.awt.Color(255, 255, 153));

        lbPhpMilkyDonut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPhpMilkyDonut.setForeground(new java.awt.Color(225, 135, 44));
        lbPhpMilkyDonut.setText("Php: 0.00");

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel79Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPhpMilkyDonut)
                .addContainerGap())
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel79Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPhpMilkyDonut)
                .addContainerGap())
        );

        btn5PcsMilkyDonut.setBackground(new java.awt.Color(255, 255, 153));
        btn5PcsMilkyDonut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn5PcsMilkyDonut.setForeground(new java.awt.Color(225, 135, 44));
        btn5PcsMilkyDonut.setText("5 PCS");

        btn10PcsMilkyDonut.setBackground(new java.awt.Color(255, 255, 153));
        btn10PcsMilkyDonut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn10PcsMilkyDonut.setForeground(new java.awt.Color(225, 135, 44));
        btn10PcsMilkyDonut.setText("10 PCS");

        jRadioButton16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton16.setForeground(new java.awt.Color(225, 135, 44));
        jRadioButton16.setText("Milky Cheese Donut");

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton16)
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addComponent(btn5PcsMilkyDonut, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn10PcsMilkyDonut)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn10PcsMilkyDonut)
                    .addComponent(btn5PcsMilkyDonut))
                .addGap(27, 27, 27))
        );

        jPanel80.setBackground(new java.awt.Color(255, 204, 102));

        jPanel81.setBackground(new java.awt.Color(255, 255, 153));

        jLabel95.setBackground(new java.awt.Color(225, 135, 44));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Banana Muffin.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel82.setBackground(new java.awt.Color(255, 204, 102));

        btnMinuMuffin.setBackground(new java.awt.Color(255, 204, 102));
        btnMinuMuffin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMinuMuffin.setForeground(new java.awt.Color(225, 135, 44));
        btnMinuMuffin.setText("-");
        btnMinuMuffin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinuMuffinActionPerformed(evt);
            }
        });

        lbzeroMuffin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbzeroMuffin.setForeground(new java.awt.Color(225, 135, 44));
        lbzeroMuffin.setText("0");

        btnPlusMuffin.setBackground(new java.awt.Color(255, 204, 102));
        btnPlusMuffin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlusMuffin.setForeground(new java.awt.Color(225, 135, 44));
        btnPlusMuffin.setText("+");
        btnPlusMuffin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMuffinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMinuMuffin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lbzeroMuffin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlusMuffin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinuMuffin)
                    .addComponent(lbzeroMuffin)
                    .addComponent(btnPlusMuffin))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel83.setBackground(new java.awt.Color(255, 255, 153));

        lbPhpMuffin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPhpMuffin.setForeground(new java.awt.Color(225, 135, 44));
        lbPhpMuffin.setText("Php: 0.00");

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel83Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPhpMuffin)
                .addContainerGap())
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel83Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPhpMuffin)
                .addContainerGap())
        );

        jRadioButton17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton17.setForeground(new java.awt.Color(225, 135, 44));
        jRadioButton17.setText("Banana Muffin");

        btn6PcsBananaMuffin.setBackground(new java.awt.Color(255, 255, 153));
        btn6PcsBananaMuffin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn6PcsBananaMuffin.setForeground(new java.awt.Color(225, 135, 44));
        btn6PcsBananaMuffin.setText("6 PCS");

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton17)
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn6PcsBananaMuffin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn6PcsBananaMuffin)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout breadsandsweetsPanelLayout = new javax.swing.GroupLayout(breadsandsweetsPanel);
        breadsandsweetsPanel.setLayout(breadsandsweetsPanelLayout);
        breadsandsweetsPanelLayout.setHorizontalGroup(
            breadsandsweetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, breadsandsweetsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(breadsandsweetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(breadsandsweetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(breadsandsweetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(215, 215, 215))
        );
        breadsandsweetsPanelLayout.setVerticalGroup(
            breadsandsweetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breadsandsweetsPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(breadsandsweetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(breadsandsweetsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(678, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(breadsandsweetsPanel);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("breads", jPanel11);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 20, 930, 730));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void updateMangoPrice() {
    int total = (mangoBasePrice) * mangoQty;
    mangoPrice.setText("Php: " + total + ".00");
}
    private void updateRedVelvetPrice(){
       int total = (redVelvetBasePrice) * redVelvetQty;
       redVelvetCakePrice.setText("Php: " + total + ".00"); 
    }
    
    private void updateStrawberryShortPrice(){
       int total = (strawberryShortcakeBasePrice) * strawberryShortcakeQty ;
       strawberryShortCakePrice.setText("Php: " + total + ".00"); 
    }
    
    private void updateBentoCakePrice(){
        int total = (bentoCakeBasePrice) * bentoCakeQty;
        bentoCakePrice.setText("Php: " + total + ".00");
        
    }
    private void updateCheeseCakePrice(){
        int total = (cheesecakeBasePrice) * cheesecakeQuantity;
        cheeseCakePrice.setText("Php: " + total + ".00");
    }
    private void updateCaramelLechePrice(){
        int total = (caramelFlanBasePrice) * caramelFlanQty;
        caramelFlanDeLecheCakePrice.setText("Php: " + total + ".00");
    }
    private void updateMangoBravoTubPrice(){
        mangoBravoTubBasePrice = 170;
        int total = (mangoBravoTubBasePrice) * mangoBravoTubQty;
        mangoBravoTubPrice.setText("Php: " + total + ".00");
        
    }
    private void updateSliceCheesecakePrice(){
        slicecheesecakeBasePrice = 175;
        int total = (slicecheesecakeBasePrice) * slicecheesecakeQty;
        sliceCheesecakePrice.setText("Php: " + total + ".00");
        
    }
    private void updateMiniCupcakesPrice(){
        int total = (miniCupcakesBasePrice) * miniCupcakesQty;
        miniCupcakesPrice.setText("Php: " + total + ".00");
    }
    private void updatePiscesCupcakesPrice(){
        int total = piscesCupcakesBasePrice * piscesCupcakesQty;
        piscesCupcakesPrice.setText("Php: " + total + ".00");
    }
    private void updateYemaCakePrice(){
        
        int total = (yemaCakeBasePrice) * yemaCakeQty;
        lbPhpYemaCake.setText("Php: " + total + ".00");
        
    }
    private void updateCheesePandesalPrice(){
         int total = (ubePandesalBasePrice) * ubePandesalQty;
         lbPhpUbePandesal.setText("Php: " + total + ".00");
    }
    private void updateBananaLoafPrice(){
        int total  = (bananaLoafBasePrice)* bananaLoafQty;
        lbPhpBananaLoaf.setText("Php: " + total + ".00");
    }
    private void updateBrowniesPrice(){
        int total = (browniesBasePrice) * browniesQty;
        lbPhpBrownies.setText("Php: " + total + ".00");
    }
    private void updateCinnamonPrice(){
        int total = (classicCinnamonQty) * classicCinnamonBasePrice;
        lbPhpClassicCinnamon.setText("Php: " + total + ".00");
        
    }
    private void updateMilkyCheeseDonutPrice(){
        int total = (milkyCheeseDonutQty) * milkyCheeseDonutBasePrice;
        lbPhpMilkyDonut.setText("Php: " + total + ".00");
    }
    private void updateBananaMuffinPrice(){
        int total = (bananaMuffinQty) * bananaMuffinBasePrice;
        lbPhpMuffin.setText("Php: " + total + ".00");
    }
    
    
    
    
    
    private void btnCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCakeActionPerformed
      jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnCakeActionPerformed

    private void btnBreadSweets1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBreadSweets1ActionPerformed
      jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnBreadSweets1ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
       if(txtSearch.getText().equals("Search"))
       {
           txtSearch.setText("");
           txtSearch.setForeground(new Color(153,153,153));
       }            
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
         if(txtSearch.getText().equals(""))
       {
           txtSearch.setText("Search");
           txtSearch.setForeground(new Color(153,153,153));
       }       
    }//GEN-LAST:event_txtSearchFocusLost

    private void minusButtonMangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonMangoActionPerformed
       if (mangoQty > 0) {
        mangoQty--;
    }
    mangoBravoQuantity.setText(String.valueOf(mangoQty));
    updateMangoPrice();
    updateMangoBravoBill();
    
    if (mangoQty == 0) {
        mangoRadioButton.setSelected(false);
        removeMangoBravoFromBill(); // This method should clear the bill panel for Mango Bravo
    }
    }//GEN-LAST:event_minusButtonMangoActionPerformed

    private void redVelvetMinusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redVelvetMinusButtonActionPerformed
        if(redVelvetQty>0){
           redVelvetQty--;
           redvelvetlabel.setText(String.valueOf(redVelvetQty));
           updateRedVelvetPrice();
           updateRedVelvetBill();
    
    if (redVelvetQty == 0) {
        redVelvetRadioButton.setSelected(false);
        removeRedVelvetFromBill(); // This method should clear the bill panel for Mango Bravo
    }
       }
    }//GEN-LAST:event_redVelvetMinusButtonActionPerformed

    private void strawberryshortminusbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strawberryshortminusbuttonActionPerformed
        if(strawberryShortcakeQty>0){
           strawberryShortcakeQty--;
           strawberyshortcakelbl.setText(String.valueOf(strawberryShortcakeQty));
           updateStrawberryShortPrice();
       }
    }//GEN-LAST:event_strawberryshortminusbuttonActionPerformed

    private void bentoCakeminusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bentoCakeminusButtonActionPerformed
        if(bentoCakeQty>0){
           bentoCakeQty--;
           bentocakelbl.setText(String.valueOf(bentoCakeQty));
           updateBentoCakePrice();
       }
    }//GEN-LAST:event_bentoCakeminusButtonActionPerformed

    private void btnMinusCaramelFlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusCaramelFlanActionPerformed
        if(caramelFlanQty>0){
           caramelFlanQty--;
           lbqtycaramelflan.setText(String.valueOf(caramelFlanQty));
           updateCaramelLechePrice();
       }
    }//GEN-LAST:event_btnMinusCaramelFlanActionPerformed

    private void btnMinusCheesecakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusCheesecakeActionPerformed
        if(cheesecakeQuantity>0){
           cheesecakeQuantity--;
           lblquantitycheesecake.setText(String.valueOf(cheesecakeQuantity));
           updateCheeseCakePrice();
       }
    }//GEN-LAST:event_btnMinusCheesecakeActionPerformed

    private void btnMinusSliceCheesecakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusSliceCheesecakeActionPerformed
        if(slicecheesecakeQty>0){
           slicecheesecakeQty--;
           slicecheesecakelblqty.setText(String.valueOf(slicecheesecakeQty));
           updateSliceCheesecakePrice();
       }
    }//GEN-LAST:event_btnMinusSliceCheesecakeActionPerformed

    private void btnMinusMangoBravoTubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusMangoBravoTubActionPerformed
        if(mangoBravoTubQty>0){
           mangoBravoTubQty--;
           mangobravotublblqty.setText(String.valueOf(mangoBravoTubQty));
           updateMangoBravoTubPrice();
       }
    }//GEN-LAST:event_btnMinusMangoBravoTubActionPerformed

    private void btnMinusMiniCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusMiniCupcakeActionPerformed
        if(miniCupcakesQty>0){
           miniCupcakesQty--;
           lbQtyMiniCupcake.setText(String.valueOf(miniCupcakesQty));
           updateMiniCupcakesPrice();
       }
    }//GEN-LAST:event_btnMinusMiniCupcakeActionPerformed

    private void btnMinusPiscesCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusPiscesCupcakeActionPerformed
        if(piscesCupcakesQty>0){
           piscesCupcakesQty--;
           lbzeroqty.setText(String.valueOf(piscesCupcakesQty));
           updatePiscesCupcakesPrice();
       }
    }//GEN-LAST:event_btnMinusPiscesCupcakeActionPerformed

    private void btnMinusUbePandesalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusUbePandesalActionPerformed
       if(ubePandesalQty>0){
           ubePandesalQty--;
           lbzeroUbePandesal.setText(String.valueOf(ubePandesalQty));
           updateCheesePandesalPrice();
       }
    }//GEN-LAST:event_btnMinusUbePandesalActionPerformed

    private void btnMinusBananaLoafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusBananaLoafActionPerformed
        if(bananaLoafQty>0){
            bananaLoafQty--;
            lbzeroBananaLoaf.setText(String.valueOf(bananaLoafQty));
            updateBananaLoafPrice();
        }
    }//GEN-LAST:event_btnMinusBananaLoafActionPerformed

    private void btnMinusBrowniesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusBrowniesActionPerformed
       if(browniesQty>0){
           browniesQty--;
           lbzeroBrownies.setText(String.valueOf(browniesQty));
           updateBrowniesPrice();
       }
    }//GEN-LAST:event_btnMinusBrowniesActionPerformed

    private void btnMinusClassicCinnamonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusClassicCinnamonActionPerformed
        if(classicCinnamonQty>0){
            classicCinnamonQty--;
            lbzeroClassicCinnamon.setText(String.valueOf(classicCinnamonQty));
            updateCinnamonPrice();
        }
    }//GEN-LAST:event_btnMinusClassicCinnamonActionPerformed

    private void btnMinusMilkyDonutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusMilkyDonutActionPerformed
       if(milkyCheeseDonutQty>0){
           milkyCheeseDonutQty--;
           lbzeroMilkyDonut.setText(String.valueOf(milkyCheeseDonutQty));
           updateMilkyCheeseDonutPrice();
           
       }
    }//GEN-LAST:event_btnMinusMilkyDonutActionPerformed

    private void btnMinuMuffinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinuMuffinActionPerformed
        if(bananaMuffinQty>0){
            bananaMuffinQty--;
            lbzeroMuffin.setText(String.valueOf(bananaMuffinQty));
            updateBananaMuffinPrice();
        }
    }//GEN-LAST:event_btnMinuMuffinActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
 
//       setVisible(false);
//       MainFrameDashBoard main = new MainFrameDashBoard();
//       main.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonMangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonMangoActionPerformed
    mangoQty++;
    mangoBravoQuantity.setText(String.valueOf(mangoQty));
    updateMangoPrice();
    updateMangoBravoBill();
    
    }//GEN-LAST:event_addButtonMangoActionPerformed

    private void btnMinusYemaCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusYemaCakeActionPerformed
        if(yemaCakeQty>0){
           yemaCakeQty--;
           yemaCakeLabelQty.setText(String.valueOf(yemaCakeQty));
          updateYemaCakePrice();
       }
    }//GEN-LAST:event_btnMinusYemaCakeActionPerformed

    private void RedVelvetPlusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedVelvetPlusButtonActionPerformed
       redVelvetQty ++;
       redvelvetlabel.setText(String.valueOf(redVelvetQty));
       updateRedVelvetPrice();
       updateRedVelvetBill();
    }//GEN-LAST:event_RedVelvetPlusButtonActionPerformed

    private void strawberryshortplusbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strawberryshortplusbuttonActionPerformed
       strawberryShortcakeQty++;
       strawberyshortcakelbl.setText(String.valueOf(strawberryShortcakeQty));
    }//GEN-LAST:event_strawberryshortplusbuttonActionPerformed

    private void bentoCakePlusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bentoCakePlusButtonActionPerformed
       bentoCakeQty++;
       bentocakelbl.setText(String.valueOf(bentoCakeQty));
    }//GEN-LAST:event_bentoCakePlusButtonActionPerformed

    private void btnPlusCheesecakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusCheesecakeActionPerformed
       cheesecakeQuantity++;
       lblquantitycheesecake.setText(String.valueOf(cheesecakeQuantity));
    }//GEN-LAST:event_btnPlusCheesecakeActionPerformed

    private void btn8CheesecakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8CheesecakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn8CheesecakeActionPerformed

    private void btn6x2CaramelFlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6x2CaramelFlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn6x2CaramelFlanActionPerformed

    private void btnPlusCaramelFlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusCaramelFlanActionPerformed
        caramelFlanQty++;
        lbqtycaramelflan.setText(String.valueOf( caramelFlanQty));
    }//GEN-LAST:event_btnPlusCaramelFlanActionPerformed

    private void btnPlusMangoBravoTubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMangoBravoTubActionPerformed
        mangoBravoTubQty++;
        mangobravotublblqty.setText(String.valueOf(mangoBravoTubQty));
        updateMangoBravoTubPrice();
    }//GEN-LAST:event_btnPlusMangoBravoTubActionPerformed

    private void btnPlusSliceCheesecakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusSliceCheesecakeActionPerformed
        slicecheesecakeQty++;
        slicecheesecakelblqty.setText(String.valueOf(slicecheesecakeQty));
        updateSliceCheesecakePrice();
    }//GEN-LAST:event_btnPlusSliceCheesecakeActionPerformed

    private void btnPlusMiniCupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMiniCupcakeActionPerformed
        miniCupcakesQty++;
        lbQtyMiniCupcake.setText(String.valueOf(miniCupcakesQty));
        updateMiniCupcakesPrice();
    }//GEN-LAST:event_btnPlusMiniCupcakeActionPerformed

    private void btnPlusPiscescupcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusPiscescupcakeActionPerformed
        piscesCupcakesQty++;
        lbzeroqty.setText(String.valueOf(piscesCupcakesQty));
        updatePiscesCupcakesPrice();
    }//GEN-LAST:event_btnPlusPiscescupcakeActionPerformed

    private void btnPlusYemaCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusYemaCakeActionPerformed
        yemaCakeQty++;
        yemaCakeLabelQty.setText(String.valueOf(yemaCakeQty));
        updateYemaCakePrice();
    }//GEN-LAST:event_btnPlusYemaCakeActionPerformed

    private void btnPlusClassicCinnamonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusClassicCinnamonActionPerformed
        classicCinnamonQty++;
        lbzeroClassicCinnamon.setText(String.valueOf(classicCinnamonQty));
        updateCinnamonPrice();
    }//GEN-LAST:event_btnPlusClassicCinnamonActionPerformed

    private void btnPlusUbePandesalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusUbePandesalActionPerformed
        ubePandesalQty++;
        lbzeroUbePandesal.setText(String.valueOf(ubePandesalQty));
        updateCheesePandesalPrice();
    }//GEN-LAST:event_btnPlusUbePandesalActionPerformed

    private void btnPlusBananaLoafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusBananaLoafActionPerformed
        bananaLoafQty++;
        lbzeroBananaLoaf.setText(String.valueOf(bananaLoafQty));
        updateBananaLoafPrice();
    }//GEN-LAST:event_btnPlusBananaLoafActionPerformed

    private void btnPlusBrowniesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusBrowniesActionPerformed
        browniesQty++;
        lbzeroBrownies.setText(String.valueOf(browniesQty));
        updateBrowniesPrice();
    }//GEN-LAST:event_btnPlusBrowniesActionPerformed

    private void btnPlusMilkyDonutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMilkyDonutActionPerformed
        milkyCheeseDonutQty++;
        lbzeroMilkyDonut.setText(String.valueOf(milkyCheeseDonutQty));
        updateMilkyCheeseDonutPrice();
    }//GEN-LAST:event_btnPlusMilkyDonutActionPerformed

    private void btnPlusMuffinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMuffinActionPerformed
       bananaMuffinQty++;
       lbzeroMuffin.setText(String.valueOf(bananaMuffinQty));
       updateBananaMuffinPrice();
    }//GEN-LAST:event_btnPlusMuffinActionPerformed

    private void btn4x2YemacakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4x2YemacakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4x2YemacakeActionPerformed

    private void btnCustomeCakeIcingCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomeCakeIcingCakeActionPerformed
        Icingcustomcake icc = new Icingcustomcake();
        icc.setVisible(true);

    }//GEN-LAST:event_btnCustomeCakeIcingCakeActionPerformed

    private void btnMinimalistCakeCustomCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimalistCakeCustomCakeActionPerformed
        MinimalistCustomCake show = new MinimalistCustomCake();
        show.setVisible(true);
    }//GEN-LAST:event_btnMinimalistCakeCustomCakeActionPerformed

    private void customCakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customCakeButtonActionPerformed
        String declaredValue = JOptionPane.showInputDialog(null, "Please input Declared Value", "Declared Value", JOptionPane.INFORMATION_MESSAGE);
        int convert = Integer.parseInt(declaredValue);
        
    }//GEN-LAST:event_customCakeButtonActionPerformed
    




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
            java.util.logging.Logger.getLogger(BeaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BeaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BeaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BeaPOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BeaPOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BillLabel;
    private javax.swing.JPanel BillPanel;
    private javax.swing.JPanel Jpanel;
    private javax.swing.JButton RedVelvetPlusButton;
    private javax.swing.JButton addButtonMango;
    private javax.swing.JButton backButton;
    private javax.swing.JButton bentoCakePlusButton;
    private javax.swing.JLabel bentoCakePrice;
    private javax.swing.JRadioButton bentoCakeRadioButton;
    private javax.swing.JToggleButton bentoCakeSizebutton;
    private javax.swing.JButton bentoCakeminusButton;
    private javax.swing.JLabel bentocakelbl;
    private javax.swing.JPanel breadsandsweetsPanel;
    private javax.swing.JToggleButton btn10PcsMilkyDonut;
    private javax.swing.JToggleButton btn12PcsBrownies;
    private javax.swing.JToggleButton btn12PcsMiniCupcake;
    private javax.swing.JToggleButton btn12PcsPisces;
    private javax.swing.JToggleButton btn1pcPisces;
    private javax.swing.JToggleButton btn30PcsBrownies;
    private javax.swing.JToggleButton btn3PcsPisces;
    private javax.swing.JToggleButton btn4PcsPisces;
    private javax.swing.JToggleButton btn4x2CaramelFlan;
    private javax.swing.JToggleButton btn4x2Yemacake;
    private javax.swing.JToggleButton btn5PcsMilkyDonut;
    private javax.swing.JToggleButton btn5x2CaramelFlan;
    private javax.swing.JToggleButton btn5x2Yemacake;
    private javax.swing.JToggleButton btn6PcsBananaMuffin;
    private javax.swing.JToggleButton btn6PcsBrownies;
    private javax.swing.JToggleButton btn6PcsMiniCupcake;
    private javax.swing.JToggleButton btn6PcsPisces;
    private javax.swing.JToggleButton btn6x2CaramelFlan;
    private javax.swing.JToggleButton btn6x2Yemacake;
    private javax.swing.JToggleButton btn8Cheesecake;
    private javax.swing.JToggleButton btnBoxof4ClassicCinnamon;
    private javax.swing.JToggleButton btnBoxof6ClassicCinnamon;
    private javax.swing.JButton btnBreadSweets1;
    private javax.swing.JButton btnCake;
    private javax.swing.JToggleButton btnCustomeCakeIcingCake;
    private javax.swing.JToggleButton btnMinimalistCakeCustomCake;
    private javax.swing.JButton btnMinuMuffin;
    private javax.swing.JButton btnMinusBananaLoaf;
    private javax.swing.JButton btnMinusBrownies;
    private javax.swing.JButton btnMinusCaramelFlan;
    private javax.swing.JButton btnMinusCheesecake;
    private javax.swing.JButton btnMinusClassicCinnamon;
    private javax.swing.JButton btnMinusMangoBravoTub;
    private javax.swing.JButton btnMinusMilkyDonut;
    private javax.swing.JButton btnMinusMiniCupcake;
    private javax.swing.JButton btnMinusPiscesCupcake;
    private javax.swing.JButton btnMinusSliceCheesecake;
    private javax.swing.JButton btnMinusUbePandesal;
    private javax.swing.JButton btnMinusYemaCake;
    private javax.swing.JToggleButton btnMoistBananaChocoChipAlmondLoaf;
    private javax.swing.JToggleButton btnMoistBananaChocoChipLoaf;
    private javax.swing.JButton btnPlusBananaLoaf;
    private javax.swing.JButton btnPlusBrownies;
    private javax.swing.JButton btnPlusCaramelFlan;
    private javax.swing.JButton btnPlusCheesecake;
    private javax.swing.JButton btnPlusClassicCinnamon;
    private javax.swing.JButton btnPlusMangoBravoTub;
    private javax.swing.JButton btnPlusMilkyDonut;
    private javax.swing.JButton btnPlusMiniCupcake;
    private javax.swing.JButton btnPlusMuffin;
    private javax.swing.JButton btnPlusPiscescupcake;
    private javax.swing.JButton btnPlusSliceCheesecake;
    private javax.swing.JButton btnPlusUbePandesal;
    private javax.swing.JButton btnPlusYemaCake;
    private javax.swing.JToggleButton btnUbeCheesedesal;
    private javax.swing.JToggleButton btnUbeHalayaCheesedesal;
    private javax.swing.JPanel cakesPanel;
    private javax.swing.JLabel caramelFlanDeLecheCakePrice;
    private javax.swing.JLabel cheeseCakePrice;
    private javax.swing.JButton customCakeButton;
    private javax.swing.JLabel dashLineLabel2;
    private javax.swing.JLabel dashLineLabel3;
    private javax.swing.JLabel dashLinelabel1;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton23;
    private javax.swing.JToggleButton jToggleButton24;
    private javax.swing.JToggleButton jToggleButton25;
    private javax.swing.JToggleButton jToggleButton26;
    private javax.swing.JToggleButton jToggleButton28;
    private javax.swing.JToggleButton jToggleButton29;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton30;
    private javax.swing.JToggleButton jToggleButton31;
    private javax.swing.JLabel lbPhpBananaLoaf;
    private javax.swing.JLabel lbPhpBrownies;
    private javax.swing.JLabel lbPhpClassicCinnamon;
    private javax.swing.JLabel lbPhpMilkyDonut;
    private javax.swing.JLabel lbPhpMuffin;
    private javax.swing.JLabel lbPhpUbePandesal;
    private javax.swing.JLabel lbPhpYemaCake;
    private javax.swing.JLabel lbQtyMiniCupcake;
    private javax.swing.JLabel lblquantitycheesecake;
    private javax.swing.JLabel lbqtycaramelflan;
    private javax.swing.JLabel lbzeroBananaLoaf;
    private javax.swing.JLabel lbzeroBrownies;
    private javax.swing.JLabel lbzeroClassicCinnamon;
    private javax.swing.JLabel lbzeroMilkyDonut;
    private javax.swing.JLabel lbzeroMuffin;
    private javax.swing.JLabel lbzeroUbePandesal;
    private javax.swing.JLabel lbzeroqty;
    private javax.swing.JToggleButton mangoBravo4x2button;
    private javax.swing.JToggleButton mangoBravo5x2button;
    private javax.swing.JToggleButton mangoBravo6x2button;
    private javax.swing.JLabel mangoBravoQuantity;
    private javax.swing.JLabel mangoBravoTubPrice;
    private javax.swing.JLabel mangoPrice;
    private javax.swing.JRadioButton mangoRadioButton;
    private javax.swing.JToggleButton mangoToppings;
    private javax.swing.JLabel mangobravotublblqty;
    private javax.swing.JLabel miniCupcakesPrice;
    private javax.swing.JButton minusButtonMango;
    private javax.swing.JLabel piscesCupcakesPrice;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JLabel productStaticLabel;
    private javax.swing.JPanel productsPanel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JToggleButton redVelvet5x2sizeButton;
    private javax.swing.JToggleButton redVelvet6x2sizebutton;
    private javax.swing.JLabel redVelvetCakePrice;
    private javax.swing.JButton redVelvetMinusButton;
    private javax.swing.JRadioButton redVelvetRadioButton;
    private javax.swing.JLabel redvelvetlabel;
    private javax.swing.JLabel sizeorVariationLabel;
    private javax.swing.JLabel sizeorvariationstaticLabel;
    private javax.swing.JLabel sliceCheesecakePrice;
    private javax.swing.JLabel slicecheesecakelblqty;
    private javax.swing.JLabel strawberryShortCakePrice;
    private javax.swing.JToggleButton strawberryshortcake4x3sizebtn;
    private javax.swing.JToggleButton strawberryshortcake5x3sizebtn;
    private javax.swing.JToggleButton strawberryshortcake6x3sizebtn;
    private javax.swing.JToggleButton strawberryshortcake8x3sizebtn;
    private javax.swing.JRadioButton strawberryshortcakeradioButton;
    private javax.swing.JButton strawberryshortminusbutton;
    private javax.swing.JButton strawberryshortplusbutton;
    private javax.swing.JLabel strawberyshortcakelbl;
    private javax.swing.JLabel subTotalamountlabel;
    private javax.swing.JLabel subtotalstaticlabel;
    private javax.swing.JLabel totalAmountLabel;
    private javax.swing.JLabel totalstaticlabel;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel yemaCakeLabelQty;
    // End of variables declaration//GEN-END:variables
}
