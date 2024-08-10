
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MyPanel extends JPanel {
    Line l[] = new Line[53];
    Circle c[] = new Circle[36];
    HashMap<String, Line> Id = new HashMap<>();

    public MyPanel() {

        // circles
        c[0] = new Circle(new Point(270, 75));
        c[1] = new Circle(new Point(150, 220));
        c[2] = new Circle(new Point(130, 310));
        c[3] = new Circle(new Point(50, 350));
        c[4] = new Circle(new Point(100, 445));
        c[5] = new Circle(new Point(240, 550));
        c[6] = new Circle(new Point(460, 615));
        c[7] = new Circle(new Point(500, 625));
        c[8] = new Circle(new Point(635, 700));
        c[9] = new Circle(new Point(740, 750));
        c[10] = new Circle(new Point(800, 800));
        c[11] = new Circle(new Point(840, 740));
        c[12] = new Circle(new Point(830, 655));
        c[13] = new Circle(new Point(840, 590));
        c[14] = new Circle(new Point(790, 530));
        c[15] = new Circle(new Point(810, 315));
        c[16] = new Circle(new Point(830, 240));
        c[17] = new Circle(new Point(840, 190));
        c[18] = new Circle(new Point(750, 200));
        c[19] = new Circle(new Point(640, 160));
        c[20] = new Circle(new Point(540, 150));
        c[21] = new Circle(new Point(450, 125));
        c[22] = new Circle(new Point(300, 240));
        c[23] = new Circle(new Point(360, 200));
        c[24] = new Circle(new Point(400, 230));
        c[25] = new Circle(new Point(470, 300));
        c[26] = new Circle(new Point(640, 270));
        c[27] = new Circle(new Point(660, 350));
        c[28] = new Circle(new Point(770, 325));
        c[29] = new Circle(new Point(630, 400));
        c[30] = new Circle(new Point(530, 450));
        c[31] = new Circle(new Point(480, 390));
        c[32] = new Circle(new Point(340, 355));
        c[33] = new Circle(new Point(250, 320));
        c[34] = new Circle(new Point(350, 470));
        c[35] = new Circle(new Point(480, 510));

        // circle 0
        l[0] = new Line(c[0].getPoint(), c[1].getPoint());
        l[1] = new Line(c[0].getPoint(), c[21].getPoint());
        l[2] = new Line(c[0].getPoint(), c[23].getPoint());
        // circle 1
        l[3] = new Line(c[1].getPoint(), c[2].getPoint());
        // circle 2
        l[4] = new Line(c[2].getPoint(), c[33].getPoint());
        l[5] = new Line(c[2].getPoint(), c[3].getPoint());
        // circle 3
        l[6] = new Line(c[3].getPoint(), c[4].getPoint());
        // circle 4
        l[7] = new Line(c[4].getPoint(), c[5].getPoint());
        // circle 5
        l[8] = new Line(c[5].getPoint(), c[34].getPoint());
        l[9] = new Line(c[5].getPoint(), c[6].getPoint());
        // circle 6
        l[10] = new Line(c[6].getPoint(), c[35].getPoint());
        l[11] = new Line(c[6].getPoint(), c[7].getPoint());
        // circle 7
        l[12] = new Line(c[7].getPoint(), c[8].getPoint());
        // circle 8
        l[13] = new Line(c[8].getPoint(), c[9].getPoint());
        l[14] = new Line(c[8].getPoint(), c[35].getPoint());
        // circle 9
        l[15] = new Line(c[9].getPoint(), c[10].getPoint());
        l[16] = new Line(c[9].getPoint(), c[12].getPoint());
        // circle 10
        l[17] = new Line(c[10].getPoint(), c[11].getPoint());
        // circle 11
        l[18] = new Line(c[11].getPoint(), c[12].getPoint());
        // circle 12
        l[19] = new Line(c[12].getPoint(), c[13].getPoint());
        // circle 13
        l[20] = new Line(c[13].getPoint(), c[14].getPoint());
        // circle 14
        l[21] = new Line(c[14].getPoint(), c[29].getPoint());
        l[22] = new Line(c[14].getPoint(), c[15].getPoint());
        // circle 15
        l[23] = new Line(c[15].getPoint(), c[28].getPoint());
        l[24] = new Line(c[15].getPoint(), c[16].getPoint());
        // circle 16
        l[25] = new Line(c[16].getPoint(), c[17].getPoint());
        // circle 17
        l[26] = new Line(c[17].getPoint(), c[18].getPoint());
        // circle 18
        l[27] = new Line(c[18].getPoint(), c[26].getPoint());
        l[28] = new Line(c[18].getPoint(), c[19].getPoint());
        // circle 19
        l[29] = new Line(c[19].getPoint(), c[26].getPoint());
        l[30] = new Line(c[19].getPoint(), c[20].getPoint());
        // circle 20
        l[31] = new Line(c[20].getPoint(), c[25].getPoint());
        l[32] = new Line(c[20].getPoint(), c[21].getPoint());
        // circle 21
        l[33] = new Line(c[21].getPoint(), c[23].getPoint());
        l[34] = new Line(c[21].getPoint(), c[24].getPoint());
        // circle 22
        l[35] = new Line(c[22].getPoint(), c[23].getPoint());
        l[36] = new Line(c[22].getPoint(), c[33].getPoint());
        // circle 23
        l[37] = new Line(c[23].getPoint(), c[24].getPoint());
        // circle 24
        l[38] = new Line(c[24].getPoint(), c[32].getPoint());
        l[39] = new Line(c[24].getPoint(), c[25].getPoint());
        // circle 25
        l[40] = new Line(c[25].getPoint(), c[26].getPoint());
        l[41] = new Line(c[25].getPoint(), c[29].getPoint());
        l[42] = new Line(c[25].getPoint(), c[31].getPoint());
        // circle 26
        l[43] = new Line(c[26].getPoint(), c[27].getPoint());
        // circle 27
        l[44] = new Line(c[27].getPoint(), c[29].getPoint());
        // circle 28
        l[45] = new Line(c[28].getPoint(), c[27].getPoint());
        // circle 29
        l[46] = new Line(c[29].getPoint(), c[30].getPoint());
        // circle 30
        l[47] = new Line(c[30].getPoint(), c[31].getPoint());
        l[48] = new Line(c[30].getPoint(), c[35].getPoint());
        // circle 31
        l[49] = new Line(c[31].getPoint(), c[32].getPoint());
        // circle 32
        l[50] = new Line(c[32].getPoint(), c[34].getPoint());
        // circle 33
        l[51] = new Line(c[33].getPoint(), c[32].getPoint());
        // circle 34
        l[52] = new Line(c[34].getPoint(), c[35].getPoint());

        // hashmap loader
        Id.put("0_1", l[0]);
        Id.put("0_21", l[1]);
        Id.put("0_23", l[2]);
        Id.put("1_2", l[3]);
        Id.put("2_33", l[4]);
        Id.put("2_3", l[5]);
        Id.put("3_4", l[6]);
        Id.put("4_5", l[7]);
        Id.put("5_34", l[8]);
        Id.put("5_6", l[9]);
        Id.put("6_35", l[10]);
        Id.put("6_7", l[11]);
        Id.put("7_8", l[12]);
        Id.put("8_9", l[13]);
        Id.put("8_35", l[14]);
        Id.put("9_10", l[15]);
        Id.put("9_12", l[16]);
        Id.put("10_11", l[17]);
        Id.put("11_12", l[18]);
        Id.put("12_13", l[19]);
        Id.put("13_14", l[20]);
        Id.put("14_29", l[21]);
        Id.put("14_15", l[22]);
        Id.put("15_28", l[23]);
        Id.put("15_16", l[24]);
        Id.put("16_17", l[25]);
        Id.put("17_18", l[26]);
        Id.put("18_26", l[27]);
        Id.put("18_19", l[28]);
        Id.put("19_26", l[29]);
        Id.put("19_20", l[30]);
        Id.put("20_25", l[31]);
        Id.put("20_21", l[32]);
        Id.put("21_23", l[33]);
        Id.put("21_24", l[34]);
        Id.put("22_23", l[35]);
        Id.put("22_33", l[36]);
        Id.put("23_24", l[37]);
        Id.put("24_32", l[38]);
        Id.put("24_25", l[39]);
        Id.put("25_26", l[40]);
        Id.put("25_29", l[41]);
        Id.put("25_31", l[42]);
        Id.put("26_27", l[43]);
        Id.put("27_29", l[44]);
        Id.put("28_27", l[45]);
        Id.put("29_30", l[46]);
        Id.put("30_31", l[47]);
        Id.put("30_35", l[48]);
        Id.put("31_32", l[49]);
        Id.put("32_34", l[50]);
        Id.put("33_32", l[51]);
        Id.put("34_35", l[52]);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 36; i++) {
            if (c[i] != null)
                c[i].draw(g);
        }
        for (int i = 0; i < 53; i++) {
            if (l[i] != null)
                l[i].draw(g);
        }

    }

}

