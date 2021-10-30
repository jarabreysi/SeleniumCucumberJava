# new feature
# Tags: optional

Feature: busqueda google
  Como usuario de la aplicacion google
  Quiero realizar una busqueda
  Para obtener mayor informacion

  @Caso01 @HappyPath
  Scenario: Buscar texto en google
    Given que el usuario se encuentra en el home de google
    When se ingresa una palabra de busqueda "Cucumber"
    Then la aplicacion muestra el resultado de "Cucumber"

  @Caso02
  Scenario Outline:Buscar texto en google 01
    Given que el usuario se encuentra en el home de google
    When se ingresa una palabra de busqueda "<sTexto>"
    Then la aplicacion muestra el resultado de "<sTexto>"
    Examples:
      | sTexto   |
      | Cucumber |
      | Facebook |
      | Linkedin |


  @Id001
  Scenario Outline:Ingresar sesion con credenciales incorrectas
    Given que el usuario se encuentra en el home de Facebook
    When se ingresa un email "<sEmail>"
    And se ingresa la contrasena "<sPassword>"
    And se clickea en el boton ingresar
    Then la aplicacion muestra el resultado de "<sMensajeError>" facebook
    Examples:
      | sEmail                | sPassword   | sMensajeError                          |
      | breysijara@gmail.com | kjsmndhjdkj | La contraseña que ingresaste es incorrecta |



  @Id002
  Scenario Outline:Ingresar sesion con credenciales correctas
    Given el usuario se encuentra en el home de Facebook
    When se ingresa un email "<sEmail>" correcto
    And se ingresa la contrasena "<sPassword>" correcto
    And se clickea en el boton iniciarSesion
    Then la aplicacion permitira el ingreso correcto
    Examples:
      | sEmail                | sPassword   |
      | angelita_bja@hotmail.com | ..facebook.com |
