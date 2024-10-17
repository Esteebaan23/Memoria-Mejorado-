package memoria;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JOptionPane;





public class Memorama extends javax.swing.JFrame implements KeyListener {

  int [] cartas= new int [17];
  int delay;
  int aleatorio,contador,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,click,residuo;
  int posicion,imagen1,imagen2,click2,cont,cont1,cont2,cont3,r;
 JButton im1;
 JButton im2;
 int residuo2=0;
 AudioClip sonido;
 String cadena;
 

 

   
   
  

    public Memorama() {
        initComponents();
        addKeyListener(this);
        this.getContentPane().setBackground(Color.black);

        cartas[1]=(int)(Math.random()*8+1);
        while(posicion <=16){
            aleatorio =(int)(Math.random()*8+1);
            for(int anterior=1;anterior<=posicion;anterior++)
            {
                    if(cartas[anterior]==aleatorio){
                        contador++;
                    }
            }
                if(contador<2){
                    cartas[posicion]=aleatorio;
                    posicion++;
                }
                contador=0;
        }

//        for(int posicion=1;posicion<=16;posicion++){
//            System.out.printf("%d  ",cartas[posicion]);
//        }
      
    }
    
public void keyTyped(KeyEvent e) {}
public void keyReleased(KeyEvent e) {}
public void keyPressed(KeyEvent e)
    {
       System.out.print(e.getKeyCode());
    
    }







