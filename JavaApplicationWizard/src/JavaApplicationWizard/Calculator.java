/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplicationWizard;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
 class Calculator extends JFrame{
    private double data1,data2;
    private boolean isDot = false;//if dot is pressed then true
    private boolean isOperatorPressed = false;//turned to true when operator is pressed
    private boolean whichOperand = false;//true for second operand
    private int operator = 0;//no selection,1-plus,2-minus,3-multiply,4-divide,5-equal 
    public Calculator(String s){
        super(s);
    }
    public void setComponents(){
        bdelete = new JButton("DEL");
        bc = new JButton();
        bce = new JButton();
        bc.setText("C");
        bce.setText("CE");
        bsign = new JButton("+/-");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bdivide = new JButton("/");
        b6 = new JButton("6");
        b5 = new JButton("5");
        b4 = new JButton("4");
        b3 = new JButton("3");
        b2 = new JButton("2");
        b1 = new JButton("1");
        b0 = new JButton("0");
        bdot = new JButton(".");
        bplus = new JButton("+");
        bmultiply = new JButton("*");
        bminus = new JButton("-");
        bequal = new JButton("=");
        setLayout(null);
        setIconImage(new ImageIcon(getClass().getResource("icon.jpg")).getImage());
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(bsign);
        add(bdot);
        add(bc);
        add(bce);
        add(bdelete);
        add(bdivide);
        add(bplus);
        add(bminus);
        add(bequal);
        add(bmultiply);
        add(display);
        b0.setBounds(20,370,65,40);
        b1.setBounds(180,310,65,40);
        b2.setBounds(100,310,65,40);
        b3.setBounds(20,310,65,40);
        b4.setBounds(180,250,65,40);
        b5.setBounds(100,250,65,40);
        b6.setBounds(20,250,65,40);
        b7.setBounds(180,190,65,40);
        b8.setBounds(100,190,65,40);
        b9.setBounds(20,190,65,40);
        bsign.setBounds(260,130,65,40);
        bdot.setBounds(100,370,65,40);       
        bce.setBounds(100,130,65,40);
        bc.setBounds(180,130,65,40);
        bdelete.setBounds(20,130,65,40);
        bdivide.setBounds(260,190,65,40);
        bplus.setBounds(180,370,65,40);
        bminus.setBounds(260,310,65,40);
        bequal.setBounds(260,370,65,40);
        bmultiply.setBounds(260,250,65,40);
        display.setBounds(20,20,305,90);
        b0.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            b0.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            b0.setBackground(UIManager.getColor("control"));
        }
        });
        b1.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            b1.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            b1.setBackground(UIManager.getColor("control"));
        }
        });
        b2.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            b2.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            b2.setBackground(UIManager.getColor("control"));
        }
        });
        b3.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            b3.setBackground(Color.yellow);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
        b3.setBackground(UIManager.getColor("control"));
        }
        });
        b4.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            b4.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            b4.setBackground(UIManager.getColor("control"));
        }
        });
        b5.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            b5.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            b5.setBackground(UIManager.getColor("control"));
        }
        });
        b6.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            b6.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            b6.setBackground(UIManager.getColor("control"));
        }
        });
        b7.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            b7.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            b7.setBackground(UIManager.getColor("control"));
        }
        });
        b8.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            b8.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            b8.setBackground(UIManager.getColor("control"));
        }
        });
        b9.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            b9.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            b9.setBackground(UIManager.getColor("control"));
        }
        });
        bce.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            bce.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            bce.setBackground(UIManager.getColor("control"));
        }
        });
        bc.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            bc.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            bc.setBackground(UIManager.getColor("control"));
        }
        });
        bsign.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            bsign.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            bsign.setBackground(UIManager.getColor("control"));
        }
        });
        bplus.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            bplus.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            bplus.setBackground(UIManager.getColor("control"));
        }
        });
        bminus.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            bminus.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            bminus.setBackground(UIManager.getColor("control"));
        }
        });
        bmultiply.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            bmultiply.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            bmultiply.setBackground(UIManager.getColor("control"));
        }
        });
        bequal.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            bequal.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            bequal.setBackground(UIManager.getColor("control"));
        }
        });
        bdot.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            bdot.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            bdot.setBackground(UIManager.getColor("control"));
        }
        });
        bdivide.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            bdivide.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            bdivide.setBackground(UIManager.getColor("control"));
        }
        });
        bdelete.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent evt) {
            bdelete.setBackground(Color.yellow);
        }
        public void mouseExited(MouseEvent evt) {
            bdelete.setBackground(UIManager.getColor("control"));
        }
        });
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
        display.setFont(new Font("Courier",Font.BOLD,35));
        display.setText("0");
        bdelete.setText("DEL");
        bdelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });

        bc.setText("CE");
        bc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });

        bce.setText("C");
        bce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bceActionPerformed(evt);
            }
        });

        bsign.setText("+/-");
        bsign.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bsignActionPerformed(evt);
            }
        });

        b7.setText("7");
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setText("8");
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setText("9");
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bdivide.setText("/");
        bdivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bdivActionPerformed(evt);
            }
        });

        b4.setText("4");
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setText("5");
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setText("6");
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        bmultiply.setText("*");
        bmultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bmultiplyActionPerformed(evt);
            }
        });

        b1.setText("1");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("2");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setText("3");
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        bminus.setText("-");
        bminus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bminusActionPerformed(evt);
            }
        });

        b0.setText("0");
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bdot.setText(".");
        bdot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bdotActionPerformed(evt);
            }
        });

        bplus.setText("+");
        bplus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bplusActionPerformed(evt);
            }
        });

        bequal.setText("=");
        bequal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bequalActionPerformed(evt);
            }
        });
    }
    private void b0ActionPerformed(ActionEvent evt){
        if(display.getText().equals("ERROR"));
        else
            if(display.getText().equals("0")||isOperatorPressed)
                display.setText("0");
            else
                display.setText(display.getText()+"0");
        isOperatorPressed = false;
    }
    private void b1ActionPerformed(ActionEvent evt){
        if(display.getText().equals("ERROR"));
        else
            if(display.getText().equals("0")||isOperatorPressed)
                display.setText("1");
            else
                display.setText(display.getText()+"1");
        isOperatorPressed = false;
    }
    private void b2ActionPerformed(ActionEvent evt){
        if(display.getText().equals("ERROR"));
        else
            if(display.getText().equals("0")||isOperatorPressed)
                display.setText("2");
            else
                display.setText(display.getText()+"2");
        isOperatorPressed = false;
    }
    private void b3ActionPerformed(ActionEvent evt){
        if(display.getText().equals("ERROR"));
        else
            if(display.getText().equals("0")||isOperatorPressed)
                display.setText("3");
            else
                display.setText(display.getText()+"3");
        isOperatorPressed = false;
    }
    private void b4ActionPerformed(ActionEvent evt){
        if(display.getText().equals("ERROR"));
        else
            if(display.getText().equals("0")||isOperatorPressed)
                display.setText("4");
            else
                display.setText(display.getText()+"4");
        isOperatorPressed = false;
    }
    private void b5ActionPerformed(ActionEvent evt){
        if(display.getText().equals("ERROR"));
        else
            if(display.getText().equals("0")||isOperatorPressed)
                display.setText("5");
            else
                display.setText(display.getText()+"5");
        isOperatorPressed = false;
    }
    private void b6ActionPerformed(ActionEvent evt){
        if(display.getText().equals("ERROR"));
        else
            if(display.getText().equals("0")||isOperatorPressed)
                display.setText("6");
            else
                display.setText(display.getText()+"6");
        isOperatorPressed = false;
    }
    private void b7ActionPerformed(ActionEvent evt){
        if(display.getText().equals("ERROR"));
        else
            if(display.getText().equals("0")||isOperatorPressed)
                display.setText("7");
            else
                display.setText(display.getText()+"7");
        isOperatorPressed = false;
    }
    private void b8ActionPerformed(ActionEvent evt){
        if(display.getText().equals("ERROR"));
        else
            if(display.getText().equals("0")||isOperatorPressed)
                display.setText("8");
            //else if (display.getText().equals("0")){
              //  display.setText("8");
//            }
else{
                display.setText(display.getText()+"8");
            }
        isOperatorPressed = false;
    }
    private void b9ActionPerformed(ActionEvent evt){
        if(display.getText().equals("ERROR"));
        else
            if(display.getText().equals("0")||isOperatorPressed)
                display.setText("9");
            else
                display.setText(display.getText()+"9");
        isOperatorPressed = false;
    }
    private void bdeleteActionPerformed(ActionEvent evt){
        if(display.getText().equals("ERROR")||display.getText().equals("0")||isOperatorPressed);
        else{
            if(display.getText().length()>1)
                display.setText(display.getText().substring(0,display.getText().length() -1));
            else{
                display.setText("0");
            }
        if(display.getText().indexOf('.') == -1)
            isDot = false;
        }
    }
    private void bceActionPerformed(ActionEvent evt){
        if(display.getText().equals("ERROR"));
        else{
            display.setText("0");
            isDot = false;
        }
    }
    private void bsignActionPerformed(ActionEvent evt){
        if(display.getText().equals("ERROR"));
        else{
            if(display.getText().equals("0"));
            else{
                if(Double.parseDouble(display.getText())>0.0)
                    display.setText("-"+display.getText());
                else
                    display.setText(display.getText().substring(1,display.getText().length()));
                }
            }
        }
    private void bdotActionPerformed(ActionEvent evt){
        if(display.getText().equals("ERROR"));
        else if(display.getText().equals("0")||isOperatorPressed){
            display.setText("0.");
            isDot = true;
        }else{
            if(isDot){
            ;
            }else{
                display.setText(display.getText()+".");
                isDot = true;
            }
            isOperatorPressed = false;
        }
    }
    private void bplusActionPerformed(ActionEvent evt) {
       if(display.getText().equals("ERROR"))
		      ; //nothing will happen		   
        else{ 
	    if(whichOperand==false){
		  data1=Double.parseDouble(display.getText());
		  whichOperand=true;
		}
		else{
		  if(isOperatorPressed)
		    ;//nothing will happen
		  else{
		   data2=Double.parseDouble(display.getText());
		   
		   switch(operator)
		   {
                        case 1:
                               data1=data1+data2;
				  break;
			case 2:
			      data1=data1-data2;
				  break;
			case 3:
				  data1=data1*data2;
				  break;
			case 4:
				  if(data2!=0.0)
				     data1=data1/data2;
				  else
					 display.setText("ERROR");
				  break;
		   }
		   if(display.getText().equals("ERROR")){
		      isOperatorPressed=false;
		      operator=0;
		   }
		   else if(data1==Math.floor(data1))
		     display.setText(""+(int)Math.floor(data1));
		   else
		     display.setText(""+data1);
		  }
		  
		}
		
	  	if(!display.getText().equals("ERROR")){
		 isOperatorPressed=true;
		 operator=1;
		}
	} 
    }
    private void bdivActionPerformed(ActionEvent evt) {
       if(display.getText().equals("ERROR"))
		      ; //nothing will happen		   
	  	else {
		if(whichOperand==false){
		  data1=Double.parseDouble(display.getText());
		  whichOperand=true;
		}
		else{
		  if(isOperatorPressed)
		    ;//nothing will happen
		  else{
		   data2=Double.parseDouble(display.getText());
		   switch(operator)
		   {
		    case 1:
		          data1=data1+data2;
				  break;
			case 2:
			      data1=data1-data2;
				  break;
			case 3:
				  data1=data1*data2;
				  break;
			case 4:
				  if(data2!=0.0)
				     data1=data1/data2;
				  else
					 display.setText("ERROR");
				  break;
		   }
		   if(display.getText().equals("ERROR")){
		      isOperatorPressed=false;
		      operator=0;
		   }
		   else if(data1==Math.floor(data1))
		     display.setText(""+(int)Math.floor(data1));
		   else
		     display.setText(""+data1);
		  }
		  }
		  
		
		if(!display.getText().equals("ERROR")){
		 isOperatorPressed=true;
		 operator=4;
		}
	 } 	  
    }
   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        bc = new javax.swing.JButton();
        bce = new javax.swing.JButton();
        bsign = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        bdivide = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bmultiply = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        bplus = new javax.swing.JButton();
        bequal = new javax.swing.JButton();
        bminus = new javax.swing.JButton();
        display = new javax.swing.JTextField();
        display2 = new javax.swing.JTextField();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bdelete.setText("DEL");

        bc.setText("C");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });

        bce.setText("CE");

        bsign.setText("+/-");

        b9.setText("9");

        b8.setText("8");

        b7.setText("7");

        bdivide.setText("/");

        b4.setText("4");

        b5.setText("5");

        b6.setText("6");

        bmultiply.setText("*");
        bmultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmultiplyActionPerformed(evt);
            }
        });

        b1.setText("1");

        b2.setText("2");

        b3.setText("3");

        b0.setText("0");

        bdot.setText(".");

        bplus.setText("+");

        bequal.setText("=");
        bequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bequalActionPerformed(evt);
            }
        });

        bminus.setText("-");
        bminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bminusActionPerformed(evt);
            }
        });

        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setText("0");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(display)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bdelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bmultiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bdivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bce, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bsign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bdot, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bplus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bequal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bminus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(display2))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdelete)
                    .addComponent(bc)
                    .addComponent(bsign)
                    .addComponent(bce))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b9)
                    .addComponent(b8)
                    .addComponent(bdivide)
                    .addComponent(b7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4)
                    .addComponent(b5)
                    .addComponent(b6)
                    .addComponent(bmultiply))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3)
                    .addComponent(bminus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b0)
                    .addComponent(bdot)
                    .addComponent(bplus)
                    .addComponent(bequal))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bmultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmultiplyActionPerformed
        if(display.getText().equals("ERROR"))
		      ; //nothing will happen		   
	  	else {
		if(whichOperand==false){
		  data1=Double.parseDouble(display.getText());
		  whichOperand=true;
		}
		else{
		  if(isOperatorPressed)
		    ;//nothing will happen
		  else{
		   data2=Double.parseDouble(display.getText());
		   switch(operator)
		   {
		    case 1:
		          data1=data1+data2;
				  break;
			case 2:
			      data1=data1-data2;
				  break;
			case 3:
				  data1=data1*data2;
				  break;
			case 4:
				   if(data2!=0.0)
				     data1=data1/data2;
				  else
					 display.setText("ERROR");
				  break;
		   }
		   if(display.getText().equals("ERROR")){
		      isOperatorPressed=false;
		      operator=0;
		   }
		   else if(data1==Math.floor(data1))
		     display.setText(""+(int)Math.floor(data1));
		   else
		     display.setText(""+data1);
		  }
		  
		}
		if(!display.getText().equals("ERROR")){
		 isOperatorPressed=true;
		 operator=3;
		}
	  	
	 } 	  
    }//GEN-LAST:event_bmultiplyActionPerformed

    private void bequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bequalActionPerformed
        if(display.getText().equals("ERROR"))
		      ; 	   
	  	else {
		if(whichOperand==false){
		  data1=Double.parseDouble(display.getText());
		  whichOperand=false; 
		  isOperatorPressed=true;
		}
		else{
		  if(isOperatorPressed){
		    data2=data1;
		    switch(operator)
		    {
		    case 1:
		          data1=data1+data2;
				  break;
			case 2:
			      data1=data1-data2;
				  break;
			case 3:
				  data1=data1*data2;
				  break;
			case 4:
				  if(data2!=0.0)
				     data1=data1/data2;
				  else
					 display.setText("ERROR");
				  break;
		    }
			if(display.getText().equals("ERROR")){
		      isOperatorPressed=false;
		      operator=0;
		    }
		   else if(data1==Math.floor(data1))
		     display.setText(""+(int)Math.floor(data1));
		   else
		     display.setText(""+data1);
		  }
		  else{
		   data2=Double.parseDouble(display.getText());
		   switch(operator)
		   {
		    case 1:
		          data1=data1+data2;
				  break;
			case 2:
			      data1=data1-data2;
				  break;
			case 3:
				  data1=data1*data2;
				  break;
			case 4:
				  if(data2!=0.0)
				     data1=data1/data2;
				  else
					 display.setText("ERROR");
				  break;
		   }
		   if(display.getText().equals("ERROR")){
		      isOperatorPressed=false;
		      operator=0;
		   }
		   else if(data1==Math.floor(data1))
		     display.setText(""+(int)Math.floor(data1));
		   else
		     display.setText(""+data1);
		  }
		  whichOperand=false;
		  }
		  
		
		if(!display.getText().equals("ERROR")){
		 isOperatorPressed=true;
		 operator=5;
		}
	 } 	     
    }//GEN-LAST:event_bequalActionPerformed

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
        display.setText("0");
        isDot = false;
        isOperatorPressed = false;
        whichOperand = false;
        operator  = 0;   
    }//GEN-LAST:event_bcActionPerformed

    private void bminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bminusActionPerformed
        if(display.getText().equals("ERROR"))
		      ; //nothing will happen		   
	  	else {
		if(whichOperand==false){
		  data1=Double.parseDouble(display.getText());
		  whichOperand=true;
		}
		else{
		  if(isOperatorPressed)
		    ;//nothing will happen
		  else{
		   data2=Double.parseDouble(display.getText());
		   switch(operator)
		   {
		    case 1:
		          data1=data1+data2;
				  break;
			case 2:
			      data1=data1-data2;
				  break;
			case 3:
				  data1=data1*data2;
				  break;
			case 4:
				   if(data2!=0.0)
				     data1=data1/data2;
				  else
					 display.setText("ERROR");
				  break;
		   }
		   if(display.getText().equals("ERROR")){
		      isOperatorPressed=false;
		      operator=0;
		   }
		   else if(data1==Math.floor(data1))
		     display.setText(""+(int)Math.floor(data1));
		   else
		     display.setText(""+data1);
		  }
		  
		}
		if(!display.getText().equals("ERROR")){
		 isOperatorPressed=true;
		 operator=2;
		}  
        }
    }//GEN-LAST:event_bminusActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed
 public static void main(String[] args) {
            Calculator c = new Calculator("Calculator");
            c.setComponents();
            c.setSize(700,430);
            c.setVisible(true);
            c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bc;
    private javax.swing.JButton bce;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bdivide;
    private javax.swing.JButton bdot;
    private javax.swing.JButton bequal;
    private javax.swing.JButton bminus;
    private javax.swing.JButton bmultiply;
    private javax.swing.JButton bplus;
    private javax.swing.JButton bsign;
    private javax.swing.JTextField display;    
}
