package ClassThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TelaTime extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout());

    private JLabel descricao = new JLabel("Time 1");

    private JTextField showtime = new JTextField();

    private JLabel descricao2 = new JLabel("Time 2");

    private JTextField showtime2 = new JTextField();

    private JButton jButton = new JButton("Start");
    private JButton jButton2 = new JButton("Stop");

    private Runnable thread1 = new Runnable() {
        @Override
        public void run() {
         while (true) {
             showtime.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
                     format(Calendar.getInstance().getTime()));
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
        }
    };


    private Runnable thread2 = new Runnable() {
        @Override
        public void run() {
            while (true) {
                showtime2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
                        format(Calendar.getInstance().getTime()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };


    private Thread thread1Time;
    private Thread thread2Time;

    public TelaTime() {

        setTitle("TIME COM THREAD");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);
        /* -------------------------------------------------*/
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(5, 10, 5,5);
        gridBagConstraints.anchor = gridBagConstraints.WEST;

        descricao.setPreferredSize(new Dimension(200, 25));
        jPanel.add(descricao, gridBagConstraints);

        showtime.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy ++;
        showtime.setEditable(false);
        jPanel.add(showtime, gridBagConstraints);

        descricao2.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy++;
        jPanel.add(descricao2, gridBagConstraints);

        showtime2.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy++;
        showtime2.setEditable(false);
        jPanel.add(showtime2, gridBagConstraints);

        /* -------------------------------------------------*/

        gridBagConstraints.gridwidth = 1;

        jButton.setPreferredSize(new Dimension(92,25));
        gridBagConstraints.gridy++;
        jPanel.add(jButton, gridBagConstraints);

        jButton2.setPreferredSize(new Dimension(92,25));
        gridBagConstraints.gridx++;
        jPanel.add(jButton2, gridBagConstraints);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread1Time = new Thread(thread1);
                thread1Time.start();

                thread2Time = new Thread(thread2);
                thread2Time.start();

                jButton.setEnabled(false);
                jButton2.setEnabled(true);
            }

        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread1Time.stop();

                thread2Time.stop();

                jButton.setEnabled(true);
                jButton2.setEnabled(false);
            }
        });

        jButton2.setEnabled(false);

        add(jPanel, BorderLayout.WEST);
        setVisible(true);
    }

}
