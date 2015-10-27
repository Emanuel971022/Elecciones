package util;

import javax.swing.JOptionPane;

/**
 * @author Emanuel Martinez Pinzon
 * 
 * Esta clase contiene la mayoria de los metodos de JOptionPane documentados y
 * simplificados para que el programador la agregue a sus proyectos y con solo
 * importarla en las otras clases pueda hacer uso de estas herramientas, que 
 * aunque pueden ser programadas como se hace por dafault esto ofrece una
 * estructura mas comoda para presentar mensajes por JOptionPane
 */
public class Notificacion{    
    //---------------------------------ALERTAS---------------------------------//
    
    /**
     * Muestra el JOptionPane sin icono, solo dejando el titulo y el mensaje.
     * @param titulo
     * @param mensaje
     */
    public static void alerta(String titulo, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de interrogacion, un titulo y un mensaje.
     * @param titulo
     * @param mensaje
     */
    public static void alertaPregunta(String titulo, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de error, un titulo y un mensaje.
     * @param titulo
     * @param mensaje
     */
    public static void alertaError(String titulo, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }
        
    /**
     * Muestra el JOptionPane con un icono de alerta, un titulo y un mensaje.
     * @param titulo
     * @param mensaje
     */
    public static void alertaAtencion(String titulo, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de informacion, un titulo y un mensaje.
     * @param titulo
     * @param mensaje 
     */
    public static void alertaInformativo(String titulo, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    //--------------------------------OPCIONES---------------------------------//
    
    /**
     * Muestra el JOptionPane con sin icono, un titulo, un mensaje y tres opciones
     * de seleccion: "Si", "No" y "Cancelar".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     * Retorna 2 si selecciona "Cancelar"
     */
    public static int opcionCompleta(String titulo, String mensaje){
        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, new Object[]{"Si","No", "Cancelar"}, "Si");
    }
    
    /**
     * Muestra el JOptionPane sin icono, un titulo, un mensaje y dos opciones de
     * seleccion: "Si", "No".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     */
    public static int opcionSINO(String titulo, String mensaje){
        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, new Object[]{"Si","No"}, "Si");
    }
    
    /**
     * Muestra el JOptionPane sin icono, un titulo, un mensaje y una opcion de
     * seleccion: "Si".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     */
    public static int opcionSI(String titulo, String mensaje){
        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, new Object[]{"Si"}, "Si");
    }
    
    /**
     * Muestra el JOptionPane con un icono de pregunta, un titulo, un mensaje y
     * tres opciones de seleccion: "Si", "No" y "Cancelar".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     * Retorna 2 si selecciona "Cancelar"
     */
    public static int opcionPreguntaCompleta(String titulo, String mensaje){
        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{"Si","No","Cancelar"}, "Si");
    }
    
