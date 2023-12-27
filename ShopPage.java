/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java;

//import javax.swing.table.DefaultTableModel;

import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;


/**
 *
 * @author phatn
 */
public class ShopPage extends javax.swing.JFrame {

    /**
     * Creates new form ShopPage
     */
    public ShopPage() {
        initComponents();
        addTableHeader();
    }
    
    Address[] addr = new Address[50];
    Account[] acc = new Account[20];    
    DateTime[] dt = new DateTime[50];
    
    int accCount = 0;
    int addrCount = 0;
    int dtCount = 0;
 
    
    public void GetLogin(int i){
        // BIRTHDAY
        int j = SearchDateArr("bd_"+acc[i].getUserName());
        try{
            LocalDate current = LocalDate.now();
            String birthStr = dt[j].getDate()+"-"+dt[j].getMonth()+"-"+dt[j].getYear();
            LocalDate birth = LocalDate.parse(birthStr, DateTimeFormatter.ofPattern("d-MMM-yyyy"));
            int age = Period.between(birth, current).getYears();
            
            // ASSIGN
            birthInfo.setText(birthStr);
            ageInfo.setText(String.valueOf(age));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index of array is "+j+". Some info is missing");
        }
        // BIRTHDAY*
        
        // WORKDATE
        int k = SearchDateArr("wd_"+acc[i].getUserName());
        try{
            String workStr = dt[k].getDate()+"-"+dt[k].getMonth()+"-"+dt[k].getYear();
            
            // ASSIGN
            workInfo.setText(workStr);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index of array is "+j+". Some info is missing");
        }
        
        // WORKDATE*
        
        // ADDRESS
        int g = SearchAddrArr("addr_"+acc[i].getUserName());
        try{
            String addrStr = addr[g].getCity()+", "+
                    addr[g].getDistrict()+", "+
                    addr[g].getCommune()+", "+
                    addr[g].getVillage()+", "+
                    addr[g].getRoad()+", "+
                    addr[g].getApartmentNumber();
            
            // ASSIGN
            addressInfo.setText(addrStr);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index of array is "+j+". Some info is missing");
        }
        // ADDRESS*
        
        // ASSIGN
        userNameInfo.setText(acc[i].getUserName());
        nameInfo.setText(acc[i].getName());
        roleInfo.setText(acc[i].getRole());
        
        
        phoneInfo.setText(acc[i].getPhone());
        emailInfo.setText(acc[i].getEmail());
        // ASSIGN*
                
    }
    
    
    public int SearchDateArr(String str){
        int check = 0;
        int i = 0;
        while(i < dt.length){
            if(dt[i] == null){
                break;
            }
            if(dt[i].getDateTimeID().equals(str)) {
                check = 1;
                break;
            }
            i++;
        }
        if (check == 1) return i; else return -1;
    }
    
    public int SearchAddrArr(String str){
        int check = 0;
        int i = 0;
        while(i < addr.length){
            if(addr[i] == null){
                break;
            }
            if(addr[i].getAddressID().equals(str)) {
                check = 1;
                break;
            }
            i++;
        }
        if (check == 1) return i; else return -1;
    }
    
