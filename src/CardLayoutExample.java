import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by jaime on 05-04-2015.
 */
public class CardLayoutExample extends JFrame{

    CardLayoutExample() {

        setTitle("Ventana CardLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contenedor = getContentPane();
        JPanel buttonPanel = new JPanel();
        JButton nextButton = new JButton("Next");

        buttonPanel.add(nextButton);
        contenedor.add(buttonPanel, BorderLayout.SOUTH);

        final JPanel cardPanel = new JPanel();
        final CardLayout cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        for (int i = 1; i <= 5; i++) {
            JButton card = new JButton("Card" + i);
            card.setPreferredSize(new Dimension(250, 200));
            cardPanel.add(card);
        }

        contenedor.add(cardPanel, BorderLayout.CENTER);
        pack();

        /**
         * MouseAdapter: clase abstracta que recibe eventos desde el mouse
         */
        nextButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    cardLayout.next(cardPanel);

                }

            }
        });

    }





}
