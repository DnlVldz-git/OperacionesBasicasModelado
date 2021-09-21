/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author dani_
 */
public class PrincipalFrame extends JFrame {

    private PanelBotones pnlBotones;
    private PanelImagen pnlImg;
    private PanelImagen pnlImg2;
    private PanelImagen pnlImg3;
    private BufferedImage img;
    private BufferedImage imgRot;
    private boolean bandera;
    private boolean bandera2;
    private boolean bandera3;
    private JPanel panel;
    private int num;

    public PrincipalFrame() throws IOException {
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setTitle("Operaciones");
        super.setResizable(true);
        super.setSize(300, 670);
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        bandera = false;
        bandera2 = false;
        bandera3 = false;
        pnlBotones = new PanelBotones();

        addAL();

        add(pnlBotones);
        super.setVisible(true);

    }

    public void addAL() {
        pnlBotones.getBtnIdentidad().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PnlBotn pnlBtn1 = new PnlBotn();
                setPanel(1, pnlBtn1);

                actionRegresar(pnlBtn1);

            }
        });
        pnlBotones.getBtnInverso().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PnlBotn pnlBtn2 = new PnlBotn();
                setPanel(2, pnlBtn2);

                actionRegresar(pnlBtn2);
            }
        });
        pnlBotones.getBtnUmbral().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PnlBotn pnlBtn3 = new PnlBotn();
                setPanel(3, pnlBtn3);

                actionRegresar(pnlBtn3);
            }
        });
        pnlBotones.getBtnUmbralInverso().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PnlBotn pnlBtn4 = new PnlBotn();
                setPanel(4, pnlBtn4);

                actionRegresar(pnlBtn4);
            }
        });
        pnlBotones.getBtnIntUmbralBin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PnlBotn pnlBtn5 = new PnlBotn();
                setPanel(5, pnlBtn5);

                actionRegresar(pnlBtn5);
            }
        });
        pnlBotones.getBtnIntUmbralBinInv().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PnlBotn pnlBtn6 = new PnlBotn();
                setPanel(6, pnlBtn6);

                actionRegresar(pnlBtn6);

            }
        });
        pnlBotones.getBtnIntUmbralGris().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PnlBotn pnlBtn7 = new PnlBotn();
                setPanel(7, pnlBtn7);

                actionRegresar(pnlBtn7);
            }
        });
        pnlBotones.getBtnIntUmbralGrisInv().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PnlBotn pnlBtn8 = new PnlBotn();
                setPanel(8, pnlBtn8);

                actionRegresar(pnlBtn8);
            }
        });
        pnlBotones.getBtnExtension().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PnlBotn pnlBtn9 = new PnlBotn();
                setPanel(9, pnlBtn9);

                actionRegresar(pnlBtn9);
            }
        });
        pnlBotones.getBtnReduGris().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PnlBotn pnlBtn10 = new PnlBotn();
                setPanel(10, pnlBtn10);

                actionRegresar(pnlBtn10);
            }
        });
        pnlBotones.getBtnSuma().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PnlBotn pnlBtn11 = new PnlBotn();
                setPanel(11, pnlBtn11);

                actionRegresar(pnlBtn11);
            }
        });
        pnlBotones.getBtnResta().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PnlBotn pnlBtn12 = new PnlBotn();
                setPanel(12, pnlBtn12);

                actionRegresar(pnlBtn12);
            }
        });
        pnlBotones.getBtnAND().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PnlBotn pnlBtn13 = new PnlBotn();

                setPanel(13, pnlBtn13);

                actionRegresar(pnlBtn13);
            }
        });
        pnlBotones.getBtnOR().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PnlBotn pnlBtn14 = new PnlBotn();
                setPanel(14, pnlBtn14);

                actionRegresar(pnlBtn14);
            }
        });
    }

    public void setPanel(int funcion, PnlBotn pnlBtn) {
        accion(funcion, pnlBtn);

        if (bandera2) {
            panel = new JPanel();
            panel.setLayout(new BorderLayout());
            remove(pnlBotones);
            pnlImg = new PanelImagen("img.png");
            pnlImg3 = new PanelImagen("img_rot.png");
            panel.add(pnlImg, BorderLayout.WEST);
            panel.add(pnlImg3, BorderLayout.NORTH);
            panel.add(pnlBtn, BorderLayout.SOUTH);
            add(panel, BorderLayout.CENTER);
            setSize(1200, 901);
            setSize(1200, 900);
            bandera2 = false;
        } else if (bandera3) {
            panel = new JPanel();
            panel.setLayout(new BorderLayout());
            remove(pnlBotones);
            pnlImg = new PanelImagen("img3.png");
            pnlImg3 = new PanelImagen("img4.png");
            panel.add(pnlImg, BorderLayout.WEST);
            panel.add(pnlImg3, BorderLayout.NORTH);
            panel.add(pnlBtn, BorderLayout.SOUTH);
            add(panel, BorderLayout.CENTER);
            setSize(1200, 901);
            setSize(1200, 900);
            bandera3 = false;
        } else {
            panel = new JPanel();
            panel.setLayout(new BorderLayout());
            remove(pnlBotones);
            pnlImg = new PanelImagen("img.png");
            panel.add(pnlImg, BorderLayout.WEST);
            panel.add(pnlBtn, BorderLayout.SOUTH);
            add(panel, BorderLayout.CENTER);
            setSize(1200, 451);
            setSize(1200, 450);
        }

        if (funcion == 12) {
            panel = new JPanel();
            panel.setLayout(new BorderLayout());
            remove(pnlBotones);
            pnlImg = new PanelImagen("img.png");
            pnlImg3 = new PanelImagen("img_rot.png");
            panel.add(pnlImg, BorderLayout.WEST);
            panel.add(pnlImg3, BorderLayout.NORTH);
            panel.add(pnlBtn, BorderLayout.SOUTH);
            add(panel, BorderLayout.CENTER);
            setSize(1200, 901);
            setSize(1200, 900);
            bandera2 = false;
        }
        if (funcion == 13) {
            panel = new JPanel();
            panel.setLayout(new BorderLayout());
            remove(pnlBotones);
            pnlImg = new PanelImagen("img3.png");
            pnlImg3 = new PanelImagen("img4.png");
            panel.add(pnlImg, BorderLayout.WEST);
            panel.add(pnlImg3, BorderLayout.NORTH);
            panel.add(pnlBtn, BorderLayout.SOUTH);
            add(panel, BorderLayout.CENTER);
            setSize(1200, 901);
            setSize(1200, 900);
            bandera2 = false;
        }
        if (funcion == 14) {
            panel = new JPanel();
            panel.setLayout(new BorderLayout());
            remove(pnlBotones);
            pnlImg = new PanelImagen("img3.png");
            pnlImg3 = new PanelImagen("img4.png");
            panel.add(pnlImg, BorderLayout.WEST);
            panel.add(pnlImg3, BorderLayout.NORTH);
            panel.add(pnlBtn, BorderLayout.SOUTH);
            add(panel, BorderLayout.CENTER);
            setSize(1200, 901);
            setSize(1200, 900);
            bandera2 = false;
        }
        pnlBotones = null;
    }

    public void actionRegresar(PnlBotn pnlBtn) {
        pnlBtn.getBtnSalir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pnlBotones = new PanelBotones();
                addAL();
                if (pnlImg2 != null) {
                    panel.remove(pnlImg2);
                }
                if (pnlImg3 != null) {
                    panel.remove(pnlImg3);
                }
                remove(panel);
                panel = null;
                remove(pnlBtn);
                add(pnlBotones);
                setSize(300, 671);
                setSize(300, 670);
            }
        });
    }

    public void accion(int funcion, PnlBotn pnlBtn) {
        switch (funcion) {
            case 1:
                pnlBtn.getBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try {
                            img = ImageIO.read(new File("img.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        for (int x = 0; x < img.getWidth(); x++) {
                            for (int y = 0; y < img.getHeight(); y++) {
                                int rgb = img.getRGB(x, y);

                                Color color = new Color(rgb);

                                Color colorNuevo = new Color((color.getRed()), (color.getGreen()), (color.getBlue()));

                                img.setRGB(x, y, colorNuevo.getRGB());
                            }
                        }
                        try {
                            ImageIO.write(img, "png", new File("img2.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera = true;
                        pnlImg2 = new PanelImagen("img2.png");
                        panel.add(pnlImg2, BorderLayout.EAST);
                        setSize(1200, 451);
                        setSize(1200, 450);
                    }
                });
                break;
            case 2:
                pnlBtn.getBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try {
                            img = ImageIO.read(new File("img.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        for (int x = 0; x < img.getWidth(); x++) {
                            for (int y = 0; y < img.getHeight(); y++) {
                                int rgb = img.getRGB(x, y);

                                Color color = new Color(rgb);

                                Color colorNuevo = new Color((255 - color.getRed()), (255 - color.getGreen()), (255 - color.getBlue()));

                                img.setRGB(x, y, colorNuevo.getRGB());
                            }
                        }
                        try {
                            ImageIO.write(img, "png", new File("img2.png"));
                        } catch (IOException ex) {

                        }

                        bandera = true;
                        pnlImg2 = new PanelImagen("img2.png");
                        panel.add(pnlImg2, BorderLayout.EAST);
                        setSize(1200, 451);
                        setSize(1200, 450);
                    }
                });
                break;
            case 3:
                pnlBtn.getBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try {
                            img = ImageIO.read(new File("img.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        for (int x = 0; x < img.getWidth(); x++) {
                            for (int y = 0; y < img.getHeight(); y++) {
                                int rgb = img.getRGB(x, y);

                                Color colorNuevo = null;

                                Color color = new Color(rgb);
                                if (color.getRed() <= 127) {
                                    colorNuevo = new Color((0), (0), (0));
                                } else {
                                    colorNuevo = new Color((255), (255), (255));
                                }
                                img.setRGB(x, y, colorNuevo.getRGB());
                            }
                        }
                        try {
                            ImageIO.write(img, "png", new File("img2.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera = true;
                        pnlImg2 = new PanelImagen("img2.png");
                        panel.add(pnlImg2, BorderLayout.EAST);
                        setSize(1200, 451);
                        setSize(1200, 450);
                    }
                });
                break;
            case 4:
                pnlBtn.getBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try {
                            img = ImageIO.read(new File("img.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        for (int x = 0; x < img.getWidth(); x++) {
                            for (int y = 0; y < img.getHeight(); y++) {
                                int rgb = img.getRGB(x, y);

                                Color colorNuevo = null;

                                Color color = new Color(rgb);
                                if (color.getRed() <= 127) {
                                    colorNuevo = new Color((255), (255), (255));
                                } else {
                                    colorNuevo = new Color((0), (0), (0));
                                }
                                img.setRGB(x, y, colorNuevo.getRGB());
                            }
                        }
                        try {
                            ImageIO.write(img, "png", new File("img2.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera = true;
                        pnlImg2 = new PanelImagen("img2.png");
                        panel.add(pnlImg2, BorderLayout.EAST);
                        setSize(1200, 451);
                        setSize(1200, 450);
                    }
                });
                break;
            case 5:
                pnlBtn.getBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try {
                            img = ImageIO.read(new File("img.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        for (int x = 0; x < img.getWidth(); x++) {
                            for (int y = 0; y < img.getHeight(); y++) {
                                int rgb = img.getRGB(x, y);

                                Color colorNuevo = null;

                                Color color = new Color(rgb);
                                if (color.getRed() <= 50 || color.getRed() >= 180) {
                                    colorNuevo = new Color((0), (0), (0));
                                } else if (50 < color.getRed() && color.getRed() < 180) {
                                    colorNuevo = new Color((255), (255), (255));
                                }
                                img.setRGB(x, y, colorNuevo.getRGB());
                            }
                        }
                        try {
                            ImageIO.write(img, "png", new File("img2.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera = true;
                        pnlImg2 = new PanelImagen("img2.png");
                        panel.add(pnlImg2, BorderLayout.EAST);
                        setSize(1200, 451);
                        setSize(1200, 450);
                    }
                });
                break;
            case 6:
                pnlBtn.getBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try {
                            img = ImageIO.read(new File("img.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        for (int x = 0; x < img.getWidth(); x++) {
                            for (int y = 0; y < img.getHeight(); y++) {
                                int rgb = img.getRGB(x, y);

                                Color colorNuevo = null;

                                Color color = new Color(rgb);
                                if (color.getRed() <= 50 || color.getRed() >= 180) {
                                    colorNuevo = new Color((255), (255), (255));
                                } else if (50 < color.getRed() && color.getRed() < 180) {
                                    colorNuevo = new Color((0), (0), (0));
                                }
                                img.setRGB(x, y, colorNuevo.getRGB());
                            }
                        }
                        try {
                            ImageIO.write(img, "png", new File("img2.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera = true;
                        pnlImg2 = new PanelImagen("img2.png");
                        panel.add(pnlImg2, BorderLayout.EAST);
                        setSize(1200, 451);
                        setSize(1200, 450);
                    }
                });
                break;
            case 7:
                pnlBtn.getBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try {
                            img = ImageIO.read(new File("img.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        for (int x = 0; x < img.getWidth(); x++) {
                            for (int y = 0; y < img.getHeight(); y++) {
                                int rgb = img.getRGB(x, y);

                                Color colorNuevo = null;

                                Color color = new Color(rgb);
                                if (color.getRed() <= 50 || color.getRed() >= 180) {
                                    colorNuevo = new Color((255), (255), (255));
                                } else if (50 < color.getRed() && color.getRed() < 180) {
                                    colorNuevo = new Color((color.getRed()), (color.getRed()), (color.getRed()));
                                }
                                img.setRGB(x, y, colorNuevo.getRGB());
                            }
                        }
                        try {
                            ImageIO.write(img, "png", new File("img2.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera = true;
                        pnlImg2 = new PanelImagen("img2.png");
                        panel.add(pnlImg2, BorderLayout.EAST);
                        setSize(1200, 451);
                        setSize(1200, 450);
                    }
                });
                break;
            case 8:
                pnlBtn.getBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {

                        try {
                            img = ImageIO.read(new File("img.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        for (int x = 0; x < img.getWidth(); x++) {
                            for (int y = 0; y < img.getHeight(); y++) {
                                int rgb = img.getRGB(x, y);

                                Color colorNuevo = null;

                                Color color = new Color(rgb);
                                if (color.getRed() <= 50 || color.getRed() >= 180) {
                                    colorNuevo = new Color((color.getRed()), (color.getRed()), (color.getRed()));
                                } else if (50 < color.getRed() && color.getRed() < 180) {
                                    colorNuevo = new Color((255), (255), (255));
                                }
                                img.setRGB(x, y, colorNuevo.getRGB());
                            }
                        }
                        try {
                            ImageIO.write(img, "png", new File("img2.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera = true;
                        pnlImg2 = new PanelImagen("img2.png");
                        panel.add(pnlImg2, BorderLayout.EAST);
                        setSize(1200, 451);
                        setSize(1200, 450);
                    }
                });
                break;
            case 9:
                pnlBtn.getBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try {
                            img = ImageIO.read(new File("img.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        for (int x = 0; x < img.getWidth(); x++) {
                            for (int y = 0; y < img.getHeight(); y++) {
                                int rgb = img.getRGB(x, y);

                                Color colorNuevo = null;

                                Color color = new Color(rgb);
                                if (color.getRed() <= 50 || color.getRed() >= 180) {
                                    colorNuevo = new Color((255), (255), (255));
                                } else if (50 < color.getRed() && color.getRed() < 180) {
                                    int num = (color.getRed());
                                    colorNuevo = new Color((255 * ((num - 50) / (180 - 50))), (255 * ((num - 50) / (180 - 50))), (255 * ((num - 50) / (180 - 50))));
                                }
                                img.setRGB(x, y, colorNuevo.getRGB());
                            }
                        }
                        try {
                            ImageIO.write(img, "png", new File("img2.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera = true;
                        pnlImg2 = new PanelImagen("img2.png");
                        panel.add(pnlImg2, BorderLayout.EAST);
                        setSize(1200, 451);
                        setSize(1200, 450);
                    }
                });
                break;
            case 10:
                JFrame parent = this;
                pnlBtn.getBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        DialogNumBits dialog = new DialogNumBits(parent, num);
                        num = 1;
                        dialog.setVisible(true);

                        try {
                            img = ImageIO.read(new File("img.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        num = dialog.getNum();
                        for (int x = 0; x < img.getWidth(); x++) {
                            for (int y = 0; y < img.getHeight(); y++) {
                                int rgb = img.getRGB(x, y);

                                Color colorNuevo = null;

                                Color color = new Color(rgb);

                                int numIni = 256 / num;

                                for (int i = 0; i < 256; i += numIni) {
                                    if (color.getRed() <= numIni) {
                                        colorNuevo = new Color((0), (0), (0));
                                        break;
                                    } else if (i < color.getRed() && color.getRed() <= i + numIni) {
                                        colorNuevo = new Color((i), (i), (i));
                                        break;
                                    }
                                }
                                /*if (color.getRed() <= 50) {
                                colorNuevo = new Color((0), (0), (0));
                                } else if (50 < color.getRed() && color.getRed() <= 100) {
                                colorNuevo = new Color((50), (50), (50));
                                } else if (100 < color.getRed() && color.getRed() <= 150) {
                                colorNuevo = new Color((100), (100), (100));
                                } else if (150 < color.getRed() && color.getRed() <= 200) {
                                colorNuevo = new Color((150), (150), (150));
                                } else if (200 < color.getRed() && color.getRed() <= 250) {
                                colorNuevo = new Color((200), (200), (200));
                                } else if (250 < color.getRed() && color.getRed() <= 255) {
                                colorNuevo = new Color((250), (250), (250));
                                }*/

                                img.setRGB(x, y, colorNuevo.getRGB());
                            }
                        }
                        try {
                            ImageIO.write(img, "png", new File("img2.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera = true;
                        pnlImg2 = new PanelImagen("img2.png");
                        panel.add(pnlImg2, BorderLayout.EAST);
                        setSize(1200, 451);
                        setSize(1200, 450);
                    }
                });
                break;
            case 11:
                pnlBtn.getBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try {
                            img = ImageIO.read(new File("img.png"));
                            imgRot = ImageIO.read(new File("img_rot.png"));

                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera2 = true;
                        for (int x = 0; x < img.getWidth(); x++) {
                            for (int y = 0; y < img.getHeight(); y++) {
                                int rgb = img.getRGB(x, y);
                                int rgb2 = imgRot.getRGB(x, y);

                                Color color = new Color(rgb);
                                Color color2 = new Color(rgb2);

                                int num = (color.getRed() + color2.getRed()) / 2;

                                Color colorNuevo = new Color(num, num, num);

                                img.setRGB(x, y, colorNuevo.getRGB());
                            }
                        }
                        try {
                            ImageIO.write(img, "png", new File("img2.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera = true;
                        pnlImg2 = new PanelImagen("img2.png");
                        panel.add(pnlImg2, BorderLayout.EAST);
                        setSize(1200, 950);
                        setSize(1200, 951);
                    }
                });
                break;
            case 12:
                pnlBtn.getBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try {
                            img = ImageIO.read(new File("img.png"));
                            imgRot = ImageIO.read(new File("img_rot.png"));

                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera2 = true;
                        for (int x = 0; x < img.getWidth(); x++) {
                            for (int y = 0; y < img.getHeight(); y++) {
                                int rgb = img.getRGB(x, y);
                                int rgb2 = imgRot.getRGB(x, y);

                                Color color = new Color(rgb);
                                Color color2 = new Color(rgb2);

                                int num = (color.getRed() - color2.getRed());
                                if (num < 0) {
                                    num *= -1;
                                }

                                Color colorNuevo = new Color(num, num, num);

                                img.setRGB(x, y, colorNuevo.getRGB());
                            }
                        }
                        try {
                            ImageIO.write(img, "png", new File("img2.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera = true;
                        pnlImg2 = new PanelImagen("img2.png");
                        panel.add(pnlImg2, BorderLayout.EAST);
                        setSize(1200, 950);
                        setSize(1200, 951);
                    }
                });
                break;
            case 13:
                pnlBtn.getBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try {
                            img = ImageIO.read(new File("img3.png"));
                            imgRot = ImageIO.read(new File("img4.png"));

                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera3 = true;
                        for (int x = 0; x < img.getWidth(); x++) {
                            for (int y = 0; y < img.getHeight(); y++) {
                                int rgb = img.getRGB(x, y);
                                int rgb2 = imgRot.getRGB(x, y);

                                Color color = new Color(rgb);
                                Color color2 = new Color(rgb2);

                                Color colorNuevo = null;

                                if (color.getRed() == 255 && color2.getRed() == 255) {
                                    colorNuevo = new Color(255, 255, 255);
                                } else if (color.getRed() == 0 && color2.getRed() == 255) {
                                    colorNuevo = new Color(0, 0, 0);
                                } else if (color.getRed() == 255 && color2.getRed() == 0) {
                                    colorNuevo = new Color(0, 0, 0);
                                } else if (color.getRed() == 0 && color2.getRed() == 0) {
                                    colorNuevo = new Color(0, 0, 0);
                                }
                                img.setRGB(x, y, colorNuevo.getRGB());
                            }
                        }
                        try {
                            ImageIO.write(img, "png", new File("img2.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera = true;
                        pnlImg2 = new PanelImagen("img2.png");
                        panel.add(pnlImg2, BorderLayout.EAST);
                        setSize(1200, 950);
                        setSize(1200, 951);
                    }
                });
                break;
            case 14:
                pnlBtn.getBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        try {
                            img = ImageIO.read(new File("img3.png"));
                            imgRot = ImageIO.read(new File("img4.png"));

                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera3 = true;
                        for (int x = 0; x < img.getWidth(); x++) {
                            for (int y = 0; y < img.getHeight(); y++) {
                                int rgb = img.getRGB(x, y);
                                int rgb2 = imgRot.getRGB(x, y);

                                Color color = new Color(rgb);
                                Color color2 = new Color(rgb2);

                                Color colorNuevo = new Color(0, 0, 0);

                                if (color.getRed() == 255 && color2.getRed() == 255) {                                    
                                    colorNuevo = new Color(255, 255, 255);
                                } else if (color.getRed() == 255 && color2.getRed() == 0) {
                                    colorNuevo = new Color(255, 255, 255);
                                } else if (color.getRed() == 0 && color2.getRed() == 255) {
                                    colorNuevo = new Color(255, 255, 255);
                                } else if (color.getRed() == 0 && color2.getRed() == 0) {
                                    colorNuevo = new Color(0, 0, 0);
                                }

                                img.setRGB(x, y, colorNuevo.getRGB());
                            }
                        }
                        try {
                            ImageIO.write(img, "png", new File("img2.png"));
                        } catch (IOException ex) {
                            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        bandera = true;
                        pnlImg2 = new PanelImagen("img2.png");
                        panel.add(pnlImg2, BorderLayout.EAST);
                        setSize(1200, 950);
                        setSize(1200, 951);
                    }
                });
                break;
            default:
                throw new AssertionError();
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new PrincipalFrame();
                } catch (IOException ex) {
                    Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

}
