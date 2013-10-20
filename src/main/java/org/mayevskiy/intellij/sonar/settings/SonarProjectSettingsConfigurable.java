package org.mayevskiy.intellij.sonar.settings;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.Nullable;
import org.mayevskiy.intellij.sonar.sonarserver.SonarService;

import javax.swing.*;

/**
 * @author Oleg Mayevskiy
 * @author Michail Plushnikov
 */
public class SonarProjectSettingsConfigurable extends SonarSettingsConfigurable {

  private JButton testConnectionButton;
  private JPanel jPanel;
  private JTextField sonarServerUrlTextField;
  private JTextField sonarUserTextField;
  private JTextField sonarPasswordTextField;
  private JTextField sonarResourceTextField;
  private JComboBox<String> sonarResourceComboBox;
  private JButton resourcesUpdateButton;

  private SonarSettingsComponent sonarSettingsComponent;
  private SonarService sonarService;
  private Project project;

  @Override
  public JButton getTestConnectionButton() {
    return testConnectionButton;
  }

  @Override
  public JButton getUpdateResourcesButton() {
    return resourcesUpdateButton;
  }

  @Override
  public SonarService getSonarService() {
    return sonarService;
  }

  @Override
  public SonarSettingsComponent getSonarSettingsComponent() {
    return sonarSettingsComponent;
  }

  @Override
  public Project getProject() {
    return project;
  }

  @Override
  public JPanel getJPanel() {
    return jPanel;
  }

  @Override
  public JTextField getSonarServerUrlTextField() {
    return sonarServerUrlTextField;
  }

  @Override
  public JTextField getSonarUserTextField() {
    return sonarUserTextField;
  }

  @Override
  public JTextField getSonarPasswordTextField() {
    return sonarPasswordTextField;
  }

  @Override
  public JTextField getSonarResourceTextField() {
    return sonarResourceTextField;
  }

  @Override
  public JComboBox<String> getSonarResourceComboBox() {
    return sonarResourceComboBox;
  }

  public SonarProjectSettingsConfigurable(Project project) {
    this.project = project;
    this.sonarSettingsComponent = project.getComponent(SonarSettingsProjectComponent.class);
    this.sonarService = ServiceManager.getService(SonarService.class);
  }

  @Nullable
  //for backward compatibility
  public Icon getIcon() {
    return null;
  }
}
