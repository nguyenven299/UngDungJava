package Lab3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai_1 extends JFrame{
	public Bai_1() {
		setVisible(true);
		setTitle("");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 400);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBackground(Color.YELLOW);
		panel.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblTrChiXp = new JLabel("Trò Chơi Xếp Ô Số");
		lblTrChiXp.setForeground(Color.RED);
		lblTrChiXp.setBackground(Color.LIGHT_GRAY);
		lblTrChiXp.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTrChiXp.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblTrChiXp);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton So1 = new JButton("1");
		So1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So1ActionPerformed(evt);
			}
		});
		panel_2.add(So1);
		
		JButton So2 = new JButton("2");
		So2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                So2ActionPerformed(evt);
            }
		});
		panel_2.add(So2);
		
		JButton So3 = new JButton("3");
		So3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	               So3ActionPerformed(evt);
	            }
		});
		panel_2.add(So3);
		
		
		JButton So4 = new JButton("4");
		
		So4.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	               So4ActionPerformed(evt);
	            }
		});
		panel_2.add(So4);
		
		JButton So5 = new JButton("5");
		So5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               So5ActionPerformed(evt);
            }
	});
		panel_2.add(So5);
		
		JButton So6 = new JButton("6");
		So6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               So6ActionPerformed(evt);
            }
	});
		panel_2.add(So6);
		
		JButton So7 = new JButton("7");
		So7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               So7ActionPerformed(evt);
            }
	});
		panel_2.add(So7);
		
		JButton So8 = new JButton("8");
		So8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               So8ActionPerformed(evt);
            }
	});
		panel_2.add(So8);
		
		JButton So9 = new JButton("9");
		So9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               So9ActionPerformed(evt);
            }
	});
		panel_2.add(So9);
		
		JButton So10 = new JButton("10");
		So10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               So10ActionPerformed(evt);
            }
	});
		panel_2.add(So10);
		
		JButton So11 = new JButton("11");
		So11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               So11ActionPerformed(evt);
            }
	});
		panel_2.add(So11);
		
		JButton So12 = new JButton("12");
		So12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               So12ActionPerformed(evt);
            }
	});
		panel_2.add(So12);
		
		JButton So13 = new JButton("13");
		So13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               So13ActionPerformed(evt);
            }
	});
		panel_2.add(So13);
		
		JButton So14 = new JButton("14");
		So14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               So14ActionPerformed(evt);
            }
	});
		panel_2.add(So14);
		
		JButton So15 = new JButton("15");
		So15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 So15ActionPerformed(evt);
            }
	});
		panel_2.add(So15);
		
		JButton Trong = new JButton("");
		panel_2.add(Trong);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.CYAN);
		panel.add(panel_3, BorderLayout.SOUTH);
		
		JButton btnBtu = new JButton("Bắt Đầu");
		btnBtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBtuActionPerformed(evt);
			}
		});
		panel_3.add(btnBtu);
	}
	 private boolean ktrabtnBtu = false;
	    private void btnBtuActionPerformed(ActionEvent arg0) {

	        if (ktrabtnBtu == false) {
	            if (getTitle().trim().equals("Game Mini")) {
	                String hoTen = JOptionPane.showInputDialog("Nhập họ và tên người chơi").trim();
	                while (true) {
	                    if (!hoTen.trim().equals("")) {
	                        setTitle(hoTen);
	                        this.btnBtu.setText("Dừng");
	                       ktrabtnBtu = true;
	                        break;
	                    } else {
	                        hoTen = JOptionPane.showInputDialog("Nhập họ và tên người chơi").trim();
	                    }
	                }
	            } else {
	                ktrabtnBtu = true;
	               this.btnBtu.setText("Dừng");
	            }
	        } else {
	            ktrabtnBtu = false;
	            this.btnBtu.setText("Tiếp tục");
	        }
	        winChua();
	    }
	    private void winChua() {
			// TODO Auto-generated method stub
			
		}
		private JButton btnNull = new JButton("null");
	    private void So4ActionPerformed(java.awt.event.ActionEvent evt) {
	        hoanDoi(So8, space, btnNull, So5, So4);
	        winChua();
	    }//GEN-LAST:event_So4ActionPerformed

	    private void So14ActionPerformed(java.awt.event.ActionEvent evt) {
	        hoanDoi(btnNull, So10, So13, So15, So14);
	        winChua();
	    }//GEN-LAST:event_So14ActionPerformed

	    private void So13ActionPerformed(java.awt.event.ActionEvent evt) {
	        hoanDoi(btnNull, So9, So12, So14, So13);
	        winChua();
	    }//GEN-LAST:event_So13ActionPerformed

	    private void So12ActionPerformed(java.awt.event.ActionEvent evt) {
	        hoanDoi(btnNull, So8, btnNull, So13, So12);
	        winChua();
	    }//GEN-LAST:event_So12ActionPerformed

	    private void So11ActionPerformed(java.awt.event.ActionEvent evt) {
	        hoanDoi(So15, So7, So10, btnNull, So11);
	        winChua();
	    }//GEN-LAST:event_So11ActionPerformed

	    private void So10ActionPerformed(java.awt.event.ActionEvent evt) {
	        hoanDoi(So14, So6, So9, So11, So10);
	        winChua();
	    }//GEN-LAST:event_So10ActionPerformed

	    private void So9ActionPerformed(java.awt.event.ActionEvent evt) {
	        hoanDoi(So13, So5, So8, So10, So9);
	        winChua();
	    }//GEN-LAST:event_So9ActionPerformed

	    private void So8ActionPerformed(java.awt.event.ActionEvent evt) {
	        hoanDoi(So12, So4, btnNull, So9, So8);
	        winChua();
	    }//GEN-LAST:event_So8ActionPerformed

	    private void So7ActionPerformed(java.awt.event.ActionEvent evt) {
	        hoanDoi(So11, So3, So6, btnNull, So7);
	        winChua();
	    }//GEN-LAST:event_So7ActionPerformed

	    private void So6ActionPerformed(java.awt.event.ActionEvent evt) {
	        hoanDoi(So10, So2, So5, So7, So6);
	        winChua();
	    }//GEN-LAST:event_So6ActionPerformed

	    private void So5ActionPerformed(java.awt.event.ActionEvent evt) {
	        hoanDoi(So9, So1, So4, So6, So5);
	        winChua();
	    }

	    private void So3ActionPerformed(java.awt.event.ActionEvent evt) {
	        hoanDoi(So7, btnNull, So2, btnNull, So3);
	        winChua();
	    }//GEN-LAST:event_So3ActionPerformed

	    private void So2ActionPerformed(java.awt.event.ActionEvent evt) {
	        hoanDoi(So6, btnNull, So1, So3, So2);
	        winChua();
	    }//GEN-LAST:event_So2ActionPerformed

	    private void So1ActionPerformed(java.awt.event.ActionEvent evt) {
	        hoanDoi(So5, btnNull, space, So2, So1);
	        winChua();
	    }//GEN-LAST:event_So1ActionPerformed

	    private void spaceActionPerformed(java.awt.event.ActionEvent evt) {
	        hoanDoi(So4, btnNull, btnNull, So1, space);
	        winChua();
	    }
	public static void main (String []args)
	{
		new Bai_1();
		
	}
}