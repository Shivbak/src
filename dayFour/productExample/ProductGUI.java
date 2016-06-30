package dayFour.productExample;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import static dayFour.productExample.ProductGeneration.*;

/**
 * Created by student on 30-Jun-16.
 */
public class ProductGUI extends JFrame {

    private JTextField model,description,price,category;
    private JButton btnPrior,btnNext;
    JMenuItem createDb,loadMenuItem,newMenuItem;

    Connection con;
    String username = "root";
    String password = "Password100";
    String url = "jdbc:mysql://localhost:3306/awesome?UseSSL=false";

    public static List<Blackberry> bb = new ArrayList<>();
    int index = 0;

    ProductGUI()
    {
        super("BlackBerry Warehouse");
        setSize(500,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(event -> {

        });
        fileMenu.add(newMenuItem);

        JMenuItem loadMenuItem = new JMenuItem("Load");
        loadMenuItem.addActionListener(event -> {
            LoadItem();
        });
        fileMenu.add(loadMenuItem);

        JMenuItem createDb = new JMenuItem("CreateDb");
        createDb.addActionListener(event ->{
            try {
                implementDb();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }


        } );

        fileMenu.add(createDb);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        createComponents();

        setVisible(true);
        bb.add(passport);
        bb.add(priv);
        bb.add(leap);


    }

    public void createComponents()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));




        //field panel method
        panel.add(createFieldComponents(),BorderLayout.CENTER);
        panel.add(createButtonComponents(),BorderLayout.SOUTH);

        setContentPane(panel);
    }

    public JPanel createFieldComponents()
    {
       JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(4,2,5,5));

        fieldPanel.add(new JLabel("Model"));
        model = new JTextField();
        fieldPanel.add(model);

        fieldPanel.add(new JLabel("Description"));
        description = new JTextField();
        fieldPanel.add(description);

        fieldPanel.add(new JLabel("Price"));
        price = new JTextField();
        fieldPanel.add(price);

        fieldPanel.add(new JLabel("Category"));
        category = new JTextField();
        fieldPanel.add(category);

        return fieldPanel;

    }

    public JPanel createButtonComponents()
    {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        btnPrior = new JButton("Previous");
        btnPrior.addActionListener(event -> {


        } );
        buttonPanel.add(btnPrior);

        btnNext = new JButton("Next");
        btnNext.addActionListener(event -> {



            for (int i = 0; i<= bb.size(); i++)
            {
                model.setText(bb.get(i).getModel());
                description.setText(bb.get(i).getDescription());
                //price.setText(bb.get(0).getPrice());
                category.setText(bb.get(i).getCategory());
            }

        });
        buttonPanel.add(btnNext);

        return buttonPanel;
    }

    public void LoadItem()
    {

        model.setText(bb.get(0).getModel());
        description.setText(bb.get(0).getDescription());
        //price.setText(bb.get(0).getPrice());
        category.setText(bb.get(0).getCategory());

        }

    public void implementDb() throws Exception
    {
        //get the deiver
        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection(url,username,password);
        new MySqlDb(con).createDatabaseTables();
        con.close();
    }
    public static void main(String[] args)
    {
        new ProductGUI();
    }
}
