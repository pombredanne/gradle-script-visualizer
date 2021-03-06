package com.nurflugel.util;

import java.awt.*;

import javax.swing.*;

/** Util class. */
public class Util
{
  public static final Cursor busyCursor           = Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR);
  public static final Cursor normalCursor         = Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);
  public static final String VERSION              = "2.2.1";
  public static final String DEPENDS_ON           = "dependsOn";
  public static final String APPLY_FROM           = "apply from: ";
  public static final String DEPENDS_ON_TEXT      = "dependsOn:";
  public static final String EXECUTE_TEXT         = ".execute()";
  public static final String SPACE                = " ";
  public static final String PERIOD               = ".";
  public static final String NO_TYPE              = "noType";
  public static final String EACH                 = ".each";
  public static final String SINGLE_QUOTE         = "'";
  public static final String DOUBLE_QUOTE         = "\"";
  public static final String COMMA                = ",";
  public static final String OPEN_SQUARE_BRACKET  = "[";
  public static final String CLOSE_SQUARE_BRACKET = "]";
  public static final String EMPTY_TEXT           = "";
  public static final String OPEN_PARENTHESIS     = "(";
  public static final String CLOSE_PARENTHESIS    = ")";
  public static final String TYPE                 = "type:";
  public static final String UNDERSCORE           = "_";
  public static final String COLON                = ":";
  public static final String SLASH                = "/";
  public static final String BACKSLASH            = "\\";
  public static final String HYPHEN               = "-";
  public static final String HTTP                 = "http:";
  public static final String OPEN_CURLY_BRACE     = "{";
  public static final String CLOSE_CURLY_BRACE    = "}";
  // -------------------------- STATIC METHODS --------------------------

  /** Sets the look and feel. Todo - put into shared library. */
  @SuppressWarnings("UseOfSystemOutOrSystemErr")
  public static LookAndFeel setLookAndFeel(String feelName, Component component)
  {
    LookAndFeel currentLAF = UIManager.getLookAndFeel();

    try
    {
      UIManager.setLookAndFeel(feelName);
      SwingUtilities.updateComponentTreeUI(component);
    }
    catch (Exception e)
    {
      System.out.println("Error setting native LAF: " + feelName + e.getMessage());
    }

    return currentLAF;
  }

  /** Todo - put into shared library. */
  public static LookAndFeel setLookAndFeel(LookAndFeel lookAndFeel, Component component)
  {
    return setLookAndFeel(lookAndFeel.getName(), component);
  }

  /** Todo - put into shared library. */
  public static void centerApp(Object object)
  {
    if (object instanceof Container)
    {
      Container comp = (Container) object;

      center(comp);
    }
  }

  /** Centers the component on the screen. Todo - put into shared library. */
  @SuppressWarnings("NumericCastThatLosesPrecision")
  public static void center(Container container)
  {
    Toolkit   defaultToolkit = Toolkit.getDefaultToolkit();
    Dimension screenSize     = defaultToolkit.getScreenSize();
    int       x              = (int) ((screenSize.getWidth() - container.getWidth()) / 2);
    int       y              = (int) ((screenSize.getHeight() - container.getHeight()) / 2);

    container.setBounds(x, y, container.getWidth(), container.getHeight());
  }

  /** Add the help listener - link to the help files. Todo - put into shared library. */
  public static void addHelpListener(String helpSetName, JButton helpButton, JFrame theFrame)
  {
    /*
     * ClassLoader classLoader = theFrame.getClass().getClassLoader();
     *
     * try
     * {
     * URL                       hsURL                 = HelpSet.findHelpSet(classLoader, helpSetName);
     * HelpSet                   helpSet               = new HelpSet(null, hsURL);
     * HelpBroker                helpBroker            = helpSet.createHelpBroker();
     * CSH.DisplayHelpFromSource displayHelpFromSource = new CSH.DisplayHelpFromSource(helpBroker);
     *
     * helpButton.addActionListener(displayHelpFromSource);
     * }
     * catch (HelpSetException ee)
     * {  // Say what the exception really is
     * System.out.println("Exception! " + ee.getMessage());
     * // LOGGER.error("HelpSet " + ee.getMessage());
     * // LOGGER.error("HelpSet " + HELP_HS + " not found");
     * }
     */
  }

  private Util() {}
}
