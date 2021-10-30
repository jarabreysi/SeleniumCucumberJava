# new feature
# Tags: optional

Feature: Registrar un formulario
  Yo un nuevo cliente
  Quiero registrar mis datos
  Para tengan mi informacion

  @Id003
  Scenario Outline: Regsitro de formulario con datos validos
    Given que la web TollQa esta disponible
    When ingreso mis datos "<sName>" "<sEmail>" "<sCurrentAddress>" "<sPermanentAddress>"
    And se clickea en el boton sumit
    Then se muestra mis datos en pantalla
    Examples:
    | sName       |  sEmail                |sCurrentAddress   |sPermanentAddress  |
    |   breysi    |  breysi@gmail.com      |   Huanuco        |  Lima             |
    |   Ana       |  ana@gmail.com      |   Huanuco        |  Lima             |
