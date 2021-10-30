# new feature
# Tags: optional

Feature: Pruebas demoQA
  Como Usuario
  Quiero validar check box de la aplicacion demo qa
  Para obtener las opciones de home


  @Radiobuton
  Scenario Outline: funcionalidad de radio buton
    Given que el usuario se encuentra en el home de demoqa
    And seleciona la cateroria del home "<sCategoria>"
    When Selecciona la opcion del menu de la categoria en home "<sMenu>"
    Then presiona clic en una de las opciones

    Examples:
      | sCategoria | sMenu     |
      | Elements   |Radio Button   |