public class GUI extends JFrame {
    static GUI gui;

    class Edge {
        int src, dest;
        double weight;

        Edge(int dest, double weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    JButton reload;
    MyPanel myPanel;
    int x, scnt;
    int count = 0;
    double totalDist = 0;
    JLabel totalSum;
    ArrayList<Edge> graph[];
    int currSrc;
    int fixCount;
    KDtree ktree;
    double KDInput[][];
    String[] location = new String[36];
    boolean[] present;
    double[][] points = { { 78.127508, 14.632747 }, { 78.088203, 14.594480 }, { 78.078988, 14.577559 },
            { 78.052451, 14.562302 }, { 78.073979, 14.538324 }, { 78.107872, 14.505532 }, { 78.156607, 14.467071 },
            { 78.160930, 14.462299 }, { 78.205766, 14.433034 }, { 78.215026, 14.426837 }, { 78.226541, 14.422548 },
            { 78.231787, 14.428498 }, { 78.231485, 14.437057 }, { 78.233492, 14.449304 }, { 78.227840, 14.469641 },
            { 78.264074, 14.539821 }, { 78.281567, 14.573476 }, { 78.289679, 14.580479 }, { 78.275789, 14.578558 },
            { 78.222207, 14.600408 }, { 78.198670, 14.610557 }, { 78.164556, 14.618996 }, { 78.127846, 14.583435 },
            { 78.142321, 14.605527 }, { 78.153540, 14.595753 }, { 78.174730, 14.572562 }, { 78.219814, 14.568455 },
            { 78.202794, 14.542829 }, { 78.243196, 14.541860 }, { 78.197591, 14.537529 }, { 78.165749, 14.529281 },
            { 78.160883, 14.544139 }, { 78.137102, 14.552610 }, { 78.113047, 14.569479 }, { 78.134111, 14.526995 },
            { 78.162413, 14.484985 } };

    void initialize() {
        location[0] = "00 Simhadri Puram";
        location[1] = "01 Gurijala";
        location[2] = "02 Bindinani Cherla";
        location[3] = "03 Velidandla";
        location[4] = "04 Karnapapaya palle";
        location[5] = "05 Government ITI collage";
        location[6] = "06 Pulivendula-parnapalle Rd";
        location[7] = "07 Chinna kudala Sub Station";
        location[8] = "08 Chinna Ranga Puram";
        location[9] = "09 Parnapalli Circle";
        location[10] = "10 Pulivendula";
        location[11] = "11 Gandhi Circle pulivendula";
        location[12] = "12 Muddanur Circle";
        location[13] = "13 JNTU Collage of Engineering";
        location[14] = "14 Ragalapuram";
        location[15] = "15 Inagalur";
        location[16] = "16 Thondur";
        location[17] = "17 SH 60 Thondur";
        location[18] = "18 Thondur Simhadripuram";
        location[19] = "19 Lomada";
        location[20] = "20 Duddukunta";
        location[21] = "21 Kasanuru";
        location[22] = "22 Himakuntala";
        location[23] = "23 Kastuba Gandhi girls hostel";
        location[24] = "24 Agraharam";
        location[25] = "25 Ankalamma guduru";
        location[26] = "26 Koragunta palle";
        location[27] = "27 Jagan Reddy Balapanuru AP";
        location[28] = "28 Tummala palle";
        location[29] = "29 Balappanuru";
        location[30] = "30 Ramapuram";
        location[31] = "31 Kamasamudram";
        location[32] = "32 Ankevari palli";
        location[33] = "33 Challe palle";
        location[34] = "34 Borala";
        location[35] = "35 Pedda Kundala";
    }

    GUI() {
        initialize();
        createFixGraph();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myPanel = new MyPanel();
        myPanel.setLayout(null);
        this.add(myPanel);
        this.setTitle("K-D Tree Approach");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        JPanel inputPanel = new JPanel();
        myPanel.add(inputPanel);
        Color c = Color.decode("#CCDAED");
        myPanel.setBackground(c);
        inputPanel.setBounds(1000, 0, 536, 1000);
        c = Color.decode("#00B9B2");
        inputPanel.setBackground(c);
        inputPanel.setLayout(null);

        // Labels
        JLabel locLabels[] = new JLabel[36];
        for (int i = 0; i < 36; i++) {
            String temp = "";
            if (i < 10)
                temp = "0" + i;
            else
                temp = "" + i;
            locLabels[i] = new JLabel(temp);
            Point p = myPanel.c[i].getPoint();
            myPanel.add(locLabels[i]);
            locLabels[i].setBounds((int) (p.getX()) + 5, (int) (p.getY()) + 5, 20, 20);
        }

        JButton btn = new JButton("start");

        JLabel srcName = new JLabel("");
        JLabel cntLabel = new JLabel("");
        JLabel delLabel = new JLabel("");
        JLabel text = new JLabel("Enter the current Location:");
        inputPanel.add(text);

        text.setBounds(10, 10, 536, 50);
        text.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        String[] items = new String[36];
        for (int i = 0; i < 36; i++) {
            items[i] = location[i];
        }
        present = new boolean[36];
        JComboBox<String> dropdown = new JComboBox<>(items);
        dropdown.addKeyListener(new KeyAdapter() {
            boolean srcSelected = false;
            int count;
            JLabel destLabels[];

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    String selectedItem = (String) dropdown.getSelectedItem();
                    Integer n = (selectedItem.charAt(0) - '0') * 10 + (selectedItem.charAt(1) - '0');
                    present[n] = true;
                    if (!srcSelected) {
                        myPanel.c[n].color = Color.ORANGE;
                        String userInput = null;
                        while (true) {
                            userInput = JOptionPane.showInputDialog(null, "Enter the count of delivery locations:");
                            if (userInput != null) {
                                try {
                                    count = Integer.parseInt(userInput);
                                    if (count <= 0 || count >= 36)
                                        throw new Exception();
                                    break;
                                } catch (Exception s) {
                                    continue;
                                }
                            }
                        }
                        fixCount = count;
                        srcSelected = true;
                        currSrc = n;
                        text.setText("Enter the Delivery locations:");
                        destLabels = new JLabel[fixCount];

                    } else {
                        myPanel.c[n].color = Color.RED;
                        count--;
                        destLabels[count] = new JLabel((count + 1) + ") " + selectedItem);
                        destLabels[count].setVisible(false);
                        inputPanel.add(destLabels[count]);
                        destLabels[count].setBounds(5, 240 + 50 * (count + 1), 530, 50);
                        destLabels[count].setFont(new Font("Times New Roman", Font.PLAIN, 22));

                        if (count == 0) {
                            dropdown.setEnabled(false);
                            JOptionPane.showMessageDialog(null, "Locations entered successfully");
                            srcName.setText("Start location:  " + location[currSrc]);
                            srcName.setVisible(true);

                            cntLabel.setText("Total locations: " + fixCount);
                            cntLabel.setVisible(true);

                            delLabel.setText("Delivery Locations:");
                            delLabel.setVisible(true);

                            for (int i = 0; i < fixCount; i++) {
                                destLabels[i].setVisible(true);
                            }
                            btn.setVisible(true);

                        }
                    }
                    dropdown.removeAllItems();
                    for (int i = 0; i < present.length; i++) {
                        if (!present[i]) {
                            dropdown.addItem(location[i]);
                        }
                    }
                    myPanel.repaint();
                }
            }
        });
        inputPanel.add(dropdown);
        dropdown.setBounds(5, 70, 530, 50);
        dropdown.setFont(new Font("Times New Roman", Font.PLAIN, 22));

