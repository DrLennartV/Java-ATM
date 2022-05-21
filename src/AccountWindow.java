import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AccountWindow extends JFrame implements Window {
    private JPanel AccountWindow;
    private JButton createButton;
    private JLabel chargeLabel1;
    private JLabel chargeLabel2;
    private JPanel accountPanel;
    private ATM atmsystem;


    public AccountWindow(CustomerWindow customerWindow, ATM atm) {

        WindowSetter.windowConfig2(this, AccountWindow);
        this.atmsystem = atm;
        reFresh();
        chargeLabel1.setText("You will be charged for $" + Constants.OpenClose_Fee + " for creating or closing an account.");
        chargeLabel2.setText("You will be charged for $" + Constants.Withdraw_Fee + " for each withdrawal and transfer.");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                customerWindow.setVisible(true);
            }
        });

        createButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new CreateAccountDialog(atmsystem);
                reFresh();
            }
        });
    }

    public void reFresh() {
        accountPanel.setLayout(new BoxLayout(accountPanel, BoxLayout.Y_AXIS));
        ((Customer) atmsystem.getUser()).updatedAccounts();
        List<BankAccount> bs = ((Customer) atmsystem.getUser()).getAccounts();
        accountPanel.removeAll();
        for (BankAccount b : bs) {
            AccountElement e = new AccountElement(atmsystem, b, this);
            accountPanel.add(e.$$$getRootComponent$$$());
        }
        accountPanel.revalidate();
        accountPanel.repaint();
    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        AccountWindow = new JPanel();
        AccountWindow.setLayout(new GridLayoutManager(2, 1, new Insets(20, 20, 20, 20), -1, -1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
        AccountWindow.add(panel1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        chargeLabel1 = new JLabel();
        chargeLabel1.setText("charge fee rule introduction 1");
        panel1.add(chargeLabel1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(0, 1, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        createButton = new JButton();
        createButton.setText("Create Account");
        panel1.add(createButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        chargeLabel2 = new JLabel();
        chargeLabel2.setText("charge fee rule introduction 2");
        panel1.add(chargeLabel2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        AccountWindow.add(scrollPane1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        accountPanel = new JPanel();
        accountPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        scrollPane1.setViewportView(accountPanel);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return AccountWindow;
    }

}