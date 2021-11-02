# new feature
# Tags: optional

Feature: Ingresar a Instagram
  Como usuario
  Quiero ingresar a la aplicacionn
  Para ver unos post

  @LoginInstagram
  Scenario Outline:Login - Ingresar sesion con credenciales incorrectas
    Given que el usuario se encuentra en el home de instagram
    When se ingresa el email "<sEmail>"
    And se ingresa una contrasena "<sPassword>"
    And se clickea en el boton iniciar
    Then la aplicacion muestra el resultado de "<sMensajeError>" instagram
    Examples:
      | sEmail                | sPassword   | sMensajeError                              |
      | breysijara@gmail.com | kjsmndhjdkj | La contraseña no es correcta. Compruébala. |



