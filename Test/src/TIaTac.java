import java.awt.BasicStroke;
import java.awt.Component;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
 
public class TIaTac extends javax.swing.JFrame {
 
    private Graphics2D gr = null;
 
    private int currentSide = CROSS;
 
    private static final int CROSS = 0;
 
    private static final int ZERO = 1;
 
    private char[][] cells = new char[3][3];
 
    public TIaTac() {
        initComponents();
        clear();
    }
 
    @SuppressWarnings("unchecked")
    private void initComponents() {
 
        NewGameBtn = new javax.swing.JButton();
        Cell11 = new javax.swing.JPanel();
        Cell21 = new javax.swing.JPanel();
        Cell31 = new javax.swing.JPanel();
        Cell12 = new javax.swing.JPanel();
        Cell22 = new javax.swing.JPanel();
        Cell32 = new javax.swing.JPanel();
        Cell13 = new javax.swing.JPanel();
        Cell33 = new javax.swing.JPanel();
        Cell23 = new javax.swing.JPanel();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
        NewGameBtn.setText("Заново");
        NewGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameBtnActionPerformed(evt);
            }
        });
 
        Cell11.setBackground(new java.awt.Color(153, 153, 153));
        Cell11.setPreferredSize(new java.awt.Dimension(120, 120));
        Cell11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cell11MouseClicked(evt);
            }
        });
 
        javax.swing.GroupLayout Cell11Layout = new javax.swing.GroupLayout(Cell11);
        Cell11.setLayout(Cell11Layout);
        Cell11Layout.setHorizontalGroup(
            Cell11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        Cell11Layout.setVerticalGroup(
            Cell11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
 
        Cell21.setBackground(new java.awt.Color(153, 153, 153));
        Cell21.setPreferredSize(new java.awt.Dimension(120, 120));
        Cell21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cell21MouseClicked(evt);
            }
        });
 
        javax.swing.GroupLayout Cell21Layout = new javax.swing.GroupLayout(Cell21);
        Cell21.setLayout(Cell21Layout);
        Cell21Layout.setHorizontalGroup(
            Cell21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        Cell21Layout.setVerticalGroup(
            Cell21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
 
        Cell31.setBackground(new java.awt.Color(153, 153, 153));
        Cell31.setPreferredSize(new java.awt.Dimension(120, 120));
        Cell31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cell31MouseClicked(evt);
            }
        });
 
        javax.swing.GroupLayout Cell31Layout = new javax.swing.GroupLayout(Cell31);
        Cell31.setLayout(Cell31Layout);
        Cell31Layout.setHorizontalGroup(
            Cell31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        Cell31Layout.setVerticalGroup(
            Cell31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
 
        Cell12.setBackground(new java.awt.Color(153, 153, 153));
        Cell12.setPreferredSize(new java.awt.Dimension(120, 120));
        Cell12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cell12MouseClicked(evt);
            }
        });
 
        javax.swing.GroupLayout Cell12Layout = new javax.swing.GroupLayout(Cell12);
        Cell12.setLayout(Cell12Layout);
        Cell12Layout.setHorizontalGroup(
            Cell12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        Cell12Layout.setVerticalGroup(
            Cell12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
 
        Cell22.setBackground(new java.awt.Color(153, 153, 153));
        Cell22.setPreferredSize(new java.awt.Dimension(120, 120));
        Cell22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cell22MouseClicked(evt);
            }
        });
 
        javax.swing.GroupLayout Cell22Layout = new javax.swing.GroupLayout(Cell22);
        Cell22.setLayout(Cell22Layout);
        Cell22Layout.setHorizontalGroup(
            Cell22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        Cell22Layout.setVerticalGroup(
            Cell22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
 
        Cell32.setBackground(new java.awt.Color(153, 153, 153));
        Cell32.setPreferredSize(new java.awt.Dimension(120, 120));
        Cell32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cell32MouseClicked(evt);
            }
        });
 
        javax.swing.GroupLayout Cell32Layout = new javax.swing.GroupLayout(Cell32);
        Cell32.setLayout(Cell32Layout);
        Cell32Layout.setHorizontalGroup(
            Cell32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        Cell32Layout.setVerticalGroup(
            Cell32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
 
        Cell13.setBackground(new java.awt.Color(153, 153, 153));
        Cell13.setPreferredSize(new java.awt.Dimension(120, 120));
        Cell13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cell13MouseClicked(evt);
            }
        });
 
        javax.swing.GroupLayout Cell13Layout = new javax.swing.GroupLayout(Cell13);
        Cell13.setLayout(Cell13Layout);
        Cell13Layout.setHorizontalGroup(
            Cell13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        Cell13Layout.setVerticalGroup(
            Cell13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
 
        Cell33.setBackground(new java.awt.Color(153, 153, 153));
        Cell33.setPreferredSize(new java.awt.Dimension(120, 120));
        Cell33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cell33MouseClicked(evt);
            }
        });
 
        javax.swing.GroupLayout Cell33Layout = new javax.swing.GroupLayout(Cell33);
        Cell33.setLayout(Cell33Layout);
        Cell33Layout.setHorizontalGroup(
            Cell33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        Cell33Layout.setVerticalGroup(
            Cell33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
 
        Cell23.setBackground(new java.awt.Color(153, 153, 153));
        Cell23.setPreferredSize(new java.awt.Dimension(120, 120));
        Cell23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cell23MouseClicked(evt);
            }
        });
 
        javax.swing.GroupLayout Cell23Layout = new javax.swing.GroupLayout(Cell23);
        Cell23.setLayout(Cell23Layout);
        Cell23Layout.setHorizontalGroup(
            Cell23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        Cell23Layout.setVerticalGroup(
            Cell23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NewGameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cell11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cell21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cell31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cell12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cell22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cell32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cell13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cell23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cell33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cell11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cell21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cell31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cell12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cell22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cell32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cell13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cell23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cell33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NewGameBtn)
                .addContainerGap())
        );
 
        pack();
    }
 
    private void clear() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = 'e';
            }
        }
        for (Component c : this.getContentPane().getComponents()) {
            gr = (Graphics2D) c.getGraphics();
            gr.setColor(c.getBackground());
            gr.fillRect(0, 0, c.getWidth(), c.getHeight());
        }
        currentSide = CROSS;
    }
 
    private void sideSwitch() {
        if (currentSide == CROSS) {
            currentSide = ZERO;
        } else {
            currentSide = CROSS;
        }
    }
 
