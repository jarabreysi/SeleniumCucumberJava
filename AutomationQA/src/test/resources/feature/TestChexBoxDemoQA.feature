# new feature
# Tags: optional

Feature: Pruebas demo QA
  Como Usuario
  Quiero validar check box de la aplicacion demo qa
  Para obtener las opciones de home

  @Formulario
  Scenario Outline: Regsitro de formulario con datos validos
    Given que la web TollQa esta disponible
    When ingreso mis datos "<sName>" "<sEmail>" "<sCurrentAddress>" "<sPermanentAddress>"
    And se clickea en el boton sumit
    Then se muestra mis datos en pantalla
    Examples:
      | sName       |  sEmail                |sCurrentAddress   |sPermanentAddress  |
      |   breysi    |  breysi@gmail.com      |   Huanuco        |  Lima             |
      |   Ana       |  ana@gmail.com      |   Huanuco        |  Lima             |



  @MenuChexbox
  Scenario Outline:Validar la opcion desktop
    Given que el usuario se encuentra en el home de demo qa
    And seleciona la cateroria "<sCategoria>"
    And Selecciona la opcion del menu de la categoria "<sMenu>"
    When selecciona el menu home
    Then se obtine la opcion del menu "<sCbxLevel2>" y de tecer nivel "<sCbxLevel3>"
    And presiona clic en el menu "<sMenu>"
    Examples:
      | sCategoria | sMenu     | sCbxLevel2 | sCbxLevel3 |
      | Elements   |Check Box    | Documents  | WorkSpace |


