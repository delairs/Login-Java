import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Jalankan frame login
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}