private void Cell11MouseClicked(java.awt.event.MouseEvent evt) {
    clickHandler((javax.swing.JPanel) evt.getSource(), new int[]{0, 0}, currentSide);
}
 
private void Cell12MouseClicked(java.awt.event.MouseEvent evt) {
    clickHandler((javax.swing.JPanel) evt.getSource(), new int[]{0, 1}, currentSide);
}
 
private void Cell13MouseClicked(java.awt.event.MouseEvent evt) {
    clickHandler((javax.swing.JPanel) evt.getSource(), new int[]{0, 2}, currentSide);
}
 
private void Cell21MouseClicked(java.awt.event.MouseEvent evt) {
    clickHandler((javax.swing.JPanel) evt.getSource(), new int[]{1, 0}, currentSide);
}
 
private void Cell22MouseClicked(java.awt.event.MouseEvent evt) {
    clickHandler((javax.swing.JPanel) evt.getSource(), new int[]{1, 1}, currentSide);
}
 
private void Cell23MouseClicked(java.awt.event.MouseEvent evt) {
    clickHandler((javax.swing.JPanel) evt.getSource(), new int[]{1, 2}, currentSide);
}
 
private void Cell31MouseClicked(java.awt.event.MouseEvent evt) {
    clickHandler((javax.swing.JPanel) evt.getSource(), new int[]{2, 0}, currentSide);
}
 
