/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class jFormularioDatos extends javax.swing.JFrame {

	/**
	 * Creates new form jFormularioDatos
	 */
	public jFormularioDatos() {
		initComponents();
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
        fieldCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldNif = new javax.swing.JTextField();
        fieldLetraNif = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldDomicilio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fieldCP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fieldLocalidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fieldTlfn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fieldMovil = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fieldFax = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fieldMail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fieldtotal = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prueba Entrada de Datos");
        setResizable(false);

        jLabel1.setText("Código");

        fieldCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldCodigoFocusLost(evt);
            }
        });
        fieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldCodigoKeyPressed(evt);
            }
        });

        jLabel2.setText("NIF");

        fieldNif.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fieldNifCaretUpdate(evt);
            }
        });
        fieldNif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldNifKeyPressed(evt);
            }
        });

        fieldLetraNif.setEditable(false);
        fieldLetraNif.setFocusable(false);

        jLabel3.setText("Nombre");

        fieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldNombreKeyPressed(evt);
            }
        });

        jLabel4.setText("Apellidos");

        fieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldApellidoKeyPressed(evt);
            }
        });

        jLabel5.setText("Domicilio");

        fieldDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldDomicilioKeyPressed(evt);
            }
        });

        jLabel6.setText("C.P.");

        fieldCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldCPKeyPressed(evt);
            }
        });

        jLabel7.setText("Localidad");

        fieldLocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldLocalidadKeyPressed(evt);
            }
        });

        jLabel8.setText("Telefono");

        fieldTlfn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldTlfnKeyPressed(evt);
            }
        });

        jLabel9.setText("Móvil");

        fieldMovil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldMovilKeyPressed(evt);
            }
        });

        jLabel10.setText("Fax");

        fieldFax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldFaxKeyPressed(evt);
            }
        });

        jLabel11.setText("e-mail");

        fieldMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldMailKeyPressed(evt);
            }
        });

        jLabel12.setText("Total");

        fieldtotal.setEditable(false);
        fieldtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fieldtotal.setText("0");

        btnAceptar.setMnemonic('A');
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setMnemonic('C');
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(fieldCodigo))
                                .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(fieldDomicilio))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel1)
                            .addGap(62, 62, 62)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(111, 111, 111)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fieldNif, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fieldLetraNif, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                        .addComponent(fieldCP))
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fieldLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fieldMail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fieldTlfn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fieldMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(fieldFax, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(60, 60, 60)
                                .addComponent(fieldtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldLetraNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldTlfn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
		int validacion = jFormController.validacion(jFormController.CODIGO, fieldCodigo.getText());
		if (validacion == jFormController.NO_ERROR) {
			validacion = jFormController.validacion(jFormController.NIF, fieldNif.getText());
			if (validacion == jFormController.NO_ERROR) {
				validacion = jFormController.validacion(jFormController.NOMBRE, fieldNombre.getText());
				if (validacion == jFormController.NO_ERROR) {
					validacion = jFormController.validacion(jFormController.APELLIDO, fieldApellido.getText());
					if (validacion == jFormController.NO_ERROR) {
						validacioncont();
					} else {
						errorCode = validacion == jFormController.CONTENT_ERROR
								? ERROR_IN_APELLIDOS
								: ERROR_IN_APELLIDOS_LONG;
						warningPane(WARNING_TITLES[errorCode], WARNING_MESSAGES[errorCode]);
						fieldApellido.grabFocus();
					}
				} else {
					errorCode = validacion == jFormController.CONTENT_ERROR
							? ERROR_IN_NOMBRE
							: ERROR_IN_NAME_LONG;
					warningPane(WARNING_TITLES[errorCode], WARNING_MESSAGES[errorCode]);
					fieldNombre.grabFocus();
				}
			} else {
				errorCode = validacion == jFormController.CONTENT_ERROR
						? ERROR_IN_NIF
						: ERROR_IN_NIF_LONG;
				warningPane(WARNING_TITLES[errorCode], WARNING_MESSAGES[errorCode]);
				fieldNif.grabFocus();
			}
		} else {
			errorCode = validacion == jFormController.CONTENT_ERROR
					? ERROR_IN_COD
					: ERROR_IN_COD_LONG;
			warningPane(WARNING_TITLES[errorCode], WARNING_MESSAGES[errorCode]);
			fieldCodigo.grabFocus();
		}
    }//GEN-LAST:event_btnAceptarActionPerformed

	private void validacioncont() {
		int validacion = jFormController.validacion(jFormController.CP, fieldCP.getText());
		if (validacion == jFormController.NO_ERROR) {
			validacion = jFormController.validacion(jFormController.LOCALIDAD, fieldLocalidad.getText());
			if (validacion == jFormController.NO_ERROR) {
				validacion = jFormController.validacion(jFormController.TELEFONO, fieldTlfn.getText());
				if (validacion == jFormController.NO_ERROR) {
					validacion = jFormController.validacion(jFormController.MOVIL, fieldMovil.getText());
					if (validacion == jFormController.NO_ERROR) {
						validacionCont2();
					} else {
						errorCode = validacion == jFormController.CONTENT_ERROR
								? ERROR_IN_MOVIL
								: ERROR_IN_MOVIL_LONG;
						warningPane(WARNING_TITLES[errorCode], WARNING_MESSAGES[errorCode]);
						fieldMovil.grabFocus();
					}
				} else {
					errorCode = validacion == jFormController.CONTENT_ERROR
							? ERROR_IN_TLFN
							: ERROR_IN_TLFN_LONG;
					warningPane(WARNING_TITLES[errorCode], WARNING_MESSAGES[errorCode]);
					fieldTlfn.grabFocus();
				}
			} else {
				errorCode = validacion == jFormController.CONTENT_ERROR
						? ERROR_IN_LOCALIDAD
						: ERROR_IN_LOCALIDAD_LONG;
				warningPane(WARNING_TITLES[errorCode], WARNING_MESSAGES[errorCode]);
				fieldLocalidad.grabFocus();
			}
		} else {
			errorCode = validacion == jFormController.CONTENT_ERROR
					? ERROR_IN_CP
					: ERROR_IN_CP_LONG;
			warningPane(WARNING_TITLES[errorCode], WARNING_MESSAGES[errorCode]);
			fieldCP.grabFocus();
		}
	}

	private void validacionCont2() {
		int validacion = jFormController.validacion(jFormController.FAX, fieldFax.getText());
		if (validacion == jFormController.NO_ERROR) {
			errorCode = NO_ERROR;
			JOptionPane.showMessageDialog(this, "Datos correctos", "Todos los datos introducidos son correctos", JOptionPane.YES_NO_CANCEL_OPTION);
			resetFields();
			fieldCodigo.grabFocus();
		} else {
			errorCode = validacion == jFormController.CONTENT_ERROR
					? ERROR_IN_FAX
					: ERROR_IN_FAX_LONG;
			warningPane(WARNING_TITLES[errorCode], WARNING_MESSAGES[errorCode]);
			fieldFax.grabFocus();
		}
	}


    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
		resetFields();
		errorCode = NO_ERROR;
		fieldCodigo.grabFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void fieldNifCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fieldNifCaretUpdate
		if (jFormController.validacion(jFormController.NIF, fieldNif.getText()) == jFormController.NO_ERROR) {
			fieldLetraNif.setText(jFormController.letraNif(fieldNif.getText()));
		} else {
			fieldLetraNif.setText(null);
		}
    }//GEN-LAST:event_fieldNifCaretUpdate

    private void fieldCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCodigoKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			fieldNif.grabFocus();
		}
    }//GEN-LAST:event_fieldCodigoKeyPressed

    private void fieldNifKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNifKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			fieldNombre.grabFocus();
		}
    }//GEN-LAST:event_fieldNifKeyPressed

    private void fieldNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNombreKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			fieldApellido.grabFocus();
		}
    }//GEN-LAST:event_fieldNombreKeyPressed

    private void fieldApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldApellidoKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			fieldDomicilio.grabFocus();
		}
    }//GEN-LAST:event_fieldApellidoKeyPressed

    private void fieldDomicilioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldDomicilioKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			fieldCP.grabFocus();
		}
    }//GEN-LAST:event_fieldDomicilioKeyPressed

    private void fieldCPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCPKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			fieldLocalidad.grabFocus();
		}
    }//GEN-LAST:event_fieldCPKeyPressed

    private void fieldLocalidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldLocalidadKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			fieldTlfn.grabFocus();
		}
    }//GEN-LAST:event_fieldLocalidadKeyPressed

    private void fieldTlfnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTlfnKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			fieldMovil.grabFocus();
		}
    }//GEN-LAST:event_fieldTlfnKeyPressed

    private void fieldMovilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldMovilKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			fieldFax.grabFocus();
		}
    }//GEN-LAST:event_fieldMovilKeyPressed

    private void fieldFaxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldFaxKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			fieldMail.grabFocus();
		}
    }//GEN-LAST:event_fieldFaxKeyPressed

    private void fieldMailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldMailKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			btnAceptar.grabFocus();
		}
    }//GEN-LAST:event_fieldMailKeyPressed

    private void fieldCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCodigoFocusLost
		String show = "";
		for (int i = 0; i < 6 - fieldCodigo.getText().length(); i++) {
			show += "0";
		}
		show += fieldCodigo.getText();
		fieldCodigo.setText(show);
    }//GEN-LAST:event_fieldCodigoFocusLost

	private void resetFields() {
		fieldApellido.setText(null);
		fieldCP.setText(null);
		fieldCodigo.setText(null);
		fieldDomicilio.setText(null);
		fieldFax.setText(null);
		fieldLetraNif.setText(null);
		fieldLocalidad.setText(null);
		fieldMail.setText(null);
		fieldMovil.setText(null);
		fieldNif.setText(null);
		fieldTlfn.setText(null);
		fieldNombre.setText(null);
	}

	private void warningPane(String title, String content) {
		JOptionPane.showMessageDialog(this, content, title, JOptionPane.YES_NO_CANCEL_OPTION);
	}

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
				if ("Darcula".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(jFormularioDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(jFormularioDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(jFormularioDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(jFormularioDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		try {
			javax.swing.UIManager.setLookAndFeel("com.bulenkov.darcula.DarculaLaf");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new jFormularioDatos().setVisible(true);
			}
		});
	}

	//control variable
	private static int errorCode = 0;

	// Constant declaration
	private static final int NO_ERROR = 0;
	private static final int ERROR_IN_COD = 1;
	private static final int ERROR_IN_NIF = 2;
	private static final int ERROR_IN_NOMBRE = 3;
	private static final int ERROR_IN_APELLIDOS = 4;
	private static final int ERROR_IN_CP = 5;
	private static final int ERROR_IN_LOCALIDAD = 6;
	private static final int ERROR_IN_TLFN = 7;
	private static final int ERROR_IN_MOVIL = 8;
	private static final int ERROR_IN_FAX = 9;
	private static final int ERROR_IN_EMAIL = 10; //Used for consistent ID purposes. Unused
	private static final int ERROR_IN_COD_LONG = 11;
	private static final int ERROR_IN_NIF_LONG = 12;
	private static final int ERROR_IN_NAME_LONG = 13;
	private static final int ERROR_IN_APELLIDOS_LONG = 14;
	private static final int ERROR_IN_CP_LONG = 15;
	private static final int ERROR_IN_LOCALIDAD_LONG = 16;
	private static final int ERROR_IN_TLFN_LONG = 17;
	private static final int ERROR_IN_MOVIL_LONG = 18;
	private static final int ERROR_IN_FAX_LONG = 19;

	private static final String[] WARNING_TITLES = {"No hay Error",
		"Error en Codigo",
		"Error en NIF",
		"Error en Nombre",
		"Error en Apellidos",
		"Error en Código Postal",
		"Error en Localidad",
		"Error en Teléfono",
		"Error en Móvil",
		"Error en Fax",
		"Error en Email",
		"Error en Codigo",
		"Error en NIF",
		"Error en Nombre",
		"Error en Apellidos",
		"Error en Código Postal",
		"Error en Localidad",
		"Error en Teléfono",
		"Error en Móvil",
		"Error en Fax",
		"Error en Email"};

	private static final String[] WARNING_MESSAGES = {"WARNING: No hay error",
		"WARNING: \"Longitud de Código: entre 1 y 6\"",
		"WARNING: \"Introduzca solo números en el campo NIF\"",
		"WARNING: \"Introduzca un nombre válido en el campo NOMBRE\"",
		"WARNING: \"Introduzca un apellido válido en el campo APELLIDO\"",
		"WARNING: \"Introduzca solo números en el campo CP\"",
		"WARNING: \"Introduzca un nombre de localidad válido en el campo LOCALIDAD\"",
		"WARNING: \"Introduzca un número de teléfono válido en el campo TELÉFONO\"",
		"WARNING: \"Introduzca un número de teléfono válido en el campo MÓVIL\"",
		"WARNING: \"Introduzca un número de teléfono válido en el campo FAX\"",
		"WARNING: \"Introduzca un email válido en el campo EMAIL\"", //Added for consistent ID purposes. Unused
		"WARNING: \"Longitud de Código: entre 1 y 6\"",
		"WARNING: \"El NIF requiere de al menos 1 carácter\"",
		"WARNING: \"Longitud máxima de Nombre: %d\"",//Used for consistent ID purposes. Unused
		"WARNING: \"Longitud máxima de Apellido: %d\"",
		"WARNING: \"Longitud de CP: 5\"",
		"WARNING: \"Longitud de Localidad: %d\"",
		"WARNING: \"Longitud de Teléfono: 9 Campo: TELÉFONO\"",
		"WARNING: \"Longitud de Teléfono: 9 Campo: MÓVIL\"",
		"WARNING: \"Longitud de Teléfono: 9 Campo: FAX\""};

    //"WARNING: \"\"" <- Basic Warning prompt

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField fieldApellido;
    private javax.swing.JTextField fieldCP;
    private javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fieldDomicilio;
    private javax.swing.JTextField fieldFax;
    private javax.swing.JTextField fieldLetraNif;
    private javax.swing.JTextField fieldLocalidad;
    private javax.swing.JTextField fieldMail;
    private javax.swing.JTextField fieldMovil;
    private javax.swing.JTextField fieldNif;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldTlfn;
    private javax.swing.JTextField fieldtotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}