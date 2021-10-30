# new feature
# Tags: optional

Feature: Pruebas Basic HTML Form
  Como Usuario
  Quiero validar form de la aplicacion Basic HTML Form
  Para obtener las opciones


  @FormBasic
  Scenario Outline: Registro de formulario Basic
    Given que la web Basic HTML Form  esta disponible
    When se ingresa el name "<sName>"
    And se ingresa el password "<sPassword>"
    And se ingresa el comments "<sComments>"
    And se  carga un archivo
    And se selecciona un chexbox
    And se selecciona un radio buton
    And se selecciona un multiple select
    And se selecciona un Dropdown
    And se clickea en el btn submit del formulario
    Then se muestra mis datos en una ventana
    Examples:
      | sName  | sPassword | sComments           |
      | breysi | jara      | Hola mundo |