        srcName.setVisible(false);
        inputPanel.add(srcName);
        srcName.setBounds(5, 140, 530, 50);
        srcName.setFont(new Font("Times New Roman", Font.PLAIN, 23));

        cntLabel.setVisible(false);
        inputPanel.add(cntLabel);
        cntLabel.setBounds(5, 190, 530, 50);
        cntLabel.setFont(new Font("Times New Roman", Font.PLAIN, 23));

        delLabel.setVisible(false);
        inputPanel.add(delLabel);
        delLabel.setBounds(5, 240, 530, 50);
        delLabel.setFont(new Font("Times New Roman", Font.PLAIN, 23));

        btn.setVisible(false);
        inputPanel.add(btn);
        btn.setBounds(125, 825, 300, 50);
        btn.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        reload = new JButton("Reload");
        reload.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        // reload.setVisible(false);
        inputPanel.add(reload);
        reload.setBounds(125, 750, 300, 50);
        reload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gui.setVisible(false);
                gui = new GUI();
            }

        });
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // preparing points for kdtree
                KDInput = new double[fixCount][2];
                int j = 0;
                for (int i = 0; i < 36; i++) {
                    if (present[i] && i != currSrc) {
                        KDInput[j][0] = points[i][0];
                        KDInput[j][1] = points[i][1];
                        j++;
                    }
                }
                ktree = new KDtree();
                ktree.buildTree(KDInput);
                double[] target = new double[2];
                target[0] = points[currSrc][0];
                target[1] = points[currSrc][1];
                node clp = ktree.nearestNeighbour(ktree.root, target, 0);
                double[] found = clp.data;
                // finding index
                int i = 0;
                for (i = 0; i < 36; i++) {
                    if (found[0] == points[i][0] && found[1] == points[i][1])
                        break;
                }

                inputPanel.remove(btn);
                inputPanel.revalidate();
                scnt = fixCount;
                myPanel.c[currSrc].color = Color.ORANGE;
                inputPanel.revalidate();
                myPanel.repaint();
                shortestPath(currSrc, i, myPanel);
                totalSum.setVisible(true);
            }
        });
        totalSum = new JLabel("Total Distance: ");
        totalSum.setVisible(false);
        inputPanel.add(totalSum);
        totalSum.setBounds(125, 825, 350, 50);
        totalSum.setFont(new Font("Times New Roman", Font.PLAIN, 25));
    }

    public void createFixGraph() {
        graph = new ArrayList[36];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // for 0
        graph[0].add(new Edge(1, 6.3));
        graph[0].add(new Edge(21, 4.7));
        graph[0].add(new Edge(23, 3.6));

        // for 1
        graph[1].add(new Edge(0, 6.3));
        graph[1].add(new Edge(2, 2.2));

        // for 2
        graph[2].add(new Edge(33, 4.3));
        graph[2].add(new Edge(3, 3.5));
        graph[2].add(new Edge(1, 2.2));

        // for 3
        graph[3].add(new Edge(2, 3.5));
        graph[3].add(new Edge(4, 3.5));

        // for 4
        graph[4].add(new Edge(3, 3.5));
        graph[4].add(new Edge(5, 5.4));

        // for 5
        graph[5].add(new Edge(4, 5.4));
        graph[5].add(new Edge(34, 4.1));
        graph[5].add(new Edge(6, 6.8));

        // for 6
        graph[6].add(new Edge(5, 6.8));
        graph[6].add(new Edge(35, 2.2));
        graph[6].add(new Edge(7, 0.75));

        // for 7
        graph[7].add(new Edge(6, 0.75));
        graph[7].add(new Edge(8, 5.9));

        // for 8
        graph[8].add(new Edge(7, 5.9));
        graph[8].add(new Edge(9, 1.2));
        graph[8].add(new Edge(35, 8.4));

        // for 9
        graph[9].add(new Edge(8, 1.2));
        graph[9].add(new Edge(10, 1.5));
        graph[9].add(new Edge(12, 2.3));

        // for 10
        graph[10].add(new Edge(9, 1.5));
        graph[10].add(new Edge(11, 1.0));

        // for 11
        graph[11].add(new Edge(10, 1.0));
        graph[11].add(new Edge(12, 0.90));

        // for 12
        graph[12].add(new Edge(9, 2.3));
        graph[12].add(new Edge(11, 0.90));
        graph[12].add(new Edge(13, 2.1));

        // for 13
        graph[13].add(new Edge(12, 2.1));
        graph[13].add(new Edge(14, 1.6));

        // for 14
        graph[14].add(new Edge(13, 1.6));
        graph[14].add(new Edge(29, 8.3));
        graph[14].add(new Edge(15, 8.8));

        // for 15
        graph[15].add(new Edge(14, 8.8));
        graph[15].add(new Edge(28, 2.5));
        graph[15].add(new Edge(16, 4.2));

        // for 16
        graph[16].add(new Edge(15, 4.2));
        graph[16].add(new Edge(17, 1.2));

        // for 17
        graph[17].add(new Edge(16, 1.2));
        graph[17].add(new Edge(18, 1.6));

        // for 18
        graph[18].add(new Edge(17, 1.6));
        graph[18].add(new Edge(26, 6.3));
        graph[18].add(new Edge(19, 6.3));

        // for 19
        graph[19].add(new Edge(26, 3.7));
        graph[19].add(new Edge(18, 6.5));
        graph[19].add(new Edge(20, 3.1));

        // for 20
        graph[20].add(new Edge(19, 3.1));
        graph[20].add(new Edge(25, 5.6));
        graph[20].add(new Edge(21, 4.7));

        // for 21
        graph[21].add(new Edge(0, 4.7));
        graph[21].add(new Edge(23, 3.4));
        graph[21].add(new Edge(24, 3.2));
        graph[21].add(new Edge(20, 4.7));

        // for 22
        graph[22].add(new Edge(23, 3.1));
        graph[22].add(new Edge(33, 2.6));

        // for 23
        graph[23].add(new Edge(22, 3.1));
        graph[23].add(new Edge(0, 3.6));
        graph[23].add(new Edge(21, 3.4));
        graph[23].add(new Edge(24, 1.6));

        // for 24
        graph[24].add(new Edge(21, 3.2));
        graph[24].add(new Edge(23, 1.6));
        graph[24].add(new Edge(32, 5.3));
        graph[24].add(new Edge(25, 3.6));

        // for 25
        graph[25].add(new Edge(20, 5.6));
        graph[25].add(new Edge(24, 3.6));
        graph[25].add(new Edge(26, 5.1));
        graph[25].add(new Edge(29, 4.8));
        graph[25].add(new Edge(31, 4.2));

        // for 26
        graph[26].add(new Edge(19, 3.7));
        graph[26].add(new Edge(25, 5.1));
        graph[26].add(new Edge(27, 3.6));
        graph[26].add(new Edge(18, 6.3));

        // for 27
        graph[27].add(new Edge(29, 0.85));
        graph[27].add(new Edge(26, 3.6));
        graph[27].add(new Edge(28, 4.7));

        // for 28
        graph[28].add(new Edge(27, 4.7));
        graph[28].add(new Edge(15, 2.8));

        // for 29
        graph[29].add(new Edge(25, 4.8));
        graph[29].add(new Edge(30, 4.8));
        graph[29].add(new Edge(14, 8.3));
        graph[29].add(new Edge(27, 0.85));

        // for 30
        graph[30].add(new Edge(31, 2.9));
        graph[30].add(new Edge(29, 4.8));
        graph[30].add(new Edge(35, 5.6));

        // for 31
        graph[31].add(new Edge(32, 3.0));
        graph[31].add(new Edge(25, 4.2));
        graph[31].add(new Edge(30, 2.9));

        // for 32
        graph[32].add(new Edge(24, 5.3));
        graph[32].add(new Edge(31, 3.0));
        graph[32].add(new Edge(33, 3.4));
        graph[32].add(new Edge(34, 3.2));

        // for 33
        graph[33].add(new Edge(2, 4.3));
        graph[33].add(new Edge(22, 2.6));
        graph[33].add(new Edge(32, 3.4));

        // for 34
        graph[34].add(new Edge(32, 3.2));
        graph[34].add(new Edge(5, 4.1));
        graph[34].add(new Edge(35, 6.0));

        // for 35
        graph[35].add(new Edge(34, 6.0));
        graph[35].add(new Edge(30, 5.6));
        graph[35].add(new Edge(6, 2.2));
        graph[35].add(new Edge(8, 8.4));
    }

    public void shortestPath(int st, int ed, MyPanel myPanel) {
        System.out.println(st + " " + ed);
        double start = st;
        double end = ed;
        double totalNodes = graph.length;
        double[][] table = new double[(int) totalNodes][3];
        // filling values in table
        for (int i = 0; i < totalNodes; i++) {
            table[i][0] = i;
            table[i][1] = Integer.MAX_VALUE;
            table[i][2] = -1;// No previous node
        }
        // filling of first Node as 0;
        table[(int) start][1] = 0;
        boolean[] visited = new boolean[(int) totalNodes];
        double current = table[(int) start][0];
        while (true) {
            for (int i = 0; i < graph[(int) current].size(); i++) {
                int dest = graph[(int) current].get(i).dest;
                double weight = graph[(int) current].get(i).weight;
                if (!visited[dest]) {
                    double sum = table[(int) current][1] + weight;
                    if (sum < table[dest][1]) {
                        table[dest][1] = sum;
                        table[dest][2] = current;
                    }
                }
            }
            visited[(int) current] = true;
            // find new current
            double minval = Integer.MAX_VALUE;
            double countvisited = 0;
            for (int i = 0; i < totalNodes; i++) {
                if (!visited[i]) {
                    if (minval > table[i][1]) {
                        current = i;
                        minval = table[i][1];
                    }
                } else {
                    countvisited++;
                }
            }
            if (countvisited == totalNodes || current == end)
                break;
        }

        Stack<Double> s = new Stack<>();
        s.push(end);
        double loc = end;
        while (loc != start) {
            loc = table[(int) loc][2];
            s.push(loc);
        }
        Integer srt = s.pop().intValue();
        int midDes = 1;
        while (!s.isEmpty()) {
            Integer edn = s.pop().intValue();
            for (int i = 0; i < graph[srt].size(); i++) {
                Edge edge = graph[srt].get(i);
                if (edge.dest == edn) {
                    totalDist += edge.weight;
                    break;
                }
            }

            if (present[edn] && edn != currSrc && !s.empty()) {
                --scnt;
                midDes++;
                Color c = Color.decode("#FF00CA");
                myPanel.c[edn].color = c;
                count++;
                JLabel destLabel = new JLabel(count + "");
                destLabel.setForeground(Color.RED);
                destLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                Point p = myPanel.c[edn].getPoint();
                myPanel.add(destLabel);
                destLabel.setBounds((int) (p.getX()) - 30, (int) (p.getY()) - 30, 30, 30);
                myPanel.repaint();
                present[edn] = false;

            } else {
                myPanel.c[edn].color = Color.BLACK;
            }
            String str1 = srt + "_" + edn;
            String str2 = edn + "_" + srt;
            if (myPanel.Id.containsKey(str1)) {
                myPanel.Id.get(str1).color = Color.BLACK;
            }

            if (myPanel.Id.containsKey(str2)) {
                myPanel.Id.get(str2).color = Color.BLACK;
            }
            srt = edn;
        }
        Color c = Color.decode("#FF00CA");
        myPanel.c[ed].color = c;

        // Increasing delivery count to mark as visited
        count++;
        JLabel destLabel = new JLabel(count + "");
        destLabel.setForeground(Color.RED);
        destLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        Point p = myPanel.c[ed].getPoint();
        myPanel.add(destLabel);
        destLabel.setBounds((int) (p.getX()) - 30, (int) (p.getY()) - 30, 30, 30);
        myPanel.repaint();

        --scnt;
        if (scnt == 0) {
            System.out.println(midDes);
            System.out.println(scnt);
            myPanel.c[ed].color = Color.GREEN;
            String fv = String.format("%.2f", totalDist);
            totalSum.setText("Total Distance: " + fv + " KM");
            reload.setVisible(true);
            myPanel.repaint();
            return;
        }

        int newSrc = ed;

        double[] target = new double[2];
        target[0] = points[newSrc][0];
        target[1] = points[newSrc][1];
        // removing from kdtree
        present[newSrc] = false;
        double temp[][] = new double[KDInput.length - midDes][2];
        int j = 0;
        for (int i = 0; i < 36; i++) {
            if (present[i] && i != currSrc) {
                temp[j][0] = points[i][0];
                temp[j][1] = points[i][1];
                j++;
            }
        }

        KDInput = temp;
        KDtree temtree = new KDtree();
        temtree.buildTree(KDInput);
        ktree = temtree;
        node clp = ktree.nearestNeighbour(ktree.root, target, 0);
        double[] found = clp.data;
        System.out.println(found[0] + " " + found[1]);
        // finding index
        x = 0;
        for (x = 0; x < 36; x++) {
            if (found[0] == points[x][0] && found[1] == points[x][1])
                break;
        }
        java.util.Timer timer = new java.util.Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                shortestPath(newSrc, x, myPanel);
            }
        }, 1000);
    }

    public static void main(String[] args) {
        gui = new GUI();
    }
}