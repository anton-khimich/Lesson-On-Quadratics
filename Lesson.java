
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Anton
 *
 * This program uses JLayeredPane to create an effect of pages.
 *
 * This program uses HashMap in order to store multiple questions as String and
 * multiples answers as ArrayList, one of which is correct.
 *
 * Questions are randomly picked from the HashMap based on a randomly generated
 * number.
 *
 * Logic in selecting correct answer: The correct answer was placed at the
 * specific index in the ArrayList Then, the index value was appended to the
 * question string after the underscore Each index value in the ArrayList is
 * assigned to a RadioButton
 *
 */
public class Lesson extends javax.swing.JFrame {

    public static int pageNumber = 1;
    public static int correctQuestionIndex;
    public static int btnIndex=-1;//Set to an invalid index value

    public static HashMap<String, ArrayList> questionsHashMap = new HashMap<>();

    /**
     * Creates new form Lesson
     */
    public Lesson() {
        initComponents();
        initQuestions();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        page1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        page2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        page3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        btnGenerate = new javax.swing.JButton();
        btnA = new javax.swing.JRadioButton();
        btnB = new javax.swing.JRadioButton();
        btnC = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtQuiz = new javax.swing.JTextArea();
        btnCheckAnswer = new javax.swing.JButton();
        lblWrong = new javax.swing.JLabel();
        page4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jLayeredPane1.setBackground(new java.awt.Color(153, 204, 255));
        jLayeredPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jLayeredPane1.setForeground(new java.awt.Color(153, 204, 255));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(600, 600));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(600, 601));

        btnPrevious.setText("Previous");
        btnPrevious.setVisible(false);
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        page1.setMinimumSize(new java.awt.Dimension(500, 500));
        page1.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Factoring can be Fun Too!");

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to \"Factoring can be Fun Too!\" This lesson will attempt to teach you the basics of factoring quadratic equations. When factoring numbers or factoring polynomials, you are finding numbers or polynomials that divide out evenly from the original numbers or polynomials. But in the case of polynomials, you are dividing numbers and variables out of expressions, not just dividing numbers out of numbers.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("I will now show an example using the expression: 3x^2 + 12x\nNow we search for common factors. This is always the first step when factoring.\n3x is a common factor of both 3x and 12x and as such, our expression becomes:\n3x(x+4)\nNow the expression can no longer be factored, and our job is done! Easy, right?");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout page1Layout = new javax.swing.GroupLayout(page1);
        page1.setLayout(page1Layout);
        page1Layout.setHorizontalGroup(
            page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(page1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        page1Layout.setVerticalGroup(
            page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        page2.setMinimumSize(new java.awt.Dimension(500, 500));
        page2.setPreferredSize(new java.awt.Dimension(500, 500));
        page2.setVisible(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Actual Quadratic Equations");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("Now we can move on to actual quadratic expressions, on which this lesson is actually about.\nWhen given a quadratic, it normally has three terms: a, b, and c\nax^2 + bx + c\nIn this lesson, our \"a\" will always be 1, but it will be your job to find the factored equation from the values of \"b\" and \"c\". \nTo find the factored expression, we will use the method of factoring by grouping, which is the easiest, but however will not always work.\nThe basics of factoring by grouping are this:\nYou want to find 2 values which when multiplied together give you the \"c\" term in the expression, and when added, give you the \"b\" term.\nNow let's use the example of x^2 + 4x + 3\nWe know that the initial brackets of this equations consist of:\n(x + )(x + )\nTwo numbers that multiply to give 3 are 1 and 3.\n3 and 1 add up to 4 which is our middle or \"b\" term.\nOrdering does not matter because our \"a\" value is 1.\nOur final factored expression:\n(x + 3)(x + 1)");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setMinimumSize(new java.awt.Dimension(164, 436));
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout page2Layout = new javax.swing.GroupLayout(page2);
        page2.setLayout(page2Layout);
        page2Layout.setHorizontalGroup(
            page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(page2Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel4)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        page2Layout.setVerticalGroup(
            page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        page3.setMinimumSize(new java.awt.Dimension(500, 500));
        page3.setPreferredSize(new java.awt.Dimension(500, 500));
        page3.setRequestFocusEnabled(false);
        page3.setVisible(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Special Cases and Quiz");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("Now that you know how to factor, you must learn about sum of squares, and the difference of squares, which are special cases.\nA sum of squares will resemble this:\nx^2 + 4x + 4\nAnd its factored expression:\n(x + 2)(x + 2) or (x + 2)^2\nA difference of squares will resemble this:\nx^2 -4x +4\nAnd its factored expression:\n(x - 2)(x - 2) or (x - 2)^2\nAt this point, it is only important that you are able to recognise these special cases, as this will come in handy later on in Mathematics.\nNow you should be ready for the Quiz!");
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setMinimumSize(new java.awt.Dimension(164, 436));
        jScrollPane4.setViewportView(jTextArea4);

        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnA);
        btnA.setText("a)");
        btnA.setEnabled(false);
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnB);
        btnB.setText("b)");
        btnB.setEnabled(false);
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnC);
        btnC.setText("c)");
        btnC.setEnabled(false);
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtQuiz.setEditable(false);
        txtQuiz.setColumns(20);
        txtQuiz.setLineWrap(true);
        txtQuiz.setRows(5);
        txtQuiz.setToolTipText("");
        txtQuiz.setWrapStyleWord(true);
        jScrollPane6.setViewportView(txtQuiz);

        btnCheckAnswer.setText("Check Answer");
        btnCheckAnswer.setEnabled(false);
        btnCheckAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckAnswerActionPerformed(evt);
            }
        });

        lblWrong.setForeground(new java.awt.Color(255, 51, 51));
        lblWrong.setText("Wrong! Try again.");
        lblWrong.setVisible(false);

        javax.swing.GroupLayout page3Layout = new javax.swing.GroupLayout(page3);
        page3.setLayout(page3Layout);
        page3Layout.setHorizontalGroup(
            page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page3Layout.createSequentialGroup()
                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(page3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(page3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(page3Layout.createSequentialGroup()
                                        .addComponent(btnGenerate)
                                        .addGap(168, 168, 168)
                                        .addComponent(lblWrong))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 92, Short.MAX_VALUE))
                            .addComponent(jScrollPane4)))
                    .addGroup(page3Layout.createSequentialGroup()
                        .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(page3Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(btnA)
                                .addGap(51, 51, 51)
                                .addComponent(btnB)
                                .addGap(52, 52, 52)
                                .addComponent(btnC)
                                .addGap(48, 48, 48)
                                .addComponent(btnCheckAnswer))
                            .addGroup(page3Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        page3Layout.setVerticalGroup(
            page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerate)
                    .addComponent(lblWrong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(page3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnB)
                    .addComponent(btnC)
                    .addComponent(btnA)
                    .addComponent(btnCheckAnswer))
                .addGap(47, 47, 47))
        );

        page4.setMinimumSize(new java.awt.Dimension(500, 500));
        page4.setPreferredSize(new java.awt.Dimension(500, 500));
        page4.setVisible(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Congratulations!!!");

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setText("You have reached the end of the lesson and successfully completed the quiz. If you'd like to redo the quiz with another random question, close the program, and re-open it.\n\n\nThanks for using this program!");
        jTextArea5.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jTextArea5);

        javax.swing.GroupLayout page4Layout = new javax.swing.GroupLayout(page4);
        page4.setLayout(page4Layout);
        page4Layout.setHorizontalGroup(
            page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page4Layout.createSequentialGroup()
                .addGroup(page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(page4Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel10))
                    .addGroup(page4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        page4Layout.setVerticalGroup(
            page4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page4Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(page1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnPrevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext)
                .addGap(67, 67, 67))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(page2, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(page3, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(page4, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(page1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext))
                .addGap(24, 24, 24))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(page2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(182, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(page3, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 116, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(page4, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(206, Short.MAX_VALUE)))
        );
        jLayeredPane1.setLayer(btnPrevious, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnNext, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(page1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(page2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(page3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(page4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Moves pages forwards
     *
     * @param evt
     */
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        pageNumber++;
        setPanel();
    }//GEN-LAST:event_btnNextActionPerformed

    /**
     * Moves pages backwards
     *
     * @param evt
     */
    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        pageNumber--;
        setPanel();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        //Enable radio buttons
        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        //Enable Check Answer button
        btnCheckAnswer.setEnabled(true);
        //Resets radio button selection
        buttonGroup1.clearSelection();
        String randomQuestion = generateRandomQuestion();
        txtQuiz.setText(randomQuestion);
    }//GEN-LAST:event_btnGenerateActionPerformed

    /**
     * The variable btnIndex is compared to the correct answer If correct, move
     * to final page
     *
     * @param evt
     */
    private void btnCheckAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckAnswerActionPerformed
        if (btnIndex == correctQuestionIndex) {
            pageNumber++;
            //System.out.println("you're correct");
            setPanel();
        } else {
            lblWrong.setVisible(true);
        }
    }//GEN-LAST:event_btnCheckAnswerActionPerformed
    /**
     * The variable btnIndex is controlled by the radio button selection
     *
     * @param evt
     */
    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        btnIndex = 0;
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        btnIndex = 1;
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        btnIndex = 2;
    }//GEN-LAST:event_btnCActionPerformed

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
            java.util.logging.Logger.getLogger(Lesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lesson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnA;
    private javax.swing.JRadioButton btnB;
    private javax.swing.JRadioButton btnC;
    private javax.swing.JButton btnCheckAnswer;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JLabel lblWrong;
    private javax.swing.JPanel page1;
    private javax.swing.JPanel page2;
    private javax.swing.JPanel page3;
    private javax.swing.JPanel page4;
    private javax.swing.JTextArea txtQuiz;
    // End of variables declaration//GEN-END:variables

    /**
     * This method controls which panel within the GUI is visible; acts like a
     * page system.
     */
    private void setPanel() {
        // reset all panels to non visible
        page1.setVisible(false);
        page2.setVisible(false);
        page3.setVisible(false);
        page4.setVisible(false);
        btnNext.setVisible(false);
        btnPrevious.setVisible(false);

        switch (pageNumber) {
            case 1:
                page1.setVisible(true);
                btnNext.setVisible(true);
                break;
            case 2:
                page2.setVisible(true);
                btnNext.setVisible(true);
                btnPrevious.setVisible(true);
                break;
            case 3:
                page3.setVisible(true);
                btnPrevious.setVisible(true);
                break;
            default:
                page4.setVisible(true);
        }
    }

    /**
     * This method initializes quiz questions and answers
     */
    private void initQuestions() {
        ArrayList<String> listAnswers1 = new ArrayList();
        listAnswers1.add("(x + 5)(x + 6)");
        listAnswers1.add("(x + 3)(x + 2)");//Correct Answer
        listAnswers1.add("(x + 3)(x - 2)");
        String question1 = "x^2 + 5x + 6_1";

        ArrayList listAnswers2 = new ArrayList();
        listAnswers2.add("(x + 2)(x - 2)");//Correct Answer
        listAnswers2.add("(x + 4)(x - 1)");
        listAnswers2.add("(x - 2)(x - 2)");
        String question2 = "x^2 - 4_0";

        ArrayList listAnswers3 = new ArrayList();
        listAnswers3.add("(x - 2)(x - 2)");
        listAnswers3.add("(x + 1)(x - 2)");
        listAnswers3.add("(x - 1)(x - 2)");//Correct Answer
        String question3 = "x^2 - 3x + 2_2";

        ArrayList listAnswers4 = new ArrayList();
        listAnswers4.add("(x - 2)(x - 2)");
        listAnswers4.add("(x + 7)(x + 1)");//Correct Answer
        listAnswers4.add("(x - 1)(x - 2)");
        String question4 = "x^2 + 8x + 7_1";

        ArrayList listAnswers5 = new ArrayList();
        listAnswers5.add("(x - 3)(x - 3)");//Correct Answer
        listAnswers5.add("(x + 6)(x - 9)");
        listAnswers5.add("(x - 3)(x + 3)");
        String question5 = "x^2 - 6x + 9_0";
        //Place pairs of questions and answers into the HashMap
        questionsHashMap.put(question1, listAnswers1);
        questionsHashMap.put(question2, listAnswers2);
        questionsHashMap.put(question3, listAnswers3);
        questionsHashMap.put(question4, listAnswers4);
        questionsHashMap.put(question5, listAnswers5);
    }

    /**
     * This method decides which question is to be chosen and returns formatted
     * output.
     */
    private String generateRandomQuestion() {
        String strQuestion = "Factor: ";
        String keyQuestion = "";
        int maxIndex = questionsHashMap.size();
        //generate random integer from 1 to maxIndex
        int intRandomNumber = (int) (Math.random() * maxIndex);

        int counter = 0;
        for (String key : questionsHashMap.keySet()) {
            if (intRandomNumber == counter++) {
                keyQuestion = key;
                break;
            }
        }

        // split question apart from correct index
        // - '0' simple mapping of char to integer representation of char
        correctQuestionIndex = keyQuestion.charAt(keyQuestion.length() - 1) - '0';
        strQuestion += keyQuestion.substring(0, keyQuestion.length() - 2) + "\n";
        ArrayList<String> answers = questionsHashMap.get(keyQuestion);
        char choice = 'a';
        //Formats output
        for (String s : answers) {
            strQuestion += choice++ + ") " + s + "\n";
        }
        return strQuestion.trim();
    }
}