    /**
     * Muestra el JOptionPane con un icono de pregunta, un titulo, un mensaje y
     * dos opciones de seleccion: "Si", "No".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     */
    public static int opcionPreguntaSINO(String titulo, String mensaje){
        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{"Si","No"}, "Si");
    }
    
    /**
     * Muestra el JOptionPane con un icono de pregunta, un titulo, un mensaje y
     * una opcion de seleccion: "Si".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     */
    public static int opcionPreguntaSI(String titulo, String mensaje){
        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{"Si"}, "Si");
    }
    
    /**
     * Muestra el JOptionPane con un icono de error, un titulo, un mensaje y
     * tres opciones de seleccion: "Si", "No" y "Cancelar".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     * Retorna 2 si selecciona "Cancelar"
     */
    public static int opcionErrorCompleta(String titulo, String mensaje){
        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE,
                null, new Object[]{"Si","No","Cancelar"}, "Si");
    }
    
    /**
     * Muestra el JOptionPane con un icono de error, un titulo, un mensaje y
     * dos opciones de seleccion: "Si", "No".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     */
    public static int opcionErrorSINO(String titulo, String mensaje){
        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE,
                null, new Object[]{"Si","No"}, "Si");
    }
    
    /**
     * Muestra el JOptionPane con un icono de pregunta, un titulo, un mensaje y
     * una opcion de seleccion: "Si".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     */
    public static int opcionErrorSI(String titulo, String mensaje){
        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_OPTION, JOptionPane.ERROR_MESSAGE,
                null, new Object[]{"Si"}, "Si");
    }
    
    /**
     * Muestra el JOptionPane con un icono de alerta, un titulo, un mensaje y
     * tres opciones de seleccion: "Si", "No" y "Cancelar".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     * Retorna 2 si selecciona "Cancelar"
     */
    public static int opcionAlertaCompleta(String titulo, String mensaje){
        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE,
                null, new Object[]{"Si","No","Cancelar"}, "Si");
    }
    
    /**
     * Muestra el JOptionPane con un icono de alerta, un titulo, un mensaje y
     * dos opciones de seleccion: "Si", "No".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     */
    public static int opcionAlertaSINO(String titulo, String mensaje){
        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,
                null, new Object[]{"Si","No"}, "Si");
    }
    
    /**
     * Muestra el JOptionPane con un icono de pregunta, un titulo, un mensaje y
     * una opcion de seleccion: "Si".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     */
    public static int opcionAlertaSI(String titulo, String mensaje){
        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE,
                null, new Object[]{"Si"}, "Si");
    }
    
    /**
     * Muestra el JOptionPane con un icono informativo, un titulo, un mensaje y
     * tres opciones de seleccion: "Si", "No" y "Cancelar".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     * Retorna 2 si selecciona "Cancelar"
     */
    public static int opcionInformativoCompleta(String titulo, String mensaje){
        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Si","No","Cancelar"}, "Si");
    }
    
    /**
     * Muestra el JOptionPane con un icono informativo, un titulo, un mensaje y
     * dos opciones de seleccion: "Si", "No".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     */
    public static int opcionInformativoSINO(String titulo, String mensaje){
        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Si","No"}, "Si");
    }
    
    /**
     * Muestra el JOptionPane con un icono informativo, un titulo, un mensaje y
     * una opcion de seleccion: "Si".
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion seleccionada.
     * Retorna 0 si selecciona "Si"
     */
    public static int opcionInformativoSI(String titulo, String mensaje){
        return JOptionPane.showOptionDialog(null, mensaje, titulo,
                JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Si"}, "Si");
    }
    
    //-----------------------------INGRESO DE DATOS----------------------------//
    
    /**
     * Muestra el JOptionPane con un icono informativo, un mensaje sin titulo
     * opcional sino en el mensaje por defecto.
     * @param mensaje
     * @return Retorna un String con la informacion ingresada en el campo de texto.
     */
    public static String ingresar(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    
    /**
     * Muestra el JOptionPane sin icono, un titulo, un mensaje y un campo en
     * donde se ingresan los datos.
     * @param titulo
     * @param mensaje
     * @return Retorna un String con la informacion ingresada en el campo de texto.
     */
    public static String ingresar(String titulo, String mensaje){
        String ventana = JOptionPane.showInputDialog(null, mensaje, titulo,
                JOptionPane.PLAIN_MESSAGE);
        return ventana;
    }
    
    /**
     * Muestra el JOptionPane sin icono, un titulo, un mensaje y un campo en
     * donde se ingresan los datos.
     * @param titulo
     * @param mensaje
     * @return Retorna un char con la informacion ingresada en el campo de texto.
     */
    public static int ingresarChar(String titulo, String mensaje){
        String numero = JOptionPane.showInputDialog(null, mensaje, titulo,
                JOptionPane.PLAIN_MESSAGE);
        char b[] = numero.toCharArray();        
        
        return (b[0]);
    }
    
    /**
     * Muestra el JOptionPane sin icono, un titulo, un mensaje y un campo en
     * donde se ingresan los datos.
     * @param titulo
     * @param mensaje
     * @return Retorna un Integer con la informacion ingresada en el campo de texto.
     */
    public static int ingresarInt(String titulo, String mensaje){
        int numero = -1;
        try{
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje,
                    titulo, JOptionPane.PLAIN_MESSAGE));
        }catch(NumberFormatException nfe){
            alertaError("Titulo", "Debe ingresar numeros enteros solamente");
        }
        
        return numero;
    }
    
    /**
     * Muestra el JOptionPane sin icono, un titulo, un mensaje y un campo en
     * donde se ingresan los datos.
     * @param titulo
     * @param mensaje
     * @return Retorna un Float con la informacion ingresada en el campo de texto.
     */
    public static float ingresarFloat(String titulo, String mensaje){
        float numero = -1;
        try{
            numero = Float.parseFloat(JOptionPane.showInputDialog(null, mensaje,
                    titulo, JOptionPane.PLAIN_MESSAGE));
        }catch(NumberFormatException nfe){
            alertaError("Error", "Debe ingresar solo numeros");
        }
        
        return numero;
    }
    
    /**
     * Muestra el JOptionPane con un icono de pregunta, un titulo, un mensaje y
     * un campo en donde se ingresan los datos.
     * @param titulo
     * @param mensaje
     * @return Retorna un String con la informacion ingresada en el campo de texto.
     */
    public static String ingresarPregunta(String titulo, String mensaje){
        return JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de error, un titulo y un mensaje y
     * un campo en donde se ingresan los datos.
     * @param titulo
     * @param mensaje
     * @return Retorna un String con la informacion ingresada en el campo de texto.
     */
    public static String ingresarError(String titulo, String mensaje){
        return JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de alerta, un titulo y un mensaje y
     * un campo en donde se ingresan los datos.
     * @param titulo
     * @param mensaje
     * @return Retorna un String con la informacion ingresada en el campo de texto.
     */
    public static String ingresarAlerta(String titulo, String mensaje){
        return JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono informativo, un titulo y un mensaje y
     * un campo en donde se ingresan los datos.
     * @param titulo
     * @param mensaje
     * @return Retorna un String con la informacion ingresada en el campo de texto.
     */
    public static String ingresarInformativo(String titulo, String mensaje){
        return JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    //----------------------INGRESO DE DATOS CON COMBO-------------------------//
    
    /**
     * Muestra el JOptionPane sin icono, un titulo, un mensaje y un item 
     * en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoCombo(String titulo, String mensaje, String item1){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.PLAIN_MESSAGE, null, new Object[] {item1}, item1);
    }
    
    /**
     * Muestra el JOptionPane sin icono, un titulo, un mensaje y dos item's
     * en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoCombo(String titulo, String mensaje, String item1,
            String item2){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.PLAIN_MESSAGE, null, new Object[] {item1, item2},
                item1);
    }
    
    /**
     * Muestra el JOptionPane sin icono, un titulo, un mensaje y tres item's
     * en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @param item3
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoCombo(String titulo, String mensaje, String item1,
            String item2, String item3){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.PLAIN_MESSAGE, null, new Object[] {item1, item2,
                    item3}, item1);
    }
    
    /**
     * Muestra el JOptionPane sin icono, un titulo, un mensaje y cuatro item's
     * en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @param item3
     * @param item4
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoCombo(String titulo, String mensaje, String item1,
            String item2, String item3, String item4){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.PLAIN_MESSAGE, null, new Object[] {item1, item2,
                    item3, item4}, item1);
    }
    
    /**
     * Muestra el JOptionPane sin icono, un titulo, un mensaje y cinco item's
     * en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @param item3
     * @param item4
     * @param item5
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoCombo(String titulo, String mensaje, String item1,
            String item2, String item3, String item4, String item5){
        return JOptionPane.showInputDialog(null, mensaje, titulo,
                JOptionPane.PLAIN_MESSAGE, null, new Object[] {item1, item2,
                    item3, item4, item5}, item1);
    }
    
    /**
     * Muestra el JOptionPane con icono de pregunta, un titulo, un mensaje y un
     * item en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoPreguntaCombo(String titulo, String mensaje, String item1){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.QUESTION_MESSAGE, null, new Object[] {item1}, item1);
    }
    
    /**
     * Muestra el JOptionPane con icono de pregunta, un titulo, un mensaje y dos
     * item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoPreguntaCombo(String titulo, String mensaje, String item1,
            String item2){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.QUESTION_MESSAGE, null, new Object[] {item1, item2},
                item1);
    }
    
    /**
     * Muestra el JOptionPane con icono de pregunta, un titulo, un mensaje y tres
     * item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @param item3
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoPreguntaCombo(String titulo, String mensaje, String item1,
            String item2, String item3){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.QUESTION_MESSAGE, null, new Object[] {item1, item2,
                    item3}, item1);
    }
    
    /**
     * Muestra el JOptionPane con icono de pregunta, un titulo, un mensaje y
     * cuatro item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @param item3
     * @param item4
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoPreguntaCombo(String titulo, String mensaje, String item1,
            String item2, String item3, String item4){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.QUESTION_MESSAGE, null, new Object[] {item1, item2,
                    item3, item4}, item1);
    }
    
    /**
     * Muestra el JOptionPane con icono de pregunta, un titulo, un mensaje y
     * cinco item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @param item3
     * @param item4
     * @param item5
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoPreguntaCombo(String titulo, String mensaje, String item1,
            String item2, String item3, String item4, String item5){
        return JOptionPane.showInputDialog(null, mensaje, titulo,
                JOptionPane.QUESTION_MESSAGE, null, new Object[] {item1, item2,
                    item3, item4, item5}, item1);
    }
    
    /**
     * Muestra el JOptionPane con un icono de error, un titulo, un mensaje y un item 
     * en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoErrorCombo(String titulo, String mensaje, String item1){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.ERROR_MESSAGE, null, new Object[] {item1}, item1);
    }
    
    /**
     * Muestra el JOptionPane con un icono de error, un titulo, un mensaje y dos
     * item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoErrorCombo(String titulo, String mensaje, String item1,
            String item2){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.ERROR_MESSAGE, null, new Object[] {item1, item2},
                item1);
    }
    
    /**
     * Muestra el JOptionPane con un icono de error, un titulo, un mensaje y tres
     * item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @param item3
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoErrorCombo(String titulo, String mensaje, String item1,
            String item2, String item3){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.ERROR_MESSAGE, null, new Object[] {item1, item2,
                    item3}, item1);
    }
    
    /**
     * Muestra el JOptionPane con un icono de error, un titulo, un mensaje y
     * cuatro item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @param item3
     * @param item4
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoErrorCombo(String titulo, String mensaje, String item1,
            String item2, String item3, String item4){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.ERROR_MESSAGE, null, new Object[] {item1, item2,
                    item3, item4}, item1);
    }
    
    /**
     * Muestra el JOptionPane con un icono de error, un titulo, un mensaje y
     * cinco item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @param item3
     * @param item4
     * @param item5
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoErrorCombo(String titulo, String mensaje, String item1,
            String item2, String item3, String item4, String item5){
        return JOptionPane.showInputDialog(null, mensaje, titulo,
                JOptionPane.ERROR_MESSAGE, null, new Object[] {item1, item2,
                    item3, item4, item5}, item1);
    }
    
    /**
     * Muestra el JOptionPane con un icono de alerta, un titulo, un mensaje y un item
     * en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoAlertaCombo(String titulo, String mensaje, String item1){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.WARNING_MESSAGE, null, new Object[] {item1}, item1);
    }
    
    /**
     * Muestra el JOptionPane con un icono de alerta, un titulo, un mensaje y dos
     * item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoAlertaCombo(String titulo, String mensaje, String item1,
            String item2){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.WARNING_MESSAGE, null, new Object[] {item1, item2},
                item1);
    }
    
    /**
     * Muestra el JOptionPane con un icono de alerta, un titulo, un mensaje y tres
     * item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @param item3
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoAlertaCombo(String titulo, String mensaje, String item1,
            String item2, String item3){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.WARNING_MESSAGE, null, new Object[] {item1, item2,
                    item3}, item1);
    }
    
    /**
     * Muestra el JOptionPane con un icono de alerta, un titulo, un mensaje y cuatro
     * item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @param item3
     * @param item4
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoAlertaCombo(String titulo, String mensaje, String item1,
            String item2, String item3, String item4){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.WARNING_MESSAGE, null, new Object[] {item1, item2,
                    item3, item4}, item1);
    }
    
    /**
     * Muestra el JOptionPane con un icono de alerta, un titulo, un mensaje y cinco
     * item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @param item3
     * @param item4
     * @param item5
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoAlertaCombo(String titulo, String mensaje, String item1,
            String item2, String item3, String item4, String item5){
        return JOptionPane.showInputDialog(null, mensaje, titulo,
                JOptionPane.WARNING_MESSAGE, null, new Object[] {item1, item2,
                    item3, item4, item5}, item1);
    }
    
    /**
     * Muestra el JOptionPane con un icono de notificacion, un titulo, un mensaje
     * y un item en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoNotificacionCombo(String titulo, String mensaje, String item1){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.INFORMATION_MESSAGE, null, new Object[] {item1}, item1);
    }
    
    /**
     * Muestra el JOptionPane con un icono de notificacion, un titulo, un mensaje
     * y dos item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoNotificacionCombo(String titulo, String mensaje,
            String item1, String item2){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.INFORMATION_MESSAGE, null, new Object[] {item1, item2},
                item1);
    }
    
    /**
     * Muestra el JOptionPane con un icono de notificacion, un titulo, un mensaje
     * y tres item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @param item3
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoNotificacionCombo(String titulo, String mensaje,
            String item1, String item2, String item3){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.INFORMATION_MESSAGE, null, new Object[] {item1, item2,
                    item3}, item1);
    }
    
    /**
     * Muestra el JOptionPane con un icono de notificacion, un titulo, un mensaje
     * y cuatro item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @param item3
     * @param item4
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoNotificacionCombo(String titulo, String mensaje, 
            String item1, String item2, String item3, String item4){
        return JOptionPane.showInputDialog(null, mensaje, titulo, 
                JOptionPane.INFORMATION_MESSAGE, null, new Object[] {item1, item2,
                    item3, item4}, item1);
    }
    
    /**
     * Muestra el JOptionPane con un icono de notificacion, un titulo, un mensaje
     * y cinco item's en un combo.
     * @param titulo
     * @param mensaje
     * @param item1
     * @param item2
     * @param item3
     * @param item4
     * @param item5
     * @return Retorna el Object del elemento seleccionado
     */
    public static Object ingresoNotificacionCombo(String titulo, String mensaje,
            String item1, String item2, String item3, String item4, String item5){
        return JOptionPane.showInputDialog(null, mensaje, titulo,
                JOptionPane.INFORMATION_MESSAGE, null, new Object[] {item1, item2,
                    item3, item4, item5}, item1);
    }
    
    //-----------------------PANELES DE CONFIRMACION---------------------------//
    
    /**
     * Muestra el JOptionPane sin icono, con un titulo, un mensaje y tres opciones
     * de eleccion: "Si", "No" y "Cancelar"
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion elegida:
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     * Retorna 2 si selecciona "Cancelar"
     */
    public static int confirmacionCompleta(String titulo, String mensaje){
        return JOptionPane.showConfirmDialog(null, mensaje, titulo, 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane sin icono, con un titulo, un mensaje y dos opciones
     * de eleccion: "Si" y "No"
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion elegida:
     * Retorna 0 si selecciona "Si"
     * Retirna 1 si selecciona "No"
     */
    public static int confirmacionSINO(String titulo, String mensaje){
        return JOptionPane.showConfirmDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de pregunta, con un titulo, un mensaje
     * y tres opciones de eleccion: "Si", "No" y "Cancelar"
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion elegida:
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     * Retorna 2 si selecciona "Cancelar"
     */
    public static int confirmacionPreguntaCompleta(String titulo, String mensaje){
        return JOptionPane.showConfirmDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de pregunta, con un titulo, un mensaje
     * y dos opciones de eleccion: "Si" y "No"
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion elegida:
     * Retorna 0 si selecciona "Si"
     * Retirna 1 si selecciona "No"
     */
    public static int confirmacionPreguntaSINO(String titulo, String mensaje){
        return JOptionPane.showConfirmDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de error, con un titulo, un mensaje y
     * tres opciones de eleccion: "Si", "No" y "Cancelar"
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion elegida:
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     * Retorna 2 si selecciona "Cancelar"
     */
    public static int confirmacionErrorCompleta(String titulo, String mensaje){
        return JOptionPane.showConfirmDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de error, con un titulo, un mensaje y
     * dos opciones de eleccion: "Si" y "No"
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion elegida:
     * Retorna 0 si selecciona "Si"
     * Retirna 1 si selecciona "No"
     */
    public static int confirmacionErrorSINO(String titulo, String mensaje){
        return JOptionPane.showConfirmDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de alerta, con un titulo, un mensaje
     * y tres opciones de eleccion: "Si", "No" y "Cancelar"
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion elegida:
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     * Retorna 2 si selecciona "Cancelar"
     */
    public static int confirmacionAlertaCompleta(String titulo, String mensaje){
        return JOptionPane.showConfirmDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de alerta, con un titulo, un mensaje
     * y dos opciones de eleccion: "Si" y "No"
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion elegida:
     * Retorna 0 si selecciona "Si"
     * Retirna 1 si selecciona "No"
     */
    public static int confirmacionAlertaSINO(String titulo, String mensaje){
        return JOptionPane.showConfirmDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de notificacion, con un titulo, un
     * mensaje y tres opciones de eleccion: "Si", "No" y "Cancelar"
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion elegida:
     * Retorna 0 si selecciona "Si"
     * Retorna 1 si selecciona "No"
     * Retorna 2 si selecciona "Cancelar"
     */
    public static int confirmacionNotificacionCompleta(String titulo, String mensaje){
        return JOptionPane.showConfirmDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Muestra el JOptionPane con un icono de notificacion, con un titulo, un
     * mensaje y dos opciones de eleccion: "Si" y "No"
     * @param titulo
     * @param mensaje
     * @return Retorna un entero segun la opcion elegida:
     * Retorna 0 si selecciona "Si"
     * Retirna 1 si selecciona "No"
     */
    public static int confirmacionNotificacionSINO(String titulo, String mensaje){
        return JOptionPane.showConfirmDialog(null, mensaje, titulo,
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }
}