   Timer timer = new Timer (40, new ActionListener ()
{
    public void actionPerformed(ActionEvent e)
    {
       
        delay++;
        if(delay==10)
        {
            residuo2=click2%2;
            if(residuo2==0)
            {
                if(imagen1==imagen2)
                {
                     sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana2.wav"));
        sonido.play();
                    im1.setEnabled(false);
                    im2.setEnabled(false);
                }
                else
                {
                     sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/emp.wav"));
        sonido.play();
     
                    im1.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg ")));
                    im2.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg ")));
                   
                }
           
            }
           
     }
}});
   
   
   Timer temporizador = new Timer (100, new ActionListener ()
{
    public void actionPerformed(ActionEvent e)
    {
       
     cont+=1;
                lbldecimas.setText(String.valueOf(cont));
                r= Integer.parseInt(lbldecimas.getText())%10;
                if(r==0)
                {
                   
                    lbldecimas.setText(String.valueOf(0)); 
                    cont=0;
                    cont2++;
                    lblsegundos.setText(String.valueOf(cont2)); 
                     if(Integer.parseInt(lblsegundos.getText())<10)
                    {
                        lblsegundos.setText("0"+String.valueOf(cont2));
                    }
                    
                    a=Integer.parseInt(lblsegundos.getText())%59;
                    if(a==0)
                    {
                        cont2=0;
                        cont3++;
                        lblminutos.setText(String.valueOf(cont3)); 
                    }
                }
                
           if(btn1.isEnabled()==false && btn18.isEnabled()==false && btn19.isEnabled()==false && btn20.isEnabled()==false && btn21.isEnabled()==false && btn22.isEnabled()==false
                   && btn23.isEnabled()==false && btn24.isEnabled()==false && btn25.isEnabled()==false && btn26.isEnabled()==false && btn27.isEnabled()==false && btn28.isEnabled()==false
                   && btn29.isEnabled()==false && btn30.isEnabled()==false && btn31.isEnabled()==false && btn32.isEnabled()==false)
           {
                
               temporizador.stop();
               JOptionPane.showMessageDialog(null,"Felicidades "+cadena+ ", Haz terminado el juego con un tiempo de "+cont3+" minutos "+cont2+" segundos");
               System.exit(0);
               
           }
           
     
                   
}});

    
      



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        lblminutos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblsegundos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbldecimas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn1.setText("jButton1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn17.setText("Restart");
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btn18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn18.setText("jButton1");
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        btn19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn19.setText("jButton1");
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });

        btn20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn20.setText("jButton1");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn21.setText("jButton1");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn22.setText("jButton1");
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn23.setText("jButton1");
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn24.setText("jButton1");
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });

        btn25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn25.setText("jButton1");
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });

        btn26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn26.setText("jButton1");
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });

        btn27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn27.setText("jButton1");
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });

        btn28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn28.setText("jButton1");
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });

        btn29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn29.setText("jButton1");
        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn29ActionPerformed(evt);
            }
        });

        btn30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn30.setText("jButton1");
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });

        btn31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn31.setText("jButton1");
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoria/balnco.jpg"))); // NOI18N
        btn32.setText("jButton1");
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });

        lblminutos.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblminutos.setForeground(new java.awt.Color(255, 255, 255));
        lblminutos.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(":");

        lblsegundos.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblsegundos.setForeground(new java.awt.Color(255, 255, 255));
        lblsegundos.setText("00");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(":");

        lbldecimas.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbldecimas.setForeground(new java.awt.Color(255, 255, 255));
        lbldecimas.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(lblminutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblsegundos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbldecimas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblminutos)
                            .addComponent(jLabel5)
                            .addComponent(lblsegundos)
                            .addComponent(jLabel7)
                            .addComponent(lbldecimas))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

       
    }//GEN-LAST:event_formWindowActivated

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
    a=cartas[1];
    click++;
    click2++;
    residuo=click%2;
    sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
   
    switch(a)
    {
    case 1: btn1.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn1.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn1.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn1.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn1.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn1.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn1.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn1.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
  
    if(residuo==0)
    {
        imagen1=a;
        im1=btn1;
        
    }
    else
    {
        imagen2=a;
        im2=btn1;
    }
     delay=0;
    timer.start();

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
       b=cartas[2];
       click++;
       click2++;
       residuo=click%2;
       sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
    switch(b)
    {
    case 1: btn18.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn18.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn18.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn18.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn18.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn18.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn18.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn18.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
 
        if(residuo==0)
    {
        imagen1=b;
        im1=btn18;
        
    }
    else
    {
        imagen2=b;
        im2=btn18;
    }
         delay=0;
    timer.start();

    }//GEN-LAST:event_btn18ActionPerformed

  

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
      c=cartas[3];
      click++;
      click2++;
      residuo=click%2;
         sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
    switch(c)
    {
    case 1: btn21.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn21.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn21.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn21.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn21.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn21.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn21.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn21.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
     if(residuo==0)
    {
        imagen1=c;
        im1=btn21;
        
    }
    else
    {
        imagen2=c;
        im2=btn21;
    }
     delay=0;
    timer.start();
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
     d=cartas[4];
     click++;
     click2++;
     residuo=click%2;
        sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
    switch(d)
    {
    case 1: btn19.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn19.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn19.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn19.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn19.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn19.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn19.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn19.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
     if(residuo==0)
    {
        imagen1=d;
        im1=btn19;
        
    }
    else
    {
        imagen2=d;
        im2=btn19;
    }
     delay=0;
timer.start();
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        e=cartas[5];
        click++;
         click2++;
        residuo=click%2;
           sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
    switch(e)
    {
    case 1: btn20.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn20.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn20.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn20.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn20.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn20.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn20.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn20.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
     if(residuo==0)
    {
        imagen1=e;
        im1=btn20;
        
    }
    else
    {
        imagen2=e;
        im2=btn20;
    }
     delay=0;
   timer.start();
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
      f=cartas[6];
      click++;
       click2++;
      residuo=click%2;
         sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
    switch(f)
    {
    case 1: btn24.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn24.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn24.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn24.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn24.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn24.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn24.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn24.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
    if(residuo==0)
    {
        imagen1=f;
        im1=btn24;
        
    }
    else
    {
        imagen2=f;
        im2=btn24;
    }
     delay=0;
    timer.start();
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        g=cartas[7];
        click++;
         click2++;
        residuo=click%2;
           sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
    switch(g)
    {
    case 1: btn22.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn22.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn22.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn22.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn22.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn22.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn22.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn22.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
     if(residuo==0)
    {
        imagen1=g;
        im1=btn22;
        
    }
    else
    {
        imagen2=g;
        im2=btn22;
    }
     delay=0;
   timer.start();
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
         h=cartas[8];
         click++;
          click2++;
         residuo=click%2;
            sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
    switch(h)
    {
    case 1: btn23.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn23.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn23.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn23.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn23.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn23.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn23.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn23.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
   
    if(residuo==0)
    {
        imagen1=h;
        im1=btn23;
        
    }
    else
    {
        imagen2=h;
        im2=btn23;
    }
     delay=0;
   timer.start();
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
      i=cartas[9];
      click++;
       click2++;
      residuo=click%2;
         sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
    switch(i)
    {
    case 1: btn30.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn30.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn30.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn30.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn30.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn30.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn30.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn30.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
     if(residuo==0)
    {
        imagen1=i;
        im1=btn30;
        
    }
    else
    {
        imagen2=i;
        im2=btn30;
    }
     delay=0;
    timer.start();
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
    j=cartas[10];
 
    click++;
     click2++;
    residuo=click%2;
       sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
    switch(j)
    {
    case 1: btn28.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn28.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn28.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn28.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn28.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn28.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn28.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn28.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
   if(residuo==0)
    {
        imagen1=j;
        im1=btn28;
        
    }
    else
    {
        imagen2=j;
        im2=btn28;
    }
     delay=0;
   timer.start();
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
       k=cartas[11];
       click++;
        click2++;
       residuo=click%2;
          sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
    switch(k)
    {
    case 1: btn32.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn32.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn32.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn32.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn32.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn32.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn32.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn32.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
    
     if(residuo==0)
    {
        imagen1=k;
        im1=btn32;
        
    }
    else
    {
        imagen2=k;
        im2=btn32;
    }
     delay=0;
    timer.start();
    
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn29ActionPerformed
         l=cartas[12];
         click++;
          click2++;
         residuo=click%2;
            sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
    switch(l)
    {
    case 1: btn29.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn29.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn29.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn29.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn29.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn29.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn29.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn29.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
               
     if(residuo==0)
    {
        imagen1=l;
        im1=btn29;
        
    }
    else
    {
        imagen2=l;
        im2=btn29;
    }
     delay=0;
    timer.start();
    }//GEN-LAST:event_btn29ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        m=cartas[13];
        click++;
         click2++;
        residuo=click%2;
           sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
    switch(m)
    {
    case 1: btn31.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn31.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn31.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn31.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn31.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn31.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn31.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn31.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
 if(residuo==0)
    {
        imagen1=m;
        im1=btn31;
        
    }
    else
    {
        imagen2=m;
        im2=btn31;
    }
     delay=0;
    timer.start();
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
     n=cartas[14];
     click++;
      click2++;
     residuo=click%2;
        sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
    switch(n)
    {
    case 1: btn27.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn27.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn27.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn27.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn27.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn27.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn27.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn27.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
     if(residuo==0)
    {
        imagen1=n;
        im1=btn27;
        
    }
    else
    {
        imagen2=n;
        im2=btn27;
    }
     delay=0;
   timer.start();
    
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
    o=cartas[15];
    click++;
     click2++;
    residuo=click%2;
       sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
    switch(o)
    {
    case 1: btn25.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn25.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn25.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn25.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn25.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn25.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn25.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn25.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
    if(residuo==0)
    {
        imagen1=o;
        im1=btn25;
        
    }
    else
    {
        imagen2=o;
        im2=btn25;
    }
     delay=0;
   timer.start();
    
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
      p=cartas[16];
      click++;
       click2++;
      residuo=click%2;
         sonido=java.applet.Applet.newAudioClip(getClass().getResource("/memoria/gana1.wav"));
        sonido.play();
    switch(p)
    {
    case 1: btn26.setIcon(new ImageIcon(this.getClass().getResource("1.png")));
                    break;
                    case 2: btn26.setIcon(new ImageIcon(this.getClass().getResource("2.png")));
                    break;
                    case 3: btn26.setIcon(new ImageIcon(this.getClass().getResource("3.png")));
                    break;
                    case 4: btn26.setIcon(new ImageIcon(this.getClass().getResource("4.png")));
                    break;
                    case 5: btn26.setIcon(new ImageIcon(this.getClass().getResource("5.png")));
                    break;
                    case 6: btn26.setIcon(new ImageIcon(this.getClass().getResource("6.png")));
                    break;
                    case 7: btn26.setIcon(new ImageIcon(this.getClass().getResource("7.png")));
                    break;
                    case 8: btn26.setIcon(new ImageIcon(this.getClass().getResource("8.png")));
                    break;
    }
  if(residuo==0)
    {
        imagen1=p;
        im1=btn26;
        
    }
    else
    {
        imagen2=p;
        im2=btn26;
    }
     delay=0;
timer.start();
    
 
    
    
    
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
       btn26.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg ")));
       btn1.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg ")));
       btn27.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg")));
       btn28.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg")));
       btn29.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg")));
       btn30.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg")));
       btn31.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg ")));
       btn32.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg")));
       btn19.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg")));
       btn18.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg")));
      
       btn20.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg")));
       btn21.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg ")));
       btn22.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg")));
       btn23.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg")));
         btn24.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg ")));
       btn25.setIcon(new ImageIcon(this.getClass().getResource("balnco.jpg")));
       btn1.setEnabled(true);
       btn18.setEnabled(true);
       btn19.setEnabled(true);
       btn20.setEnabled(true);
       btn21.setEnabled(true);
       btn22.setEnabled(true);
       btn23.setEnabled(true);
       btn24.setEnabled(true);
       btn25.setEnabled(true);        
   btn25.setEnabled(true);
       btn27.setEnabled(true);
       btn28.setEnabled(true);       
       btn29.setEnabled(true);
       btn30.setEnabled(true);
       btn31.setEnabled(true);
       btn32.setEnabled(true);
       btn26.setEnabled(true);
       lblsegundos.setText(String.valueOf("00")); 
       lbldecimas.setText(String.valueOf("0")); 
       lblminutos.setText(String.valueOf("0")); 
       cont=0;
       cont1=0;
       cont2=0;
       cont3=0;
       temporizador.start();
               
      
     
    }//GEN-LAST:event_btn17ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 cadena=JOptionPane.showInputDialog("Ingrese Nombre de Jugador");    
     temporizador.start();
    }//GEN-LAST:event_formWindowOpened




















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
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Memorama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbldecimas;
    private javax.swing.JLabel lblminutos;
    private javax.swing.JLabel lblsegundos;
    // End of variables declaration//GEN-END:variables
}