private void Cell32MouseClicked(java.awt.event.MouseEvent evt) {
    clickHandler((javax.swing.JPanel) evt.getSource(), new int[]{2, 1}, currentSide);
}
 
private void Cell33MouseClicked(java.awt.event.MouseEvent evt) {
    clickHandler((javax.swing.JPanel) evt.getSource(), new int[]{2, 2}, currentSide);
}
 
private void NewGameBtnActionPerformed(java.awt.event.ActionEvent evt) {
    clear();
}
 
    private void clickHandler(javax.swing.JPanel src, int[] loc, int side) {
        if (cells[loc[0]][loc[1]] != 'e') {
            return;
        }
        switch (currentSide) {
            case CROSS:
                cells[loc[0]][loc[1]] = 'x';
                break;
            case ZERO:
                cells[loc[0]][loc[1]] = 'o';
                break;
        }
        gr = (Graphics2D) src.getGraphics();
        gr.setStroke(new BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        switch (side) {
            case CROSS:
                gr.drawLine(20, 20, src.getWidth() - 20, src.getHeight() - 20);
                gr.drawLine(20, src.getHeight() - 20, src.getWidth() - 20, 20);
                break;
            case ZERO:
                gr.drawOval(20, 20, src.getWidth() - 40, src.getHeight() - 40);
                break;
        }
        check();
        sideSwitch();
    }
 
    private void check() {
        if ((cells[0][0] == 'x' && cells[0][1] == 'x' && cells[0][2] == 'x')
                || (cells[1][0] == 'x' && cells[1][1] == 'x' && cells[1][2] == 'x')
                || (cells[2][0] == 'x' && cells[2][1] == 'x' && cells[2][2] == 'x')
                || (cells[0][0] == 'x' && cells[1][0] == 'x' && cells[2][0] == 'x')
                || (cells[0][1] == 'x' && cells[1][1] == 'x' && cells[2][1] == 'x')
                || (cells[0][2] == 'x' && cells[1][2] == 'x' && cells[2][2] == 'x')
                || (cells[0][0] == 'x' && cells[1][1] == 'x' && cells[2][2] == 'x')
                || (cells[2][0] == 'x' && cells[1][1] == 'x' && cells[0][2] == 'x')) {
            JOptionPane.showMessageDialog(rootPane, "Выиграли крестики");
            clear();
        }
        if ((cells[0][0] == 'o' && cells[0][1] == 'o' && cells[0][2] == 'o')
                || (cells[1][0] == 'o' && cells[1][1] == 'o' && cells[1][2] == 'o')
                || (cells[2][0] == 'o' && cells[2][1] == 'o' && cells[2][2] == 'o')
                || (cells[0][0] == 'o' && cells[1][0] == 'o' && cells[2][0] == 'o')
                || (cells[0][1] == 'o' && cells[1][1] == 'o' && cells[2][1] == 'o')
                || (cells[0][2] == 'o' && cells[1][2] == 'o' && cells[2][2] == 'o')
                || (cells[0][0] == 'o' && cells[1][1] == 'o' && cells[2][2] == 'o')
                || (cells[2][0] == 'o' && cells[1][1] == 'o' && cells[0][2] == 'o')) {
            JOptionPane.showMessageDialog(rootPane, "Выиграли нолики");
            clear();
        }
    }
 
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TIaTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIaTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIaTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIaTac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
 
            public void run() {
                new TIaTac().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JPanel Cell11;
    private javax.swing.JPanel Cell12;
    private javax.swing.JPanel Cell13;
    private javax.swing.JPanel Cell21;
    private javax.swing.JPanel Cell22;
    private javax.swing.JPanel Cell23;
    private javax.swing.JPanel Cell31;
    private javax.swing.JPanel Cell32;
    private javax.swing.JPanel Cell33;
    private javax.swing.JButton NewGameBtn;
}