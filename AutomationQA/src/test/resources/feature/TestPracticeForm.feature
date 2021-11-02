# new feature
# Tags: optional

Feature: Pruebas demo QA
  Como Usuario
  Quiero validar check box de la aplicacion demo qa
  Para obtener las opciones de home


  @Form
  Scenario Outline: Registro de formulario
    Given que la web TollQa Practice Form esta disponible
    When se ingresa el Name "<sName>"
    And se ingresa el LastName "<sLastName>"
    And se ingresa el Email "<sEmail>"
    And se seleciona el Genero "<sGenero>"
    And se ingresa el Mobile "<sMobile>"
    And se seleciona Date of Birth
    And se ingresa el Subject "<sSubject>"
    And se seleciona Hobbies "<sHobbies>"
    And se carga el archivo
    And se ingresa el CurrentAddress "<sCurrentAddress>"
    And se ingresa el sState "<sState>"
    And se ingresa el sCity  "<sCity>"
    And se clickea en el boton submit del formulario
    Then se muestra mis datos en una ventana emergente "<sName>" "<sEmail>" "<sGenero>" "<sMobile>" "<sSubject>" "<sHobbies>" "<sCurrentAddress>" "<sState>"
    Examples:
      | sName  | sLastName | sEmail           | sGenero | sMobile    | sSubject | sHobbies | sCurrentAddress | sState | sCity |
      | breysi | jara      | breysi@gmail.com | Female    | 9876545678 | English  | Reading | Huanuco         | NCR      | Delhi |