    public void GetUserInfo(String[] accArr, String[] addrArr, String[] bdArr, String[] wdArr){
        acc[accCount] = new Account(accArr[0], accArr[1], accArr[2], accArr[3], accArr[4], accArr[5]);
        accCount++;
        
        addr[addrCount] = new Address(addrArr[0], addrArr[1], addrArr[2], addrArr[3], addrArr[4], addrArr[5], addrArr[6]);
        addrCount++;
        
        dt[dtCount] = new DateTime(bdArr[0], bdArr[1], bdArr[2], bdArr[3]);
        dtCount++;
        
        dt[dtCount] = new DateTime(wdArr[0], wdArr[1], wdArr[2], wdArr[3]);
        dtCount++;
        
    }
    
    
    
    
    
//    public void AddtoTable(String[] arr){
//        DefaultTableModel dTM= (DefaultTableModel)productTable.getModel();
//        dTM.addRow(arr);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        itemName = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        itemType = new javax.swing.JComboBox<>();
        itemPrice = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemDiscript = new javax.swing.JTextArea();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        itemAmount = new javax.swing.JTextField();
        itemAddBt = new javax.swing.JButton();
        deleteBt = new javax.swing.JButton();
        changeBt = new javax.swing.JButton();
        browseBt = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        newType = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        openCart = new javax.swing.JButton();
        field = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameInfo = new javax.swing.JLabel();
        roleInfo = new javax.swing.JLabel();
        userNameInfo = new javax.swing.JLabel();
        phoneInfo = new javax.swing.JLabel();
        emailInfo = new javax.swing.JLabel();
        workInfo = new javax.swing.JLabel();
        birthInfo = new javax.swing.JLabel();
        ageInfo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        addressInfo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        regPassword = new javax.swing.JPasswordField();
        regUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        regName = new javax.swing.JTextField();
        submitBt = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        regCity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        regPhone = new javax.swing.JTextField();
        regWorkDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        regWorkYear = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        regBirthDate = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        regBirthYear = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        regDistrict = new javax.swing.JTextField();
        regCommune = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        regVillage = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        regRoad = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        regApartmentNumber = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        regZIP = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        regWorkMonth = new javax.swing.JComboBox<>();
        regBirthMonth = new javax.swing.JComboBox<>();
        regEmail = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        regRole = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        loginBt = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        loginUserName = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        loginPassword = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("PRODUCT DETAIL");

        itemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNameActionPerformed(evt);
            }
        });

        jLabel37.setText("Name");

        jLabel38.setText("Type");

        jLabel39.setText("Price");

        jLabel40.setText("Discription");

        itemDiscript.setColumns(20);
        itemDiscript.setRows(5);
        jScrollPane2.setViewportView(itemDiscript);

        jLabel41.setText("Image");

        jLabel42.setText("Amount");

        itemAddBt.setText("ADD");
        itemAddBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddBtActionPerformed(evt);
            }
        });

        deleteBt.setText("DELETE");
        deleteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtActionPerformed(evt);
            }
        });

        changeBt.setText("CHANGE");

        browseBt.setText("Browse");
        browseBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setText("MAKE A NEW TYPE");

        newType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTypeActionPerformed(evt);
            }
        });

        jButton1.setText("MAKE TYPE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(changeBt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteBt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(itemAddBt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(browseBt)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(newType, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(33, 33, 33)
                                .addComponent(jButton1))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel42))
                                .addGap(86, 86, 86)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(itemName)
                                        .addComponent(itemType, 0, 145, Short.MAX_VALUE)
                                        .addComponent(itemPrice)
                                        .addComponent(itemAmount)))))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(itemType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(itemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(itemAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(browseBt))
                .addGap(17, 17, 17)
                .addComponent(itemAddBt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(deleteBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeBt))
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        itemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(itemTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PRODUCT", jPanel5);

        openCart.setText("Open Cart");
        openCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openCartActionPerformed(evt);
            }
        });

        button.setText("Add to cart");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(openCart)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button)
                        .addGap(74, 74, 74)
                        .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button)
                    .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(openCart)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CART", jPanel1);

        nameInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameInfo.setText("No Info");

        roleInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        roleInfo.setText("No Info ");

        userNameInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userNameInfo.setText("No Info");

        phoneInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phoneInfo.setText("No Info");

        emailInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailInfo.setText("No Info");

        workInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        workInfo.setText("No Info");

        birthInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        birthInfo.setText("No Info");

        ageInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ageInfo.setText("No Info");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("USER ACCOUNT");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("YOUR NAME");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setText("ROLE");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setText("BIRTHDAY");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setText("AGE");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setText("PHONE");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setText("WORK FROM");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setText("EMAIL");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setText("ADDRESS");

        addressInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressInfo.setText("No Info");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel3)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33)
                    .addComponent(jLabel36))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 815, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(151, 151, 151))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressInfo)
                            .addComponent(workInfo)
                            .addComponent(emailInfo)
                            .addComponent(ageInfo)
                            .addComponent(roleInfo)
                            .addComponent(birthInfo)
                            .addComponent(userNameInfo)
                            .addComponent(nameInfo)
                            .addComponent(phoneInfo))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userNameInfo)
                            .addComponent(jLabel3))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameInfo)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(roleInfo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(birthInfo)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ageInfo)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(phoneInfo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(emailInfo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(workInfo))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(addressInfo))
                .addContainerGap(457, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("USER", jPanel2);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("User Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Password");

        regUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regUserNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Full Name");

        submitBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitBt.setText("SUBMIT");
        submitBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Address");

        regCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regCityActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Phone Number");

        regPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regPhoneActionPerformed(evt);
            }
        });

        regWorkDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regWorkDateActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Start Work from");

        jLabel11.setText("Date:");

        jLabel12.setText("Month:");

        jLabel13.setText("Year:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Birthday");

        jLabel15.setText("Date:");

        regBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBirthDateActionPerformed(evt);
            }
        });

        jLabel16.setText("Month:");

        jLabel17.setText("Year:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("City/ Province");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("District");

        regDistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regDistrictActionPerformed(evt);
            }
        });

        regCommune.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regCommuneActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Commune");

        regVillage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regVillageActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Village/ Area");

        regRoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regRoadActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Road");

        regApartmentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regApartmentNumberActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Apartment Number");

        regZIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regZIPActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("ZIP Code");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Register as");

        regWorkMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jan", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        regWorkMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regWorkMonthActionPerformed(evt);
            }
        });

        regBirthMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jan", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        regBirthMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBirthMonthActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Email");

        regRole.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        regRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seller", "Manager" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel25)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regVillage, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regCommune, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regCity, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(regWorkDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(regWorkMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(regBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(regBirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(regBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(regWorkYear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(regRoad, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regApartmentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regZIP, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(submitBt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(regRole, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel26)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addContainerGap(674, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel9)
                    .addContainerGap(1116, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(regUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(regPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(regName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(regPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(regEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(regWorkDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(regWorkMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(regWorkYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(regBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(regBirthMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(regBirthYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(regCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(regDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(regCommune, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(regVillage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(regRoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(regApartmentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(regZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addComponent(submitBt)
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(301, 301, 301)
                    .addComponent(jLabel9)
                    .addContainerGap(459, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("REGISTER", jPanel3);

        loginBt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginBt.setText("LOGIN");
        loginBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setText("Password");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("User Name");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(loginBt)))
                .addContainerGap(802, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(loginUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginBt)
                .addContainerGap(603, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LOGIN", jPanel4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1122, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("FUNCTION", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // PRODUCT TABLE PRODUCT TABLE //
    
    // DECLARE
    DefaultTableModel model;
    String iname = "";
    String type = "";
    String price = "";
    String amount = "";
    String discription= "";
    String selectedImagePath = "";
    
    String[] typeArr = new String[20];
    int typeCount = 0;
    // DECLARE*
    
    // CLEARFIELD
    public void clearfield(){
        itemName.setText("");
        itemPrice.setText("");
        itemAmount.setText("");
        itemDiscript.setText("");
    }
    
    // TABLE HEADER
    public void addTableHeader() {
        model = (DefaultTableModel) itemTable.getModel();
        Object[] newIdentifiers = new Object[] {"Item_Name", "Type", "Price", "Amount", "Discription", "Image"};
        model.setColumnIdentifiers(newIdentifiers);
        itemTable.setFillsViewportHeight(true);
        itemTable.getColumn("Image").setCellRenderer(new CellRenderer());    
    }
    
    class CellRenderer implements TableCellRenderer {
 
        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {
 
            TableColumn tb = itemTable.getColumn("Image");
            tb.setMaxWidth(60);
            tb.setMinWidth(60);
 
            itemTable.setRowHeight(60);
 
            return (Component) value;
        }
 
    }
    // TABLE HEADER*
    
    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        // TODO add your handling code here:
//        int fieldContent = Integer.parseInt(field.getText());
//        
//        field.setText(acc[fieldContent].getPassword());


//        DefaultTableModel defaultTableModel = new DefaultTableModel();
//        table.setModel(defaultTableModel);
//        
//        defaultTableModel.addColumn("username");
//        defaultTableModel.addColumn("password");
//        
//        
//        
//        defaultTableModel.addRow(abc);

//        DefaultTableModel dTM= (DefaultTableModel)productTable.getModel();
//        int selectedRow= productTable.getSelectedRow();
////        String a = String.valueOf(dTM.getValueAt(selectedRow, 0));
//        String[] arrToCart = new String[]{
//            dTM.getValueAt(selectedRow, 0).toString(),
//            dTM.getValueAt(selectedRow, 1).toString()
//        };
//        cart.AddtoTable(arrToCart);
    }//GEN-LAST:event_buttonActionPerformed

    private void openCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openCartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openCartActionPerformed

    private void regUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regUserNameActionPerformed

    private void submitBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtActionPerformed
        // TODO add your handling code here:

        // DECLARE

        // DECLARE*

        // ACCOUNT
        String userName = regUserName.getText();
        String password = String.valueOf(regPassword.getPassword());
        String name = regName.getText();
        String phone = regPhone.getText();
        String role= regRole.getSelectedItem().toString();
        String email = regEmail.getText();
        // ACCOUNT*
        String[] accArr = new String[] {userName, password, name, email, phone, role};
        // ACCOUNT ARRAY*

        // ADDRESS
        String addressID = "addr_"+userName;
        String city = regCity.getText();
        String district = regDistrict.getText();
        String commune = regCommune.getText();
        String village = regVillage.getText();
        String road = regRoad.getText();
        String apartmentNumber = regApartmentNumber.getText();
        // ADDRESS*
        String[] addrArr = new String[] {addressID, city, district, commune, village, road, apartmentNumber};
        // ADDRESS ARRAY*

        // BIRTH
        String dateTimeID = "bd_"+userName;
        String birthDate = regBirthDate.getText();
        String birthMonth = regBirthMonth.getSelectedItem().toString();
        String birthYear = regBirthYear.getText();
        // BIRTH*
        String[] bdArr = new String[] {dateTimeID, birthDate, birthMonth, birthYear};
        // BIRTH ARRAY*

        // WORK DATE
        dateTimeID = "wd_"+userName;
        String workDate = regWorkDate.getText();
        String workMonth = regWorkMonth.getSelectedItem().toString();
        String workYear = regWorkYear.getText();
        // WORK DATE*
        String[] wdArr = new String[] {dateTimeID, workDate, workMonth, workYear};
        // WORK DATE ARRAY*
        
        
        // SAVE DATA
        GetUserInfo(accArr, addrArr, bdArr, wdArr);
        // SAVE DATA*


    }//GEN-LAST:event_submitBtActionPerformed

    private void regCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regCityActionPerformed

    private void regPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regPhoneActionPerformed

    private void regWorkDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regWorkDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regWorkDateActionPerformed

    private void regBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBirthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regBirthDateActionPerformed

    private void regDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regDistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regDistrictActionPerformed

    private void regCommuneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regCommuneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regCommuneActionPerformed

    private void regVillageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regVillageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regVillageActionPerformed

    private void regRoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regRoadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regRoadActionPerformed

    private void regApartmentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regApartmentNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regApartmentNumberActionPerformed

    private void regZIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regZIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regZIPActionPerformed

    private void regWorkMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regWorkMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regWorkMonthActionPerformed

    private void regBirthMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBirthMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regBirthMonthActionPerformed

    private void loginBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtActionPerformed
        // TODO add your handling code here:
        String userNameStr = loginUserName.getText();
        String passwordStr = String.valueOf(loginPassword.getPassword());
        
        int check = 0;
        int i = 0;
        while (i < acc.length){
            if(acc[i] == null){
                break;
            }
            if(acc[i].getUserName().equals(userNameStr) &&
               acc[i].getPassword().equals(passwordStr)) {
                check = 1;
                break;
            }
            i++;
        }
        if(check == 0){
            JOptionPane.showMessageDialog(this, "WRONG", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Success", "Notification", JOptionPane.INFORMATION_MESSAGE);
            GetLogin(i);
        }
        
    }//GEN-LAST:event_loginBtActionPerformed

    private void itemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemNameActionPerformed

    private void itemAddBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddBtActionPerformed
        // TODO add your handling code here:
        iname = itemName.getText();
        type = itemType.getSelectedItem().toString();
        price = itemPrice.getText();
        amount = itemAmount.getText();
        discription = itemDiscript.getText();
        
        // SET IMAGE TO TABLE
        JLabel itemImage = new JLabel();
        ImageIcon imageicon = new ImageIcon(selectedImagePath);
        Image img = imageicon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        itemImage.setIcon(new ImageIcon(img));
        
        if(iname.isEmpty()){
            JOptionPane.showMessageDialog(null, "Some field was empty!");
        } else {
            model.addRow(new Object[] {iname, type, price, amount, discription, itemImage});
            JOptionPane.showMessageDialog(null, "Data is inserted");
            
        }
        clearfield();
    }//GEN-LAST:event_itemAddBtActionPerformed

    private void newTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // ADD to TYPE ARRAY
        String typeStr = newType.getText();
        typeArr[typeCount] = typeStr;
        typeCount++;
        // ADD to TYPE ARRAY*
        
        // SET TYPE COMBOBOX
        
        itemType.addItem(typeStr);
        
        // SET TYPE COMBOBOX*
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void itemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = itemTable.getSelectedRow();
        
        itemName.setText(model.getValueAt(selectedRow, 0).toString());
        
        String typeStr = model.getValueAt(selectedRow, 1).toString();
        for (int i = 0; i < itemType.getItemCount(); i++){
            if (itemType.getItemAt(i).equalsIgnoreCase(typeStr)){
                itemType.setSelectedIndex(i);
            }
        }
        
        itemPrice.setText(model.getValueAt(selectedRow, 2).toString());
        itemAmount.setText(model.getValueAt(selectedRow, 3).toString());
        itemDiscript.setText(model.getValueAt(selectedRow, 4).toString());
        
        
    }//GEN-LAST:event_itemTableMouseClicked

    private void browseBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser("E:\\Photo\\Background");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);
            ImageIcon ii = new ImageIcon(selectedImagePath);
            Image image = ii.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_browseBtActionPerformed

    private void deleteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtActionPerformed
        // TODO add your handling code here:
        int selectedRow = itemTable.getSelectedRow();
        model.removeRow(selectedRow);
        clearfield();
    }//GEN-LAST:event_deleteBtActionPerformed

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
            java.util.logging.Logger.getLogger(ShopPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShopPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShopPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShopPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressInfo;
    private javax.swing.JLabel ageInfo;
    private javax.swing.JLabel birthInfo;
    private javax.swing.JButton browseBt;
    private javax.swing.JButton button;
    private javax.swing.JButton changeBt;
    private javax.swing.JButton deleteBt;
    private javax.swing.JLabel emailInfo;
    private javax.swing.JTextField field;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton itemAddBt;
    private javax.swing.JTextField itemAmount;
    private javax.swing.JTextArea itemDiscript;
    private javax.swing.JTextField itemName;
    private javax.swing.JTextField itemPrice;
    private javax.swing.JTable itemTable;
    private javax.swing.JComboBox<String> itemType;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loginBt;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JTextField loginUserName;
    private javax.swing.JLabel nameInfo;
    private javax.swing.JTextField newType;
    private javax.swing.JButton openCart;
    private javax.swing.JLabel phoneInfo;
    private javax.swing.JTextField regApartmentNumber;
    private javax.swing.JTextField regBirthDate;
    private javax.swing.JComboBox<String> regBirthMonth;
    private javax.swing.JTextField regBirthYear;
    private javax.swing.JTextField regCity;
    private javax.swing.JTextField regCommune;
    private javax.swing.JTextField regDistrict;
    private javax.swing.JTextField regEmail;
    private javax.swing.JTextField regName;
    private javax.swing.JPasswordField regPassword;
    private javax.swing.JTextField regPhone;
    private javax.swing.JTextField regRoad;
    private javax.swing.JComboBox<String> regRole;
    private javax.swing.JTextField regUserName;
    private javax.swing.JTextField regVillage;
    private javax.swing.JTextField regWorkDate;
    private javax.swing.JComboBox<String> regWorkMonth;
    private javax.swing.JTextField regWorkYear;
    private javax.swing.JTextField regZIP;
    private javax.swing.JLabel roleInfo;
    private javax.swing.JButton submitBt;
    private javax.swing.JLabel userNameInfo;
    private javax.swing.JLabel workInfo;
    // End of variables declaration//GEN-END:variables

}
